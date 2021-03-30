/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6.pkg2014431621.latihan56.umurbarangantik;

/**
 *
 * @author sarah
 * kelas    : pbo fs112b
 * nim      : 2014431621
 */
public class BarangAntik {
    int umur;
    
    public BarangAntik (int umur) {
        this.umur = umur;
    }
    public void tampilUmur() {
        Radio r = new Radio(234);
        System.out.println("Umur barang antik ini adalah    : " + umur + " tahun ");
    }
    
}