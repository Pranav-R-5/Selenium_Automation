package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Homepage {
    public static void City(ChromeDriver driver) throws InterruptedException {
        Thread.sleep(1000);
        WebElement fromcity = driver.findElement(By.xpath("//input[@list='suggestions1']"));
        fromcity.click();
        Thread.sleep(1000);
        fromcity.sendKeys("Coimbatore");
        fromcity.click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//li[@id='Coimbatore']")).click();
        WebElement tocity = driver.findElement(By.xpath("//input[@list='suggestions2']"));
        tocity.click();
        tocity.sendKeys("Banglore");
        tocity.click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//li[@id='Bangalore']")).click();






    }
    public static void date(ChromeDriver driver) throws InterruptedException{
        driver.findElement(By.id("date")).click();
        List<WebElement> months=driver.findElements(By.xpath("//div[@class='CalendarMonth_caption CalendarMonth_caption_1']/strong"));
        for(WebElement element:months){
            if(element.getText().equals("February 2024"))break;
            else driver.findElement(By.xpath("//div[@aria-label='Move forward to switch to the next month.']")).click();
//
        }

//        int i=2;
//        while(i>0){
//            Thread.sleep(1000);
//            driver.findElement(By.xpath("//div[@aria-label='Move forward to switch to the next month.']")).click();
//            i--;
//        }

        Thread.sleep(1000);
        WebElement day= driver.findElement(By.xpath("//td[@aria-label='Monday, January 29, 2024']"));
//        Thread.sleep(1000); Thursday, February 1, 2024
        day.click();

    }

    public static void search(ChromeDriver driver) throws InterruptedException{
        WebElement searchbutton=driver.findElement(By.xpath("//span[@class='formshome_textSearch__U73WY']"));
        searchbutton.click();
    }
}
