package onliner_catalog.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OnlinerHomePage extends AbstractPage{

    @FindBy(xpath = "//div[@class='b-top-menu']//*[text()='Каталог']/parent::a")
    private WebElement linkCatalog;

    public OnlinerHomePage(WebDriver driver) {
        super(driver);
    }

    public OnlinerHomePage openPage() {
        String homepageUrl = "https://www.onliner.by/";
        driver.get(homepageUrl);
        return this;
    }

    public OnlinerCatalogPage openCatalogPage(){
        linkCatalog.click();
        return new OnlinerCatalogPage(driver);
    }
}
