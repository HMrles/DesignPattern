/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.patrones.builder;
import java.util.List;
/**
 *
 * @author Hugo
 */
public class Builder {
    
    Robot robot;
    List<Integer> acciones;
    
    public Builder(){
        
    } 
    
    public void setRobot(int i){
        if(i==1)
           robot = new RobotHamburguesa();
        else 
            robot = new RobotHotDogs();
    }
           
    public void addGetIngredientes(){
        acciones.add(1);
    }
    
    public void addArmar(){
        acciones.add(2);
    }
    
    public void addRevisar(){
        acciones.add(3);
    }
    
    public void addImposible(){
        acciones.add(100);
    }
    
    public Robot getRobot(){
        robot.cargarAcciones(acciones);
        return robot;
    }
}
