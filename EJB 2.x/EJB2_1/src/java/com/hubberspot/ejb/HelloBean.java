/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hubberspot.ejb;

import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBException;
import javax.ejb.SessionBean;
import javax.ejb.SessionContext;

/**
 *
 * @author rajjaz
 */

public class HelloBean implements SessionBean {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
        @Override
    public void ejbActivate() throws EJBException, RemoteException {
    }
 
    @Override
    public void ejbPassivate() throws EJBException, RemoteException {
    }
 
    @Override
    public void ejbRemove() throws EJBException, RemoteException {
    }
 
    @Override
    public void setSessionContext(SessionContext arg0) throws EJBException,
    RemoteException {
    }
 
    // used for creating a reference to RemoteInterface
    public void ejbCreate () throws CreateException{
        System.out.println("ejb - create");
    }
 
    // Our business method which client will call
    public void sayHello() throws RemoteException, CreateException {
        System.out.println("Hello World by EJB 2.x ...");
    }
}
