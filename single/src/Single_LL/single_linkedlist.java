/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Single_LL;

/**
 *
 * @author haidy
 */
public class single_linkedlist {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        queue obj=new queue();
        obj.enqueue("haidy");
        obj.enqueue("gamal");
        obj.enqueue("mohamed");
        obj.enqueue("ahmed");
        
        obj.print_queue();
        System.out.println("*************");
        obj.dequeue();
        obj.print_queue();
        }
       
    
}
