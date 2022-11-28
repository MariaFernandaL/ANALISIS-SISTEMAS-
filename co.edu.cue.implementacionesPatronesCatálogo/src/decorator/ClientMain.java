package decorator;

public class ClientMain {
    public static void main(String[] args) {
        Watch basicWatch= new BasicWatch();
        basicWatch.createFuncionality();
        System.out.println("--------------");

        Watch sportsWatch= new SportWatchDecorator(new BasicWatch());
        sportsWatch.createFuncionality();
        System.out.println("--------------");

        Watch sportLuxuryWatch= new LuxuryWatchDecorator(new SportWatchDecorator(new BasicWatch()));
        sportLuxuryWatch.createFuncionality();
        System.out.println("--------------");

        Watch luxurySportWatch= new SportWatchDecorator(new LuxuryWatchDecorator(sportLuxuryWatch));
        luxurySportWatch.createFuncionality();
        System.out.println("--------------");

    }
}
