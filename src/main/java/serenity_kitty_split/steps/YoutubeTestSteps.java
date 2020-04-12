package serenity_kitty_split.steps;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;
import serenity_kitty_split.pages.YoutubeTestPage;

import static junit.framework.TestCase.assertTrue;

public class YoutubeTestSteps extends ScenarioSteps {

    private YoutubeTestPage youtubeTestPage;

    @Step("Open page")
    public void open(String url) {
//        getDriver().manage().window().maximize();
        getDriver().navigate().to(url);
    }

    @Step("STEP: Click on the Sign In button")
    public void signInButtonClick() {
        youtubeTestPage.signInButton.click();
    }

    @Step("STEP: Choose another account")
    public void chooseAnotherAccount() {
        youtubeTestPage.anotherAccount.click();
    }

    @Step("STEP: Input email address")
    public void inputEmailAddress() {
        youtubeTestPage.emailField.sendKeys("vasilebasil1@gmail.com");
        //getDriver().switchTo().parentFrame();
    }

    @Step("STEP: Click on the Next button")
    public void clickNextButton() {
        youtubeTestPage.nextButton.click();
    }

    @Step("STEP: Input password")
    public void inputPassword() {
        youtubeTestPage.passwordField.sendKeys("Test123456,");
    }

    @Step("STEP: Click final Next button")
    public void clickFinalNextButton() {
        youtubeTestPage.finalNextButton.click();
    }

    @Step("STEP: Input data in Search field")
    public void inputSearchFieldWithData() {
        youtubeTestPage.searchInputField.sendKeys("Cucumber introduction");
    }

    @Step("STEP: Click on the Search button")
    public void clickSearchButton() {
        youtubeTestPage.searchButton.submit();
    }

    @Step("STEP: Click on the first result from search results list")
    public void selectFromSearchResultsList() {
        youtubeTestPage.searchResultsVideoLink.click();
    }

    @Step("STEP: Click on the Add To Playlist Button ")
    public void addToPlaylistButtonClick() {
        youtubeTestPage.addToPlaylistButton.click();
    }

    @Step("STEP: Select or create a new playlist if the playlist doesn't exist")
    public void selectOrCreatePlaylist() {
        int i = 0;
        boolean addedToPlaylist = false;

        for (WebElementFacade playlist : youtubeTestPage.playlistList) {
            i = youtubeTestPage.playlistList.indexOf(playlist) + 1;
            if (playlist.getText().toLowerCase().contains("test")) {
                playlist.click();
                youtubeTestPage.closeButton.click();
                addedToPlaylist = true;
            }
        }

        if (addedToPlaylist = false) {
            youtubeTestPage.createPlaylistButton.click();
            youtubeTestPage.playlistNameField.sendKeys("Test");
            youtubeTestPage.playlistPrivacyDropdown.sendKeys("Public");
            youtubeTestPage.createPlaylistButton.submit();
        }


    }

    @Step("STEP: Click on the Drawer Menu")
    public void drawerMenuClick() {
        youtubeTestPage.drawerMenu.click();
    }

    @Step("STEP: Click the Test playlist")
    public void openTestPlaylist() {
        if (youtubeTestPage.showMorePlaylists.isVisible()) {
            youtubeTestPage.showMorePlaylists.click();
            for (WebElementFacade playlist : youtubeTestPage.playlistsListDrawerMenu) {
                if (playlist.getText().toLowerCase().contains("test")) {
                    playlist.click();
                }
            }
        } else {
            for (WebElementFacade playlist : youtubeTestPage.playlistsListDrawerMenu) {
                if (playlist.getText().toLowerCase().contains("test")) {
                    playlist.click();
                }
            }
        }
    }
        @Step("STEP: Verify the newly added video to playlist")
        public void verifyAddedVideoToPlaylist () {
            boolean videoExists = false;

            for (WebElementFacade video : youtubeTestPage.listOfVideosInPlaylist) {
                if (video.getText().contains("cucumber")) {
                    videoExists = true;
                }
            }

            Assert.assertTrue(videoExists == true);
        }


    }