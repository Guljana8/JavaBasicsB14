package Class23;
/*Create a WebDriver Interface that will have the following unimplemented behaviour:
*openBrowser(), closeBrowser(), maximizeWindow(), findElement().
* Create 2 classes that implements WebDriver interface: ChromeDriver and FirefoxDriver.
 */

public interface WebDriver {
     void openBrowser();
     void closeBrowser();
    void maximizeWindow();
    void findElement();
}
class ChromeDriver implements WebDriver{
    @Override
    public void openBrowser(){
        System.out.println("Open Chrome browser on your computer");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Close Chrome browser on your computer");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Maximize the Chrome browser on your computer");
    }

    @Override
    public void findElement() {
        System.out.println("Find share this page element on Chrome browser");
    }
}
class FirefoxDriver implements WebDriver{

    @Override
    public void openBrowser() {
        System.out.println("Open FireFox browser on your computer");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Close FireFox browser on your computer");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Maximize the FireFox browser on your computer");
    }

    @Override
    public void findElement() {
        System.out.println("Find reload element on FireFox browser");
    }
}