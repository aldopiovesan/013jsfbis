/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clienti.Presentations;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author tss
 */

@Named   //richiamo la jsf
@RequestScoped  //indicano la durata di index.java, ciclo di vita dell'istanza(quando viene creata e quando uccisa, in base alle richieste http)



public class Index {
    
    
    
   
        
        private String usr="test";
        private String pwd;

    public String getUsr() {
        return usr;
    }

    public void setUsr(String usr) {
        this.usr = usr;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        
        System.out.println("password=" +pwd);
        this.pwd = pwd;
    }
    
    
    
    public void onInvia(){
        
        System.out.println("onInvia: " + usr +" , "+ pwd);
    }
        
        
    
        
    
                       

    
    
    
    public Index(){
        
        System.out.println("chiamata al costruttore");
    
    
}
    
    
    public String hello(){
        
        return "dynamic hello messagge..." + System.currentTimeMillis();
        
    }     
        
        public String getMessagge(){
        
        return "dynamic messagge 2..." + System.currentTimeMillis();
    }
    
}
