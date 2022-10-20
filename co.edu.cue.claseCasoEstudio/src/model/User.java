package model;

import service.Mensaje;

public class User {

    private String name;
    private String identification;
    private String address;
    private String phone;
    private String email;
    private Mensaje mss;


    public User() {
    }

    public User(String name, String identification, String address, String phone, String email, Mensaje mss) {
        this.name = name;
        this.identification = identification;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.mss = mss;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String seeMessage(){
        return mss.sendMessage();
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", identification='" + identification + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
