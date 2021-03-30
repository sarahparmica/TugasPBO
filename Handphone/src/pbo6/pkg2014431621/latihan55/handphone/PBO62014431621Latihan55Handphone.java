/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6.pkg2014431621.latihan55.handphone;

/**
 *
 * @author sarah
 * kelas    : pbo fs112b
 * nim      : 2014431621
 */
public class PBO62022436280Latihan54Handphone {

    /**
     * @param args the command line arguments
     */
    protected static String manufacture, operatingSystem, model;
    protected static int harga;
    
    public static void main(String[] args) {
        Handphone h = new Handphone(manufacture, operatingSystem, model, harga);
        h.displayProduct();
    }
    
}