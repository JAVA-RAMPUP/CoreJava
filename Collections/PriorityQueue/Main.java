package Collections.PriorityQueue;

import java.util.PriorityQueue;

import java.util.Comparator;

class MyComparator implements Comparator<String>
{
    @Override
    public int compare(String x, String y)
    {
        System.out.println("Comparing " + x + " and " + y);
        return x.length() - y.length();
    }
}


public class Main
{
    public static void main(String[] args)
    {

        PriorityQueue<String> queue = new PriorityQueue<String>(15, new MyComparator());
        queue.add("Tyrion Lannister");
    //    queue.add("Daenerys Targaryen");
        queue.add("Arya Stark");
        queue.add("Petyr 'Littlefinger' Baelish");

        while (!queue.isEmpty())
        {
            System.out.println(queue.poll());

        }
    }
}