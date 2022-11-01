package GettersAndSetters;

public class Customer {
    private String name;
    private String lastName;
    private int age;
    private Address address; //pole o typie referencyjnym

    //public void setAddress(Address address) { this.address = address; }
    public void setAddress(Address addressParameter) { address = copy(addressParameter);}

    public Address getAddress() { return address; }
    private Address copy(Address addressToCopy)
    {
        Address address = new Address(addressToCopy.getCity(),addressToCopy.getStreet(),addressToCopy.getApartment());
        return address;
    }









    public void setAge(int age){
        if(age<0)
        { throw new IllegalArgumentException("Age can't be negative number"); }
        this.age=age;
    }
    public int getAge() { return age; }



}
