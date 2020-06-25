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
public interface IOption {

    public void add(List<Contact> list, Contact contact);

    public void display(List<Contact> list);

    public void delete(List<Contact> list, int id);

}
