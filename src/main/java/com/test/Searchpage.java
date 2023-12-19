package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Searchpage {
    public static void removepopup(ChromeDriver driver) throws InterruptedException{
        Thread.sleep(10000);
        WebElement popup=driver.findElement(By.xpath("//div[@class='signUpNowPopUp_close__QE33K']"));
        popup.click();
    }
    public static void nightdeparture(ChromeDriver driver) throws InterruptedException{
        Thread.sleep(1000);
        List<WebElement> spanlist=driver.findElements(By.xpath("//span[@style='font-family:Montserrat-Medium;font-style:normal;font-weight:500;font-size:14px;line-height:17px;color:#333333;opacity:0.7']"));
//        Thread.sleep(1000);
        for(WebElement list:spanlist){
//            Thread.sleep(1000);
            if(list.getText().equals("Late (9PM-12AM)")){
                list.click();
                break;
            }
        }
    }

    public static void selectseat(ChromeDriver driver) throws InterruptedException{
        Thread.sleep(6000);
        WebElement select=driver.findElement(By.xpath("//button[@class='btn btn-secondry button_button__eJwei']"));
        select.click();
        Thread.sleep(8000);
        List<WebElement> birth= driver.findElements(By.xpath("//div[@class='seatView_rootContainer__7ISi3']/div/div"));
        Thread.sleep(6000);
        System.out.println("");
        for(WebElement element:birth){
            boolean seatselected=false;
            Thread.sleep(3000);
            List<WebElement> seats=element.findElements(By.xpath("//div[@class='seatView_seatGrid__q8A8t']/div"));
            System.out.println("abcd");
           Thread.sleep(3000);
            boolean seatfree=false;
            for(WebElement seat:seats){
//                Thread.sleep(1000);
                //System.out.println();
                System.out.println(seatfree);
                System.out.println(seat.getAttribute("class"));
                Thread.sleep(1000);
                if(seat.getAttribute("class").equals("seatView_seat2x1__AIRQv text-center vertical-center") && seatfree==true){
                    seat.click();
                    seatselected=true;

                    break;
                } else if (seat.getAttribute("class").equals("seatView_seat2x1__AIRQv text-center vertical-center")) {
                    seatfree=true;
                }
                else seatfree=false;
            }
            if(seatselected){
                break;
            }
        }
    }

    public static void bookticket(ChromeDriver driver) throws InterruptedException{
        Thread.sleep(10000);
        WebElement booknow= driver.findElement(By.xpath("//button[@class='btn btn-secondry']"));
        Thread.sleep(1000);
        booknow.click();
        Thread.sleep(20000);
        String seatno=driver.findElement(By.xpath("//span[@class='passengerInfoCheckout_seatDetails__AJHLG']")).getText();
        System.out.println("SEAT NO : "+seatno);
        String cost=driver.findElement(By.xpath("//span[@class='priceContainerNew_netText__ft1i0']")).getText();
        System.out.println("TOTAL COST :"+cost);
        String date=driver.findElement(By.xpath("//span[@class='leftContentSection_time__ELINm']")).getText();
        System.out.println("DATE :"+date);
    }
}
