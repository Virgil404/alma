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
public class bycicle  extends vehicles{
    public bycicle(String color, float price, int maxspeed, int driver) throws Exception {
        super(color, price, maxspeed);
    }

    @Override
    protected int speedlimit() {
       int speedlimit=50;
       return speedlimit;//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected int solution(int time,int maxspeed, int passengers, int distance) {
        return 1;
    }
    
}
