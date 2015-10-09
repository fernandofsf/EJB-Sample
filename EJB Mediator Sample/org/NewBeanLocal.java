/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org;

import javax.ejb.Local;

/**
 *
 * @author malaka
 */
@Local
public interface NewBeanLocal {
    public String display();
    public String sayHello(String name);
}
