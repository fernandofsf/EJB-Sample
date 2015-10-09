/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org1;

import javax.ejb.Remote;

/**
 *
 * @author rajjaz
 */
@Remote
public interface LibrarySessionBeanRemote {
    public String display();
    public String sayHello(String name);
}
