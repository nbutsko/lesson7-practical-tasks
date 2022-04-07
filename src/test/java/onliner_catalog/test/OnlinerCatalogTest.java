package onliner_catalog.test;

import onliner_catalog.page.OnlinerHomePage;
import onliner_catalog.page.OnlinerTVCatalogPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OnlinerCatalogTest {

    private WebDriver driver;
    private OnlinerTVCatalogPage tvCatalogPage;

    @Before
    public void browserSetup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void openOnlinerTVCatalogTest() throws InterruptedException {
        tvCatalogPage = new OnlinerHomePage(driver)
                .openPage()
                .openCatalogPage()
                .openTVCatalogPage();
    }

    @After
    public void browserTearDown() {
        driver.quit();
        driver = null;
    }
}
