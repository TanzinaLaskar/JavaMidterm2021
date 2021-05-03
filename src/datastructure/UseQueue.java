package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {


    /*
     * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
     * Use For Each loop and while loop with Iterator to retrieve data.
     *
     */

    public static void main(String[] args) {
        /*
         * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
         * Use For Each loop and while loop with Iterator to retrieve data.
         *
         */

        Queue<String> queueList = new LinkedList<>();
        queueList.add("Tanzina");
        queueList.add("Farzin");
        queueList.add("Shadman");
        queueList.add("Thamina");

        queueList.remove(3);
        System.out.println("available variables are: " + queueList);

        System.out.println(queueList.poll());
        System.out.println(queueList.poll());
        System.out.println(queueList.peek());
        System.out.println(queueList.poll());

        for (
                String item : queueList)
            System.out.print(item + ", ");

        System.out.print("\nThe Queue items using iterator: ");
        Iterator<String> iter = queueList.iterator();
        while (iter.hasNext()) {
            System.out.print(iter.next() + ", ");


        }
    }

}


