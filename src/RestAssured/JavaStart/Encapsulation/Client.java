package JavaStart.Encapsulation;

class Client {
    private String firstName;
    private String lastName;
    private boolean premium;

    public Client(String firstName, String lastName, boolean premium) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.premium = premium;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isPremium() {
        return premium;
    }

    public void setPremium(boolean premium) {
        this.premium = premium;
    }

    public void showDiscountInformation(double price, double priceDiscount){
        System.out.println("Witaj " + this.firstName + " " + this.lastName);
        System.out.println("Kwota przed rabatem: " + price);
        System.out.println("Do zapłaty (po rabacie): " + priceDiscount);
    }


}