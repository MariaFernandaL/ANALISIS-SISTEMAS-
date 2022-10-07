package controller;

import model.CompradorMayorista;
import model.CompradorOcasional;
import service.Mensaje;
import service.UserService;
import service.impl.UserServiceImpl;

import javax.swing.*;

public class UserController {

    UserService userService= new UserServiceImpl();
    Mensaje mensaje;

    public UserController() {
    }

    public UserController(UserService userService) {
        this.userService = userService;
    }


    //CRUD
    public void createUser(){
        JOptionPane.showMessageDialog(null,"Enter the user data: ");
        String name= JOptionPane.showInputDialog("Enter the name");
        String id= JOptionPane.showInputDialog("Enter the id");
        String direccion= JOptionPane.showInputDialog("Enter the address");
        String phone= JOptionPane.showInputDialog("Enter the phone");
        String email= JOptionPane.showInputDialog("Enter the email");
        String mss= JOptionPane.showInputDialog("Enter the type of buyer");
        if (mss.equalsIgnoreCase("comprador mayorista")) {
            mensaje=new CompradorMayorista();
        } else if(mss.equalsIgnoreCase("comprador ocasional")){
            mensaje= new CompradorOcasional();
        }
        userService.createUser(name, id, direccion, phone, email,mensaje);
    }

    public void deleteUser(){
        String id= JOptionPane.showInputDialog("Enter the user id for delete");
        if (id!=null){
            userService.deleteUser(id);
        }
    }

    public void updateUser(){
        String idSearch= JOptionPane.showInputDialog("Enter the user id for update");
        if (idSearch!=null){
            userService.updateUser(idSearch);
        }
    }

    public void showUsers(){
        userService.viewUsers();
    }

}
