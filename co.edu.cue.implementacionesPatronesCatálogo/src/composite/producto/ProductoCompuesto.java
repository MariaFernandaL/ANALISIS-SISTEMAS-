package composite.producto;

import composite.service.IPrecio;

import java.util.ArrayList;
import java.util.Iterator;

public class ProductoCompuesto implements IPrecio {

    private ArrayList<IPrecio> productos;

    public ProductoCompuesto(){
        productos=new ArrayList<IPrecio>();
    }

    public void addProducto(IPrecio precio){
        productos.add(precio);
    }

    public void removeProducto(IPrecio precio){
        productos.remove(precio);
    }

    public ArrayList<IPrecio> getProductos() {
        return productos;
    }

    @Override
    public double getImporteTotal() {
        double importeTotal=0;
        for (Iterator<IPrecio> it= productos.iterator(); it.hasNext();){
            IPrecio iPrecio= it.next();
            importeTotal+=iPrecio.getImporteTotal();
        }
        return importeTotal;
    }
}
