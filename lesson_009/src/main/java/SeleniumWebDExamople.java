import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SeleniumWebDExamople {

    public static final String SELENIUM = "https://www.seleniumhq.org/";

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\driver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.MICROSECONDS);
        driver.manage().window().maximize();
        driver.navigate().to(SELENIUM);
        driver.findElement(By.id("menu_projects")).click();
        driver.findElement(By.id("menu_documentation")).click();
        driver.findElement(By.xpath("//a[text()='Selenium WebDriver']")).click();
    }
}
