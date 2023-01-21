package singleton;

public class SoyUnico {

    private String nombre;
    private static SoyUnico soyUnico;

    private SoyUnico(String nombre){
        this.nombre=nombre;
        System.out.println("Mi nombre es: "+ this.nombre);
    }

    public static SoyUnico getSingletonInstance(String nombre){
        if (soyUnico ==null){
            soyUnico= new SoyUnico(nombre);
        } else{
            System.out.println("I CANT CREATE THIS: "+nombre);
        }
        return soyUnico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public SoyUnico getSoyUnico() {
        return soyUnico;
    }

    public void setSoyUnico(SoyUnico soyUnico) {
        this.soyUnico = soyUnico;
    }
}

