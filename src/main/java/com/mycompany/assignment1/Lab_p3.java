package com.mycompany.assignment1;
import java.util.Scanner;


public class Lab_p3 {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int invoiceNumber1,size1,size2;
        int invoiceNumber2;
        System.out.println("Enter account 1 data");
        System.out.print("Invoice number: ");
        invoiceNumber1=scan.nextInt();
        scan.nextLine();
        System.out.print("Customer name: ");
        String customerName1 = scan.nextLine();
        System.out.print("Number of elements: ");
        size1=scan.nextInt();
        System.out.print("Prices: ");
        double[] prices1 = getPrice(size1);
        System.out.println("Enter account 2 data");
        System.out.print("Invoice number: ");
        invoiceNumber2=scan.nextInt();
        scan.nextLine();
        System.out.print("Customer name: ");
        String customerName2=scan.nextLine();
        System.out.print("Number of elements: ");
        size2=scan.nextInt();
        System.out.print("Prices: ");
        double[] prices2 = getPrice(size2);
        Invoice customer1=new Invoice(invoiceNumber1, customerName1, prices1);
        Invoice customer2=new Invoice(invoiceNumber2, customerName2, prices2);
        customer1.report();
        System.out.println("The total cost after discount = "+customer1.calculateInvoice());
        customer2.report();
        System.out.println("The total cost after discount = "+customer2.calculateInvoice());
    }
    public static double[] getPrice(int size){
        Scanner scan=new Scanner(System.in);
        double[] result= new double[size];
        String[] line=scan.nextLine().split(",");
        for(int i=0;i<size;i++){
            result[i] = Double.parseDouble(line[i].trim());
        }
        return result;
        
    }

  
   
}
