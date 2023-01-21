package state;

public abstract class State {
    public User user;
    public State(User user){
        this.user=user;
    }
    public abstract String onActive();
    public abstract String onDisable();
    public abstract String onLock();
    public abstract String onBuy();
}