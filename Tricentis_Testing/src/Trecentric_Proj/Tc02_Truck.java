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

public class Tc02_Truck {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.sparkstone.co.nz/sampleapp/101/index.php");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("/html/body/div/header/div[2]/div/div[1]/ul/li[2]/a")).click();

		// START // ENTER VEHICLE DATA //

		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[1]/select")).click();

		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[1]/select/option[7]"))
				.click();

		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[2]/input"))
				.sendKeys("500");

		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[3]/input"))
				.sendKeys("07/18/2024");

		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[4]/select")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[4]/select/option[8]"))
				.click();

		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[5]/select")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[5]/select/option[3]"))
				.click();

		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[6]/input"))
				.sendKeys("1000");

		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[7]/input"))
				.sendKeys("4999");

		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[8]/input"))
				.sendKeys("6000");

		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[9]/input"))
				.sendKeys("MH32VC7777");

		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[10]/input"))
				.sendKeys("50000");

		Thread.sleep(3000);

		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[11]/button")).click();

		// END// ENTER VEHICLE DATA//

		////// - ------ START ENTER INSURANCE DATA -----------------------///

		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[1]/input"))
				.sendKeys("Tejas"); // firstName
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[2]/input"))
				.sendKeys("Karde"); // LastName
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[3]/input"))
				.sendKeys("10/21/1998"); // birth
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[4]/p/label[1]/span"))
				.click(); // Male

		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[5]/input"))
				.sendKeys("Karve Nagar Pune");
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[6]/select")).click(); // Country
		driver.findElement(
				By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[6]/select/option[106]")).click(); // country
																															// Value

		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[7]/input"))
				.sendKeys("411052"); // zipcode
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[8]/input"))
				.sendKeys("Pune");

		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[9]/select")).click(); // occupation
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[9]/select/option[6]"))
				.click(); // occ value

		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[10]/p/label[1]/span"))
				.click(); // hobbies
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[10]/p/label[4]/span"))
				.click(); // hobbies

		Thread.sleep(3000);

		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[13]/button[2]"))
				.click();

		////// - ------ END ENTER INSURANCE DATA -----------------------///

		// START// ENTER PRODUCT DATA//

		LocalDate currentDate1 = LocalDate.now();

		LocalDate futureDate = currentDate1.plusDays(32);

		DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("MM/dd/yyyy");

		String formattedFutureDate = futureDate.format(formatter1);

		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[3]/div[1]/input"))
				.sendKeys(formattedFutureDate); // start date

		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[3]/div[2]/select")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[3]/div[2]/select/option[4]"))
				.click();

		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[3]/div[3]/select")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[3]/div[3]/select/option[3]"))
				.click();

		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[3]/div[4]/p/label[2]/span"))
				.click();

		Thread.sleep(3000);

		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[3]/div[5]/button[2]"))
				.click();

		// END// ENTER PRODUCT DATA//

		///// ---- Start SELECT PRICE OPTION ------------------//////

		driver.findElement(By.xpath(
				"/html/body/div[1]/div/div[1]/div/div/form/div/section[4]/section/div[1]/table/tfoot/tr/th[2]/label[4]/span"))
				.click();

		// driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[4]/section/div[2]/div[1]/div/div[1]/div/div[1]/a/span/i")).click();
		// ///SEnd QUOTE///

		String ppYear = "4,018.00";
		String onlineClamString = "Submit";
		String clamDiscount = "10";
		String worldWideCoverString = "Unlimited";

		String primumPyear = driver.findElement(By.xpath(
				"/html/body/div[1]/div/div[1]/div/div/form/div/section[4]/section/div[1]/table/tbody/tr[1]/td[5]/span"))
				.getText();
		System.out.println(primumPyear);

		String onlineClam = driver.findElement(By.xpath(
				"/html/body/div[1]/div/div[1]/div/div/form/div/section[4]/section/div[1]/table/tbody/tr[2]/td[5]"))
				.getText();
		System.out.println(onlineClam);
		String discountString = driver.findElement(By.xpath(
				"/html/body/div[1]/div/div[1]/div/div/form/div/section[4]/section/div[1]/table/tbody/tr[3]/td[5]"))
				.getText();
		System.out.println(discountString);
		String worldCover = driver.findElement(By.xpath(
				"/html/body/div[1]/div/div[1]/div/div/form/div/section[4]/section/div[1]/table/tbody/tr[4]/td[5]"))
				.getText();
		System.out.println(worldCover);

		Thread.sleep(3000);

		if (ppYear.contains(primumPyear) && onlineClamString.contains(onlineClam)
				&& clamDiscount.contains(discountString) && worldWideCoverString.contains(worldCover)) {

			System.out.println(" Test Case Pass");
			driver.findElement(By
					.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[4]/section/div[2]/div[2]/button[2]"))
					.click();
		} else {
			System.out.println(" Test Case Fail");
		}

		///// ---- END SELECT PRICE OPTION ------------------//////

		// START// // SEND QUOTE //

		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[5]/section/div[1]/input"))
				.sendKeys("test@gamil.com");

		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[5]/section/div[2]/input"))
				.sendKeys("9999999999");

		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[5]/section/div[3]/input"))
				.sendKeys("Prabhat");

		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[5]/section/div[4]/input"))
				.sendKeys("Pass@123");

		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[5]/section/div[5]/input"))
				.sendKeys("Pass@123");

		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[5]/section/div[6]/textarea"))
				.sendKeys("Hello");

		driver.findElement(
				By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[5]/section/div[7]/button[2]")).click();

		Thread.sleep(10000);

		File f1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f1, new File(
				"C:\\Users\\91708\\eclipse-workspace\\MavenProject\\Tricentis_Testing\\src\\Trecentric_Proj\\images\\screen2.jpeg"));
		driver.findElement(By.xpath("/html/body/div[4]/div[7]/div/button")).click();
		// END// //SEND QUOTE //

		driver.findElement(By.xpath(
				"/html/body/div[1]/div/div[1]/div/div/form/div/section[5]/section/div[8]/div/div[1]/div/div[1]/a/span/i"))
				.click();

	}

}
