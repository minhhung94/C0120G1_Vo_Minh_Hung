package nhap.Test;

public class Product {
    private int id;
    private String price;
    private String url;

    public Product(int id, String price, String url) {
        this.id = id;
        this.price = price;
        this.url = url;
    }

    public Product() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
