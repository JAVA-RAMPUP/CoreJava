package Collections.PriorityQueue;

import java.util.PriorityQueue;

import java.util.Comparator;


class MyComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        // Reverse order
        return o2 - o1;
    }
}

public class Main
{
    public static void main(String[] args)
    {

        PriorityQueue<Integer> queue = new PriorityQueue<Integer>( new MyComparator());
        queue.add(2);
        queue.add(5);
        queue.add(9);

        while (!queue.isEmpty())
        {
            System.out.println(queue.poll());

        }
    }
}