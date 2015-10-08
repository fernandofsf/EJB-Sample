/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org1;

import javax.ejb.Stateless;

/**
 *
 * @author rajjaz
 */
@Stateless
public class NewSessionBean implements LibrarySessionBeanRemote {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
        public String display(){
        return "Hello JBoss";
    }
    public String sayHello(String name){
        return "Hello " + name;
    }
}
