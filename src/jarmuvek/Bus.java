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
public class Bus extends hasengine {

    public Bus(String color, float price, int maxspeed, int weight, int travkm, int passengers, int fuelusage, int carryweight) throws Exception {
        super(color, price, maxspeed, weight, travkm, passengers, fuelusage, carryweight);
    }


    @Override
    protected int speedlimit() {
      int speedlimit=130;
      return speedlimit;
    }

   @Override
    protected int solution(int time,int maxspeed, int passengers, int distance) {
        int traveled=time*maxspeed;
       int rounds=traveled/(2*distance);
       int passengercarried=rounds*passengers;
       return passengercarried;
    }

    @Override
    protected int weightmax() {
       int weightmax=6000;
       return weightmax;
    }

    @Override
    protected int passengermax() {
     int passengermax=60;
     return passengermax;
    }

    @Override
    protected int carryweightmax() {
      int carryweightmax=400;
      return carryweightmax;  
    }
}
