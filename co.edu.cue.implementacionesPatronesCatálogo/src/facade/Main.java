package facade;

import facade.mobile.Mobile;
import facade.mobile.MobileFacade;

public class Main {
    public static void main(String[] args) {
        MobileFacade facade= new MobileFacade();
        Mobile mobile= facade.on();

        System.out.println("---------------------");

        facade.off(mobile);
    }
}
