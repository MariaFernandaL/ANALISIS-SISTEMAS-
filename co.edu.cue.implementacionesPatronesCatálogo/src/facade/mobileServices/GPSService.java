package facade.mobileServices;

import facade.mobile.MobileService;

public class GPSService implements MobileService {
    @Override
    public void start() {
        System.out.println("GPS Service started");
    }

    @Override
    public void close() {
        System.out.println("GPS Service closed");
    }
}
