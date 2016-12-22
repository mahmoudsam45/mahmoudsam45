/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.lang.reflect.Constructor;


public class Account {
    
    private String name = "" ;
    private String pass = "" ;
    private String email = "" ;
    private String gendre = "" ;

    
    
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getPass() {
        return pass;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setGendre(String gendre) {
        this.gendre = gendre;
    }

    public String getGendre() {
        return gendre;
    }
    
    
    public void create()
    {
        
    }
    
    public void sign_in()
    {
        
    }
    
    public void sign_out()
    {
        
    }
    
    
}
