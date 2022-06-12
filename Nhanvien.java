/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GLuong;

/**
 *
 * @author THANTHUY
 */
public class Nhanvien extends Person{
    private String Diachi ;
    private int Luong;

    public Nhanvien() {
    }

    public Nhanvien(String Diachi, int Luong) {
        this.Diachi = Diachi;
        this.Luong = Luong;
    }

    public Nhanvien(String Diachi, int Luong, int MaNV, String Hoten) {
        super(MaNV, Hoten);
        this.Diachi = Diachi;
        this.Luong = Luong;
    }

    public String getDiachi() {
        return Diachi;
    }

    public int getLuong() {
        return Luong;
    }

    public void setDiachi(String Diachi) {
        this.Diachi = Diachi;
    }

    public void setLuong(int Luong) {
        this.Luong = Luong;
    }
    
    
}
