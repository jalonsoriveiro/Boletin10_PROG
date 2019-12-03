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
public class Date {

    int dia, mes, any;

    public Date(int dia, int mes, int any) {
        this.dia = dia;
        this.mes = mes;
        this.any = any;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int p_dia) {
       int prueba = p_dia;
        //System.out.println("s+prueba);
       // this.dia = dia;
       comprobarDate(prueba,mes,any);
                
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int p_mes) {
         int prueba2 = p_mes;
        //System.out.println("s+prueba);
       // this.dia = dia;
       comprobarDate(dia,prueba2,any);
       // this.mes = mes;
    }

    public int getAny() {
        return any;
    }

    public void setAny(int p_any) {
        this.any = any;
         int prueba3 = p_any;
        //System.out.println("s+prueba);
       // this.dia = dia;
       comprobarDate(dia,mes,prueba3);
        //this.mes = mes;
    }

    public void comprobarDate(int prueba,int p_mes ,int p_any) {


            if ((any % 4 == 0) && ((any % 100 != 0) || (any % 400 == 0))){
                System.out.println("El año es bisiesto");
               
                    switch (p_mes) {
                        case 1:
                            //int diasEnero = 31;
                            if ((prueba < 31) && (prueba > 0)) {
                                dia = prueba;                               
                            }
                            else{
                                System.out.println("dia incorrecto");
                            }
                        
                        case 2:
                            //int diasFebrero = 29;
                            if ((prueba < 29) && (prueba > 0)) {
                                dia = prueba;
                                mes =p_mes;
                                any =p_any;
                                 
                            }
                            else{
                                System.out.println("dia incorrecto");
                            }
                         break;
             
                        case 3:
                            if ((prueba < 31) && (prueba > 0)) {
                                dia = prueba;
                                 mes =p_mes;
                                any =p_any;
                            }
                            else{
                                System.out.println("dia incorrecto");
                            }
                        case 4:
                        //return ("Abril tiene 30 dias ");  
                            if ((prueba < 30) && (prueba > 0)) {
                                dia = prueba;  
                                mes =p_mes;
                                any =p_any;
                            }
                            else{
                                System.out.println("dia incorrecto");
                            }
                        case 5:
                        //return ("Mayo tiene 31 dias ");  
                            if ((prueba < 31) && (prueba > 0)) {
                                dia = prueba;
                                mes =p_mes;
                                any =p_any;
                                 
                            }
                            else{
                                System.out.println("dia incorrecto");
                            }
                        case 6:
                        // return ("Junio tiene 30 dias "); 
                            if ((prueba < 30) && (prueba > 0)) {
                                dia = prueba;
                                mes =p_mes;
                                any =p_any;
                                 
                            }
                            else{
                                System.out.println("dia incorrecto");
                            }
                        case 7:
                        //return ("Julio tiene 31 dias ");  
                            if ((prueba < 31) && (prueba > 0)) {
                                dia = prueba;
                                mes =p_mes;
                                any =p_any;
                                 
                            }
                            else{
                                System.out.println("dia incorrecto");
                            }
                        case 8:
                        //return ("Agosto tiene 31 dias ");   
                            if ((prueba < 31) && (prueba > 0)) {
                                dia = prueba;
                                mes =p_mes;
                                any =p_any;
                                 
                            }
                            else{
                                System.out.println("dia incorrecto");
                            }
                        case 9:
                        //return ("Septiembre tiene 30 dias ");
                            if ((prueba < 30) && (prueba > 0)) {
                                dia = prueba;
                                mes =p_mes;
                                any =p_any;
                                 
                            }
                            else{
                                System.out.println("dia incorrecto");
                            }
                        case 10:
                        //return ("Octubre tiene 31 dias ");
                            if ((prueba < 31) && (prueba > 0)) {
                                dia = prueba;
                                mes =p_mes;
                                any =p_any;
                                 
                            }
                            else{
                                System.out.println("dia incorrecto");
                            }
                        case 11:
                        //return ("Noviembre tiene 30 dias "); 
                            if ((prueba < 30) && (prueba > 0)) {
                                dia = prueba;
                                mes =p_mes;
                                any =p_any;
                                 
                            }
                            else{
                                System.out.println("dia incorrecto");
                            }
                        case 12:
                        // return ("Diciembre tiene 31 dias ");  
                            if ((prueba < 31) && (prueba > 0)) {
                                dia = prueba;                                 
                            }
                            else{
                                System.out.println("dia incorrecto");
                            }
                        default:
                            System.out.println("Mes incorrecto");
                    }
            }
                else{
             System.out.println("El año no es bisiesto");
             
             switch (mes) {
                        case 1:
                            //int diasEnero = 31;
                            if ((prueba < 31) && (prueba > 0)) {
                                dia = prueba;
                              
                            }
                            else{
                                System.out.println("dia incorrecto");
                            }
                        
                        case 2:
                            //int diasFebrero = 28;
                            if ((prueba < 28) && (prueba > 0)) {
                                dia = prueba;
                                 
                            }
                            else{
                                System.out.println("dia incorrecto");
                            }
                         break;
             
                        case 3:
                            if ((prueba < 31) && (prueba > 0)) {
                                dia = prueba;
                                 
                            }
                            else{
                                System.out.println("dia incorrecto");
                            }
                        case 4:
                        //return ("Abril tiene 30 dias ");  
                            if ((prueba < 30) && (prueba > 0)) {
                                dia = prueba;                                 
                            }
                            else{
                                System.out.println("dia incorrecto");
                            }
                        case 5:
                        //return ("Mayo tiene 31 dias ");  
                            if ((prueba < 31) && (prueba > 0)) {
                                dia = prueba;
                                 
                            }
                            else{
                                System.out.println("dia incorrecto");
                            }
                        case 6:
                        // return ("Junio tiene 30 dias "); 
                            if ((prueba < 30) && (prueba > 0)) {
                                dia = prueba;
                                 
                            }
                            else{
                                System.out.println("dia incorrecto");
                            }
                        case 7:
                        //return ("Julio tiene 31 dias ");  
                            if ((prueba < 31) && (prueba > 0)) {
                                dia = prueba;
                                 
                            }
                            else{
                                System.out.println("dia incorrecto");
                            }
                        case 8:
                        //return ("Agosto tiene 31 dias ");   
                            if ((prueba < 31) && (prueba > 0)) {
                                dia = prueba;
                                 
                            }
                            else{
                                System.out.println("dia incorrecto");
                            }
                        case 9:
                        //return ("Septiembre tiene 30 dias ");
                            if ((prueba < 30) && (prueba > 0)) {
                                dia = prueba;
                                 
                            }
                            else{
                                System.out.println("dia incorrecto");
                            }
                        case 10:
                        //return ("Octubre tiene 31 dias ");
                            if ((prueba < 31) && (prueba > 0)) {
                                dia = prueba;
                                 
                            }
                            else{
                                System.out.println("dia incorrecto");
                            }
                        case 11:
                        //return ("Noviembre tiene 30 dias "); 
                            if ((prueba < 30) && (prueba > 0)) {
                                dia = prueba;
                                 
                            }
                            else{
                                System.out.println("dia incorrecto");
                            }
                        case 12:
                        // return ("Diciembre tiene 31 dias ");  
                            if ((prueba < 31) && (prueba > 0)) {
                                dia = prueba;                                 
                            }
                            else{
                                System.out.println("dia incorrecto");
                            }
                        default:
                            System.out.println("Mes incorrecto");
                    }
             
             
             
                  }

            

        }

    }
