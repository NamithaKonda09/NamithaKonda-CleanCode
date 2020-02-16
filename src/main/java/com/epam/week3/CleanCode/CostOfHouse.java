package com.epam.week3.CleanCode;

public class CostOfHouse {
double calculate_construction_cost(double area_of_house,int automation)
{
   if(automation==2)
		return 1800*area_of_house;
	else if(automation==1)
		return 2500*area_of_house;
	else 
		return -1;
	
}
double calculate_construction_cost(int material_standard,double area_of_house)
{
	if(material_standard==1)
	{
		return 1200*area_of_house;
	}
	else if(material_standard==2)
		return 1500*area_of_house;

	else 
		return -1;
	
}
}
