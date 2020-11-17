package exstack;
public class stack {
    private class Node{
        private int value;
        private Node next;
        
    public Node(int value){
        this.value = value;
    }  
    }
    
    private Node first;
    private Node last;
    
    public void push(int value){
       var newlink = new Node(value);
        if(first == null){
            first = newlink;    
        }
        newlink.next=first;
        first = newlink;

    }
    public int peek(){
        return first.value;
    
    }
    public void pop(){
        first = first.next;
    }
    public void push1(int value){
      var newlink = new Node(value);
        if(first ==null)first =newlink;
        else
            last.next=newlink;
  
        last =newlink;}   
}
