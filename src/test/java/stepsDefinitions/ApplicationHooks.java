package stepsDefinitions;

import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


import util.ConfigReader;
import util.ExtentPropertiesSetter;
import common.DriverFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import pageFactory.PF_BasicCalculator;

public class ApplicationHooks {

	private DriverFactory driverFactory;
	private WebDriver driver;
	private ConfigReader configReader;
	private ExtentPropertiesSetter extentPropertiesSetter;
	Properties prop;
	Properties extentProp;
	String buildNo;

	@Before(order = 0)
	public void getProperty() {
		configReader = new ConfigReader();
		prop = configReader.init_prop();
	}

	@Before(order = 1)
	public void launchBrowser() {
		String browserName = prop.getProperty("browser");
		driverFactory = new DriverFactory();
		driver = driverFactory.init_driver(browserName);
		
	}
	
	@Before(order = 2)
	public void navigate() {
		String urL = prop.getProperty("urL");
		driver.navigate().to(urL);
	}

	@Before(order = 3)
	public void selectBuild() {
		buildNo = prop.getProperty("build");
		PF_BasicCalculator basicCalculator = new PF_BasicCalculator(DriverFactory.getDriver());
		basicCalculator.selectBuild(buildNo);
	}
	
	@Before(order = 4)
	public void setBuildNumberToExtentPropertyFile() {
		extentPropertiesSetter = new ExtentPropertiesSetter();
		extentPropertiesSetter.updatePropertiesFile("systeminfo.build", buildNo);
	}
	
	@After(order = 0)
	public void quitBrowser() {
		driver.quit();
	}

	@After(order = 1)
	public void tearDown(Scenario scenario) {
		if (scenario.isFailed()) {
			// take screenshot:
			String screenshotName = scenario.getName().replaceAll(" ", "_");
			byte[] sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(sourcePath, "image/png", screenshotName);

		}
	}
	
}
