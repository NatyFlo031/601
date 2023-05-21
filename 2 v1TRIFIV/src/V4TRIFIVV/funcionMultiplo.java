/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package V4TRIFIVV;

/**
 *
 * @author Usuario 1
 */
public class funcionMultiplo {
    public String retornoMultiplo(int numero){
        if (numero%3==0 && numero%5==0){
            return "TRIFIV";
        }else if (numero%3==0){
            return "TRI";
        }else if (numero%5==0){
            return "FIV";
        } return null;
    }
    
}
