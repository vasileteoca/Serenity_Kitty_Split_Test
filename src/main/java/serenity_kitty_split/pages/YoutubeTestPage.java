package serenity_kitty_split.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class YoutubeTestPage extends PageObject {

    /*@FindBy(css = "CSS Selector goes here")
    public WebElementFacade emptyElementTemplate;

    @FindBy(css = "input[title='Search']")
    public WebElementFacade searchField;

    @FindBy(css = "div.rc h3")
    public List<WebElementFacade> resultsTitles;*/

    @FindBy(css = "#buttons > ytd-button-renderer")
    public WebElementFacade signInButton;

    @FindBy(css = "#profileIdentifier")
    public WebElementFacade profileSelect;

    @FindBy(css = "div > div > ul > li:nth-child(2)")
    public WebElementFacade anotherAccount;

    @FindBy(css = "input[type='email']")
    public WebElementFacade emailField;

    @FindBy(css = "div:nth-child(2)>div:nth-child(2)>div>div>div:nth-child(2)>div>div:nth-child(2)>div>div:nth-child(1) > div")
    public WebElementFacade nextButton;

    @FindBy(css = "#password > div.aCsJod.oJeWuf > div > div.Xb9hP > input")
    public WebElementFacade passwordField;

    @FindBy(css = "div:nth-child(2)>div:nth-child(2)>div>div>div:nth-child(2)>div>div:nth-child(2)>div>div:nth-child(1) > div")
    public WebElementFacade finalNextButton;

    @FindBy(css = "#search")
    public WebElementFacade searchInputField;

    @FindBy(css = "#search-icon-legacy")
    public WebElementFacade searchButton;

    @FindBy(css = "#video-title")
    public WebElementFacade searchResultsVideoLink;

    @FindBy(css = "#button")
    public WebElementFacade addToPlaylistButton;

    @FindBy(css = "#playlists ytd-playlist-add-to-option-renderer")
    public List<WebElementFacade> playlistList;

    @FindBy(css = "#endpoint")
    public WebElementFacade newPlaylistButton;

    @FindBy(css = "#input-1 > input")
    public WebElementFacade playlistNameField;

    @FindBy(css = "#trigger")
    public WebElementFacade playlistPrivacyDropdown;

    @FindBy(css = "#button")
    public WebElementFacade createPlaylistButton;

    @FindBy(css = "#button > yt-icon")
    public WebElementFacade closeButton;

    @FindBy(css = "#guide-icon")
    public WebElementFacade drawerMenu;

    @FindBy(css = "#endpoint > paper-item > span.title.style-scope.ytd-guide-entry-renderer")
    public WebElementFacade showMorePlaylists;

    @FindBy(css = "#section-items ytd-guide-entry-renderer")
    public List<WebElementFacade> playlistsListDrawerMenu;

    @FindBy(css = "#content")
    public List<WebElementFacade> listOfVideosInPlaylist;

/*    @FindBy(css = "")
    public WebElementFacade nextButton;

    @FindBy(css = "")
    public WebElementFacade nextButton;

    @FindBy(css = "")
    public WebElementFacade nextButton;

    @FindBy(css = "")
    public WebElementFacade nextButton;*/
}