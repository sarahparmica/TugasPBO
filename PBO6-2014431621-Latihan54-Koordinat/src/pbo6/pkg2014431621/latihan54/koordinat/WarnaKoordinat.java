/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6.pkg2014431621.latihan54.koordinat;

/**
 *
 * @author sarah
 * KELAS    : PBO FS112B
 * NIM      : 2014431621
 */

public class warnaKoordinat {
    private String namaWarna;
    
    public warnaKoordinat(int x, int y, String namaWarna) {
        this.namaWarna = namaWarna;
    }
    public String getNamaWarna() {
        return namaWarna;
    }
    public void setNamaWarna(String namaWarna) {
        this.namaWarna = namaWarna;
    }
}