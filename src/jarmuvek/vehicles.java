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
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
abstract public class vehicles {
    
    private String color;
    private float price;
    private int maxspeed;

    public vehicles() {
    }

    public vehicles(String color, float price, int maxspeed) throws Exception {
        if(price<=0)throw new Exception("the price cannot be lower than zero");
        if(speedlimit()<maxspeed||maxspeed<=0) throw new Exception("the speed parameter is not correct");
        this.color = color;
        this.price = price;
        this.maxspeed = maxspeed;
    }
    
 
    /** sets the maximum speedlimit to different veichles 
     *@return Speedlimit
     */ 
    abstract protected int speedlimit();
    /**count the soluton of the given task */ 
    abstract protected int solution(int time,int maxspeed, int passengers, int distance);
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append(" price: " + this.price + " Ft");
        sb.append(" | Maxsped: " + this.maxspeed + "km/h");
        return sb.toString();
    }
    
}
