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

public class Tc04_Camper {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		/// Start page
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.sparkstone.co.nz/sampleapp/101/index.php");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div[1]/ul/li[4]/a")).click();

		// End Start Page

		// -------------START ENTER VICHLE DATA -------------//

		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[1]/select")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[1]/select/option[5]"))
				.click(); // make value

		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[2]/input"))
				.sendKeys("2000"); // Engine Performance

		LocalDate currentDate1 = LocalDate.now();

		LocalDate futureDate = currentDate1.plusDays(0);

		DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("MM/dd/yyyy");

		String formattedFutureDate = futureDate.format(formatter1);

		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[3]/input"))
				.sendKeys(formattedFutureDate); // date of manufacture

		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[4]/select")).click(); // Number
																														// of
																														// Seat
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[4]/select/option[7]"))
				.click(); // value seat

		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[5]/p/label[1]/span"))
				.click(); // Right hand drive

		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[6]/select")).click(); // type
																														// fuel
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[6]/select/option[4]"))
				.click(); // fule value

		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[7]/input"))
				.sendKeys("1000"); // payload

		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[8]/input"))
				.sendKeys("50000"); // total wt

		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[9]/input"))
				.sendKeys("100000"); // list price

		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[10]/input"))
				.sendKeys("ABCDEFGHIJ"); // plate number

		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[11]/input"))
				.sendKeys("100000");

		Thread.sleep(3000);

		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[12]/button")).click(); // next

		// -------------END ENTER VICHLE DATA -------------//

		// START // INSURANT DATA //

		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[1]/input"))
				.sendKeys("Prabhat");

		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[2]/input"))
				.sendKeys("Hiwrale");

		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[3]/input"))
				.sendKeys("12/27/1998");

		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[4]/p/label[1]/span"))
				.click();

		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[5]/input"))
				.sendKeys("Karve Nagar, Pune");

		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[6]/select")).click();

		driver.findElement(
				By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[6]/select/option[106]")).click();

		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[7]/input"))
				.sendKeys("411052");

		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[8]/input"))
				.sendKeys("Pune");

		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[9]/select")).click();

		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[9]/select/option[6]"))
				.click();

		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[10]/p/label[2]/span"))
				.click();

		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[10]/p/label[5]/span"))
				.click();

		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[11]/input"))
				.sendKeys("www.google.com");

		Thread.sleep(3000);

		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[13]/button[2]"))
				.click();

		// END // INSURANT DATA //

		/// --------------START Enter Product Data --------------------//

		LocalDate currentDate2 = LocalDate.now();

		LocalDate futureDate1 = currentDate2.plusDays(35);

		DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("MM/dd/yyyy");

		String formattedFutureDate1 = futureDate1.format(formatter2);

		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[3]/div[1]/input"))
				.sendKeys(formattedFutureDate1); // start date

		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[3]/div[2]/select")).click(); // insurance
																														// sum
		driver.findElement(
				By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[3]/div[2]/select/option[10]")).click(); // insurance
																														// value

		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[3]/div[3]/select")).click(); // damge
																														// insu
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[3]/div[3]/select/option[4]"))
				.click(); // damage insu value

		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[3]/div[4]/p/label[1]/span"))
				.click(); // optional prod
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[3]/div[4]/p/label[2]/span"))
				.click(); // optional 2

		Thread.sleep(3000);

		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[3]/div[5]/button[2]"))
				.click(); // nextt

		/// --------------END Enter Product Data --------------------//

		// ------------ SELECT PRICE OPTION START ---------------------//

		driver.findElement(By.xpath(
				"/html/body/div[1]/div/div[1]/div/div/form/div/section[4]/section/div[1]/table/tfoot/tr/th[2]/label[4]/span"))
				.click(); // unlimeted select

		// condition check
		String actppYear = "12,425.00";
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
			Thread.sleep(3000);
			driver.findElement(By
					.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[4]/section/div[2]/div[2]/button[2]"))
					.click(); // next
		} else {
			System.out.println("Test Case Fail");
		}

		//// -------------------------SELECT PRICE OPTION END -------------------------
		//// /////

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

		Thread.sleep(20000);

		File f1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f1, new File(
				"C:\\Users\\91708\\eclipse-workspace\\MavenProject\\Tricentis_Testing\\src\\Trecentric_Proj\\images\\screen4.jpeg"));
		driver.findElement(By.xpath("/html/body/div[4]/div[7]/div/button")).click();
//		// END// //SEND QUOTE //
//
		driver.findElement(By.xpath(
				"/html/body/div[1]/div/div[1]/div/div/form/div/section[5]/section/div[8]/div/div[1]/div/div[1]/a/span/i"))
				.click();

		// ------------------ SEND QUOTE END -----------------//

	}

}
