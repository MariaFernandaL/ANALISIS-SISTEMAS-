package state;

import state.estados.ActiveState;
import state.estados.BuyingState;
import state.estados.DisableState;
import state.estados.LockState;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.setBuying(true);
        user.setEnable(true);

        ActiveState activeState = new ActiveState(user);
        activeState.onActive();

        BuyingState buyingState = new BuyingState(user);
        buyingState.onBuy();

        DisableState disableState = new DisableState(user);
        disableState.onDisable();

        LockState lockState = new LockState(user);
        lockState.onLock();
    }
}
