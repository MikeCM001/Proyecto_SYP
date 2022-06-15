
package com.mycompany.conexionc;


import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Coneccion        
{
    public Connection con;
    public Statement stm;
    
    public Coneccion()
    {
        conectar();
    }
    
    public void conectar()
    {
        String url = "jdbc:postgresql://localhost:5432/inventario";
        String user = "postgres";
        String pass = "mikeCM4224";
        
        try
        {
        con = DriverManager.getConnection(url, user, pass);
        }
        catch(SQLException ex)
        {
            Logger.getLogger(Coneccion.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    
public ResultSet consultar(String sql)
        {
            ResultSet resultado = null;
            try
            {
            stm = con.createStatement();
            resultado = stm.executeQuery(sql);
            }
            catch(SQLException ex)
            {
                Logger.getLogger(Coneccion.class.getName()).log(Level.SEVERE, null, ex);            
            }
          return resultado;
    }
 
    public int accionesEdit(String sql)
    {
        int res = 0;
        
        try
        {
        stm = con.createStatement();
        res = stm.executeUpdate(sql);
        }
        catch(SQLException ex)
        {
                Logger.getLogger(Coneccion.class.getName()).log(Level.SEVERE, null, ex);            
        }
       return res;
    }


}