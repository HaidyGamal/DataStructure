/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contact.list_double_ll;

/**
 *
 * @author haidy
 */
public class ContactList_double_LL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double_LL obj=new double_LL();
        obj.add_last("haidy");
        obj.add_last("gamal");
        obj.add_last("mohamed");
        obj.add_index(1,"ahmed");
        
        obj.print();
        System.out.println("***********");
        obj.delete_last();
        obj.print();
        System.out.println("***********");
        System.out.println(obj.search_index("haidy"));
    }
    
}
