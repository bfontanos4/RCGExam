package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class PF_BasicCalculator {
	@FindBy(id = "selectBuild")
	@CacheLookup
	WebElement drp_build;
	
	@FindBy(id = "number1Field")
	@CacheLookup
	WebElement txt_firstNumber;
	
	@FindBy(id = "number2Field")
	@CacheLookup
	WebElement txt_secondNumber;
	
	@FindBy(id = "selectOperationDropdown")
	@CacheLookup
	WebElement drp_operation;
	
	@FindBy(id = "calculateButton")
	@CacheLookup
	WebElement btn_calculate;
	
	@FindBy(id = "numberAnswerField")
	@CacheLookup
	WebElement txt_Answer;
	
	@FindBy(id = "clearButton")
	@CacheLookup
	WebElement btn_clear;

	@FindBy(id = "errorMsgField")
	@CacheLookup
	WebElement txt_errorMsgField;

	public PF_BasicCalculator(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void selectBuild(String build) {
		Select drpBuild = new Select(drp_build);
		drpBuild.selectByVisibleText(build);
		
	}

	public void enterFirstNumber(String firstNumber) {
		txt_firstNumber.sendKeys(firstNumber);
	}
	
	public void enterSecondNumber(String secondNumber) {
		txt_secondNumber.sendKeys(secondNumber);
	}
	
	public void selectOperation(String Operation) {
		Select drpOperation = new Select(drp_operation);
		drpOperation.selectByVisibleText(Operation);
		
	}
	public void clickCalculate() {
		btn_calculate.click();
	}
	
	public String getAnswer() {
		return txt_Answer.getAttribute("value");
	}
	
	public String getErrorMsg() {
		return txt_errorMsgField.getText();
	}

}
