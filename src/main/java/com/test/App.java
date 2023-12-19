package com.test;

import dev.failsafe.internal.util.Durations;
import org.bouncycastle.LICENSE;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;



public class App 
{
    public static void main( String[] args ) throws InterruptedException {
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.zingbus.com/?gad_source=1&gclid=CjwKCAiA-P-rBhBEEiwAQEXhH_OH4wjCY9pg64Bsy3AP-QBMSegerkxUufCqhHl854g0rkmHqsasrBoCZicQAvD_BwE");
        System.out.println(driver.getTitle());
            driver.manage().window().maximize();
         Homepage home=new Homepage();
         Searchpage searchpage=new Searchpage();

        home.City(driver);
        home.date(driver);
        home.search(driver);
        searchpage.removepopup(driver);
        searchpage.nightdeparture(driver);
        searchpage.selectseat(driver);
        searchpage.bookticket(driver);


//        System.out.println(driver.getPageSource());
       // System.out.println(driver.getCurrentUrl());
         //  System.out.println(driver.manage().logs());
//        driver.findElement(By.id("user-name")).sendKeys("1234");
//        driver.findElement(By.name("password")).sendKeys("12345");

//        FluentWait wait=new FluentWait(driver);
//        try{   done
//         Thread.sleep(5000);
//
//            WebElement ele=driver.findElement(By.id("webklipper-publisher-widget-container-notification-frame"));
//            driver.switchTo().frame(ele);
//            driver.findElement(By.className("close")).click();  done
////            WebElement element=driver.findElement(By.id("webklipper-publisher-widget-container-notification-close-div"));
//            JavascriptExecutor executor = (JavascriptExecutor)driver;
//            executor.executeScript("arguments[0].click();", element);

//        }
//        catch(Exception e){
//            System.out.println("jvhdac");
//        }
//        finally {
//         //   driver.quit();
//        }

//        driver.switchTo().defaultContent();
//        Thread.sleep(1000);
//        List<WebElement> elementlist = driver.findElements(By.xpath("//span[@class='headerIconTextAlignment chNavText darkGreyText']"));
//
//        for(WebElement webElement:elementlist){
//            String text=webElement.getText();
//
//            if(text.equals("Trains")){
//                webElement.click();
//                break;
//            }
//        }
//        Thread.sleep(1000);
//        driver.findElement(By.id("fromCity")).click();
//        Thread.sleep(1000);
//        WebElement e= driver.findElement(By.xpath("//input[@title='From']"));
//        e.sendKeys("Coimbatore");
//        Thread.sleep(1000);
//        driver.findElement(By.id("react-autowhatever-1")).click();
//        Thread.sleep(1000);
//        WebElement to=driver.findElement(By.xpath("//input[@title='To']"));
//        to.click();
//        Thread.sleep(1000);
//        to.sendKeys("Tirupati");
//        Thread.sleep(1000);
//        driver.findElement(By.id("react-autowhatever-1-section-0-item-0")).click();
//        Thread.sleep(1000);
//        driver.findElement(By.id("travelDate")).click();
//        Thread.sleep(1000);
//
//        while(!driver.findElement(By.xpath("//div[@role=\"heading\"]/div")).getText().equals("March 2024")){
//            Thread.sleep(1000);
//            driver.findElement(By.xpath("//span[@aria-label=\"Next Month\"]")).click();
//        }
//        Thread.sleep(1000);
//        List<WebElement> days= driver.findElements(By.xpath("\n" +
//                "//div[@class=\"DayPicker-Body\"]/div[@class='DayPicker-Week']/div[@class='DayPicker-Day']"));
//        for(WebElement element:days){
//            String text=element.getText();
//            Thread.sleep(1000);
//            if(text.equals("1")){
//                element.click();
//                break;
//            }
//        }
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("//span[@data-cy=\"class\"]")).click();
//        driver.findElement(By.xpath("//li[@data-cy='SL']")).click();
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("//a[@data-cy=\"submit\"]")).click();
//        Thread.sleep(2000);
//
//        driver.findElement(By.xpath("//input[@id=\"journeyClassFilter-SL\"]")).click();
//
//        List<WebElement> trainlist=  driver.findElements(By.xpath("//div[@class='single-train-detail single-train-padding']"));
//
//        for(WebElement trains:trainlist){
//            List<WebElement> cl = trains.findElements(By.xpath("//div[@class='ticket-price justify-flex-end']"));
//            for(WebElement webElement:cl){
//                System.out.println(webElement.getText());
//            }
//        }
//


    }
    public static void waitForEnableCondition(WebDriver driver,WebElement e){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(e));
    }
}
