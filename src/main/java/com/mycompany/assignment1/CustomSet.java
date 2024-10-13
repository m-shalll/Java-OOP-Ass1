package com.mycompany.assignment1;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class CustomSet {
    private int size;
    private List<Integer> data=new ArrayList<>();;
    public CustomSet(List<Integer> data){
        for(int value: data)
            if(!this.data.contains(value)){
                 this.data.add(value);
            }
        size = data.size();
    }
    public boolean contains(int value){
               return this.data.contains(value);
           }
    public List<Integer> getData(){
         return(data);
     }
     public CustomSet union(CustomSet newlist) {
         CustomSet result=new CustomSet(newlist.data);
             for(int value: this.data)
             if(!result.contains(value))
                 result.data.add(value); 
           return result;
     }
     
     }

