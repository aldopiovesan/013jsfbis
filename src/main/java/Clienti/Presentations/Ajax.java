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



@Named
@RequestScoped
public class Ajax {
    
    private String msg;
    private boolean error;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
    
     public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }
    
    
    
    public void onAjax(){
        
        this.error = msg.contains("error");
    }
    
  

   
}
