/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org;

import javax.ejb.Stateless;

/**
 *
 * @author malaka
 */
@Stateless(name="NewBean", mappedName="ejb/NewBean")
public class NewBean implements NewBeanRemote, NewBeanLocal {

    public String display(){
        return "Hello JBoss";
    }
    public String sayHello(String name){
        return "Hello " + name;
    }
}
