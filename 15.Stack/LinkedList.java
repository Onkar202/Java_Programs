import java.util.*;

class LinkedList {
    public static boolean isListPalindrom(LinkedList l) {
        
        Stack<Character> s1 = new Stack<>();
        if(l.size%2==0){
            while(!l.isEmpty()){
                if(s1.isEmpty() || s1.peek() != l.peek())
                    s1.add(l.remove());
                else if(s1.peek()==l.peek()){
                    s1.pop();
                    l.remove();
                }
            }
        }
        else{
            int k = 0;
            while(!l.isEmpty()){
                //abcba
                if(k == l.size / 2 + 1){
                    l.remove();
                }
                else if(s1.isEmpty() || s1.peek() != l.peek())
                s1.add(l.remove());
                else if(s1.peek()==l.peek()){
                    s1.pop();
                    l.remove();
                }
                k++;
            }
        }
        if(s1.isEmpty())
            return true;
        return false;
    }

    class Node {
        char data;
        Node next;

        Node(char data) {
            this.data = data;
            this.next = null;
        }
    }
    public char peek() {
        if(head==null){
            System.out.println("List is empty");
            return '!';
        }
        return head.data;
    }
    Node head = null;
    Node tail = null;
    int size = 0;
    public void add(char data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            
            return;
        }
        tail.next = newNode;
        tail = newNode;
        
    }

    public char remove() {
        if (head == null) {
            return '!';
        }
        size--;
        char ch = head.data;
        head = head.next;
        return ch;

    }

    public boolean isEmpty() {
        if (head == null) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        LinkedList ch = new LinkedList();
        ch.add('a');
        ch.add('a');
        ch.add('b');
        // ch.add('c');
        ch.add('b');
        ch.add('a');
        ch.add('a');
        // ch.remove();
        System.out.println(ch);
        System.out.println(ch.size);
        System.out.println(isListPalindrom(ch));

    }
}