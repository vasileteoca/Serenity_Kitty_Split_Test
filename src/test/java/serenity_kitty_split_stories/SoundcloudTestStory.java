package serenity_kitty_split_stories;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.*;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.WebDriver;
import serenity_kitty_split.steps.SoundcloudTestSteps;


@Story(SoundcloudTestStory.class)
@RunWith(SerenityRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@WithTag("Smoke")
public class SoundcloudTestStory {

    @Managed(uniqueSession = false)
    public WebDriver webDriver;

    @Steps
    private SoundcloudTestSteps soundcloudTestSteps;


    @Before
    public void init() {
        webDriver.manage().window().maximize();
        soundcloudTestSteps.open("http://www.soundcloud.com");
    }

    @Test
    @WithTag("Add to Playlist")
    @Title("Adding a song to a new or existing playlist")
    public void AddToPlaylist() {
        soundcloudTestSteps.signInButtonClick();
        soundcloudTestSteps.inputEmailAddress();
        soundcloudTestSteps.clickContinueButton();
        soundcloudTestSteps.inputPassword();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        soundcloudTestSteps.clickFinalNextButton();
        soundcloudTestSteps.searchForSong();
        soundcloudTestSteps.openSongPageFromResultList();
        soundcloudTestSteps.moreDropdownClick();
        soundcloudTestSteps.addToPlaylistOptionClick();

    }

    @Test
    @WithTag("Like song")
    @Title("Like a song and verify it in the like list")
    public void LikeSongAndVerification() {

    }

    @Test
    @WithTag("Change Name")
    @Title("Update the name of the profile")
    public void UpdateProfileName() {
    }
}