package state.estados;

import state.State;
import state.User;

public class LockState extends State {

    public LockState(User user) {
        super(user);
    }
    @Override
    public String onActive() {
        return "Locked...";
    }
    @Override
    public String onDisable() {
        return "Locked...";
    }
    @Override
    public String onLock() {
        if (user.isBuying()){
            user.changeState(new DisableState(user));
            return "Locked...";
        }
        if (user.getEnable()){
            user.changeState(new DisableState(user));
            return "Disabled...";
        }
        user.changeState(new ActiveState(user));
        return "Locked...";
    }
    @Override
    public String onBuy() {
        return "Locked...";
    }
}
