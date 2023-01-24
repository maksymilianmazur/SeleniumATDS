package JavaStart;

class Product {
    String name;
    String producer;

    public String getProducer(String producer) {
        this.producer = producer;
        return producer;
    }

    Product(String name, String producer)
    {
        this.name = name;
        this.producer = producer;
    }
}