# NODE CLASS 
we make node class as structure contains the data of root and the left and right nodes
```
public class node {
    int data;
    node left,right;

    public node() {
    }  
}
```
# BINARY TREE CLASS
class contains all methods that can be done in binary tree
#1. make_node function
function that creates new nodes
```
public node make_node(int dd){
        node temp=new node();
        temp.data=dd;
        temp.left=null;
        temp.right=null;
        return temp;
           
    }
 ```
#2. rec_insertion function
function to insert new node in its correct position in the tree
```
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
 ```
 #3 print pre-order functions
 functions to print the nodes of the tree in preorder traversal
 by printing the data of the parent first then check the left and right childs
 ```
 public void print_preOrder(){
        
        if(root==null) System.out.println("EMPTY TREE");
        else rec_preOrder(root);
    }
  public void rec_preOrder(node ptr){
        if(ptr==null) return;
        System.out.print(ptr.data+"  ");
        rec_preOrder(ptr.left);
        rec_preOrder(ptr.right);
    }
  ```
 #4. print post-order functions
 functions to print the nodes of the tree in postorder traversal
 by printing the data of the left child first then the right child and  parent
 ```
 public void print_postOrder(){
        
        if(root==null) System.out.println("EMPTY TREE");
        else rec_postOrder(root);
    }
  public void rec_postOrder(node ptr){
        if(ptr==null) return;
        rec_preOrder(ptr.left);
        rec_preOrder(ptr.right);
        System.out.print(ptr.data+"  ");
    }
  ```
  #5. print in-order functions
 functions to print the nodes of the tree in inorder traversal
 by printing the data of the left child first then the parent and right child
 ```
 public void print_inOrder(){
       
        if(root==null) System.out.println("EMPTY TREE");
        else rec_inOrder(root);
    }
  public void rec_inOrder(node ptr){
        if(ptr==null) return;
        rec_preOrder(ptr.left);
        System.out.print(ptr.data+"  ");
        rec_inOrder(ptr.right);
    }
   ```
#6. search functions
  function to check if the inserted element exists in the tree 
  ```
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
   ```
 #7. remove functions
 function to remove specific element from the tree
 first we have to check if the root equal to null or not
 ```
 public void remove_data(int dd){
        if(search_data(dd)){
        if(root==null) {System.out.println("EMPTY TREE");}
        else  root=rec_delete(root,dd);}
        else System.out.println("\nthe number doesn't exist");
    }
   ```
then we have to specify the position of the inserted element 
if the element bigger than the data so we have to look in the right part
and if it is less so we have to look in the left
till we reatch to the wanted node 
```
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
   ```


 
