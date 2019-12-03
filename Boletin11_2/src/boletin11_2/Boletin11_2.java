/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin11_2;

/**
 *
 * @author jalonsoriveiro
 */
public class Boletin11_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Media a = new Media("pepito","pepon",5);
        
        a.getAutor();
        System.out.println(a.getAutor());
        a.setAutor("pepona");
        System.out.println(a.getAutor());
        a.setNom("juana");
        System.out.println(a.getNom());
        a.setDuradaSegons(50);
        System.out.println(a.getDuradaSegons());
    }
    
}
