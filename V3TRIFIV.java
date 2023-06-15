/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2.v1trifiv;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Usuario 1
 */
public class V3TRIFIV {
    public static void main(String[] args) throws IOException {
        BufferedReader BuffEntrada=new BufferedReader(new InputStreamReader(System.in));
        int numero;
        System.out.println("Dame el numero");
        numero=Integer.parseInt(BuffEntrada.readLine());
        System.out.println(retornaMultiplo(numero));      
    
}   public static String retornaMultiplo(int numero){
        int mult3,mult5;
        mult3=numero%3;
        mult5=numero%5;
        if (mult3==0 && mult5==0){
            return("TRIFIV");
        }else if (mult3==0){
            return("TRI");
        }else if (mult5==0){
            return("FIV");
        } return ("Ningún Valor");
} 
}
