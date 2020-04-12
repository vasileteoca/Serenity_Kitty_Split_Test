package serenity_kitty_split.steps;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;
import serenity_kitty_split.pages.KittySplitTestPage;

import static junit.framework.TestCase.assertTrue;

public class KittySplitTestSteps extends ScenarioSteps {

    private KittySplitTestPage kittySplitTestPage;

    @Step("Open page")
    public void open(String url) {
        getDriver().manage().window().maximize();
        getDriver().navigate().to(url);
    }

    @Step("STEP: Click Start button")
    public void clickStartButton(){
        kittySplitTestPage.startButton.click();
    }

    @Step("STEP: I input Kitty Name")
    public void inputKittyName(){
        kittySplitTestPage.kittyNameField.sendKeys("Ski Trip");
    }

    @Step("STEP: I input First Participant name")
    public void inputFirstParticipantName(){
        kittySplitTestPage.kittyPartyFirstNameField.sendKeys("Vasi");
    }

    @Step("STEP: I input First Participant email")
    public void inputFirstParticipantEmail(){
        kittySplitTestPage.kittyPartyFirstEmailField.sendKeys("vasilebasil1@gmail.com");
    }

    @Step("STEP: I input Sectond Participant name")
    public void inputSecondParticipantName(){
        kittySplitTestPage.kittyPartySecondNameField.sendKeys("Batman");
    }

    @Step("STEP: I Click Create Kitty button")
    public void createKittyButtonClick(){
        kittySplitTestPage.kittySubmitButtonField.submit();
    }

    @Step("STEP: Assert Kitty Title")
    public void assertKittyTitle(){
        Assert.assertTrue(kittySplitTestPage.kittyTitle.getText().contains("Ski"));
    }

    @Step("STEP: Open Kitty page")
    public void openKitty(){
        getDriver().manage().window().maximize();
        getDriver().navigate().to("https://kittysplit.com/sdsdfgsfb/UkxbxOR4FoPieCwJVllOnnS_6Im74tbL-2");
    }

    @Step("STEP: Select party member")
    public void selectPartyMember(){
        for(WebElementFacade element: kittySplitTestPage.partyMemberButtonList){
            if(element.getText().contains("vasi")){
                element.click();
            }
        }
    }

    @Step("STEP: Add Expense button click")
    public void addExpenseButtonClick(){
        kittySplitTestPage.addExpenseButton.click();
    }

    @Step("STEP: Input Amount")
    public void inputAmount(){
        kittySplitTestPage.amountField.sendKeys("60");
    }

    @Step("STEP: Input reason for expense")
    public void inputReasonForExpense(){
        kittySplitTestPage.descriptionField.sendKeys("Ski pass");
    }

    @Step("STEP: Click on Add Expense final button")
    public void clickAddButton(){
        kittySplitTestPage.addButton.submit();
        getDriver().switchTo().activeElement();
    }

    @Step("STEP: Mark dept as settled")
    public void markAsSettledButtonClick(){
        kittySplitTestPage.markAsSettledButton.click();
    }

    @Step("STEP: Assert Settle text")
    public void assertSettleText(){
                System.out.printf(kittySplitTestPage.settleText.getText());
                Assert.assertTrue(kittySplitTestPage.settleText.getText().contains("marked"));


        //Assert.assertTrue(kittySplitTestPage.settleText.getText().contains("up"));
    }

    @Step("STEP: Assert expense")
    public void assertExpenseSuccessText() {
        getDriver().switchTo().activeElement();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.printf(kittySplitTestPage.expenseText.getText());
        Assert.assertTrue(kittySplitTestPage.expenseText.getText().contains("pass"));
    }
}