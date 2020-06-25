/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contactmanager;

import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author Bui Dat
 */
public class CheckInput {

    Scanner sc = new Scanner(System.in);

    public void menu() {
        System.out.println("========= Contact program =========");
        System.out.println("1. Add a Contact");
        System.out.println("2. Display all Contact");
        System.out.println("3. Delete a Contact");
        System.out.println("4. Exit");
    }

    public int getChoice() {
        while (true) {
            System.out.print("Selection of users: ");
            String input = sc.nextLine();
            Pattern p = Pattern.compile("^[1-4]$");
            if (p.matcher(input).find()) {
                int choice = Integer.parseInt(input);
                return choice;
            } else {
                System.out.print("invalid choice, pls re-enter");
            }
        }
    }

    public int getID(List<Contact> list) {
        if (list.isEmpty()) {
            return 1;

        } else {
            int lastIndex = list.size() - 1;
            int newID = list.get(lastIndex).getId() + 1;
            return newID;
        }
    }

    public String getString(String mess) {
        while (true) {
            System.out.print(mess);
            String name = sc.nextLine();
            Pattern p = Pattern.compile("^[a-zA-Z ]+$");
            if (p.matcher(name).find()) {
                return name;
            } else {
                System.out.println("Invalid name, please input again");
            }
        }
    }

    public String getPhone() {
        while (true) {
            System.out.println("Please input Phone flow\n"
                    + "• 1234567890\n"
                    + "• 123-456-7890 \n"
                    + "• 123-456-7890 x1234\n"
                    + "• 123-456-7890 ext1234\n"
                    + "• (123)-456-7890\n"
                    + "• 123.456.7890\n"
                    + "• 123 456 7890\n");
            System.out.print("Input phone: ");
            String phone = sc.nextLine();
            Pattern p1 = Pattern.compile("^[0-9]{10}$");
            Pattern p2 = Pattern.compile("^[0-9]{3}\\-[0-9]{3}\\-[0-9]{4}$");
            Pattern p3 = Pattern.compile("^[0-9]{3}\\-[0-9]{3}\\-[0-9]{4} (x||ext)[0-9]{4}$");
            Pattern p4 = Pattern.compile("^\\([0-9]{3}\\)\\-[0-9]{3}\\-[0-9]{4}$");
            Pattern p5 = Pattern.compile("^[0-9]{3}\\.[0-9]{3}\\.[0-9]{4}$");
            Pattern p6 = Pattern.compile("^[0-9]{3} [0-9]{3} [0-9]{4}$");
            if (p1.matcher(phone).find() || p2.matcher(phone).find() || p3.matcher(phone).find() || p4.matcher(phone).find() || p5.matcher(phone).find() || p6.matcher(phone).find()) {
                System.out.println("Successful");
                return phone;
            } else {
                System.out.println("Invalid name, please input again");
            }
        }
    }

    public int getIdDelete() {
        while (true) {
            System.out.println("Enter ID: ");
            String id = sc.nextLine();
            Pattern p = Pattern.compile("^[0-9]+$");
            if (p.matcher(id).find()) {
                return Integer.parseInt(id);
            }else{
                System.out.println("ID is digit");
            }
        }
    }
}
