package com.javafundamentals.javalanguage.variablesdatatypesmathoperators;

public class DataTypes {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		/*
		 * there are four types of primitive data types in java
		 * Integers, Floating points, Characters, Booleans
		 * 
		 * Integer types are 
		 * 		byte     8 bits         -128/127                          0
		 *      short    16 bits        +32768/-32767                     0
		 *      int      32 bits        +2_147_483_648/-2_147_483_647     0
		 *      long     64 bits        9 kentilyon                       0L
		 * 
		 *      
		 *  Floating Points types are
		 *      float    32 bits        10^-45/10^38          0.0f               
		 *      double   64 bits        10^-324/10^308    0.0 or 0.0d
		 *      
		 *      
		 *      
		 *  Characters  
		 *       char   4 bits
		 *       for unicode points use \ u followed by 4 digit hex value  
		 *       
		 *         
		 *  Booleans
		 *  
		 *       boolean  1 bits   true/false 
		 *       
		 *         
		 */
		
		
		//Integers
		byte byteNumber = 76;
		short shortNumber = 400;
		int intNumber = 33_3746;
		long longNumber = 3_456_576_485L;
		
		
		//Floating Points
		float floatNumber= 0.3f;
		double doubleNumber = 0.0;
		
		
		// Character
		char charValue = 'd';
		char charUnicode = '\u00DA';
		
		
		//Boolean
		boolean booleanValue = true;
		
		
		/*
		 * 
		 * Primitive data types are stored by-value
		 * this means that every variable has own set of
		 * copy of data 
		 * 
		 * 
		 */
		
		
		int firstValue = 100;
		int secondValue = firstValue;
		firstValue = 50; 
		
		System.out.println(firstValue);   // 50
		System.out.println(secondValue);  // 100
			
		
	}

}
