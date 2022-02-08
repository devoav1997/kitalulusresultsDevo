
import java.time.Clock;
import java.time.Duration;
import java.time.ZoneOffset;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.SessionId;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        System.setProperty("webdriver.chrome.driver", "G:\\Project\\selenium project\\kitalulusproject\\kitalulus\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://kerja.kitalulus.com/");

        // account button
        driver.findElement(By.xpath("//*[@id='__next']/div[2]/div[3]/nav/div/a[4]/button")).click();
        System.out.println("Click Account Passed");

        // login account google
        Wait<WebDriver> waits = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30L))
                .pollingEvery(Duration.ofSeconds(5L))
                .ignoring(NoSuchElementException.class);

        WebElement foo = waits.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.xpath("//*[@id='__next']/div[2]/div[1]/div[2]/div[1]/button/h3"));
            }
        });

        driver.findElement(By.xpath("//*[@id='__next']/div[2]/div[1]/div[2]/div[1]/button/h3")).click();
        System.out.println("Click Login Account Google Passed");

        // input email
        Wait<WebDriver> waitGoogleEmail = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(10L))
                .pollingEvery(Duration.ofSeconds(5L))
                .ignoring(NoSuchElementException.class);

        WebElement GoogleEmail = waits.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.xpath("//*[@id='identifierId']"));
            }
        });
        driver.findElement(By.xpath("//*[@id='identifierId']")).click();
        driver.findElement(By.xpath("//*[@id='identifierId']")).sendKeys("fortesting639@gmail.com");
        driver.findElement(By.xpath("//*[@id='identifierNext']/div/button/span")).click();
        System.out.println("Input Email Google Passed");

        // input password
        Wait<WebDriver> waitGooglePass = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(10L))
                .pollingEvery(Duration.ofSeconds(5L))
                .ignoring(NoSuchElementException.class);

        WebElement GooglePass = waits.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.xpath("//*[@id='password']/div[1]/div/div[1]/input"));
            }
        });

        driver.findElement(By.xpath("//*[@id='password']/div[1]/div/div[1]/input")).click();
        driver.findElement(By.xpath("//*[@id='password']/div[1]/div/div[1]/input")).sendKeys("testingdev0101**");
        driver.findElement(By.xpath("//*[@id='passwordNext']/div/button/span")).click();
        System.out.println("Input Password Google Passed");

        // //input no hp ------------------------------------------Mungkin kalo device
        // baru perlu verifikasi sms kalo misal butuh bisa di uncomment minta verifikasi
        // ke saya lewat wa
        // Wait<WebDriver> waitGooglephone = new FluentWait<WebDriver>(driver)
        // .withTimeout(Duration.ofSeconds(10L))
        // .pollingEvery(Duration.ofSeconds(5L))
        // .ignoring(NoSuchElementException.class);

        // WebElement GooglePhone = waits.until(new Function<WebDriver, WebElement>() {
        // public WebElement apply(WebDriver driver) {
        // return driver.findElement(By.xpath("//*[@id='phoneNumberId']"));
        // }
        // });

        // driver.findElement(By.xpath("//*[@id='phoneNumberId']")).click();
        // driver.findElement(By.xpath("//*[@id='phoneNumberId']")).sendKeys("87871792282");
        // driver.findElement(By.xpath("//*[@id='idvanyphonecollectNext']/div/button")).click();

        // input kode verifikasi dari sms
        // ------------------------------------------Mungkin kalo device baru perlu
        // verifikasi sms kalo misal butuh bisa di uncomment minta verifikasi ke saya
        // lewat wa
        // Wait<WebDriver> waitGoogleVerifikasikodeSMS = new
        // FluentWait<WebDriver>(driver)
        // .withTimeout(Duration.ofSeconds(10L))
        // .pollingEvery(Duration.ofSeconds(5L))
        // .ignoring(NoSuchElementException.class);

        // WebElement GoogleVerifikasikodeSMS = waits.until(new Function<WebDriver,
        // WebElement>() {
        // public WebElement apply(WebDriver driver) {
        // return driver.findElement(By.xpath("//*[@id='idvAnyPhonePin']"));
        // }
        // });

        // driver.findElement(By.xpath("//*[@id='idvAnyPhonePin']")).click();
        // driver.findElement(By.xpath("//*[@id='idvAnyPhonePin']")).sendKeys("720493");
        // driver.findElement(By.xpath("//*[@id='idvanyphoneverifyNext']/div/button")).click();

        // karier button
        // Wait<WebDriver> waitKarierbutton = new FluentWait<WebDriver>(driver)
        // .withTimeout(Duration.ofSeconds(30L))
        // .pollingEvery(Duration.ofSeconds(5L))
        // .ignoring(NoSuchElementException.class);

        // WebElement waitsKarierbutton = waits.until(new Function<WebDriver,
        // WebElement>() {
        // public WebElement apply(WebDriver driver) {
        // return
        // driver.findElement(By.xpath("//*[@id='__next']/div[2]/div[2]/nav/div/a[1]/button"));
        // }
        // });
        

        //tunggu logo kita lulus muncul terus klik
        Wait<WebDriver> waitimg = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(50L))
                .pollingEvery(Duration.ofSeconds(5L))
                .ignoring(NoSuchElementException.class);

        WebElement waitimgs = waits.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.xpath("//*[@id='__next']/div[2]/nav/div/div/a/img"));
            }
        });
        driver.findElement(By.xpath("//*[@id='__next']/div[2]/nav/div/div/a/img")).click();
        System.out.println("Click Logo kitalulus Passed");

        // click kolom search
        driver.findElement(By.xpath("//*[@id='__next']/div[2]/div[1]/div[1]/div/input")).click();
        System.out.println("Click Kolom Search Passed");

        // input kolom search isinya Quality Assurance
        driver.findElement(By.xpath("//*[@id='__next']/div[2]/div[1]/div[1]/div/input")).sendKeys("Quality Assurance");
        System.out.println("Input Quality Assurance Passed");

        // Enter search
        driver.findElement(By.xpath("//*[@id='__next']/div[2]/div[1]/div[1]/div/input")).sendKeys(Keys.ENTER);
        System.out.println("Enter Input Quality Assurance Passed");

        // wait element muncul
        WebElement element = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions
                        .elementToBeClickable(By.xpath("//*[@id='__next']/div[2]/div[2]/div[2]/div[2]/div[1]/div/span/img")));

        driver.findElement(By.xpath("//*[@id='__next']/div[2]/div[2]/div[2]/div[2]/div[1]/div/span/img")).click();
        System.out.println("Click Bookmark/Love Passed");

    }
}
