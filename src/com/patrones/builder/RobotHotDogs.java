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
public class RobotHotDogs implements Robot{
    private List<Integer> acciones;
    
    public RobotHotDogs(){}
    
    
    private void start(){
        System.out.println("Iniciando HotDog");
    }
    
    private void getParts(){
        System.out.println("Buscando: Pan , salchichas, salsas");
    }
    
    private void build(){
        System.out.println("Armando el HotDog");
    }
    
    private void check(){
        System.out.println("Revisando HotDog");
    }
    
    private void finish(){
        System.out.println("Terminar HotDog");
    }
    
        @Override
    public void cargarAcciones(List<Integer> accion){
        this.acciones=accion;
    }
    
    @Override
    public void trabajar(){
        start();
        
        for(Integer i:acciones){
            switch(i){
                case 1:
                    getParts();
                    break;
                    
                case 2:
                    build();
                    break;
                    
                case 3:
                    check();
                    break;
                    
                default:
                    System.out.println("Esa accion no la puedo hacer :-) ");
            }
        }
        finish();
    }
}
