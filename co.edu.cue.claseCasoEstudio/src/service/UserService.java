package service;

import model.User;

public interface UserService {

    public void createUser(String name, String id, String address, String phone, String email, Mensaje mensaje);
    public void deleteUser(String id);
    public void updateUser(String idSearch, String name, String id, String address, String phone, String email );
    public void viewUsers();
}
