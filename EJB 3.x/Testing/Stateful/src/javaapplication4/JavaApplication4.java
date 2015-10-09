/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import org1.LibrarySessionBeanRemote;
import org1.NewStatefulSessionBeanRemote;
/**
 *
 * @author rajjaz
 */
public class JavaApplication4 {

        
       BufferedReader brConsoleReader = null; 
   Properties props;
   InitialContext ctx;
   {
      props = new Properties();
      try {
      props.load(new FileInputStream("jndi.properties"));
      } catch (IOException ex) {
      ex.printStackTrace();
      }
      try {
      ctx = new InitialContext(props);            
      } catch (NamingException ex) {
      ex.printStackTrace();
      }
      brConsoleReader = 
      new BufferedReader(new InputStreamReader(System.in));
   }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws NamingException {
       JavaApplication4 ejbTester = new JavaApplication4();
      ejbTester.testStatelessEjb();
    }
    
         private void testStatelessEjb() throws NamingException{
       
                  NewStatefulSessionBeanRemote libraryBean;
           libraryBean = (NewStatefulSessionBeanRemote)ctx.lookup("NewStatefulSessionBean/remote");
                  
                System.out.println("Obtained a remote stateful counter for invocation");
        // invoke on the remote counter bean
        final int NUM_TIMES = 5;
        System.out.println("Counter will now be incremented " + NUM_TIMES + " times");
        for (int i = 0; i < NUM_TIMES; i++) {
            System.out.println("Incrementing counter");
            libraryBean.increment();
            System.out.println("Count after increment is " + libraryBean.getCount());
        }
        // now decrementing
        System.out.println("Counter will now be decremented " + NUM_TIMES + " times");
        for (int i = NUM_TIMES; i > 0; i--) {
            System.out.println("Decrementing counter");
            libraryBean.decrement();
            System.out.println("Count after decrement is " + libraryBean.getCount());
        }
     }
}
