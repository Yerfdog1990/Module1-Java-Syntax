package CollectionClasses;
/*
A Queue is an appropriate data structure to manage people in a bank in
the order of their booked receipt numbers for receiving service.
The Queue interface in Java represents a collection designed for holding elements prior to processing,
typically following the First-In-First-Out (FIFO) principle.
Here's an example of how you might use a Queue to manage this scenario:
 */

import java.util.LinkedList;
import java.util.Queue;

public class BankServiceQueue {
    public static void main(String[] args) {
        //Create a Queue to hold the receipt numbers
        Queue<Integer> serviceQueue = new LinkedList<>();

        //Simulate booking receipts (adding people to the serviceQueue)
        serviceQueue.offer(100);
        serviceQueue.offer(101);
        serviceQueue.offer(102);
        serviceQueue.offer(103);
        serviceQueue.offer(104);
        serviceQueue.offer(105);
        serviceQueue.offer(106);
        serviceQueue.offer(107);
        serviceQueue.offer(108);
        serviceQueue.offer(109);

        //Process each person in the order of their receipt number
        while(!serviceQueue.isEmpty()){
            //Retrieve and remove head queue
            int receiptNumber = serviceQueue.poll();
            System.out.println("Receipt number " +receiptNumber +" go to counter number " +Math.floor(Math.random()*9) );
            waitingCustomer(receiptNumber);
        }
    }
    //Simulate providing service to a person
    private static void waitingCustomer(int receiptNumber){

        // Add your service logic here
    }

}
