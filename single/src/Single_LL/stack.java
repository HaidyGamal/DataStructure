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
public  class stack {
    private node top;

    public stack() {
        this.top=null;
    }
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
    public String pop(){
        if(top==null) {System.out.println("ERROR:EMPTY LIST");
            return "0";}
        
        String dd=top.data;
        top=top.next;
        return dd;
    }
    public void remove(int i){
        if(top==null) {System.out.println("can't remove from empty list");
            return;}
        node temp=top;
        while(temp!=null&&temp.index!=i){
            temp=temp.next;
        }
        while(temp.next!=null){
        temp.data=temp.next.data;
        temp.index=temp.next.index;
        temp=temp.next;
        }
        temp=null;
    }
    public boolean is_empty(){
        return top==null;
    }
    public String read_top(){
        return top.data;
    }
    public int get_actual_size(){
        int counter=0;
        node temp=top;
        while(temp!=null){
            temp=temp.next;
            counter++;
        }
        return counter;
        }
    public void print_stack(){
        node temp=top;
        while(temp!=null){
            System.out.print(temp.index+"  ");
            System.out.println(temp.data);
            
            temp=temp.next;
        }
    }
    }
    
