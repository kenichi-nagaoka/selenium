import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SampleTest {

    private WebDriver webDriver;

    @BeforeEach
    public void setUp() {
      //  System.setProperty("webdriver.chrome.driver", "C:\\Development\\selenium\\chromedriver.exe");
        webDriver = new ChromeDriver();
    }

    @Test
    public void goToYahoo() {
        webDriver.get("https://www.yahoo.co.jp/");
        assertEquals("Yahoo! JAPAN", webDriver.getTitle());
    }

    @AfterEach
    public void tearDown() {
        webDriver.quit();
    }
}
