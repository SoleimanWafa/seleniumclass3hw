package class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW3 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/text-box");
        driver.manage().window().maximize();

        WebElement textBox1=driver.findElement(By.xpath("//input[@placeholder='Full Name']"));
        textBox1.sendKeys("Soleiman Wafa");

        WebElement textbox2=driver.findElement(By.xpath("//input[@id='userEmail']"));
        textbox2.sendKeys("goku5469@hotmail.com");

        WebElement address = driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
        address.sendKeys("123 Sesame Street");
        WebElement permaddress = driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
        permaddress.sendKeys("123 Sesame Street");

        WebElement submitBTN=driver.findElement(By.linkText("//button[@id='submit']"));
        submitBTN.click();

        driver.quit();





    }
}


