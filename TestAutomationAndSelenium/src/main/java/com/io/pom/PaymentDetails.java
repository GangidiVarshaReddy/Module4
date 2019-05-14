package com.io.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaymentDetails {
	WebDriver driver;

	public PaymentDetails(WebDriver driver) {
		this.driver = driver;
	}
	
	By cardHolderName=By.name("txtFN");
	By debitCardNo=By.name("debit");
	By cvvNumber=By.name("cvv");
	By cardExpiryMonth=By.name("month");
	By cardExpiryYear=By.name("year");
	// payment details of the user
	public void giveCardHolderName() {
		driver.findElement(cardHolderName).sendKeys("Varshareddy");
	}
	
	public void giveDebitCardName() {
		driver.findElement(debitCardNo).sendKeys("1207VJ");
	}
	
	public void giveCvvNumber() {
		driver.findElement(cvvNumber).sendKeys("124");
	}
	
	public void giveCardExpiryMonth() {
		driver.findElement(cardExpiryMonth).sendKeys("June");
	}
	
	public void giveCardExpiryYear() {
		driver.findElement(cardExpiryYear).sendKeys("2023");
	}
	
	public void clickNext() throws InterruptedException {
		driver.findElement(By.id("btnPayment")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
	}
}
