import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.commands.ScrollTo;
import com.codeborne.selenide.conditions.Visible;
import io.netty.util.Timeout;
import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.awt.*;

import static com.codeborne.selenide.Selenide.$;

public class Tests {
    @AfterTest
    public void conf(){
    }
    @Test
    public void test () {
        Configuration.browser = "chrome";
        Configuration.holdBrowserOpen=true;
        Selenide.open("https://www.mvideo.ru/product-list-page?q=%D1%82%D0%B5%D0%BB%D0%B5%D0%B2%D0%B8%D0%B7%D0%BE%D1%80%D1%8B&category=televizory-65");
        PageObjectMvideo pageObjectMvideo = Selenide.page(new PageObjectMvideo());
        PageObjectPagination pageObjectPagination = Selenide.page(new PageObjectPagination());
        PageObjectFilter pageObjectFilter = Selenide.page(new PageObjectFilter());
        pageObjectMvideo.swipe();
        Selenide.sleep(5000);
        pageObjectMvideo.productCardName.scrollIntoView(false).click();
    }
}

