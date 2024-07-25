package Recursion;
/*
The Tower of Hanoi is a classic puzzle that can be solved using recursion in Java.
Here's a breakdown of the problem and its solution in Java:

The Problem:
Imagine three rods (A, B, and C) and n disks of different sizes.
Initially, all disks are stacked on rod A, with the largest disk at the bottom and the smallest on top.
The objective is to move the entire stack of disks to another rod (C) following these rules:
1.Only one disk can be moved at a time.
2.A larger disk cannot be placed on top of a smaller one.
Java Solution using Recursion:
We can solve the Tower of Hanoi problem using recursion. Here's how it works:
1.Base Case: If there's only one disk (n=1), move it directly from the source rod (from_rod) to the destination rod (to_rod).
2.Recursive Calls:
    -Move the top n-1 disks from the source rod (from_rod) to an auxiliary rod (aux_rod) using the destination rod (to_rod) as the temporary holder.
    -Move the largest disk (disk n) from the source rod (from_rod) to the destination rod (to_rod).
    -Move the n-1 disks from the auxiliary rod (aux_rod) to the destination rod (to_rod) using the source rod (from_rod) as the temporary holder.
 */
public class TowersOfHanoi {
    //Method to solve tower of Hanoi
    public static void solveTowerOfHanoi(int n, char fromRod, char toRod, char auxRod){
        //If there's only one disk (n=1), move it directly from the source rod (from_rod) to the destination rod (to_rod).
        if(n == 1){ //Base case
            System.out.println("Move disk 1 from " +fromRod+ " to " +toRod);
            return;
        }else{
            //Move the top n-1 disks from the source rod (from_rod) to an auxiliary rod (aux_rod) using the destination rod (to_rod) as the temporary holder.
            solveTowerOfHanoi(n-1, fromRod, auxRod, toRod);
            //Move the largest disk (disk n) from the source rod (from_rod) to the destination rod (to_rod).
            System.out.println("Move disk " +n+ " from " +fromRod+ " to " +toRod);
            //Move the n-1 disks from the auxiliary rod (aux_rod) to the destination rod (to_rod) using the source rod (from_rod) as the temporary holder.
            solveTowerOfHanoi(n-1, auxRod, toRod, fromRod);
        }
    }
    //Main method
    public static void main(String[] args) {
        // Number of disks
        int n = 3;
        solveTowerOfHanoi(n, 'A', 'B', 'C');
    }
}
