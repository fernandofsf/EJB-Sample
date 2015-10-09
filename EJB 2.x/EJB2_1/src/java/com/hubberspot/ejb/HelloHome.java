/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hubberspot.ejb;
import java.rmi.RemoteException;
import javax.ejb.EJBHome;
/**
 *
 * @author rajjaz
 */
public interface HelloHome extends EJBHome{
    public HelloRemote create() throws RemoteException;
}
