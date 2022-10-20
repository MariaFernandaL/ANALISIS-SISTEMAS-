package service.impl;

import model.Product;
import service.Categoryy;
import service.ProductService;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductServiceImpl implements ProductService {

    List<Product> listProducts= new ArrayList<Product>();

    public ProductServiceImpl() {
       initializeProducts();
    }

    /**
     * Descripcion: Este metodo esta sobreescrito y realiza la creacion de productos, añadiendolos a la lista de productos.
     * Ademas envia la fecha actual de creacion del producto. Tambien envia al usuario un mensaje de confirmacion
     * @param name
     * @param sku
     * @param description
     * @param price
     * @param material
     * @param color
     * @param category
     * @param stock
     * @param listImages
     */
    @Override
    public void createProduct(String name, String sku, String description, double price, String material, String color, Categoryy category, int stock, String listImages) {
        Date dateCreate= new Date();
        Date dateUpdate= null;
        Product product=new Product(name,sku,description,price,material,color,category,stock,listImages,dateCreate,dateUpdate);
        listProducts.add(product);
        product.toString();
        System.out.println("The product is create");
    }

    /**
     * Descripcion: este metodo esta sobreescrito y realizar la eliminacion del producto seleccionado, eliminandolo de la lista de productos ya creada,
     * ademas envia al usuario un mensaje de confirmacion
     * @param sku
     */
    @Override
    public void deleteProduct(String sku) {
        Product product= search(sku);
        if (product!=null) {
            listProducts.remove(product);
            System.out.println("The product is delete");
        } else{
            System.out.println("The product is not found");
        }
    }

    /**
     * Descripcion: Este metodo busca un producto segun el sku dado en la lista de productos y lo retorna.
     * @param sku
     * @return
     */
    private Product search(String sku) {
        for (Product product: listProducts) {
            if (product.getSku().equals(sku)){
                return product;
            }
        }
        return null;
    }

    /**
     * Descripcion: Este metodo realiza la actualizacion de un producto segun el sku dado, ademas muestra toda la
     * informacion del producto encontrado y da la opcion de elegir el atributo a editar. Tambien envia un mensaje de
     * confirmacion al usuario, al igual que almacena la fecha de actualizacion en el producto
     * @param sku
     */
    @Override
    public void updateProduct(String sku) {
        Product product= search(sku);

        int option;

        if (product!=null) {
            do {
                option = Integer.parseInt(JOptionPane.showInputDialog("The product data: \n" +
                        "1. NAME: " + product.getName() + "\n" +
                        "2. DESCRIPTION: " + product.getDescription()  + "\n" +
                        "3. PRICE: " + product.getPrice() + "\n" +
                        "4. STOCK: " + product.getStock()  + "\n"+
                        "5. LIST IMAGES: " + product.getListImages()  + "\n"+
                        "6 OUT"
                ));

                switch (option){
                    case 1:
                        String name= JOptionPane.showInputDialog("Enter the name of change: ");
                        product.setName(name);
                        break;
                    case 2:
                        String description= JOptionPane.showInputDialog("Enter the description of change: ");
                        product.setDescription(description);
                        break;
                    case 3:
                        double price= Double.parseDouble(JOptionPane.showInputDialog("Enter the price of change: "));
                        product.setPrice(price);
                        break;
                    case 4:
                        int stock= Integer.parseInt(JOptionPane.showInputDialog("Enter the stock of change: "));
                        product.setStock(stock);
                        break;
                    case 5:
                        String listImages= JOptionPane.showInputDialog("Enter the list Images of change: ");
                        product.setListImages(listImages);
                        break;
                }
            }while (option!=6);
            System.out.println("The product is update.");
            product.setDateUpdate(new Date());
        } else{
            System.out.println("The product is not found");
        }
    }

    /**
     * Descripcion: Este metodo lista e imprime todos los productos creados y actualizados en la lista de productos.
     */
    @Override
    public void viewProducts() {
        for (Product product : listProducts) {
            System.out.println(product);
        }
    }

    /**
     *Este metodo realiza la creacion de ciertos productos y los añade a la lista. (Ya contiene informacion)
     */
    private void initializeProducts(){

        Product product1=
        new Product("SAMSUNG GALAXY Z FLIP 4", "EA126A", "ULTIMATE PHONE OF SAMSUNG C0MPANY OG KOREA",
                3.000, "METAL", "ROSEGOLD", Categoryy.CELULAR, 3, "https://images.samsung.com/au/smartphones/galaxy-z-flip4/images/galaxy-z-flip4_highlights_kv.jpg",
                new Date(), new Date());
        listProducts.add(product1);

        Product product2=
                new Product("SAMSUNG GALAXY Z FLIP 4", "IJOP839", "ULTIMATE PHONE OF SAMSUNG C0MPANY OG KOREA",
                        3.000, "METAL", "ROSEGOLD", Categoryy.CELULAR, 3, "https://images.samsung.com/au/smartphones/galaxy-z-flip4/images/galaxy-z-flip4_highlights_kv.jpg",
                        new Date(), new Date());
        listProducts.add(product2);
    }
}
