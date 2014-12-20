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
class Place {
    private String name;
    private boolean occupied=false;
    public Place(String n){
        name =n;
    }
    public Place(){}
    
    public void setPlaceName(String n){
        setName(n);
    }
    
    public String getPlaceName(){
        return getName();
    }
    
    public void park(){
        setOccupied(true);
    }
    
    
    public void empty(){
        setOccupied(false);
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
     * @return the occupied
     */
    public boolean isOccupied() {
        return occupied;
    }

    /**
     * @param occupied the occupied to set
     */
    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }
}
