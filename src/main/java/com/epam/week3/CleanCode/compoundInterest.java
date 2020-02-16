package com.epam.week3.CleanCode;

public class compoundInterest {
	 double calculate_compound_interest(double Principal,double RateOfInterest,double TimePeriod)
	{
		
	return Principal * Math.pow(1.0+RateOfInterest/100.0,TimePeriod) - Principal;
	}

}
