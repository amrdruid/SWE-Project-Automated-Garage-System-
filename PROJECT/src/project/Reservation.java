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
public class Reservation {

    /**
     * @return the reservationPermision
     */
    public static boolean isReservationPermision() {
        return reservationPermision;
    }

    /**
     * @param aReservationPermision the reservationPermision to set
     */
    public static void setReservationPermision(boolean aReservationPermision) {
        reservationPermision = aReservationPermision;
    }
    private int customerID;
    private String timeFrom;
    private String timeTo;
    private int reservationID; 
    private static boolean reservationPermision=true;
    
    public Reservation (int c, String tf , String tt,int rID ){
        customerID = c;
        timeFrom = tf;
        timeTo = tt ;
        reservationID=rID;
    }
    
    public void setData(int  c, String tf , String tt,int rID){
        setCustomerID(c);
        setTimeFrom(tf);
        setTimeTo(tt) ;
        setReservationID(rID);
    }
    
    public void addReservation(){
        
        if(isReservationPermision()){
            if(Pay())

        Database.addReservation(this);
        }
        else
            System.out.println("CANT");
            //PRINT ERROR MESSAGE
        
    }
    
    
    
    public void cancelReservation(int RID){
        Database.removeReservation(RID);
    }

    /**
     * @return the customerID
     */
    public int getCustomerID() {
        return customerID;
    }

    /**
     * @param customerID the customerID to set
     */
    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    /**
     * @return the timeFrom
     */
    public String getTimeFrom() {
        return timeFrom;
    }

    /**
     * @param timeFrom the timeFrom to set
     */
    public void setTimeFrom(String timeFrom) {
        this.timeFrom = timeFrom;
    }

    /**
     * @return the timeTo
     */
    public String getTimeTo() {
        return timeTo;
    }

    /**
     * @param timeTo the timeTo to set
     */
    public void setTimeTo(String timeTo) {
        this.timeTo = timeTo;
    }

    /**
     * @return the reservationID
     */
    public int getReservationID() {
        return reservationID;
    }

    /**
     * @param reservationID the reservationID to set
     */
    public void setReservationID(int reservationID) {
        this.reservationID = reservationID;
    }

    private boolean Pay() {
        return true;
    }
    
    
    
    
    
    
}
