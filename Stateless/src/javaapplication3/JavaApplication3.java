/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import org1.LibrarySessionBeanRemote;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Properties;
import javax.naming.InitialContext;
import javax.naming.NamingException;
/**
 *
 * @author rajjaz
 */
public class JavaApplication3 {

    
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
        // TODO code application logic here
         
      JavaApplication3 ejbTester = new JavaApplication3();
 
      ejbTester.testStatelessEjb();
    }
    
    
    
     private void testStatelessEjb() throws NamingException{
          LibrarySessionBeanRemote libraryBean = 
         (LibrarySessionBeanRemote)ctx.lookup("NewSessionBean/remote");
         System.out.println(libraryBean.sayHello("rajjaz"));
     }
}
