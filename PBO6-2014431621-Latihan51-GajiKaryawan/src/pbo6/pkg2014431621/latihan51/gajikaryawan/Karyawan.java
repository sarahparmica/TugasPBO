/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6.pkg2014431621.latihan51.gajikaryawan;

/**
 *
 * @author sarah
 * Kelas    : PBO FS112B
 * NIM      : 2014431621
 */
public class Karyawan {
     private String nik, nama, jabatan;
  private int golongan;
  
  public String getNik() {
      return nik;
  } 
  
  public void setNik(String nik) {
       this.nik = nik;
  }
  
  public String getNama() {
      return nama;
  } 
  
  public void setNama(String nama) {
       this.nama = nama;
  }
  
  public String getJabatan() {
      return jabatan;
  } 
  
  public void setJabatan(String jabatan) {
       this.jabatan = jabatan;
  }
  
  public int getGolongan() {
      return golongan;
  } 
  
  public void setGolongan(int golongan) {
       this.golongan = golongan;
  }
  

  public void tampilKaryawan() {
      System.out.println("Nik      : "+nik);
      System.out.println("Nama     : "+nama);
      System.out.println("Jabatan  : "+jabatan);
      System.out.println("Golongan : "+golongan);
  }

}