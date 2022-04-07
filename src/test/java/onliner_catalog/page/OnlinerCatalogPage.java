package onliner_catalog.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OnlinerCatalogPage extends AbstractPage{

    @FindBy(xpath = "//*[text()='Электроника']/ancestor::li")
    private WebElement buttonElectronics;

    @FindBy(xpath = "//*[contains(text(),'Телевидение')]/parent::div")
    private WebElement sectionTelevision;

    @FindBy(xpath = "//*[contains(text(),'Телевизоры')]//ancestor::a[@class='catalog-navigation-list__dropdown-item']")
    private WebElement buttonTelevision;

    public OnlinerCatalogPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public OnlinerCatalogPage openPage() {
        String catalogPageUrl = "https://catalog.onliner.by/";
        driver.get(catalogPageUrl);
        return this;
    }

    public OnlinerTVCatalogPage openTVCatalogPage() {
        buttonElectronics.click();
        sectionTelevision.click();
        buttonTelevision.click();
        return new OnlinerTVCatalogPage(driver);
    }

}
