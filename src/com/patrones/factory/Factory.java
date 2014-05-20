/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.patrones.factory;

/**
 *
 * @author Hugo
 */
public class Factory {
    protected String tipo;
    
    public Factory(String tipo){
        this.tipo=tipo;
    }
            
    public Conexion creaConexion(){
        if(tipo.equalsIgnoreCase("Oracle"))
            return new OracleConexion();
        if(tipo.equalsIgnoreCase("SqlServer"))
            return new SqlServerConexion();
        if(tipo.equalsIgnoreCase("Postgresql"))
            return new PostgresqlConexion();
        else
            return new MysqlConexion();
    }
}
