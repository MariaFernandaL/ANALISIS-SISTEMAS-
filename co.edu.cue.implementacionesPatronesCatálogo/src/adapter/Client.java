package adapter;

import adapter.adapter.UserAdapter;
import adapter.adapter.UserAdapterImpl;

public class Client {
    public static void main(String[] args) {
        UserAdapter adapter= new UserAdapterImpl();
        adapter.getUser(1);
    }
}
