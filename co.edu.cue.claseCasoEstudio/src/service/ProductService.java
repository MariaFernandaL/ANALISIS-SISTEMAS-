package service;

public interface ProductService {


    /**
     * Descripcion: Este metodo es para realizar la creacion de productos, su funcionalidad es dada en la clase que lo implemente (ProductServiceImpl)
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
    void createProduct(String name, String sku, String description, double price, String material, String color, Categoryy category, int stock, String listImages);

    /**
     * Descripcion: Este metodo es para realizar la eliminacion de un producto, su funcionalidad es dada en la clase que lo implemente (ProductServiceImpl)
     * @param sku
     */
    void deleteProduct(String sku);

    /**
     * Descripcion: Este metodo es para realizar la actualizacion de un producto, su funcionalidad es dada en la clase que lo implemente (ProductServiceImpl)
     * @param sku
     */
    void updateProduct(String sku);

    /**
     * Descripcion: Este metodo es para visualizar todos los productos creados o modificados, su funcionalidad es dada en la clase
     * que lo implemente (ProductServiceImpl)
     */
    void viewProducts();
}
