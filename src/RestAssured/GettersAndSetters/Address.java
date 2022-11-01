package GettersAndSetters;

public class Address {
    private String street;
    private String apartment;
    private String city;
    public Address(String city, String street, String apartment) //konstruktor z parametrami
    {
        this.street = street;
        this.apartment = apartment;
        this.city = city;
    }
    public String getStreet(){return street;} //metody zwracające pola prywatne klasy - getter
    public String getApartment(){return apartment;}
    public String getCity(){return city;}

    public void setCity(String city){
        this.city = city;
    }

}
