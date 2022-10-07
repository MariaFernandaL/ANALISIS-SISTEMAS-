package service;

import model.User;

public interface UserService {

    public void createUser(String name, String identification, String address, String phone, String email, Mensaje mensaje);
    public void deleteUser(String identification);
    public void updateUser(String idSearch);
    public void viewUsers();
}
