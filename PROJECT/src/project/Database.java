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
class Database {
    public static void addCustomer (Customer c){
        //add c to database
    }
    public static void addCar (int cID ,Car c){
        //add car to database
    }

    static Customer logInCustomer(String n, String p) {
        Customer c = new Customer();
        //Customer c = get from database
        return c;
        
    }

    static void addReservation(Reservation r) {
        // add Reservation to database
    }

    static void removeReservation(int RID) {
        //Database delete reservation
    }

    static void addEmployee(Employee e) {
        // add Employee to DATABASE
    }

    static Employee logInEmployee(String un, String pw) {
        Employee e= new Employee();
        //GET FROM DATABASE EMPLOYEE WITH Username and password
        return e;
    }

    static void viewData() {
        //GET DATA FROM DATA BASE AND VIEW IT
    }

    static void deleteEmployee(int eID) {
        //Delete FROM DATABASE EMPLOYEE WITH THAT ID
    }

    static int getCustomer(int carID) {
        int c = 0;
        //GET FROM DATABASE CUSTOMERID OF CAR ID
        return c;
    }

    static boolean searchReservation(int customerID) {
        boolean found = true;
        //LOOK FOR RESERVATION FOR THAT CUSTOMER
        return found ;
    }

    
    
    
    
    
    
}
