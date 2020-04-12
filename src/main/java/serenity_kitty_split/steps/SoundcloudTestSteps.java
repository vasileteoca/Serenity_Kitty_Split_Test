package serenity_kitty_split.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import serenity_kitty_split.pages.SoundcloudTestPage;

import static junit.framework.TestCase.assertTrue;

public class SoundcloudTestSteps extends ScenarioSteps {

    private SoundcloudTestPage soundcloudTestPage;

    @Step("Open page")
    public void open(String url) {
        getDriver().navigate().to(url);
    }

    @Step("Click Sign in button")
    public void signInButtonClick(){
        soundcloudTestPage.signInButton.click();
        getDriver().switchTo().activeElement();
    }

    @Step("STEP: Input email address")
    public void inputEmailAddress() {
        soundcloudTestPage.emailField.sendKeys("vasilebasil1@gmail.com");
        //getDriver().switchTo().parentFrame();
    }

    @Step("STEP: Click on the Continue button")
    public void clickContinueButton() {
        soundcloudTestPage.continueButton.click();
    }

    @Step("STEP: Input password")
    public void inputPassword() {
        soundcloudTestPage.passwordField.sendKeys("Test123456,");
    }

    @Step("STEP: Click final Next button")
    public void clickFinalNextButton() {
        soundcloudTestPage.finalNextButton.click();
    }

    @Step("STEP: I search for a song")
    public void searchForSong() { soundcloudTestPage.searchInputField.sendKeys("mick jenkins jazz");}

    @Step("STEP: I open the song page for the first entry in the result list")
    public void openSongPageFromResultList() { soundcloudTestPage.openSongPageFromResultList.click();}

    @Step("STEP: I click on the first result")
    public void clickOnPlayButtonInResultList() { soundcloudTestPage.songPlayButton.click();}

    @Step("STEP: I click on more dropdown")
    public void moreDropdownClick() {soundcloudTestPage.moreDropdown.click();}

    @Step("STEP:  I click on Add to playlist option")
    public void addToPlaylistOptionClick() { soundcloudTestPage.addToPlaylistDropdownOption.click();}


}