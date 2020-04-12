package serenity_kitty_split_stories;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.*;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.WebDriver;
import serenity_kitty_split.steps.KittySplitTestSteps;


@Story(KittySplitTestStory.class)
@RunWith(SerenityRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@WithTag("Smoke")
public class KittySplitTestStory {

    @Managed(uniqueSession = false)
    public WebDriver webDriver;

    @Steps
    private KittySplitTestSteps kittySplitTestSteps;


    @Before
    public void init() {
        kittySplitTestSteps.open("http://www.kittysplit.com/en/");
    }

    @Test
    @WithTag("Test1")
    @Title("Create Kitty")
    public void CreateKitty() {
        kittySplitTestSteps.clickStartButton();
        kittySplitTestSteps.inputKittyName();
        kittySplitTestSteps.inputFirstParticipantName();
        kittySplitTestSteps.inputFirstParticipantEmail();
        kittySplitTestSteps.inputSecondParticipantName();
        kittySplitTestSteps.createKittyButtonClick();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        kittySplitTestSteps.assertKittyTitle();
    }

    @Test
    @WithTag("Add Expense to kitty")
    @Title("Add Expense to kitty")
    public void AddExpense() {
        kittySplitTestSteps.openKitty();
        kittySplitTestSteps.selectPartyMember();
        kittySplitTestSteps.addExpenseButtonClick();
        kittySplitTestSteps.inputAmount();
        kittySplitTestSteps.inputReasonForExpense();
        kittySplitTestSteps.clickAddButton();
        kittySplitTestSteps.assertExpenseSuccessText();
    }

    @Test
    @WithTag("Settle debt")
    @Title("Open Kitty and settle debt")
    public void SettleDebt() {
        kittySplitTestSteps.openKitty();
        kittySplitTestSteps.selectPartyMember();
        kittySplitTestSteps.markAsSettledButtonClick();
        kittySplitTestSteps.assertSettleText();
    }
}