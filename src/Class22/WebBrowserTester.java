package Class22;

public class WebBrowserTester {
    public static void main(String[] args) {
        /*Safari safari=new Safari();
        safari.startBrowser();
        safari.test();
        safari.closeBrowser();

        Chrome chrome=new Chrome();
        chrome.startBrowser();
        chrome.test();
        chrome.closeBrowser();

        FireFox fireFox=new FireFox();
        fireFox.startBrowser();
        fireFox.test();
        fireFox.closeBrowser();*/

        WebDriver[] browsers={new Chrome(), new Safari(), new FireFox()};
        for(WebDriver browser:browsers){
            browser.startBrowser();
            browser.closeBrowser();
        }
    }
}
