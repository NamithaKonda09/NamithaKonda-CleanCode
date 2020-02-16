package com.epam.week3.CleanCode;
import java.io.*;
import java.util.*;

public class CalculateInterest 
{
    public static void main( String[] args )
    {
    	double Principal, RateOfInterest, TimePeriod, SimpleInterest,CompoundInterest;
    	 
        Scanner sc=new Scanner(System.in);
        PrintStream print_on_console =  new PrintStream(new FileOutputStream(FileDescriptor.out));
        simpleInterest simpleInterest_obj=new simpleInterest();
        compoundInterest compoundInterest_obj=new compoundInterest();
        
        print_on_console.println("Enter principal, rate of interest and Time period:");
        Principal=sc.nextFloat();
        RateOfInterest=sc.nextFloat();
        TimePeriod=sc.nextFloat();
        
        SimpleInterest=simpleInterest_obj.calculate_simple_interest(Principal, RateOfInterest, TimePeriod);
        print_on_console.println("Simple Interest:"+SimpleInterest);
      
        
        CompoundInterest=compoundInterest_obj.calculate_compound_interest(Principal, RateOfInterest, TimePeriod);
        print_on_console.println("Compound Interest:"+CompoundInterest);
        
        sc.close();
        print_on_console.close();
        
    }
}
