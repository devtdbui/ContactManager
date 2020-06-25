/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contactmanager;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Bui Dat
 */
public class ContactManager {

    public static void main(String[] args) {
        List<Contact> list = new ArrayList<>();
        Option op = new Option();
        list.add(new Contact(1, "fu hoa lac", "Star", "Ha noi", "1231231123"));
        list.add(new Contact(2, "hehehe hi", "Star", "Ha noi", "1231231123"));
        list.add(new Contact(3, "ho chi minh", "Star", "Ha noi", "1231231123"));
        list.add(new Contact(4, "bui dat dep trai", "Star", "Ha noi", "1231231123"));
        list.add(new Contact(5, "liu lewwwww", "Star", "Ha noi", "1231231123"));
        list.add(new Contact(6, "sprise mother", "Star", "Ha noi", "1231231123"));

        CheckInput ci = new CheckInput();
        while (true) {
            ci.menu();
            int choice = ci.getChoice();
            switch (choice) {
                case 1:
                    int id = ci.getID(list);
                    String name = ci.getString("Input name: ");
                    String group = ci.getString("Input group: ");
                    String address = ci.getString("Input address: ");
                    String phone = ci.getPhone();
                    op.add(list, new Contact(id, name, group, address, phone));
                    break;
                case 2:
                    op.display(list);
                    break;
                case 3:
                    int newId = ci.getIdDelete();
                    op.delete(list, newId);
                    break;
                case 4:
                    break;
            }
        }
    }
}
