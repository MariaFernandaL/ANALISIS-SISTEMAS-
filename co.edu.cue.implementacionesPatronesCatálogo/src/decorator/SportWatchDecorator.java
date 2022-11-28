package decorator;

public class SportWatchDecorator extends WatchDecorator {
    public SportWatchDecorator(Watch watch) {
        super(watch);
    }
    @Override
    public void createFuncionality() {
        super.createFuncionality();
        System.out.println("othe features(Sport Watch): ");
        this.addPedometer();
        this.addSleepMode();
    }
    private void addPedometer(){
        System.out.println("PEDOMETER");
    }
    private void addSleepMode(){
        System.out.println("SLEEPMODE");
    }
}
