package Registration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Home_Work_Registration {
    public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver","C:\\Software\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        driver.findElement(By.className("ico-register")).click();
        driver.findElement(By.id("gender-male")).click();
        driver.findElement(By.id("FirstName")).sendKeys("Meet");
        driver.findElement(By.id("LastName")).sendKeys("Patel");
        driver.findElement(By.name("DateOfBirthDay")).sendKeys("4");
        driver.findElement(By.name("DateOfBirthMonth")).sendKeys("May");
        driver.findElement(By.name("DateOfBirthYear")).sendKeys("1991");
        driver.findElement(By.id("Email")).sendKeys("test123@gmail.com");
        driver.findElement(By.name("Company")).sendKeys("Unify Testing");
        driver.findElement(By.name("Newsletter")).isEnabled();
        driver.findElement(By.xpath("//input[@type='password' and @id='Password']")).sendKeys("Test@123");
        driver.findElement(By.cssSelector("input[id='ConfirmPassword']")).sendKeys("Test@123");
        driver.findElement(By.id("register-button")).submit();
      //  driver.findElement(By.className("button-1 register-continue-button")).click();
    }
}
