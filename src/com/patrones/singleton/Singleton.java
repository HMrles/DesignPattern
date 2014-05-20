/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.patrones.singleton;

/**
 *
 * @author Hugo
 */
public final class Singleton {
    private static final Singleton singleton = new Singleton();
    private static int cantidad;
    private Singleton(){     
        System.out.println("Hola, he sido creado una sola vez");
    }
    
    public static Singleton obtenerSingleton(){
        cantidad++;
        return singleton;
    }
    
    public void vecesLlamado(){
        System.out.println("Se ha llamdo: "+cantidad+" Numero de veces");
    }
}
