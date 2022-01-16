/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jarmuvek;

/**
 *
 * @author zaccomer virgil
 */
public abstract class hasengine extends vehicles {
    private int weight;
    private int travkm;
    private int passengers;
    private int fuelusage;
    private int carryweight;
    
    public hasengine(String color, float price, int maxspeed,int weight,int travkm, int passengers,int fuelusage,int carryweight) throws Exception {
        super(color, price, maxspeed);
        if(travkm<0)throw new Exception("traveled km cannot be negative");
        if (weight<=300||weight>weightmax())throw new Exception("weight cannot be less than 300");
        if (passengers<=2||passengers>passengermax()) throw new Exception("passenger cannot be less than 2");
        if (fuelusage<=0)throw new Exception("fuelusage cannot be zero or negative");
        if(carryweight<=0||carryweight>carryweightmax())throw new Exception("carryweight cannot be zero or negative");
        this.weight=weight;
        this.travkm=travkm;
        this.passengers=passengers;
        this.fuelusage=fuelusage;
        this.carryweight=carryweight;
    }
    
 @Override
    public String toString(){
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append(" traveled km: " + this.travkm + "km");
        sb.append(" | Consumption: " + this.fuelusage + "l/km");
        sb.append(" | Carry capacity: " + this.carryweight + " kg\n");
        
        return sb.toString();
    }
    
   /**
    * Sets the maximum value of weight
    * @return weightmax
    */
    abstract protected int weightmax();
    /**
     * Sets the maximum value of passenger
     * @return passengermax 
     */
    abstract protected int passengermax();
    /**
     * Sets the maximum value of carryweight
     * @return carryweightmax
     */
    abstract protected int carryweightmax();
    
    
    
}
