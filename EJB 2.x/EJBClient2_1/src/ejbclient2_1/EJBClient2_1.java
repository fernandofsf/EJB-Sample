/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejbclient2_1;

import com.hubberspot.ejb.HelloHome;
import com.hubberspot.ejb.HelloRemote;
import java.rmi.RemoteException;
import java.util.Properties;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.rmi.PortableRemoteObject;
/**
 *
 * @author rajjaz
 */
public class EJBClient2_1 {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
 
        try {
 
            // Creating a Property object
            Properties props = new Properties();
 
            // Providing the props the Initial Context factory Class
            props.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.enterprise.naming.SerialInitContextFactory");
            // Setting the host by giving url here its localhost
            props.setProperty("org.omg.CORBA.ORBInitialHost", "localhost");         
            // Glassfish's default jndi registry server port
            props.setProperty("org.omg.CORBA.ORBInitialPort", "3700");
 
            // Creating an Initial Context object by passing 
            // properties created above. It will help us 
            // locating the Home Interface through JNDI
            InitialContext ctx = new InitialContext(props);
 
            // Having a lookup for the jndi name specified in 
            // the glassfish-ejb-jar.xml file
            Object obj = ctx.lookup("HelloBean");
 
            // Converting Corba object to portable object below
            // and getting the Home interface reference
            HelloHome beanhome = 
                    (HelloHome) javax.rmi.PortableRemoteObject.narrow(obj, HelloHome.class); 
            // Calling the create method of home interface which 
            // will return back the reference of remote interface
            HelloRemote bean = (HelloRemote)beanhome.create();
 
            // calling the business method of remote interface
            bean.sayHello();
        }
        catch (RemoteException e) {
 
            e.printStackTrace();
        }
        catch (NamingException e) {
 
            e.printStackTrace();
        }
 
    }
    
}
