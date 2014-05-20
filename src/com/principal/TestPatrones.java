/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.principal;

import com.patrones.builder.Builder;
import com.patrones.builder.Robot;
import java.util.Scanner;

import com.patrones.factory.Factory;
import com.patrones.singleton.Singleton;
import com.patrones.factory.Conexion;
/**
 *
 * @author Hugo
 */
public class TestPatrones {
    public static void main(String []args){
//        /******Patron Singleton*****/
//        Singleton miSingleton = Singleton.obtenerSingleton();
//        Singleton miSingletonDos = Singleton.obtenerSingleton();
//        Singleton miSingletonTres = Singleton.obtenerSingleton();
//        Singleton miSingletonCuatro = Singleton.obtenerSingleton();
//        Singleton miSingletonCinco = Singleton.obtenerSingleton();
//        miSingletonCuatro.vecesLlamado();
//        
//        /*****Patron Factory*****/
//        Scanner leer= new  Scanner(System.in);
//        Factory factory;
//        Conexion conexion;
//        
//        System.out.println("Digite la BD");
//        String tipo = leer.nextLine();
//        
//        factory = new Factory(tipo);
//        conexion = factory.creaConexion();
//        
//        String salida ="Esta conectado con: "+conexion.descripcion();
//        System.out.println(salida);
//        
//        /****Abstract Factory*****/
        
        /**** Builder*****/
        Scanner leer = new Scanner(System.in);
        Builder constructor = new Builder();
        Robot robot;
        int tipoRobot;
        
        System.out.println("Digite el tipo de robot que quire: "); 
        tipoRobot=leer.nextInt();
        
        constructor.setRobot(tipoRobot);
        constructor.addRevisar();
        constructor.addImposible();
        constructor.addGetIngredientes();
        constructor.addArmar();
        constructor.addRevisar();
        
        robot = constructor.getRobot();
        robot.trabajar();
        
    }
    
}
