package com.hayatitastan;

/**
 * Created by Dr. Hayati TASTAN on 6.10.2022
 **/

/*
FUNCTIONAL PROGRAMMING:
•  Functional programming focuses on computing results from functions
   rather than performing actions on objects
•  Objects are immutable
•  Instead of modifying or changing an object,
   you create a new object which looks like the old object, except for the change
*********************************************************************************
LAMDA FUNCTIONS:
•  Lambda functions are anonymous functions that you can create in Java without the usual code overhead.
•  A great tool if you need a quick function for a calculation in your code.
•  After all, we always had to put the definition of a function inside a class.
*/

import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        Answerable phone = () -> {return "Hello my dear friend";}; //or shortly:
        //Answerable phone = () -> "Hello";
        System.out.println(phone.answer());

        Answerable name = () -> {return "Hayati Tastan";}; //or shortly:
        //Answerable name = () -> "Hayati Tastan";
        System.out.println(name.answer());

        // Calculate square = (a) -> { return a*a;}; //or shortly:
        Calculate square = (a) -> a*a;
        System.out.println(square.result(2));

        // Calculate squareroot = (a) -> { return Math.sqrt(a);}; //or shortly:
        Calculate squareroot = (a) -> Math.sqrt(a);
        System.out.println(squareroot.result(9));

        Predicate isOdd = (n) -> { return n % 2 != 0;}; //or shortly:
        //Predicate isOdd = n -> n % 2 != 0;
        System.out.println(isOdd.test( 2));

        // Predicate isEven = (n) -> { return n % 2 == 0;}; //or shortly:
        Predicate isEven = n -> n % 2 == 0;
        System.out.println(isEven.test( 2));


        Mathematics sum = (double a, double b) -> System.out.println("Summation: " + (a + b)); //declare
        sum.operation(6,2);

        Mathematics substract = (double a, double b) -> System.out.println("Substraction: " + (a - b)); //declare
        substract.operation(6, 3);

        Mathematics multiply = (double a, double b) -> System.out.println("Multiplication: " + (a * b)); //declare
        multiply.operation(6, 3);

        Mathematics devide = (double a, double b) -> System.out.println("Division: " + (a / b)); //declare
        devide.operation(6, 3);


    }
}
