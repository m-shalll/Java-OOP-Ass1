package com.mycompany.assignment1;

import static com.mycompany.assignment1.Prime.isPrime;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Lab2_p2 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        List<Integer> list1=new ArrayList<>();
        List<Integer> list2=new ArrayList<>();
        System.out.print("Please enter the members of the first set: ");
         String[] firstString = scan.nextLine().split(",");
          for (String s : firstString) 
            list1.add(Integer.parseInt(s.trim()));
        System.out.print("Please enter the members of the second set: ");
         String[] secondString = scan.nextLine().split(",");
         for(String k: secondString)
             list2.add(Integer.parseInt(k.trim()));
         CustomSet firstSet=new CustomSet(list1);
         CustomSet secondSet=new CustomSet(list2);
         CustomSet thirdSet= firstSet.union(secondSet);
         List<Integer> thirdSetList=thirdSet.getData();
         System.out.println("The union of the two sets is "+thirdSetList);
         System.out.print("The prime numbers that are members of the union: ");
         boolean flag=false;
         for(int num: thirdSetList)
         {
             if(isPrime(num))
             {
                if(flag)
                    System.out.print(", ");
                flag= true;
                System.out.print(num);
             }
             
                 
         }
             
    }
}
