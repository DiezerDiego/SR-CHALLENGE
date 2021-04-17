
package apprater;

import java.util.Arrays;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutoForm {
   private final WebDriver driver;
   public AutoForm(){ 
    System.setProperty("webdriver.chrome.driver", "src/apprater/ChromeDriver/chromedriver.exe"); 
    driver=new ChromeDriver(); urlPage(); 
   }
   private void urlPage(){ driver.get("https://apprater.net/add/"); }
   private WebElement searchElement(String SelectorType,String selector,String label){
   switch(SelectorType.toLowerCase()){ 
       case "css":return Arrays.asList("descrip","content","deta").contains(label.toLowerCase()) ?  driver.findElement(By.cssSelector("textarea[name="+selector+"]")): driver.findElement(By.cssSelector("input[name="+selector+"]")); 
       case "name":return driver.findElement(By.name(selector)); 
      case "xpath":return Arrays.asList("descrip","content","deta").contains(label.toLowerCase()) ? driver.findElement(By.xpath("//textarea[@name="+"'"+selector+"'"+"]")):driver.findElement(By.xpath("//input[@name="+"'"+selector+"'"+"]"));
       default:  return null; } }
   public void sendText(String label,String SelectorType,String selector,String value){
    try {WebElement Element=searchElement(SelectorType, selector,label);
   Element.sendKeys(value);
  new Actions(driver).moveToElement(Element).perform(); } catch (NullPointerException e) {System.out.println("No se encontro el elemento");}}
   //optional
   public void quit(){driver.quit();}
}