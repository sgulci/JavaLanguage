package com.javafundamentals.javalanguage.variablesdatatypesmathoperators;

public class MathOperators {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		/*
		 * Arithmetic Operators
		 * 
		 * Basic operators  *,/,%,+,- 
		 * Prefix/postfix operators ++, --
		 * compound assigment operators +=, -=, /=, *=, %=
		 * 
		 * 
		 * 	Operator Precedence
	     *       postfix    	  x++, x--
		 *       prefix     	  ++x , --x
		 *       multiplicative   *, /, % 
		 *       additive         +, -
		 * 
		 * 
		 *  Operators of equel precedence is evaluate from left to right 
		 * 
		 * 
		 */
		
		int valA = 21;
		int valB = 6;
		int valC = 3;
		int valD = 1;
		
		int result1 = valA - valB / valC;  //19 
		int result2 = (valA - valB) / valC;  //5
		int result3 = valA / valC * valD + valB ;   // 13
		int result4 = valA / (valC * (valD + valB)) ;   // 1
		
		
		
		/* 
		 * Type conversion   
		 * 
		 * Implicit type conversion performed automatically by the compiler
		 *  
		 *  	- widening conversions are automatic 
		 * 		- Mixed integer sizes
		 *  		uses largest integer in eq
		 *  	- Mixed float sizes
		 *  		uses double because double bigger then float
		 * 		- Mixed integer and floating point 
		 * 			uses largest floating point in the equation
		 * 
		 * Explicit type conversions performed explicitly in code with cast operator 
		 * 		- Can perform widening and narrowing
		 * 		- floating point to integer drops fraction
		 * 		- use caution with narrowing conversions
		 * 		- Integer to floating point can lose precision
		 */
		
		
		//implicit type conversion 
		int iVal= 5;
		long lVal = iVal;
		
		//explicit type conversion 
		long longVal = 5L;
		int intVal = (int)longVal;
		
		
		float floatVal = 1.0f;
		double doubleVal = 4.0d;
		byte byteVal = 7;
		short shortVal = 7;
		long longValue = 5;
		
		
		
		
		
	}

}
