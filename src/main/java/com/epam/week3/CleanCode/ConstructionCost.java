package com.epam.week3.CleanCode;
import java.io.*;
import java.util.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class ConstructionCost {
	private static final Logger logger =LogManager.getLogger();
public static void main(String args[])
{

	int material_standard,automation;
	double area_of_house,Cost_Of_House;

	
    Scanner sc=new Scanner(System.in);
    //PrintStream print_on_console =  new PrintStream(new FileOutputStream(FileDescriptor.out));
    CostOfHouse CostOfHouse_obj=new CostOfHouse();
   
    
    logger.info("Choose Material  type:");

    logger.info("1.Standard type\n2.Above standard type\n3.High standard type");
    material_standard=sc.nextInt();
    logger.info("Enter area of house");
    area_of_house=sc.nextDouble();
    if(material_standard==3)
    {
    	logger.info("choose:\n1.Automated \n2.Non automated");
    automation=sc.nextInt();
    Cost_Of_House=CostOfHouse_obj.calculate_construction_cost(area_of_house, automation);
    logger.info("Cost of constructing house :"+Cost_Of_House);
    }
    
    else
    {
    Cost_Of_House=CostOfHouse_obj.calculate_construction_cost(material_standard, area_of_house);
    logger.info("Cost of constructing house :"+Cost_Of_House);
  
    }
 
    sc.close();
   ;
    
}

}
