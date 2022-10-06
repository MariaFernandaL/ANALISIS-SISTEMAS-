package service.impl;

import model.User;
import service.Mensaje;
import service.UserService;

import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl implements UserService {

    List<User> listUsers= new ArrayList<User>();

    @Override
    public void createUser(String name, String id, String address, String phone, String email, Mensaje mensaje) {
        User user= new User(name, id, address, phone, email,mensaje);
        listUsers.add(user);
        System.out.println(user.seeMessage());
        user.toString();
        System.out.println("The user is create");
    }

    @Override
    public void deleteUser(String id) {
        User user= search(id);
        if (user!=null) {
            listUsers.remove(user);
            System.out.println("The user is delete");
        } else{
            System.out.println("The user is not found");
        }
    }

    @Override
    public void updateUser(String idSearch, String name, String id, String address, String phone, String email) {
        User user= search(idSearch);
        if (user!=null) {
            user.setName(name);
            user.setId(id);
            user.setAddress(address);
            user.setPhone(phone);
            user.setEmail(email);
            System.out.println("The user is update");
            user.toString();
        } else{
            System.out.println("The user is not found");
        }
    }

    private User search(String id) {
        for (User user: listUsers) {
            if (user.getId().equals(id)){
                return user;
            }
        }
        return null;
    }

    public void viewUsers(){
        for (User user : listUsers) {
            System.out.println(user);
        }
    }

}
