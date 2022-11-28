package factoryMethod;

public class FactoryHoraPais implements FactoryMethod{
    @Override
    public Hora createRelojPais(String pais) {
        Hora horaActualPais= null;
        if (pais.equalsIgnoreCase("corea")){
            horaActualPais= new HoraCorea();
        } else if (pais.equalsIgnoreCase("colombia")){
            horaActualPais= new HoraColombia();
        }else if (pais.equalsIgnoreCase("inglaterra")){
            horaActualPais= new HoraInglaterra();
        } else if (pais.equalsIgnoreCase("")){
            System.out.println("EL PAIS INGRESADO NO ESTA DISPONIBLE");
        }
        return horaActualPais;
    }
}
