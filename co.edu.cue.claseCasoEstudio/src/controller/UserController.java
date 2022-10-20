package controller;

import service.CompradorMayorista;
import service.CompradorOcasional;
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
    /**
     * Descripcion: Este metodo realiza el pedido de los datos para la creacion del usuario
     * y llama al método de creacion de usuarios del objeto userService
     */
    public void createUser(){
        JOptionPane.showMessageDialog(null,"Enter the user data: ");
        String name= JOptionPane.showInputDialog("Enter the name");
        String identification= JOptionPane.showInputDialog("Enter the idetification");
        String direccion= JOptionPane.showInputDialog("Enter the address");
        String phone= JOptionPane.showInputDialog("Enter the phone");
        String email= JOptionPane.showInputDialog("Enter the email");
        String mss= JOptionPane.showInputDialog("Enter the type of buyer");
        if (mss.equalsIgnoreCase("comprador mayorista")) {
            mensaje=new CompradorMayorista();
        } else if(mss.equalsIgnoreCase("comprador ocasional")){
            mensaje= new CompradorOcasional();
        }
        userService.createUser(name, identification, direccion, phone, email,mensaje);
    }

    /**
     * Descripcion: Este metodo realiza la eliminación del usuario  según la identificacion que el usuario ingrese
     * y llama al método de eliminacion de un usuario del objeto userService
     */

    public void deleteUser(){
        String idetification= JOptionPane.showInputDialog("Enter the user idetification for delete");
        if (idetification!=null){
            userService.deleteUser(idetification);
        }
    }

    /**
     * Descripcion: Este metodo realiza la actualización de un usuario según la identificacion que el usuario ingrese
     * y llama al método de actualizacion de un usuario del objeto userService
     */

    public void updateUser(){
        String idetification= JOptionPane.showInputDialog("Enter the user idetification for update");
        if (idetification!=null){
            userService.updateUser(idetification);
        }
    }

    /**
     * Descripcion: Este metodo muestra todos los usuarios disponibles
     * y para ello, llama al método de listar usuarios del objeto userService
     */
    public void showUsers(){
        userService.viewUsers();
    }

}
