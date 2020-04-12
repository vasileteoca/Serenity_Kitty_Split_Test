package serenity_kitty_split.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import sun.plugin.dom.html.HTMLInputElement;

import java.awt.peer.TextComponentPeer;
import java.util.List;

public class KittySplitTestPage extends PageObject {

    @FindBy(css = "div.section> div > a")
    public WebElementFacade startButton;

    @FindBy(css = "#kitty_name")
    public WebElementFacade kittyNameField;

    @FindBy(css = "#kitty_parties_0_name")
    public WebElementFacade kittyPartyFirstNameField;

    @FindBy(css = "#kitty_parties_0_email")
    public WebElementFacade kittyPartyFirstEmailField;

    @FindBy(css = "#kitty_parties_1_name")
    public WebElementFacade kittyPartySecondNameField;

    @FindBy(css = "#button-submit-kitty")
    public  WebElementFacade kittySubmitButtonField;

    @FindBy(css = "nav > div > div > div.col-xs-8 > a > span")
    public WebElementFacade kittyTitle;

    @FindBy(css = "#add-entry")
    public WebElementFacade addExpenseButton;

    @FindBy(css = "#entry_amount")
    public WebElementFacade amountField;

    @FindBy(css = "#entry_description")
    public WebElementFacade descriptionField;

    @FindBy(css = "#entry-expense-add")
    public WebElementFacade addButton;

    @FindBy(css = "div > div.section> div.mb-2 > div > div.transaction > div.transaction-action > form > button")
    public WebElementFacade markAsSettledButton;

    @FindBy(css = "div > div > form > div > button")
    public List<WebElementFacade> partyMemberButtonList;

    @FindBy(css = "#pjax-container > div:nth-child(3)")
    public WebElementFacade settleText;

    @FindBy(css = "div:nth-child(2) div:nth-child(3) div:nth-child(2) div:nth-child(2) div:nth-child(1) div:nth-child(2)")
    public WebElementFacade settleText1;

    @FindBy(css = "#pjax-container > div:nth-child(3)")
    public WebElementFacade expenseText;
}