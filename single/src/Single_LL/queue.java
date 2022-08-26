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
public class queue {
    private node front,rear;

    public queue() {
        this.front=this.rear=null;
    }
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
    
    public boolean is_empty(){
        return front==null;
    }
    public String read_front(){
        return front.data;
    }
    public int get_actual_size(){
        int counter=0;
        node temp=front;
        while(temp!=null){
            temp=temp.next;
            counter++;
        }
        return counter;
        }
    public void print_queue(){
        node temp=front;
        while(temp!=null){
            System.out.print(temp.index+"  ");
            System.out.println(temp.data);
            
            temp=temp.next;
        }
    }
}
