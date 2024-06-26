/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projek_muhammad_farhan_asro;

/**
 *
 * @author ASUS
 */
public class Projek_Muhammad_Farhan_Asro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        penjumlahan kalkulator = new penjumlahan();
        kalkulator.penjumlahan(50, 32);
        kalkulator.hitungkan1();
        kalkulator.nilai();
        
        System.out.println("------------------------------------------------");
        
        pengurangan kalkulator2 = new pengurangan();
        kalkulator2.pengurangan(120, 40);
        kalkulator2.hitungkan2();
        kalkulator2.nilai2();
        
        System.out.println("------------------------------------------------");
        
        perkalian kalkulator3 = new perkalian();
        kalkulator3.perkalian(25, 3);
        kalkulator3.hitungkan3();
        kalkulator3.nilai3();
        
        System.out.println("------------------------------------------------");
        
        pembagian kalkulator4 = new pembagian();
        kalkulator4.pembagian(600, 9);
        kalkulator4.hitungkan4();
        kalkulator4.nilai4();
    }
    
    
}
