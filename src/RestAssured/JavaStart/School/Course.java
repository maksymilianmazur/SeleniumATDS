package JavaStart.School;

class Course {
    public Course(String id, String title, String description, double price) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.price = price;
    }

    private String id;
    private String title;
    private String description;
    private double price;

    void printBasicInfo() {
        System.out.println("Basis information\n Title: " + getTitle() + "\nDescription: " + getDescription() + "\nPrice: " + getPrice()
                + "\nID: " + getId());
    }

    void additionalInfo(){

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}