package composite;

import composite.producto.ProductoCompuesto;
import composite.producto.ProductoPeso;
import composite.producto.ProductoUnitario;

public class CompositePrincipal {
    public static void main(String[] args) {
        Pedido pedido= new Pedido("SEAS- Estudios Abiertos");

        ProductoPeso jamon= new ProductoPeso(5.0, 10.0, "Jamón Ibérico", "Embutidos");
        ProductoPeso lomo= new ProductoPeso(0.8, 5.0, "Lomo Ibérico", "Embutidos");

        ProductoUnitario paqueteDeEspagietis= new ProductoUnitario(3,1.50, "Paquete de Espaguetis", "Pastas");
        ProductoUnitario vino= new ProductoUnitario(6,2.25, "Botella de Vino", "Vinos");

        ProductoCompuesto cestaNavidad= new ProductoCompuesto();
        cestaNavidad.addProducto(vino);
        cestaNavidad.addProducto(lomo);

        pedido.addProducto(jamon);
        pedido.addProducto(paqueteDeEspagietis);

        System.out.println("El importe total es: "+ pedido.getImporteTotal());
        pedido.addProducto(cestaNavidad);
        System.out.println("El importe total es: "+ pedido.getImporteTotal());


    }
}
