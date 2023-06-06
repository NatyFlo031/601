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
public class V2TRIFIV {
    public static void main(String[] args) throws IOException {
        BufferedReader BuffEntrada=new BufferedReader(new InputStreamReader(System.in));
        int numero, mult3,mult5;
        System.out.println("Dame el numero");
        numero=Integer.parseInt(BuffEntrada.readLine());
        mult3=numero%3;
        mult5=numero%5;
        if (mult3==0 && mult5==0){
            System.out.println("TRIFIV");
        }else if (mult3==0){
            System.out.println("TRI");            
        }else if (mult5==0){
            System.out.println("FIV");            
        }
    
}}
