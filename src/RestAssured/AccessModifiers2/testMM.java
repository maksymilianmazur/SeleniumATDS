package AccessModifiers2;

import AccessModifiers.BasePage;
import AccessModifiers.HomePage;
import org.jsoup.Connection;

public class testMM{
    void test (){
        HomePage homePage = new HomePage();
        homePage.searchForProduct("produkt dziedziczenia");
        homePage.addtoCart();
    }
}
