package AccessModifiers;

import org.junit.Test;

public class Tests {

    @Test
    public void productPriceTest(){
        ProductPage productPage = new ProductPage();
        productPage.goTo("url-testowy");
        String price = productPage.productPrice;
        String title = productPage.title;
    }

}
