package org.utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoClass extends BaseClass{
	 public PojoClass() {
			PageFactory.initElements(driver, this);
		}
		 @FindBy(id="email")
	     private WebElement txtEmail;
		 
		 @FindBy(name="pass")
		 private WebElement txtPass;
		 
		 @FindBy(name="login")
		 private WebElement btnLog;
		 
		

		 @FindBy(xpath = "//a[text()='Create new account']")
		 private WebElement createAcc;
		 
		 @FindBy(xpath = "//input[@name='firstname']")
		 private WebElement fName;
		 
		 @FindBy(xpath="//input[@name='lastname']")
		 private WebElement lName;
		 
		 @FindBy(xpath="//input[@name='reg_email__']")
		 private WebElement emailOrMob;
		
		

		



		public WebElement getCreateAcc() {
			return createAcc;
		}

		public WebElement getfName() {
			return fName;
		}

		public WebElement getlName() {
			return lName;
		}

		public WebElement getEmailOrMob() {
			return emailOrMob;
		}

		public WebElement getTxtEmail() {
			return txtEmail;
		}

		public WebElement getTxtPass() {
			return txtPass;
		}

		public WebElement getBtnLog() {
			return btnLog;
		}


}
