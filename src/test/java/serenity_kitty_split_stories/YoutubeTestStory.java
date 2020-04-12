package serenity_kitty_split_stories;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.*;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.WebDriver;
import serenity_kitty_split.steps.YoutubeTestSteps;


@Story(YoutubeTestStory.class)
@RunWith(SerenityRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@WithTag("Smoke")
public class YoutubeTestStory {

    @Managed(uniqueSession = true)
    public WebDriver webDriver;

    @Steps
    private YoutubeTestSteps youtubeTestSteps;


    @Before
    public void init() {
        youtubeTestSteps.open("http://www.youtube.com/en");
    }

    @Test
    @WithTag("Youtube Add to playlist")
    @Title("Youtube Add to playlist")
    public void AddToPlaylist() {
        //_________________________________LOG_IN______________________________
        youtubeTestSteps.signInButtonClick();
        //youtubeTestSteps.chooseAnotherAccount();
        youtubeTestSteps.inputEmailAddress();
        youtubeTestSteps.clickNextButton();
        youtubeTestSteps.inputPassword();
        youtubeTestSteps.clickFinalNextButton();
        //_____________________________________________________________________
        //____________________________SEARCH_FOR_VIDEO_________________________
        youtubeTestSteps.inputSearchFieldWithData();
        youtubeTestSteps.clickSearchButton();
        //_____________________________________________________________________
        //______________________OPEN_VIDEO_FROM_RESULT_LIST____________________
        youtubeTestSteps.selectFromSearchResultsList();
        //_____________________________________________________________________
        //____________________________ADD_TO_PLAYLIST__________________________
        youtubeTestSteps.addToPlaylistButtonClick();
        youtubeTestSteps.selectOrCreatePlaylist();
        //_____________________________________________________________________
        //______________OPEN_DRAWER_MENU_AND_SEARCH_FOR_PLAYLIST_______________
        youtubeTestSteps.drawerMenuClick();
        youtubeTestSteps.openTestPlaylist();
        //_____________________________________________________________________
        //_____________________VERIFY_VIDEO_IN_PLAYLIST________________________
        youtubeTestSteps.verifyAddedVideoToPlaylist();

    }

    /*@Test
    @WithTag("Play from playlist")
    @Title("Play from playlist")
    public void PlayFromPlaylist() {

    }

    @Test
    @WithTag("Generate list of videos in a playlist")
    @Title("Generate list of videos in a playlist")
    public void GenerateListOfVideosInPlaylist() {

    }*/
}