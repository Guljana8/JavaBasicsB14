package Class23;

public interface WebTester {
    public static void main(String[] args) {
        WebDriver[]  web={new ChromeDriver(), new FirefoxDriver()};
        for(WebDriver browser : web){
            browser.openBrowser();
            browser.maximizeWindow();
            browser.findElement();
            browser.closeBrowser();
        }
    }
}
