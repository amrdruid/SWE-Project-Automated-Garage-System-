/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package project;

/**
 *
 * @author Omar_2
 */
public class Reader {
    private static String carPlatRead;
    Reader(String c){
        carPlatRead= c;
    }
    Reader(){}
    public static String getCarPlateNumber(){
        return carPlatRead;
    }
    public static  void setCarPlateNumber(String c){
        carPlatRead= c;
    }
  
}
