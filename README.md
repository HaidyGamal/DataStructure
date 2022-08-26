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
#BINARY TREE CLASS
class contains all methods that can be done in binary tree
#1. make_node function
function that creates new nodes
'''
public node make_node(int dd){
        node temp=new node();
        temp.data=dd;
        temp.left=null;
        temp.right=null;
        return temp;
           
    }
 '''
#2. rec_insertion function
function to insert new node in its correct position in the tree
'''
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
    '''
    
