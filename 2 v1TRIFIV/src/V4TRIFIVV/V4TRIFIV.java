/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package V4TRIFIVV;

import java.io.BufferedReader;
import V4TRIFIVV.funcionMultiplo;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Usuario 1
 */
public class V4TRIFIV {
    public static void main(String[] args) throws IOException {
        BufferedReader BuffEntrada=new BufferedReader(new InputStreamReader(System.in));
        int numero;
        funcionMultiplo mult=new funcionMultiplo();
        System.out.println("Dame el numero");
        numero=Integer.parseInt(BuffEntrada.readLine());
        System.out.println(mult.retornoMultiplo(numero));      
}}
