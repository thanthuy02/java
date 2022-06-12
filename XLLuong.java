/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GLuong;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author THANTHUY
 */
public class XLLuong {
    
    public static Connection getCon(){
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dlluong", "root", "");
        } catch (SQLException e) {
            System.out.println("error. " + e);
        }
        return conn;
    }
    
    public static List<Nhanvien> getNVbyMa(int MaNV){
        List<Nhanvien> nv = new ArrayList<>();
        Connection conn = getCon();
       
        try {
            String query = "select * from tbNhanvien where MaNV  = ?";
            PreparedStatement pstm = conn.prepareStatement(query);
            pstm.setInt(1, MaNV);
            
            ResultSet rs = pstm.executeQuery();
            while(rs.next()){
                
                int ma = rs.getInt("MaNV");
                String hoten = rs.getString("Hoten");
                String diachi = rs.getString("Diachi");
                int luong = rs.getInt("Luong");
                
                Nhanvien n = new Nhanvien(diachi, luong, ma, hoten);
                
                nv.add(n);
            }
            
        } catch (SQLException e) {
        }
        
        return nv;
    }
    
    public static void updateNV(Nhanvien nv){
        Connection conn = getCon();
        String query = "update tbNhanvien set Hoten = ?, Diachi = ?, Luong = ? where MaNV = ?";
        
        try {
            PreparedStatement pstm = conn.prepareStatement(query);
            pstm.setString(1, nv.getHoten());
            pstm.setString(2, nv.getDiachi());
            pstm.setInt(3, nv.getLuong());
            pstm.setInt(4, nv.getMaNV());
                  
            pstm.execute();
            
            System.out.println("UPDATED!");
            
        } catch (SQLException e) {
            System.out.println("error. " + e);
        }
    }
    
    public static void insertNV(Nhanvien nv){
        Connection conn = getCon();
        String query = "insert into tbNhanvien values( MaNV = ?, Hoten = ?, Diachi = ?, Luong = ? )";
        
        try {
            PreparedStatement pstm = conn.prepareStatement(query);
            pstm.setInt(1, nv.getMaNV());
            pstm.setString(2, nv.getHoten());
            pstm.setString(3, nv.getDiachi());
            pstm.setInt(4, nv.getLuong());
            
            pstm.execute();
            
            System.out.println("INSERTED!");
            
        } catch (SQLException e) {
            System.out.println("error. " + e);
        }
    }
    
    public static void delNV(int MaNV){
         Connection conn = getCon();
        String query = "delete from tbNhanvien where MaNV = '"+MaNV+"'";
        
        try {
            PreparedStatement pstm = conn.prepareStatement(query);
           // pstm.setInt(1, MaNV);
            
            pstm.executeUpdate();
            
            System.out.println("DELETED!");
            
            
        } catch (SQLException e) {
            System.out.println("error. " + e);
        }
        
    }
    
}
