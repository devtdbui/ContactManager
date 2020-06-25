/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contactmanager;

import java.util.List;

/**
 *
 * @author Bui Dat
 */
public class Option implements IOption {

    @Override
    public void add(List<Contact> list, Contact contact) {
        list.add(contact);
    }

    @Override
    public void display(List<Contact> list) {
        for (Contact o : list) {
            System.out.println(o);
        }
    }

    @Override
    public void delete(List<Contact> list, int id) {
        boolean check = false;
        int index = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                list.remove(i);
                check = true;
                index = i;
                break;
            }
        }
        if (check) {
            System.out.println("remove successfully");
            for (int i = 0; i < list.size(); i++) {
                list.get(i).setId(i + 1);
            }
        } else {
            System.out.println("Not found");
        }
    }

}
