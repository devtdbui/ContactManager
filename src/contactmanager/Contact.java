/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contactmanager;

/**
 *
 * @author Bui Dat
 */
public class Contact {

    private int id;
    private String name;
    private String group;
    private String address;
    private String phone;

    public Contact() {
    }

    public Contact(int id, String name, String group, String address, String phone) {
        this.id = id;
        this.name = name;
        this.group = group;
        this.address = address;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
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

    public String getFirstName() {
        String txt[] = name.split(" ", 2); //neu nhap nhieu space thi them \\s+
        return txt[0];
    }

    public String getLastName() {
        String txt[] = name.split(" ", 2); //neu nhap nhieu space thi them \\s+
        return txt[1];
    }

    @Override
    public String toString() {
        return String.format("%5d%25s%15s%15s%15s%15s%15s", id, name, getFirstName(), getLastName(), group, address, phone);
    }

}
