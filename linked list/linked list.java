package ex;

import java.util.NoSuchElementException;

public class LinkedList {

    private class Node {

        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
        public void displaylist(){
            System.out.println(value);}
    }
    private Node first;
    private Node last;

    public boolean isempty() {
        return first == null;
    }

    public void addfirst(int item) {
        Node newlink = new Node(item);
        if (isempty()) {
            first = newlink;
        }
        newlink.next = first;
        first = newlink;

    }

    public void addlast(int item) {
        Node newlink = new Node(item);
        if (isempty()) {
            last = first = newlink;
        } else {
            last.next = newlink;
        }
        last = newlink;
    }

    public int indexof(int item) {
        var current = first;
        int index = 0;
        while (current != null) {
            if (current.value == item) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }

    public boolean contains(int item) {
        return indexof(item) != -1;
    }
    public void removefirst(){ 
        if(isempty()){
        throw new NoSuchElementException();}
        if(first == last){
        first=last=null;
        return;
        }
        var sec = first.next;
        first.next= null;
        first = first.next;
    }
    public Node removelast(){
        var current = first;
        var previous = first;
        while (current != null){
            if (current == last){
                last= previous;
                previous.next= current.next;}
            else{
                previous = current;
                current = current.next;}
           }
        return null;  
     }
    public void displaylists(){
        var current = first;
        while (current!=null){
            current.displaylist();
            current=current.next;
        }
              
    
    }
    
}
