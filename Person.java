/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GLuong;

/**
 *
 * @author THANTHUY
 */
public class Person {
    private int MaNV;
    private String Hoten ;

    public Person() {
    }

    public Person(int MaNV, String Hoten) {
        this.MaNV = MaNV;
        this.Hoten = Hoten;
    }

    public int getMaNV() {
        return MaNV;
    }

    public String getHoten() {
        return Hoten;
    }

    public void setMaNV(int MaNV) {
        this.MaNV = MaNV;
    }

    public void setHoten(String Hoten) {
        this.Hoten = Hoten;
    }
    
}
