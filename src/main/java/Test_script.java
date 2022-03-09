import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;
public class Test_script { @Test
    void  se(){System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Google\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://status.vodafonebusiness.ringcentral.com/");
    driver.manage().window().maximize();
        WebDriver.Timeouts time = driver.manage().timeouts();
        time.implicitlyWait(60L, TimeUnit.SECONDS);
    if (driver.getPageSource().contains("class=\"have-info-wrapper left large CId-incident-icon IId-incident-icon board-error")) {
        System.out.println(" Error found ");
    } else {
        System.out.println(" No issues Found");
    }
        if (driver.getPageSource().contains("class=\"have-info-wrapper left large CId-incident-icon IId-incident-icon board-information")) {
            System.out.println(" Information Notice ");
        } else {
            System.out.println(" No issues Found");
        }
        if (driver.getPageSource().contains("class=\"have-info-wrapper left large CId-incident-icon IId-incident-icon board-warn")) {
            System.out.println(" issues found ");
        } else {
            System.out.println(" No issues Found");
        }

}
}