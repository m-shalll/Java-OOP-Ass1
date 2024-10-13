
package com.mycompany.assignment1;
public class Invoice {
    private final int invoiceNumber;
    private final String customerName;
    private final double[] prices;
    public Invoice(int invoiceNumber, String customerName, double[] prices){
        this.invoiceNumber=invoiceNumber;
        this.customerName=customerName;
        this.prices=prices;  
    }
    public void report(){
        System.out.println("Invoice number: "+this.invoiceNumber);
        System.out.println("Customer name: "+this.customerName);
        int size=this.prices.length;
        System.out.println("Number of elements: "+size);
        System.out.print("Prices: ");
        boolean flag=false;
        for(int i=0;i<size;i++){
            if(flag)
                System.out.print(",");
            System.out.print(this.prices[i]);
            flag=true;
        }
         System.out.println("");
    }
    public double calculateInvoice(){
        int size=this.prices.length;
        double total=0;
        double rate;
        for(int i=0;i<size;i++)
            total+=this.prices[i];
        System.out.println(total);
        if(total<=1000){
            rate=0.99;
            return(rate*total);
        }
            
        else if(total<=5000){
            rate=0.96;
            return(rate*total);
        }
            
        else if(total<=8000)
        {
            rate=0.94;
            return(rate*total);
        }
        else
        {
            rate=0.92;
            return(rate*total);
        }
            
        
        }
    
    }

