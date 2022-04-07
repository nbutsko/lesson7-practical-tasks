package onliner_catalog.page;

import org.openqa.selenium.WebDriver;

public class OnlinerTVCatalogPage extends AbstractPage{

    public OnlinerTVCatalogPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public OnlinerTVCatalogPage openPage() {
        String catalogPageUrl = "https://catalog.onliner.by/tv";
        driver.get(catalogPageUrl);
        return this;
    }
}
