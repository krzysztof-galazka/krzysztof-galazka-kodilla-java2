package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;

public class StreamMain {
    public static void main(String[] args) {
//        Processor processor = new Processor();
////        Executor codeToExecute = () -> System.out.println("This is an example text.");
////        processor.execute(codeToExecute);

//        ExpressionExecutor expressionExecutor = new ExpressionExecutor();
////
////        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
////        expressionExecutor.executeExpression(15, 5, (a, b) -> a - b);
////        expressionExecutor.executeExpression(18, 5, (a, b) -> a * b);
////        expressionExecutor.executeExpression(12, 5, (a, b) -> a / b);

//        ExpressionExecutor expressionExecutor = new ExpressionExecutor();
//
//        System.out.println("Calculating expressions with lambdas");
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);
//
//        System.out.println("Calculating expressions with method references");
//        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
//        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
//        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
//        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

        //POEM DECORATOR
        System.out.println("Task: Poem Decorator");
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        System.out.println(poemBeautifier.beautify("Tekst do dużych liter", text -> text.toUpperCase()));
        System.out.println(poemBeautifier.beautify("TEKST DO MAŁYCH LITER", text -> text.toLowerCase()));
        System.out.println(poemBeautifier.beautify("TEKST DO DODANIA", text -> "ABC".concat(text)));
        System.out.println(poemBeautifier.beautify("Litery do zamiany", text -> text.replace("a", "A")));
        System.out.println(poemBeautifier.beautify("TEST", text -> "### " + text + " ###"));

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }
}

