/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin11_3;

/**
 *
 * @author jalonsoriveiro
 */
public class Boletin11_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Date a = new Date(2,2,2020);
        System.out.println(a.getDia());
        a.setDia(29);
        System.out.println(a.getDia());
        a.setMes(12);
        System.out.println(a.getMes());
        a.setAny(2019);
        System.out.println(a.getAny());
        
    }
    
}
