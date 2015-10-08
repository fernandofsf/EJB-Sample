/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org1;

import javax.ejb.Remote;
import javax.ejb.Stateful;

/**
 *
 * @author rajjaz
 */
@Stateful
@Remote(NewStatefulSessionBeanRemote.class)
public class NewStatefulSessionBean implements NewStatefulSessionBeanRemote {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
    
    private int count = 0;

    @Override
    public void increment() {
        this.count++;
    }

    @Override
    public void decrement() {
        this.count--;
    }

    @Override
    public int getCount() {
        return this.count;
    }
}
