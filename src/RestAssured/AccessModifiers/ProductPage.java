package AccessModifiers;

import org.jsoup.Connection;

public class ProductPage extends BasePage {
    String productName;
    String productPrice;

   public void addtoCart(){
       BasePage basePage = new BasePage();
       basePage.searchForProduct("product");
       System.out.println("Product added to cart");
       searchForProduct("dragsy");
    }
}
