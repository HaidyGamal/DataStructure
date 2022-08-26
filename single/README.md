# single linkelist

acts as a chain.Each element contains a data, pointer that points to the next element in the list
# NODE CLASS 
we make node class as structure contains the data of parent and the next nodes
```
public class node {
    String data;
      int  index;
      node next;
    public node() {
}
}
```
# stack class
Stack is a linear data structure which follows a particular order in which the operations are performed.
Deals with LIFO(Last In First Out)
#1. push function 
to insert data into stack we have to insert it to the TOP
```
public void push(String dd){
        
        node temp=new node();
        if(temp==null){
            System.out.println("ERROR:FULL MEMORY");
            return;
        }
        if(top==null){
        temp.data=dd;
        temp.index=0;
        temp.next=top;
        top=temp;
    }
        else{
        temp.data=dd;
        temp.index=top.index+1;
        temp.next=top;
        top=temp;
        }}
   ```
  #2. POP function
  also to pop any data we have to pop it from the top to apply LIFO concept
  ```
  public String pop(){
        if(top==null) {System.out.println("ERROR:EMPTY LIST");
            return "0";}
        
        String dd=top.data;
        top=top.next;
        return dd;
    }
   ```
 #3. get_actual_size function
 
 function returns the size of the list 
 ```
 public int get_actual_size(){
        int counter=0;
        node temp=top;
        while(temp!=null){
            temp=temp.next;
            counter++;
        }
        return counter;
        }
```
4. print function
```
public void print_stack(){
        node temp=top;
        while(temp!=null){
            System.out.print(temp.index+"  ");
            System.out.println(temp.data);
            
            temp=temp.next;
        }
    }
 ```
# Queue class
queue is a linear data structure which follows a particular order in which the operations are performed.
Deals with FIFO(First In First Out)
#1. enqueue function
to insert data in a queue we have to insert in from rear 
```
public void enqueue(String dd){
        
        node temp=new node();
        if(temp==null){
            System.out.println("ERROR:FULL MEMORY");
            return;
        }
        if(front==null){
        temp.data=dd;
        temp.index=0;
        temp.next=null;}
        else{
        temp.data=dd;
        temp.index=rear.index+1;
        temp.next=null;}
       if (rear!=null){
           rear.next=temp;
           rear=temp;}
       else{rear=front=temp;}
        }
   ```
  #2. dequeue function
  to pop data from queue we have to pop it from the front to apply FIFO concept
  ```
  public String dequeue(){
        if(front==null) {System.out.println("ERROR:EMPTY LIST");
            return "0";}
        
        String dd;
        node temp=front;
        dd=front.data;
        front=front.next;
        if(front==null)   rear=null;
        return dd;
    }
   ```
