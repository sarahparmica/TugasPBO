/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6.pkg2014431621.latihan53.rabbit;

/**
 *
 * @author sarah
 * Kelas    : PBO FS112B
 * NIM      : 2014431621
 */


public class rabbits extends Animal {
    
  private String color;
    private String name;

    public rabbits(String name, boolean veg, String food, int legs, String color) {
        super(veg, food, legs);
        this.name = name;
        this.vegetarian = veg;
        this.eats = food;
        this.noOfLegs = legs;
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    public String getName() {
        return name;
    }
    
}