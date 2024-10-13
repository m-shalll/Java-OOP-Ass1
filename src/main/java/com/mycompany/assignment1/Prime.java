package com.mycompany.assignment1;
import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter N:");
        int target=scan.nextInt();
        if(target<0)
        {
            do{
            System.out.print("You should enter a positive integer number:");
            target=scan.nextInt();
            } 
            while(target<1);
        }
        
        else if(target==1){
            System.out.println("There are no prime numbers between 1 and 1.");
        }
        else{
            System.out.print("The prime numbers between 1 and "+target+": ");
            boolean first = true;
            for(int i=2;i<target;i++)
                if(isPrime(i))
                {
                    if (!first) {
                        System.out.print(", "); 
                    }
                    System.out.print(i);
                    first = false;
                }
        }
                
        }
    public static boolean isPrime(int num){
        if(num==1)
            return false;
        else if(num<0)
            num=Math.abs(num);
        for(int i=2;i<num;i++)
            if(num%i==0)
                return false;
        return true; 
    }
}
