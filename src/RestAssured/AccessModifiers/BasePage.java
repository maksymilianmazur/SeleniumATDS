package AccessModifiers;

public class BasePage {

    String title;
    String url;
    String username;

    void goTo(String pageUrl){
        System.out.println("Going to page.");
    }

        public void searchForProduct(String product){
        System.out.println("Searching for product"+ product);
        System.out.println(url);
    }
    
}
