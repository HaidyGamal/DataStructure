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
public class binary_tree {
    private node root;

    public binary_tree() {
        root=null;
    }
    public node make_node(int dd){
        node temp=new node();
        temp.data=dd;
        temp.left=null;
        temp.right=null;
        return temp;
           
    }
    public void insert_data(int dd){
        if(root==null) root=make_node(dd);
        else rec_insertion(root,dd);
    }
    public void rec_insertion(node ptr,int dd){
        if(dd<ptr.data){
            if(ptr.left==null) ptr.left=make_node(dd);
            else rec_insertion(ptr.left,dd);
        }
        else if(dd>ptr.data){
            if(ptr.right==null) ptr.right=make_node(dd);
            else rec_insertion(ptr.right,dd);
        }
    }
    public void print_preOrder(){
        
        if(root==null) System.out.println("EMPTY TREE");
        else rec_preOrder(root);
    }
    public void print_inOrder(){
       
        if(root==null) System.out.println("EMPTY TREE");
        else rec_inOrder(root);
    }
    public void print_postOrder(){
        
        if(root==null) System.out.println("EMPTY TREE");
        else rec_postOrder(root);
    }
    
    public void rec_preOrder(node ptr){
        if(ptr==null) return;
        System.out.print(ptr.data+"  ");
        rec_preOrder(ptr.left);
        rec_preOrder(ptr.right);
    }
    public void rec_inOrder(node ptr){
        if(ptr==null) return;
        rec_preOrder(ptr.left);
        System.out.print(ptr.data+"  ");
        rec_inOrder(ptr.right);
    }
    public void rec_postOrder(node ptr){
        if(ptr==null) return;
        rec_preOrder(ptr.left);
        rec_preOrder(ptr.right);
        System.out.print(ptr.data+"  ");
    }
    public boolean search_data(int dd){
        if(root==null){ System.out.println("EMPTY TREE"); return false;}
        else return rec_search(root,dd);
    }
    public boolean rec_search(node ptr,int dd){
        if(ptr==null) { System.out.print("\ncan't found  "); return false;}
        else if(ptr.data==dd) return true;
        else if(ptr.data>dd) return rec_search(ptr.left, dd);
        else  return rec_search(ptr.right, dd);
    }
    public void remove_data(int dd){
        if(search_data(dd)){
        if(root==null) {System.out.println("EMPTY TREE");}
        else  root=rec_delete(root,dd);}
        else System.out.println("\nthe number doesn't exist");
    }
   public node rec_delete(node ptr,int key){
       node current,trail_current,temp;
   
       if (ptr==null) {
           System.out.println("IT'S NULL");
           return ptr;
       }
       if(ptr.data<key)  ptr.right=rec_delete(ptr.right, key);
       else if(ptr.data>key)  ptr.left=rec_delete(ptr.left, key);
       else { 
           if(ptr.left==null&&ptr.right==null){ 
           ptr=null;
           
       }
       else if(ptr.left==null){
           temp=ptr;
           ptr=temp.right; ptr.right=null;
           temp=null;
           
       }
       else if(ptr.right==null){
           temp=ptr;
           ptr=temp.left; ptr.left=null;
           temp=null;
           
       }
       else{
           current=ptr.left;
           trail_current=null;
           while(current.right!=null){
               trail_current=current;
               current=current.right;

           }
           ptr.data=current.data;
           if(trail_current==null) ptr.left=current.left;
           else trail_current.right=current.left;
           current=null;
           
           
       }
          return ptr;  
   }
       return ptr;
   }}
