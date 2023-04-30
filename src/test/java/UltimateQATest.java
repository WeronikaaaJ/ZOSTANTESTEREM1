import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UltimateQATest extends PageSetup {

    @Test
        public void testOne(){
        driver.findElementById("idExample").click();

        WebElement buttonSuccess =   driver.findElementByClassName("entry-title");
        Assertions. assertEquals("Button success", buttonSuccess.getText());
    }

    @Test
    public void testTwo() throws InterruptedException {
        WebElement nameInput = driver.findElementById("et_pb_contact_name_0");
        nameInput.sendKeys("Tester");
        WebElement emailInput = driver.findElementById("et_pb_contact_email_0");
        emailInput.sendKeys("tester@tester.pl");

        Thread.sleep(2000);

        WebElement emailMeButton = driver.findElementByName("et_builder_submit_button");
        emailMeButton.click();

        Thread.sleep(2000);

        WebElement thanksText = driver.findElement(By.xpath("//div[@class='et-pb-contact-message']/p"));
        Assertions. assertEquals ("Thanks for contacting us",thanksText.getText());}

        @Test
    public void testThree() {
        WebElement blueField = driver.findElementByXPath("//*[contains(@class, 'et_pb_module et_pb_cta_0')]");
        Assertions.assertEquals("rgba(46, 163, 242, 1)", blueField.getCssValue("background-color"));

    }





}

