package openmarketwatch;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
 
//public class must be declared

public  class marketwatch {
// public static void is used 
//@Test
WebDriver driver;
@Test
public void TestMarketWatch() throws InterruptedException {
//WebDriver driver;
// create new firefox webdriver isntance by setting the properties using the code below 
System.setProperty("webdriver.firefox.bin","/Users/jasonsouryamath/Desktop/FirefoxDeveloperEdition.app/Contents/MacOS/firefox-bin");
driver = new FirefoxDriver();
driver.get("http://www.marketwatch.com/");
Thread.sleep(2000);
((JavascriptExecutor)driver).executeScript("scroll(0,1000)");
new WebDriverWait(driver,10).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#f72ae3716b0373a474b6898d41a29e1a9158244d > li:nth-child(3) > div:nth-child(1) > div:nth-child(2) > h3:nth-child(1) > a:nth-child(1)"))).click();
((JavascriptExecutor)driver).executeScript("scroll(0,1200)");
}

/*
new WebDriverWait(driver,10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@class='btn btn--outline btn--signup']"))).click();
new WebDriverWait(driver,5).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@class='login_id']"))).sendKeys("Jason");
new WebDriverWait(driver,5).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@Name='LastName']"))).sendKeys("Souryamath");
new WebDriverWait(driver,5).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@Name='Email']"))).sendKeys("jasonsouryamath@yahoo.com");
new WebDriverWait(driver,5).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input.login_pw"))).sendKeys("mocha1127");
new WebDriverWait(driver,5).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@Name='PasswordConfirm']"))).sendKeys("mocha1127");
}
*/
@AfterTest
public void TearDown() {
driver.close();
//new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".btn--search"))).click(); 
//WebElement trump = driver.findElement(By.cssSelector(".search__input"));
//trump.sendKeys("stock");
//Thread.sleep(2000);
}

}
