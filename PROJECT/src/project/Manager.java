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
public class Manager extends Employee {
    public void viewData(){
        Database.viewData();
    }
    
    public void turnReservationOff(){
        Reservation.setReservationPermision(false);
    }
    
    public void turnReservationOn(){
        Reservation.setReservationPermision(true);
    }
    
    public void deleteEmployee(int eID){
        Database.deleteEmployee(eID);
    }
    
    
    
}
