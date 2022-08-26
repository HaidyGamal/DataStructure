/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarysearchtree;

/**
 *
 * @author haidy
 */
public class BinarySearchTree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        binary_tree obj=new binary_tree();
        obj.insert_data(4);
        obj.insert_data(2);
        obj.insert_data(8);
        obj.insert_data(9);
        obj.insert_data(3);
        System.out.println("inOrder:"); obj.print_inOrder();
        System.out.println("\npostOrder:"); obj.print_postOrder();
        System.out.println("\npreOrder:"); obj.print_preOrder();
        System.out.println(obj.search_data(19));
        System.out.println(obj.search_data(2));
        System.out.println("\n*********************");
        obj.remove_data(4);
        obj.print_inOrder();
    }
    
}
