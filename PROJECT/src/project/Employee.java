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
public class Employee {
    
    private String name ;
    private int employeeID;
    private String employeeUsername;
    private String employeePassword;
    private boolean Manager ;
    
    Employee(){
        
    }
    
    public Employee(String n ,int eID , String eun , String pw ,boolean m){
        name = n;
        employeeID = eID;
        employeeUsername = eun;
        employeePassword = pw;
        Manager = m;
    }
    
    public void setData (String n ,int eID , String eun , String pw,boolean m){
        setName(n);
        setEmployeeID(eID);
        setEmployeeUsername(eun);
        setEmployeePassword(pw);
        setManager(m);
        
    }
    
    public void addEmployee(){
        Database.addEmployee(this);
    }
    
    public Employee employeeLogIn(String un , String pw){
        Employee e = Database.logInEmployee(un,pw);
        return e;
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
     * @return the employeeID
     */
    public int getEmployeeID() {
        return employeeID;
    }

    /**
     * @param employeeID the employeeID to set
     */
    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    /**
     * @return the employeeUsername
     */
    public String getEmployeeUsername() {
        return employeeUsername;
    }

    /**
     * @param employeeUsername the employeeUsername to set
     */
    public void setEmployeeUsername(String employeeUsername) {
        this.employeeUsername = employeeUsername;
    }

    /**
     * @return the employeePassword
     */
    public String getEmployeePassword() {
        return employeePassword;
    }

    /**
     * @param employeePassword the employeePassword to set
     */
    public void setEmployeePassword(String employeePassword) {
        this.employeePassword = employeePassword;
    }

    /**
     * @return the Manager
     */
    public boolean isManager() {
        return Manager;
    }

    /**
     * @param Manager the Manager to set
     */
    public void setManager(boolean Manager) {
        this.Manager = Manager;
    }
    
    
    
    
    
    
 
    
}
