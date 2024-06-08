package IRCTCpackage;

import java.time.Duration;
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class IRCTCAutomation {

	public static void main(String[] args) {
	      
        // Initialize the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the IRCTC website
        driver.get("https://www.irctc.co.in/nget/train-search");
        driver.manage().window().maximize();

//        // Accept the alert
//        WebElement okField = driver.findElement(By.xpath("/html/body/app-root/app-home/div[1]/app-header/p-dialog[2]/div/div[2]/div/form/div[2]/button"));
//        okField.click();
//
//        // Wait for 5 seconds
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        // Fill in the 'From' field
        WebElement fromField = driver.findElement(By.xpath("/html/body/app-root/app-home/div[3]/div/app-main-page/div/div/div[1]/div[1]/div[1]/app-jp-input/div/form/div[2]/div[1]/div[1]/p-autocomplete/span/input\r\n"));
        fromField.sendKeys("C SHIVAJI MAH T - CSMT");
        fromField.sendKeys(Keys.TAB);

        // Fill in the 'To' field
        WebElement toField = driver.findElement(By.xpath("//*[@id='destination']/span/input"));
        toField.sendKeys("PATNA JN - PNBE");
        toField.sendKeys(Keys.TAB);

        // Select the date
        WebElement dateField = driver.findElement(By.xpath("/html/body/app-root/app-home/div[3]/div/app-main-page/div/div/div[1]/div[1]/div[1]/app-jp-input/div/form/div[2]/div[2]/div[1]/p-calendar/span/input\r\n"));
        dateField.click();

        WebElement dateField1 = driver.findElement(By.xpath("/html/body/app-root/app-home/div[3]/div/app-main-page/div/div/div[1]/div[1]/div[1]/app-jp-input/div/form/div[2]/div[2]/div[1]/p-calendar/span/div/div/div[2]/table/tbody/tr[6]/td[1]/a\r\n"));
        dateField1.click();

        // Select the class
        WebElement classField = driver.findElement(By.xpath("//*[@id='journeyClass']"));
        classField.click();

        WebElement class1Field = driver.findElement(By.xpath("//*[@id='journeyClass']/div/div[4]/div/ul/p-dropdownitem[14]/li"));
        class1Field.click();

        // Click on 'Find trains'
        WebElement findField = driver.findElement(By.xpath("/html/body/app-root/app-home/div[3]/div/app-main-page/div/div/div[1]/div[1]/div[1]/app-jp-input/div/form/div[5]/div[1]/button\r\n"));
        findField.click();

        // Wait for 5 seconds
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }



        // Check availability
        WebElement checkAvail = driver.findElement(By.xpath("/html/body/app-root/app-home/div[3]/div/app-train-list/div[4]/div/div[5]/div/div[1]/app-train-avl-enq/div[1]/div[5]/div[1]/table/tr/td[1]/div\r\n"));
        checkAvail.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement check = driver.findElement(By.xpath("/html/body/app-root/app-home/div[3]/div/app-train-list/div[4]/div/div[5]/div/div[1]/app-train-avl-enq/div[1]/div[7]/div[1]/div[3]/table/tr/td[2]/div/div[2]\r\n"));
		check.click();

        // Wait for 3 seconds
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Click on 'Book Now'
        WebElement bookNow = driver.findElement(By.xpath("/html/body/app-root/app-home/div[3]/div/app-train-list/div[4]/div/div[5]/div/div[1]/app-train-avl-enq/div[2]/div/span/span[1]/button\r\n"));
        bookNow.click();
        
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }



        // Click OK on the confirmation dialog
        WebElement ok1Field = driver.findElement(By.xpath("html/body/app-root/app-home/div[3]/div/app-train-list/p-confirmdialog[2]/div/div/div[3]/button[1]/span[2]"));
        ok1Field.click();
        
        
        
      
 
         //Enter username and password
//        driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-home[1]/div[3]/app-login[1]/p-dialog[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form[1]/div[1]/input[1]\r\n")).sendKeys("yashchavan10"); // Replace with your username
//        System.out.println("Username field found, entering username...");
//       
//        driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-home[1]/div[3]/app-login[1]/p-dialog[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form[1]/div[2]/input[1]\r\n")).sendKeys("Yash@2002"); // Replace with your password
//        System.out.println("password field found, entering password...");
//        
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Wait for up to 10 seconds
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/app-root[1]/app-home[1]/div[3]/app-login[1]/p-dialog[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form[1]/div[1]/input[1]\r\n"))).sendKeys("yashchavan10"); // Replace with your username

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/app-root[1]/app-home[1]/div[3]/app-login[1]/p-dialog[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/form[1]/div[2]/input[1]\r\n"))).sendKeys("Yash@2002"); // Replace with your password

        // Wait for the user to enter captcha manually
        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Click on 'Sign In'
        WebElement signIn = driver.findElement(By.xpath("/html/body/app-root/app-home/div[3]/app-login/p-dialog[1]/div/div/div[2]/div[2]/div/div[2]/div[2]/div[2]/form/span/button"));
        signIn.click();

        // Close the browser
        //driver.close();
	}

}
