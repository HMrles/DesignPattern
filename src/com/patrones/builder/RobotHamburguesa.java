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
public class RobotHamburguesa implements Robot{
    
    List<Integer> acciones;
    public RobotHamburguesa(){}
    
    private void iniciar(){
        System.out.println("Iniciando la Hamburguesa");
    }
    
    private void getIngredientes(){
        System.out.println("Buscando: pan, hamburguesa, salsas ");
    }
    
    private void revisar(){
        System.out.println("Revisando el proceso");
    }
    
    private void armar(){
        System.out.println("Armando la hamburguesa");
    }
    
    private void terminar(){
        System.out.println("Terminado la hamburguesa");
    }

    @Override
    public void cargarAcciones(List<Integer> accion){
        this.acciones=accion;
    }
    
    @Override
    public void trabajar(){
        iniciar();
        
        for(Integer i:acciones){
            switch(i){
                case 1:
                    getIngredientes();
                    break;
                    
                case 2:
                    armar();
                    break;
                    
                case 3:
                    revisar();
                    break;
                    
                default:
                    System.out.println("Esa accion no la puedo hacer :-) ");
            }
        }
        terminar();
    }
}
