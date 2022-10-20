package dto;


public class ProductDto {

    private String name;
    private String description;
    private double price;
    private int stock;
    private String listImages;

    public ProductDto() {
    }

    public ProductDto(String name, String description, double price, int stock, String listImages) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.stock = stock;
        this.listImages = listImages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getListImages() {
        return listImages;
    }

    public void setListImages(String listImages) {
        this.listImages = listImages;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", stock=" + stock +
                ", listImages='" + listImages + '\'' +
                '}';
    }

}
