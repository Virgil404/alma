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
import java.util.ArrayList;

public class Fleet {
     
     static final private Fleet instance = new Fleet();
    static public Fleet getInstance() { return instance; }
    
    static private ArrayList<vehicles> vheicle = new ArrayList<vehicles>();
      static private ArrayList<Integer> solution = new ArrayList<Integer>();
    public void VehicleFleet(){}
    
    /**
     * puts the object in the list 
     * @param veh 
     */
     public static void PutIn (vehicles veh){
    
                 vheicle.add(veh);
    }
     /**
      * puts the value returned by the Solution method in a list 
      * @param sloutions 
      */
     public static void PutInsolution (int sloutions){
    
                 solution.add(sloutions);
    }
     public static int length(){   
         return vheicle.size();
}
     /**
      * sum the values in the solution list
      * @return sum of solution list
      */
     public static int finalsolution(){
 int deliveredpersons= 0;
for(int i = 0; i < solution.size(); i++)
    deliveredpersons += solution.get(i);
return deliveredpersons;
     
     }
     public static void reset(){
         vheicle.clear();
         solution.clear();
         
     }
     
     
}