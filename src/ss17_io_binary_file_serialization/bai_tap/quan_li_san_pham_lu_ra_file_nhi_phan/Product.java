package ss17_io_binary_file_serialization.bai_tap.quan_li_san_pham_lu_ra_file_nhi_phan;

public class Product {
    private int idProduct;
    private String name;
    private String producer;
    private double price;
    private String other;

    public Product() {
    }

    public Product(int idProduct, String name, String producer, double price, String other) {
        this.idProduct = idProduct;
        this.name = name;
        this.producer = producer;
        this.price = price;
        this.other = other;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    @Override
    public String toString() {
        return "Product{" +
                "idProduct=" + idProduct +
                ", name='" + name + '\'' +
                ", producer='" + producer + '\'' +
                ", price=" + price +
                ", other='" + other + '\'' +
                '}';
    }
}
