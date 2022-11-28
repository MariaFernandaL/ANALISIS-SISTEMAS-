package decorator;

public class LuxuryWatchDecorator extends WatchDecorator {

    public LuxuryWatchDecorator(Watch watch) {
        super(watch);
    }

    @Override
    public void createFuncionality() {
        super.createFuncionality();
        System.out.println("other features (Luxury Watch): ");
        this.addFastCharge();
        this.addImpermeability();
        this.addNFC();
    }

    private void addFastCharge(){
        System.out.println("FASTCHARGE");
    }
    private void addImpermeability(){
        System.out.println("IMPERMEABILITY");
    }
    private void addNFC(){
        System.out.println("NFC");
    }
}
