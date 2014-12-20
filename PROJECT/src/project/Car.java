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
class Car {
    private String PlateNum ;
    private String model;
    private int carID;
    
    public Car(){
        
    }
    
    public Car(String pn , String m){
        PlateNum = pn;
        model = m;
    }
    
    public void setData (String pn , String m, int car){
        setPlateNum(pn);
        setModel(m);
        setCarID(car);
        
    }
    
    
    
    public void addCar(){
        Database.addCar(getCarID(), this);
    }

    /**
     * @return the PlateNum
     */
    public String getPlateNum() {
        return PlateNum;
    }

    /**
     * @param PlateNum the PlateNum to set
     */
    public void setPlateNum(String PlateNum) {
        this.PlateNum = PlateNum;
    }

    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return the carID
     */
    public int getCarID() {
        return carID;
    }

    /**
     * @param carID the carID to set
     */
    public void setCarID(int carID) {
        this.carID = carID;
    }
}
