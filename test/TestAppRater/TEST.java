/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestAppRater;

import apprater.AutoForm;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dieze
 */
public class TEST {
     static AutoForm webSite;
    @BeforeClass
    public static void Instance() {
    webSite=new AutoForm();
    }
    
    @Test
    public void Test() {
        webSite.sendText("myName", "name","user-submitted-name","DIEGO ANTONIO");
       webSite.sendText("myLastName", "xpath","user-submitted-email","diezer_diego@hotmail.com");
       webSite.sendText("myProductTitle", "xpath","user-submitted-title","Ing Sistemas.");
       webSite.sendText("myProducURL", "xpath","user-submitted-url[]","https://www.facebook.com/profile.php?id=100004320407823");
       webSite.sendText("myProductDescription", "xpath","user-submitted-content","Dispuesto a dar todo de mi esfuerzo, Soy una persona muy comprometida"); 
    
    }
    
}
