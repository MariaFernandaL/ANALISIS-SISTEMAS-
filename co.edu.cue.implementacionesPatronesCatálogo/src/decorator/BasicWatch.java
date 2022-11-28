package decorator;

public class BasicWatch implements Watch {
    @Override
    public void createFuncionality() {
        System.out.println("RELOJ BASICO CON:");
        this.addTimer();
    }
    private void addTimer(){
        System.out.println("Timer");
    }
}