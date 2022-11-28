package factory;

import service.Categoryy;

public class ProductFactory {


    /**
     * Descripción: este método realiza la creación de las diferentes categorias de los productos, ayudando así
     * al aislamiento de la parte de creacion de el código de los controladores, así si hay nuevas categorias de productos por agregar
     * ni se tendrá que modificar la clase principal del método de creación de productos. Factory Method.
     * @param category
     * @return
     */
    public Categoryy createCategoryProduct(String category) {
    Categoryy categoryy=null;
        if(category.equalsIgnoreCase("accesorio electronico")) {
            categoryy = Categoryy.ACCESORIOELECTRONICO;
        } else if(category.equalsIgnoreCase("accesorio decorativo")) {
            categoryy = Categoryy.ACCESORIODECORATIVO;
        } else if(category.equalsIgnoreCase("computador")) {
            categoryy = Categoryy.COMPUTADOR;
        } else if(category.equalsIgnoreCase("celular")) {
            categoryy = Categoryy.CELULAR;
        }
            return categoryy;
    }
}
