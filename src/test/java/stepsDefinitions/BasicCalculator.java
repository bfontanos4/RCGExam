package stepsDefinitions;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;

import common.DriverFactory;
import io.cucumber.java.en.*;
import pageFactory.PF_BasicCalculator;
import util.ExcelReader;

	
public class BasicCalculator{
	
	WebDriver driver;
	private PF_BasicCalculator basicCalculator = new PF_BasicCalculator(DriverFactory.getDriver());
	String firstNumber;
	String secondNumber;
	String operation;
	String expectedAnswer;
	String errorMessage;
	
	@Given("^user fetch the details from test data (.*) and (.*)$")
	public void user_fetch_the_details_from_test_data(String sheetName, Integer rowNumber) throws InvalidFormatException, IOException {
		String projectPath = System.getProperty("user.dir");
		ExcelReader reader = new ExcelReader();
		List<Map<String,String>> testData = 
				reader.getData(projectPath + "/src/test/resources/testData/BasicCalculator.xlsx", sheetName);
		firstNumber = testData.get(rowNumber).get("First Number");
		secondNumber = testData.get(rowNumber).get("Second Number");
		operation = testData.get(rowNumber).get("Operation");
		expectedAnswer = testData.get(rowNumber).get("Answer");
		errorMessage = testData.get(rowNumber).get("Error Message");
		
	}

	@And("user enters the First Number and Second Number")
	public void user_enters_the_first_number_and_second_number() {
		basicCalculator.enterFirstNumber(firstNumber);
	    basicCalculator.enterSecondNumber(secondNumber);
	}

	@And("user selects operation")
	public void user_selects_operation() {
		basicCalculator.selectOperation(operation);
	}
	

	@When("user click on Calculate")
	public void user_click_on_calculate() {
		basicCalculator.clickCalculate();
	}

	@Then("user able to verify the actual answer and expected answer given in test data")
	public void user_able_to_verify_the_actual_answer_and_expected_answer_given_in_test_data() {
		String actualAnswer;
	    actualAnswer = basicCalculator.getAnswer();
	    assertEquals(actualAnswer, expectedAnswer, "There is a difference between expected and actual.");
	}
	
	@Then("user able to see error message display")
	public void user_able_to_see_error_message_display() {
		String actualErrorMsg;
		actualErrorMsg = basicCalculator.getErrorMsg();
		assertEquals(actualErrorMsg, errorMessage, "There is a difference between expected and actual.");
	}

}
