/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package project;

import java.util.ArrayList;


/**
 *
 * @author Omar_2
 */
public class Garage {
    Reader r = new Reader();
    static ArrayList <Place> places = new ArrayList<>();
    public static void carEntered(Car c){
        int carID = c.getCarID();
        int customerID = Database.getCustomer(carID);
        boolean reservationFound = Database.searchReservation(customerID);
        if(reservationFound){
            Place temp = Sensor.getPlace();
            for(int i=0;i<places.size();i++){
                if(places.get(i).getName()==temp.getName()){
                    places.get(i).park();
                    break;
                }
            }
        }
        else{
            Place temp = Sensor.getGroundPlace();
            for(int i=0;i<places.size();i++){
                if(places.get(i).getName()==temp.getName()){
                    places.get(i).park();
                    break;
                }
            }
        }
        
    }
    
}
