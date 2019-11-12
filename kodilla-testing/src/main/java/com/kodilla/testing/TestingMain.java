package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {

//        //User test
//        SimpleUser simpleUser = new SimpleUser("theForumUser");
//
//        String result = simpleUser.getUsername();
//
//        if (result.equals("theForumUser")){
//            System.out.println("test ok");
//        } else {
//            System.out.println("Error!");
//        }

        //Calculator test
        Calculator calculator = new Calculator();

        int addResult = Calculator.add(10,5);

        if (addResult == 15){
            System.out.println("Add test ok");
        }else {
            System.out.println("Error in adding!");
        }

        int substractResult = Calculator.substract(5,5);

        if (substractResult == 5){
            System.out.println("Substract test ok");
        }else {
            System.out.println("Error in substract!");
        }

    }
}
