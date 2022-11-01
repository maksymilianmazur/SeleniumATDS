package GettersAndSetters;

import org.junit.Test;

public class Tests {

    @Test
    public void gettersAndSetters(){
        Customer customer = new Customer();
        int age = 12;
        customer.setAge(age);
        System.out.println(customer.getAge());
        age = 22;
        System.out.println(customer.getAge());
    }

    @Test
    public void gettersAndSettersObjectTest(){
        Customer customer = new Customer();
        Address address = new Address("Wrocław","Poleska","69");//tworzę obiekt+inicjalizacja
        customer.setAddress(address); //referencja jako parametr metody
        Address address2 = customer.getAddress(); //utworzenie zmiennej i pobranie adresu z customera
        System.out.println("Adres: " +
                customer.getAddress().getStreet() + " " +
                customer.getAddress().getApartment() + ", " +
                customer.getAddress().getCity());
        address2.setCity("Gdańsk");
        System.out.println("Adres: " +
                customer.getAddress().getStreet() + " " +
                customer.getAddress().getApartment() + ", " +
                customer.getAddress().getCity());

    }
}
