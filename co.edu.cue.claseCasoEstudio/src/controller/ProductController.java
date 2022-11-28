package controller;

import factory.ProductFactory;
import service.*;
import service.impl.ProductServiceImpl;
import service.impl.UserServiceImpl;

import javax.swing.*;

public class ProductController {


    ProductService productService= new ProductServiceImpl();
    ProductFactory productFactory= new ProductFactory();

    public ProductController() {
    }

    public ProductController(ProductService productService,ProductFactory productFactory ) {
        this.productService = productService;
        this.productFactory = productFactory;
    }


    //CRUD
    /**
     * Descripcion: Este metodo realiza el pedido de los datos para la creacion del producto
     * y llama al método de creacion de productos del objeto productService
     */
    public void createProduct(){
        JOptionPane.showMessageDialog(null,"Enter the product data: ");
        String name= JOptionPane.showInputDialog("Enter the name");
        String sku= JOptionPane.showInputDialog("Enter the sku");
        String description= JOptionPane.showInputDialog("Enter the description");
        Double price= Double.parseDouble(JOptionPane.showInputDialog("Enter the price"));
        String material= JOptionPane.showInputDialog("Enter the material");
        String color= JOptionPane.showInputDialog("Enter the color");
        String category= JOptionPane.showInputDialog("Enter the category");
        Categoryy categoryy=productFactory.createCategoryProduct(category);
        int stock= Integer.parseInt(JOptionPane.showInputDialog("Enter the stock"));
        String listImages= JOptionPane.showInputDialog("Enter the list Images");
        productService.createProduct(name,sku,description,price,material,color,categoryy, stock, listImages);
    }

    /**
     * Descripcion: Este metodo realiza la eliminación del producto según el sku (codigo de producto) que el usuario ingrese
     * y llama al método de eliminacion de un producto del objeto productService
     */
    public void deleteProduct(){
        String sku= JOptionPane.showInputDialog("Enter the product sku for delete");
        if (sku!=null){
            productService.deleteProduct(sku);
        }
    }

    /**
     * Descripcion: Este metodo realiza la actualización de un producto según el sku (codigo de producto) que el usuario ingrese
     * y llama al método de actualizacion de un producto del objeto productService
     */
    public void updateProduct(){
        String sku= JOptionPane.showInputDialog("Enter the product sku for update");
        if (sku!=null){
            productService.updateProduct(sku);
        }
    }

    /**
     * Descripcion: Este metodo muestra todos los productos disponibles
     * y para ello, llama al método de listar productos del objeto productService
     */
    public void showProduct(){
        productService.viewProducts();
    }

}
