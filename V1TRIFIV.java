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
public class V1TRIFIV {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        BufferedReader BuffEntrada=new BufferedReader(new InputStreamReader(System.in));
        int numero;
        float mul3, mul5;
        System.out.println("Dame el numero");
        numero=Integer.parseInt(BuffEntrada.readLine());
        mul3=numero%3;
        mul5=numero%5;
        if(mul3==0){
            System.out.println("TRI");
}if(mul5==0){
            System.out.println("FIV");
}if(mul3==0 && mul5==0){
            System.out.println("TRIFIV");
}
    }
    
}
