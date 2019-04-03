import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;



public class Selenium {
    protected static WebDriver driver;

    public static void main(String[]args){
        System.setProperty("webdriver.chrome.driver","src\\Browserdrivers\\chromedriver.exe");
                driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://demo.nopcommerce.com/register");
        //driver.findElement(By.xpath("//a[@class'ico-register']")).click();
        driver.findElement(By.id("gender-female")).click();
        driver.findElement(By.id("FirstName")).sendKeys("Divya");
        driver.findElement(By.id("LastName")).sendKeys("Jain");
        //driver.findElement(By.name("DateOfBirthDay")).sendKeys(Keys.NUMPAD5);
        ///driver.findElement(By.name("DateOfBirthMonth")).sendKeys(Keys.NUMPAD5);
        //driver.findElement(By.name("DateOfBirthYear")).sendKeys(Keys.NUMPAD5);
        driver.findElement(By.id("Email")).sendKeys("divya76.jain@gmail.com");
        driver.findElement(By.id("Company")).sendKeys("ABC ltd.");
        driver.findElement(By.id("Newsletter")).click();
        driver.findElement(By.id("Password")).sendKeys("Divj2323");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("Divj2323");
        driver.findElement(By.id("register-button")).click();
        String Msg = driver.findElement(By.xpath("//div[@class='result'")).getText();
        Assert.assertEquals("User should be ",Msg);
        //driver.findElement(By.id("DateOfBirthDay")).sendKeys();

        // driver.findElement(By.name("DateofBirthDay")).sendKeys(19);
        //vsr selectElement = new SelectElement(DOBDay);
        //selectElement.SelectByValue("19");
        //selectElement.SelectByValue("19");
        //driver.findElement(By.cssSelector( "#DateOfBirthDay")).sendKeys("19");


    }
}
