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

public class Customer {
    private String name;
    private int customerID;
    private String customerCreditNumber;
    private String customerPassword ;
    private String customerUsername;
    
    public Customer (){
        
    };
    
    public Customer (String CCN ,String pass,Car car,String un){
        customerCreditNumber=CCN;
        customerPassword = pass;
        customerUsername = un;
        addCar(customerID,car);
    }
    
    public void setData (String n ,int cID ,String CCN ,String pass,Car car,
            String un){
        setName(n);
        setCustomerID(cID) ;
        setCustomerCreditNumber(CCN);
        setCustomerPassword(pass);
        setCustomerUsername(un);
        
    }
    
    public void addCar(int cID,Car car){
            Database.addCar(cID,car);
    }
    
    public void signUp(){
            Database.addCustomer(this);
    }
    
    public Customer logIn (String n , String p){
            Customer c = Database.logInCustomer(n,p);
            return c;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
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
     * @return the customerCreditNumber
     */
    public String getCustomerCreditNumber() {
        return customerCreditNumber;
    }

    /**
     * @param customerCreditNumber the customerCreditNumber to set
     */
    public void setCustomerCreditNumber(String customerCreditNumber) {
        this.customerCreditNumber = customerCreditNumber;
    }

    /**
     * @return the customerPassword
     */
    public String getCustomerPassword() {
        return customerPassword;
    }

    /**
     * @param customerPassword the customerPassword to set
     */
    public void setCustomerPassword(String customerPassword) {
        this.customerPassword = customerPassword;
    }

    /**
     * @return the customerUsername
     */
    public String getCustomerUsername() {
        return customerUsername;
    }

    /**
     * @param customerUsername the customerUsername to set
     */
    public void setCustomerUsername(String customerUsername) {
        this.customerUsername = customerUsername;
    }
    
    
    
    
    
    
}
