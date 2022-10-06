package main;

import controller.UserController;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        UserController userController= new UserController();

        int option;

        do {
            option=Integer.parseInt (JOptionPane.showInputDialog("Enter the option for the menu: "
                    + " \n 1. Create User"
                    + " \n 2. Show users"
                    + " \n 3. Update User"
                    + " \n 4. Delete User"
                    + " \n 5. OUT"
            ));

            switch (option) {
                case 1:
                    userController.createUser();
                    break;
                case 2:
                    userController.showUsers();
                    break;
                case 3:
                    userController.updateUser();
                    break;
                case 4:
                    userController.deleteUser();
                    break;
                case 5:
                default:
                    break;
            }
        } while (option!=5);
    }
}
