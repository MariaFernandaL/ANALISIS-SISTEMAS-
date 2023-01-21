package composite;

import composite.producto.ProductoCompuesto;
import composite.producto.ProductoPeso;
import composite.producto.ProductoUnitario;
import composite.service.IPrecio;

public class Pedido extends ProductoCompuesto {
    private String cliente;

    public Pedido(String cliente) {
        super();
        this.cliente = cliente;
    }
    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    @Override
    public void addProducto(IPrecio producto) {
        super.addProducto(producto);
    }

    @Override
    public void removeProducto(IPrecio producto) {
        super.removeProducto(producto);
    }

    public void establecerCantidad(IPrecio producto, int cantidadFinal){
        if (producto instanceof ProductoUnitario){
            ((ProductoUnitario) super.getProductos().
                    get(super.getProductos().indexOf(producto))).
                    setCantidad(cantidadFinal);
        }
    }
    public void establecerPeso(IPrecio producto, double pesoFinal){
        if (producto instanceof ProductoPeso){
            ((ProductoPeso) super.getProductos().
                    get(super.getProductos().indexOf(producto))).
                    setPeso(pesoFinal);
        }
    }

}
