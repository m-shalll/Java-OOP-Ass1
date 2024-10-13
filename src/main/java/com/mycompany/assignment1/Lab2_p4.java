package com.mycompany.assignment1;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Lab2_p4 {
    public static void main(String args[]) throws IOException{
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the file name: ");
        String fileName= scan.nextLine();
        Invoice[] invoices;
        ArrayList<Integer> list=new ArrayList<>();
        invoices =readInvoiceDetailsFromFile(fileName);
        Arrays.sort(invoices, new Comparator<Invoice>(){
            @Override
            public int compare(Invoice a, Invoice b) {
                return Double.compare(b.calculateInvoice(), a.calculateInvoice());
                }
        });
        for(Invoice invoice:invoices)
        {
            invoice.report();
        }
      }
   
    public static Invoice[] readInvoiceDetailsFromFile(String fileName) throws IOException{
        File file=new File(fileName);
        Invoice[] result;
        try(Scanner scan=new Scanner(file)){
            int size=scan.nextInt();
            scan.nextLine();
            result = new Invoice[size];
            for(int i=0;i<size;i++){
                String line = scan.nextLine();
                String[] parts = line.split(",");
                int invoiceNumber=Integer.parseInt(parts[0].trim());
                String customerName=parts[1].trim();
                int sizeOfDouble=Integer.parseInt(parts[2].trim());
                double [] prices=new double[sizeOfDouble];
                int flag=3;
                for(int j=0;j<sizeOfDouble;j++){
                    prices[j]=Double.parseDouble(parts[flag].trim());
                    flag++;
                }
                result[i]=new Invoice(invoiceNumber,customerName,prices);
            }
        }
        return(result);
    }
   }
