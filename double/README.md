# Double linkelist

acts as a chain.Each element contains a data, pointer that points to the previous element 
and another one to the next element
# NODE CLASS 
we make node class as structure contains the data of parent and the prev and next nodes
```
public class node {
    String data;
      int  index;
      node next;
      node prev;
    public node() {
}
}
```
# double_LL class
#1. add_first function

function to insert element in the first index
```
public void add_first(String dd){
       node temp=new node();
       if(temp==null){
            System.out.println("ERROR:FULL MEMORY");
            return;
        }
        temp.data=dd;
        temp.index=0;
        temp.next=null;
        temp.prev=null;
        
       counter++;
       if(first==null){first=last=temp;
       return;}
       temp.next=first;
       first.prev=temp;
       first=temp;
       temp=temp.next;
       while(temp!=null){
               temp.index++;
               temp=temp.next;
           }
       
   }
  ```
#2. add_last function

function to insert element in the last index
```
public void add_last(String dd){
       node temp=new node();
       if(temp==null){
            System.out.println("ERROR:FULL MEMORY");
            return;
        }
       if(first==null){
        temp.data=dd;
        temp.index=0;
        temp.next=null;
        temp.prev=null;
    }
        else{
        temp.data=dd;
        temp.index=last.index+1;
        temp.next=null;
        temp.prev=null;
        }
       counter++;
       if(first==null){first=last=temp;
       return;}
       temp.prev=last;
       last.next=temp;
       last=temp;
   }
 ```
#3. add_index function

function to insert element in specific inserted index
```
public void add_index(int pos,String dd){
       node actual;
       node temp=new node();
       if(pos<0||pos>counter){
           System.out.println("position is out of range");
            return;
       }
       if(temp==null){
            System.out.println("ERROR:FULL MEMORY");
            return;
        }
       if(pos==0) add_first(dd);
       else if(pos==counter) add_last(dd);
       else{
           temp.data=dd;
           temp.index=pos;
           actual=first;
           for(int i=1;i<pos;i++)  actual=actual.next;
           temp.next=actual.next;
           temp.prev=actual;
           actual.next=temp;
           actual.next.prev=temp;
           temp=temp.next;
           while(temp!=null){
               temp.index++;
               temp=temp.next;
           }
           counter++;
        }  
    }
  ```
#4. delete _first function

function to delete the element in the first index
```
public void delete_first(){
       
       if(first==null){System.out.println("ERROR:EMPTY LIST"); return;}
       if(counter==1){first=null;
       first=last=null;
       counter--;}
       else{
           node temp=first;
           first=first.next;
           first.prev=null;
           temp=null;
           counter--;
       }
       
       
   }
  ```
 #5. delete _last function
 
function to delete the element in the last index
```
public void delete_last(){
       
       if(last==null){System.out.println("ERROR:EMPTY LIST"); return;}
       if(counter==1){last=null;
       first=last=null;
       counter--;}
       else{
           node temp=first;
           last=last.prev;
           last.next=null;
           temp=null;
           counter--;
       }   
   }
 ```
 #6. delete_index function
 
 function to delete the element of the inserted index
```
public void delete_index(int pos){
       node temp,actual;
       temp=new node();
       if(pos<0||pos>counter){
           System.out.println("ERROR:POSITION OUT OF RANGE");
           return;
       }
       if(pos==0){delete_first();}
       else if(pos==counter){delete_last();}
       else{
       actual=first;
       for(int i=1;i<pos;i++) actual=actual.next;
       temp=actual.next;
       actual.next=temp.next;
       temp.next.prev=actual;
       temp=null;
       counter--;
       }   
   }
   ```
  #7. search_index function 
  
  function returns the index of specific element
  ```
  int search_index(String dd){
       node temp=new node();
       temp=first;
       int count=0;
       while(temp!=null){
           if(temp.data==dd) return count;
           temp=temp.next;
           count++;
       }
       System.out.println("can't found");
       return 0;
   }
  ```
  #8. print function 
  
  function that prints the elements of the list 
  ```
  public void print(){
        node temp=new node();
        temp=first;
        if(temp==null){ System.out.println("ERROR:EMPTY LIST"); return;}
        while(temp!=null){
            System.out.print(temp.index+"  ");
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
  ```
  
