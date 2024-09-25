package Collections.Dequeue;
import java.util.Deque;
import java.util.ArrayDeque;

public class Main {

    public static void main(String[] args) {


        Deque<String> dq = new ArrayDeque<String>();


        dq.add("Glenn");
        dq.add("Negan");
        dq.addLast("Maggie");
        dq.addFirst("Rick");
        dq.add("Daryl");

        System.out.println("Elements in Deque:"+dq);


        System.out.println("Removed element: "+dq.removeLast());


        System.out.println("Head: "+dq.element());


        System.out.println("poll(): "+dq.pollLast());


        System.out.println("peek(): "+dq.peek());

        System.out.println("Elements in Deque:"+dq);
    }
}