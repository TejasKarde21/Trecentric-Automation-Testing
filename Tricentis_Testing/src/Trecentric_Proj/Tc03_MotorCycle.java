package Trecentric_Proj;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc03_MotorCycle {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.sparkstone.co.nz/sampleapp/101/index.php");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("/html/body/div/header/div[2]/div/div[1]/ul/li[3]/a")).click();

		// Enter Vehicle Data START

		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[1]/select")).click(); // make
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[1]/select/option[4]"))
				.click(); // make value

		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[2]/select")).click(); // model
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[2]/select/option[2]"))
				.click(); // model value

		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[3]/input"))
				.sendKeys("1500"); // Cylinde Capacity value

		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[4]/input"))
				.sendKeys("2000"); // Engine Performance

		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[5]/input"))
				.sendKeys("07/19/2024"); // manufacture Date

		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[6]/select")).click(); // No
																														// of
																														// seat
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[6]/select/option[4]"))
				.click(); // no of seat value

		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[7]/input"))
				.sendKeys("20000"); // List Price

		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[8]/input"))
				.sendKeys("50000"); // Anual Milage

		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[9]/button")).click(); // send

		// // Enter Vehicle Data END

		// ----------- START ENTER INSURANT ---------------//

		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[1]/input"))
				.sendKeys("Tejas"); // first Name
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[2]/input"))
				.sendKeys("Karde"); // Last Name
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[3]/input"))
				.sendKeys("10/21/1998"); // Birth date

		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[4]/p/label[1]/span"))
				.click(); // Gender male

		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[5]/input"))
				.sendKeys("Karve Nagar"); // street add

		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[6]/select")).click(); // country
		driver.findElement(
				By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[6]/select/option[106]")).click(); // contry
																															// value

		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[7]/input"))
				.sendKeys("411052"); // zipcode

		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[8]/input"))
				.sendKeys("Pune"); // city

		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[9]/select")).click(); // occupation
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[9]/select/option[6]"))
				.click(); // occ value

		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[10]/p/label[1]/span"))
				.click(); // Hobbies
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[10]/p/label[4]/span"))
				.click(); // Hobbies

		Thread.sleep(3000);

		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[13]/button[2]"))
				.click(); // Next send

		// ------------ END ENTER INSURANT ------------------------//

		// ---------------- START Enter Product DATA ----------------- ///

		LocalDate currentDate1 = LocalDate.now();

		LocalDate futureDate = currentDate1.plusDays(32);

		DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("MM/dd/yyyy");

		String formattedFutureDate = futureDate.format(formatter1);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[3]/div[1]/input"))
				.sendKeys(formattedFutureDate); // Start Date

		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[3]/div[2]/select")).click(); // Insurance
																														// Sum
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[3]/div[2]/select/option[5]"))
				.click(); // Insurance Value

		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[3]/div[3]/select")).click(); // Damge
																														// Insu
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[3]/div[3]/select/option[4]"))
				.click(); // Damage Value

		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[3]/div[4]/p/label[2]/span"))
				.click(); // optinal prod

		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[3]/div[5]/button[2]"))
				.click(); // next

		// ---------------- END ENTER Product DATA ----------------- ///

		// ----------------- Start Select Price Option ------- ///

		driver.findElement(By.xpath(
				"/html/body/div[1]/div/div[1]/div/div/form/div/section[4]/section/div[1]/table/tfoot/tr/th[2]/label[4]/span"))
				.click(); // primum select

		Thread.sleep(3000);

		String actppYear = "3,778.00";
		String actonlineCalm = "Submit";
		String actDiscount = "10";
		String actWorldCover = "Unlimited";

		String ppYearString = driver.findElement(By.xpath(
				"/html/body/div[1]/div/div[1]/div/div/form/div/section[4]/section/div[1]/table/tbody/tr[1]/td[5]/span"))
				.getText();
		System.out.println(ppYearString);

		String onlineClam = driver.findElement(By.xpath(
				"/html/body/div[1]/div/div[1]/div/div/form/div/section[4]/section/div[1]/table/tbody/tr[2]/td[5]"))
				.getText();
		System.out.println(onlineClam);

		String discount = driver.findElement(By.xpath(
				"/html/body/div[1]/div/div[1]/div/div/form/div/section[4]/section/div[1]/table/tbody/tr[3]/td[5]"))
				.getText();
		System.out.println(discount);

		String worldCover = driver.findElement(By.xpath(
				"/html/body/div[1]/div/div[1]/div/div/form/div/section[4]/section/div[1]/table/tbody/tr[4]/td[5]"))
				.getText();
		System.out.println(worldCover);

		if (actppYear.contains(ppYearString) && actonlineCalm.contains(onlineClam) && actDiscount.contains(discount)
				&& actWorldCover.contains(worldCover)) {
			System.out.println("Test Case Pass");
			driver.findElement(By
					.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[4]/section/div[2]/div[2]/button[2]"))
					.click(); // next
		} else {
			System.out.println("Test Case Fail");
		}

		// ----------------- END Select Price Option ------- ///

		// -----------------SEND QUOTE START ----------------------//

		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[5]/section/div[1]/input"))
				.sendKeys("pass@gmail.com"); // email

		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[5]/section/div[2]/input"))
				.sendKeys("7083093390"); // phone

		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[5]/section/div[3]/input"))
				.sendKeys("Tejas"); // username

		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[5]/section/div[4]/input"))
				.sendKeys("Pass@123"); // password

		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[5]/section/div[5]/input"))
				.sendKeys("Pass@123"); // conf-password

		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[5]/section/div[6]/textarea"))
				.sendKeys("Hello"); // comment

		driver.findElement(
				By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[5]/section/div[7]/button[2]")).click();

		Thread.sleep(10000);

		File f1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f1, new File(
				"C:\\Users\\91708\\eclipse-workspace\\MavenProject\\Tricentis_Testing\\src\\Trecentric_Proj\\images\\screen3.jpeg"));
		driver.findElement(By.xpath("/html/body/div[4]/div[7]/div/button")).click();
//		// END// //SEND QUOTE //
//
		driver.findElement(By.xpath(
				"/html/body/div[1]/div/div[1]/div/div/form/div/section[5]/section/div[8]/div/div[1]/div/div[1]/a/span/i"))
				.click();

		// ------------------ SEND QUOTE END -----------------//

	}

}
