package main;

import controller.ProductController;
import controller.UserController;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        UserController userController = new UserController();
        ProductController productController= new ProductController();

        int option;
        int choice;

        do {
            choice = Integer.parseInt(JOptionPane.showInputDialog("Enter the desired option: "
                    + " \n 1. User Management"
                    + " \n 2. Product Management"
                    + " \n 3. OUT"
            ));

            if (choice == 1) {
                do {
                    option = Integer.parseInt(JOptionPane.showInputDialog("Enter the option for the menu: "
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
                } while (option != 5);
            } else if(choice==2){
                do {
                    option = Integer.parseInt(JOptionPane.showInputDialog("Enter the option for the menu: "
                            + " \n 1. Create Product"
                            + " \n 2. Show Products"
                            + " \n 3. Update Product"
                            + " \n 4. Delete Product"
                            + " \n 5. OUT"
                    ));

                    switch (option) {
                        case 1:
                            productController.createProduct();
                            break;
                        case 2:
                            productController.showProduct();
                            break;
                        case 3:
                            productController.updateProduct();
                            break;
                        case 4:
                            productController.deleteProduct();
                            break;
                        case 5:
                        default:
                            break;
                    }
                } while (option != 5);
            }
        } while(choice !=3);
    }
}
