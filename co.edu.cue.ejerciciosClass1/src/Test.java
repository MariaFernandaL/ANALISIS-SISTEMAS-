public class Test {

    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String saludar() throws Exception {
        validateNombre();
        return "Hola a todos";
    }

    private void validateNombre() throws Exception {
        if (nombre.equals("Pedro")){
            throw new Exception("No me cae bien Pedro");
        }
    }



}
