/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projek_muhammad_farhan_asro;

/**
 *
 * @author ASUS
 */
public class pengurangan {
    int angka1;
    int angka2;
    int nilai;
    
    void pengurangan (int angka1, int angka2 ){
        this.angka1 = angka1;
        this.angka2 = angka2;
    }
    
    void hitungkan2 (){
        int hasil = angka1 - angka2;
        System.out.println("Hasil Penjumlahan :"  + angka1 + "-" + angka2 + "=" + hasil);
        nilai = hasil;
    }
    
    void nilai2 (){
        if (nilai >= 90){
            System.out.println("Nilai anda adalah : A");
        } else if (nilai >= 85){
            System.out.println("Nilai anda adalah : B");
        } else if (nilai >=65){
            System.out.println("Nilai anda adalah : C");
        } else if (nilai >=40){
            System.out.println("Nilai anda adalah : E");
        } else {
            System.out.println("Nilai anda adalah : D");
        }
    }
}
