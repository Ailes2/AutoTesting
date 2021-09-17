import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;


public class TestGoogle {
    public WebDriver driver;

    @BeforeSuite
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\fbsmi\\IdeaProjects\\HomeWorkTestGoogle\\src\\Driver\\chromedriver.exe");
        driver= new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterSuite
    public void quit(){
        driver.quit();
    }

    @Test
    public void test1(){
        driver.get("https://www.google.com/");
        sleep(1000);
        WebElement searchInput = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
        searchInput.sendKeys("Курсы", Keys.ENTER);
        List<WebElement> nameElements = driver.findElements(By.xpath("//div[@class='g']"));
        List<String> elementInList = new ArrayList<>();
        for (WebElement nameElement: nameElements) {
            elementInList.add(nameElement.getText());
        }
        for (String goodName: elementInList) {
            Assert.assertTrue(goodName.toUpperCase().contains("КУРСЫ"));
        }
        System.out.println(elementInList);
    }

    @Test
    public void test2(){
        driver.get("https://www.google.com/");
        sleep(1000);
        WebElement searchInput = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
        searchInput.sendKeys("Курсы", Keys.ENTER);
        WebElement findButton = driver.findElement(By.xpath("//span[@class='SJajHc NVbCr']"));
        findButton.click();
        List<WebElement> nameElements = driver.findElements(By.xpath("//div[@class='v7W49e']"));
        List<String> elementInList = new ArrayList<>();
        for (WebElement nameElement: nameElements) {
            elementInList.add(nameElement.getText());
        }
        for (String goodName: elementInList) {
            Assert.assertTrue(goodName.toUpperCase().contains("КУРСЫ"));
        }
        System.out.println(elementInList);
    }

    @Test
    public void test3(){
        driver.get("https://www.google.com/");
        sleep(1000);
        WebElement searchInput = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
        searchInput.sendKeys("Курсы", Keys.ENTER);
        WebElement findButton = driver.findElement(By.xpath("//span[@class='SJajHc NVbCr']"));
        findButton.click();
        List<WebElement> nameElements = driver.findElements(By.xpath("//div[@class='v7W49e']"));
        List<String> elementInList = new ArrayList<>();
        for (WebElement nameElement: nameElements) {
            elementInList.add(nameElement.getText());
        }
        for (String goodName: elementInList) {
            Assert.assertTrue(goodName.toUpperCase().contains("КУРСЫ"));
        }
        System.out.println(elementInList);
    }



    public void sleep(long milliseconds){
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
