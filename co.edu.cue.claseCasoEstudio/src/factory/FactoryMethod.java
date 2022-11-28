package factory;

import service.Categoryy;
import service.Mensaje;

public abstract class FactoryMethod {


    /**
     * Si se necesitaran m+etodos con el mismo tipo de retorno se podría crear una clase como esta, con su método abstracto, y que
     * cada una de sus clases lo implementara.
     * @param category
     * @return
     */
    abstract Categoryy createCategoryProduct(String category);

    /**
     * Si se necesitaran m+etodos con el mismo tipo de retorno se podría crear una clase como esta, con su método abstracto, y que
     * cada una de sus clases lo implementara.
     * @param mss
     * @return
     */
    abstract Mensaje menssageBuyer(String mss);
}
