package SauceDemo;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;


public class SwagLabs {
    static WebDriver driver;
    public void urlPage() throws IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
//        Thread.sleep(3000);
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        TakesScreenshot ts=(TakesScreenshot)driver;
        File file= ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file, new File("C:/Another/DemoSelenium/ScreenShots/Homepage.jpg"));

    }

    public void login() throws IOException {
        driver.findElement(By.id("user-name")).click();
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).click();
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        TakesScreenshot ts=(TakesScreenshot)driver;
        File file= ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file, new File("C:/Another/DemoSelenium/ScreenShots/LoginPage.jpg"));
    }

    public void AddToCart() throws IOException {
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        TakesScreenshot ts=(TakesScreenshot)driver;
        File file= ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file, new File("C:/Another/DemoSelenium/ScreenShots/AddToCart.jpg"));
    }

    public void Cart() throws IOException {
        driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
        TakesScreenshot ts=(TakesScreenshot)driver;
        File file= ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file, new File("C:/Another/DemoSelenium/ScreenShots/Cart.jpg"));
    }

    public void CheckOut() throws IOException {
        driver.findElement(By.id("checkout")).click();
        TakesScreenshot ts=(TakesScreenshot)driver;
        File file= ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file, new File("C:/Another/DemoSelenium/ScreenShots/CheckOut.jpg"));
    }

    public void Information() throws IOException {
        driver.findElement(By.id("first-name")).sendKeys("Sandeep");
        driver.findElement(By.id("last-name")).sendKeys("Mondal");
        driver.findElement(By.id("postal-code")).sendKeys("700124");
        driver.findElement(By.id("continue")).click();
        TakesScreenshot ts=(TakesScreenshot)driver;
        File file= ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file, new File("C:/Another/DemoSelenium/ScreenShots/Information.jpg"));
    }

    public void Overview() throws IOException {
        driver.findElement(By.id("finish")).click();
        TakesScreenshot ts=(TakesScreenshot)driver;
        File file= ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file, new File("C:/Another/DemoSelenium/ScreenShots/Overview.jpg"));
    }

    public void BackToHome() throws InterruptedException, IOException {
        driver.findElement(By.id("back-to-products")).click();
        TakesScreenshot ts=(TakesScreenshot)driver;
        File file= ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file, new File("C:/Another/DemoSelenium/ScreenShots/BackToHomePage.jpg"));

    }

    public void Logout() throws InterruptedException, IOException {
        driver.findElement(By.id("react-burger-menu-btn")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("logout_sidebar_link")).click();
        TakesScreenshot ts=(TakesScreenshot)driver;
        File file= ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file, new File("C:/Another/DemoSelenium/ScreenShots/Logout.jpg"));
    }

    public void Quit() throws InterruptedException {
        driver.quit();
    }
}
