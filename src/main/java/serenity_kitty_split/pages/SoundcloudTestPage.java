package serenity_kitty_split.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class SoundcloudTestPage extends PageObject {

    /*@FindBy(css = "CSS Selector goes here")
    public WebElementFacade emptyElementTemplate;

    @FindBy(css = "input[title='Search']")
    public WebElementFacade searchField;

    @FindBy(css = "div.rc h3")
    public List<WebElementFacade> resultsTitles;*/

    @FindBy(css = "div > div > div > div > div > button:nth-child(1)")
    public WebElementFacade signInButton;

    @FindBy(css = "input[name='username']")
    public WebElementFacade emailField;

    @FindBy(css = "div > div > form > div > div.signinForm__step.signinForm__initial > div > button")
    public WebElementFacade continueButton;

    @FindBy(css = "input[type='password']")
    public WebElementFacade passwordField;

    @FindBy(css = "div.signinWithPassword > button")
    public WebElementFacade finalNextButton;

    @FindBy(css = "div.header__middle > div > form > input")
    public WebElementFacade searchInputField;

    @FindBy(css = "li:nth-child(2) > div > div > div > div.sound__content > div.sound__header > div > div > div.soundTitle__playButton > a")
    public WebElementFacade songPlayButton;

    @FindBy(css = "li:nth-child(2) > div > div > div > div.sound__content > div.sound__header > div > div > div.soundTitle__usernameTitleContainer > a > span")
    public WebElementFacade openSongPageFromResultList;

    @FindBy(css = "div:nth-child(1) > div > div > div.listenEngagement__footer > div > div:nth-child(1) > button.sc-button-more")
    public WebElementFacade moreDropdown;

    @FindBy(css = "div > div > button.sc-button-addtoset")
    public WebElementFacade addToPlaylistDropdownOption;


}