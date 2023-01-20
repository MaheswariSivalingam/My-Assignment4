package week3.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        driver.findElement(By.className("decorativeSubmit")).click();
        driver.findElement(By.partialLinkText("CRM/SFA")).click();
        driver.findElement(By.linkText("Leads")).click();
        driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
        driver.findElement(By.xpath("(//input[contains(@name,'firstName')])[3]")).sendKeys("Maheswari");
        driver.findElement(By.xpath("(//td[@class='x-btn-center'] //button)[7]")).click();
        driver.findElement(By.xpath("//a[text()='Maheswari']")).click();
        String title = driver.getTitle();
        System.out.println(title);
        driver.findElement(By.xpath(" (//a[@class='subMenuButton'])[3]")).click();
        driver.findElement(By.id("updateLeadForm_companyName")).clear();
        driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Testleaf");
        driver.findElement(By.xpath("(//input[@class='smallSubmit'])[1]")).click();
        String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
        if(text.contains("Testleaf")) {
       	System.out.println("company name update successfully");
        }
        driver.close();
	}

}
