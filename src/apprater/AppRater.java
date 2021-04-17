
package apprater;



public class AppRater {

    public static void main(String[] args) {
     AutoForm webSite=new AutoForm();
     //Para la descripccion del producto se tiene que usar un label que contenta la palbara descrio,content,deta
     //Esas palabras puede ser myProductDescription, Details, Contenido , etc..-
     webSite.sendText("myName", "name","user-submitted-name","DIEGO ANTONIO");
     webSite.sendText("myEmail", "css","user-submitted-email","diezer_diego@hotmail.com");
     webSite.sendText("myProductTitle", "css","user-submitted-title","Ing Sistemas.");
     webSite.sendText("myProducURL", "xpath","user-submitted-url[]","https://www.facebook.com/profile.php?id=100004320407823"); 
     webSite.sendText("myProductDescription", "xpath","user-submitted-content","Dispuesto a dar todo de mi esfuerzo, Soy una persona muy proactiva"); 
   //webSite.quit();
    }
    
}
