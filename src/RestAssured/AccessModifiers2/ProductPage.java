package AccessModifiers2;
import AccessModifiers.BasePage;

public class ProductPage extends BasePage {
    String productName;
    String productPrice;

    protected void addtoCart(){
        BasePage basePage = new BasePage();
        basePage.searchForProduct("product");
        System.out.println("Product added to cart");
    }
}
