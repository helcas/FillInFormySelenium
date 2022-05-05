package com.example.fillinformyselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class FillInFormy {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");
        driver.manage().window().maximize();
        // Fills in the form.
        WebElement firstName = driver.findElement(By.id("first-name"));
        firstName.sendKeys("First name");

        WebElement lastName = driver.findElement(By.id("last-name"));
        lastName.sendKeys("Last name");
        WebElement jobTitle = driver.findElement(By.id("job-title"));
        jobTitle.sendKeys("My job");

        WebElement education = driver.findElement(By.id("radio-button-2"));
        education.click();

        WebElement gender = driver.findElement(By.id("checkbox-3"));
        gender.click();

        WebElement experience = driver.findElement(By.id("select-menu"));
        Select selectExperience = new Select(experience);
        selectExperience.selectByVisibleText("2-4");

        WebElement date = driver.findElement(By.id("datepicker"));
        date.sendKeys("05052022");




    }

}
