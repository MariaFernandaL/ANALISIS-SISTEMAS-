package service.impl;

import model.User;
import service.Mensaje;
import service.UserService;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl implements UserService {

    List<User> listUsers= new ArrayList<User>();

    @Override
    public void createUser(String name, String identification, String address, String phone, String email, Mensaje mensaje) {
        User user= new User(name, identification, address, phone, email,mensaje);
        listUsers.add(user);
        System.out.println(user.seeMessage());
        user.toString();
        System.out.println("The user is create");
    }

    @Override
    public void deleteUser(String identification) {
        User user= search(identification);
        if (user!=null) {
            listUsers.remove(user);
            System.out.println("The user is delete");
        } else{
            System.out.println("The user is not found");
        }
    }

    @Override
    public void updateUser(String idSearch) {
        User user= search(idSearch);

        int option;

        if (user!=null) {
            do {
                option = Integer.parseInt(JOptionPane.showInputDialog("The user data: \n" +
                    "1. IDENTIFICATION: " + user.getIdentification() + "\n" +
                    "2. NAME: " + user.getName() + "\n" +
                    "3. ADDRESS: " + user.getAddress() + "\n" +
                    "4. EMAIL: " + user.getEmail() + "\n" +
                    "5. PHONE: " + user.getPhone() + "\n"+
                    "6. OUT"
                ));

                switch (option){
                    case 1:
                        String identification= JOptionPane.showInputDialog("Enter the identification of change: ");
                        user.setIdentification(identification);
                        break;
                    case 2:
                        String name= JOptionPane.showInputDialog("Enter the name of change: ");
                        user.setName(name);
                        break;
                    case 3:
                        String address= JOptionPane.showInputDialog("Enter the address of change: ");
                        user.setAddress(address);
                        break;
                    case 4:
                        String email= JOptionPane.showInputDialog("Enter the email of change: ");
                        user.setEmail(email);
                        break;
                    case 5:
                        String phone= JOptionPane.showInputDialog("Enter the phone of change: ");
                        user.setPhone(phone);
                        break;
                }
            }while (option!=6);

            System.out.println("The user is update.");
        } else{
            System.out.println("The user is not found");
        }
    }


    private User search(String identification) {
        for (User user: listUsers) {
            if (user.getIdentification().equals(identification)){
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
