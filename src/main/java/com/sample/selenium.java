package com.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static java.lang.System.out;
import static java.lang.System.setProperty;


public class selenium {

    public static <input> void main(String[] args) {

        setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("http://localhost:8080/controllerMainServlet");

        WebElement name = driver.findElement(By.name("customerName"));
        name.getText();

       WebElement select = driver.findElement(By.tagName("selectedorder"));
        List<WebElement> allOptions = select.findElements(By.tagName("option"));
        for (WebElement option : allOptions) {
            System.out.println(String.format("Value is: %s", option.getAttribute("value")));
            option.click();
        }

        out.println("Page title is: " + driver.getTitle());


        driver.quit();
    }
}
