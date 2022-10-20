package model;

import service.Categoryy;

import java.util.Date;

public class Product {

    private String name;
    private String sku;
    private String description;
    private double price;
    private String material;
    private String color;
    private Categoryy category;
    private int stock;
    private String listImages;
    private Date dateCreate;
    private Date dateUpdate;

    public Product() {
    }

    public Product(String name, String sku,String description,
                   double price, String material, String color,
                   Categoryy category, int stock, String listImages,
                   Date dateCreate, Date dateUpdate) {
        this.name = name;
        this.sku= sku;
        this.description = description;
        this.price = price;
        this.material = material;
        this.color = color;
        this.category = category;
        this.stock = stock;
        this.listImages = listImages;
        this.dateCreate = dateCreate;
        this.dateUpdate = dateUpdate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
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

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Categoryy getCategory() {
        return category;
    }

    public void setCategory(Categoryy category) {
        this.category = category;
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

    public Date getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(Date dateCreate) {
        this.dateCreate = dateCreate;
    }

    public Date getDateUpdate() {
        return dateUpdate;
    }

    public void setDateUpdate(Date dateUpdate) {
        this.dateUpdate = dateUpdate;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", sku='" + sku + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", material='" + material + '\'' +
                ", color='" + color + '\'' +
                ", category=" + category +
                ", stock=" + stock +
                ", listImages='" + listImages + '\'' +
                ", dateCreate=" + dateCreate +
                ", dateUpdate=" + dateUpdate +
                '}';
    }

}
