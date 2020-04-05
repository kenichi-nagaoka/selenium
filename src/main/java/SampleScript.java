import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleScript {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Development\\selenium\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://www.yahoo.co.jp/");
        webDriver.findElement(By.name("p")).sendKeys("ゆりあんレトリバー");
        webDriver.findElement(By.xpath("//*[@id=\"ContentWrapper\"]/header/section[1]/div/form/fieldset/span/button/span/span")).click();
        webDriver.quit();
    }
}
