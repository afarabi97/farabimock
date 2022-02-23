package AutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProjectFile {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		WebElement element= driver.findElement(By.className("login"));
		element.click();
		
		WebElement email= driver.findElement(By.id("email"));
		email.sendKeys("multajim@gmail.com");
		
		WebElement password= driver.findElement(By.id("passwd"));
		password.sendKeys("Manchester@3161");
		
		WebElement signin= driver.findElement(By.id("SubmitLogin"));
		signin.click();
		
		/*WebElement text= driver.findElement(By.className("page-heading"));
		WebElement myAccount= driver.findElement(By.className("info-account"));
		String pageText=text.getText();
		String account=myAccount.getText();*/
		
		/*System.out.println(pageText);
		System.out.println(account);*/
		
		/*if(pageText.equals("MY ACCOUNT")){
			System.out.println("Passed");
		}else{
			System.out.println("Failed");
		}*/
		
		WebElement signOutButton=driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[2]/a"));
		WebElement textConfirm=driver.findElement(By.xpath("//*[@id=\"editorial_block_center\"]/h1"));
		signOutButton.click();
		String text=textConfirm.getText();
		System.out.println(text);
		Thread.sleep(2000);
	}

}
