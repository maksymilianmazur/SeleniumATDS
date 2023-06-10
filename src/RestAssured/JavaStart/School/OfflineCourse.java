package JavaStart.School;


class OfflineCourse extends Course {
    public OfflineCourse(String city, int numberOfLessons,String id, String title, String description, double price) {
        super(id,title,description,price);
        this.city = city;
        this.numberOfLessons = numberOfLessons;
    }

    private String city;
    private int numberOfLessons;

    @Override
    void additionalInfo(){
        System.out.println("city: " + city + "\n numberOfLessons: "+ numberOfLessons);
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getNumberOfLessons() {
        return numberOfLessons;
    }

    public void setNumberOfLessons(int numberOfLessons) {
        this.numberOfLessons = numberOfLessons;
    }
}