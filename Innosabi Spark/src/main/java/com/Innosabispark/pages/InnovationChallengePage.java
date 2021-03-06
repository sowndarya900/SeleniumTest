
package com.Innosabispark.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;




/**
 * page object encapsulates the Innovation Challenge page
 * @author Sowndarya
 *
 */
public class InnovationChallengePage {
	WebDriver driver;

	By inchallenge=By.xpath("//div[@class='card-content']//h2");
	By ichallenge=By.xpath("//h1[text()='Innovation Challenge']");
	By submitidea=By.xpath("//button[text()='Submit idea']");
	By title=By.xpath("//input[@formcontrolname='title']");
	By description=By.xpath("//div[@role='textbox']");
	By checktitle=By.xpath("//h2[@class='title']");

	By comment=By.xpath("(//textarea[@placeholder='Enter a comment'])[1]");
	By clickcomment=By.xpath("(//div[@class='action-btns'])[1]");
	

	public InnovationChallengePage(WebDriver driver) 
	{
		this.driver=driver;
	}

	//To verify Innovation challenge image present in homepage
	public Boolean verifyInnovationchallenge() 
	{
		Boolean innchallenge=driver.findElement(inchallenge).isDisplayed();
		return innchallenge;
	} 
	//To verify redirected to Innovation challenge page
	public Boolean Innovationpage() throws InterruptedException 
	{
		Thread.sleep(6000);
		Boolean inchallenge=driver.findElement(ichallenge).isDisplayed();
		return inchallenge;
	} 

	//To click   Innovation challenge on homepage
	public void clickInnovationchallenge() 
	{
		driver.findElement(inchallenge).click();

	}
	//To click  submit idea button
	public void clicksubmitidea() 
	{
		driver.findElement(submitidea).click();

	}


	//to Enter idea title in the textbox
	public void ideatitle(String ititle) throws InterruptedException 
	{
		Thread.sleep(4000);
		driver.findElement(title).sendKeys(ititle);

	}

	//to Enter idea description in the textbox
	public void ideades(String ides) throws InterruptedException 
	{
		driver.findElement(description).sendKeys(ides);

	}


	//to check idea submitted to innovation page
	public String checkidea() throws InterruptedException 
	{
		Thread.sleep(6000);
		String titletext=driver.findElement(checktitle).getText();
		return titletext;
	}

	//to Enter comment
	public void comment(String coment) throws InterruptedException 
	{
		driver.findElement(comment).sendKeys(coment);

	}
	//to click comment
		public void clickcomment() throws InterruptedException 
		{
			driver.findElement(clickcomment).click();

		}

}

