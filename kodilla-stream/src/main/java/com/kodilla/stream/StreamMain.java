package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.time.Period;
import java.util.Map;
import java.util.stream.Collectors;

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
//
//        //POEM DECORATOR
//        System.out.println("Task: Poem Decorator");
//        PoemBeautifier poemBeautifier = new PoemBeautifier();
//        System.out.println(poemBeautifier.beautify("Tekst do dużych liter", text -> text.toUpperCase()));
//        System.out.println(poemBeautifier.beautify("TEKST DO MAŁYCH LITER", text -> text.toLowerCase()));
//        System.out.println(poemBeautifier.beautify("TEKST DO DODANIA", text -> "ABC".concat(text)));
//        System.out.println(poemBeautifier.beautify("Litery do zamiany", text -> text.replace("a", "A")));
//        System.out.println(poemBeautifier.beautify("TEST", text -> "### " + text + " ###"));
//
//        System.out.println("Using Stream to generate even numbers from 1 to 20");
//        NumbersGenerator.generateEven(20);


//        People.getList().stream()
//                .map(String::toUpperCase)
//                .filter(s -> s.length() > 11)
//                .map(s -> s.substring(0, s.indexOf(' ') + 2) + ".")
//                .filter(s -> s.substring(0, 1).equals("M"))
//                .forEach(System.out::println);

//        BookDirectory theBookDirectory = new BookDirectory();
//        String theResultStringOfBooks = theBookDirectory.getList().stream()
//                .filter(book -> book.getYearOfPublication() > 2005)
//                .map(Book::toString)
//                .collect(Collectors.joining(",\n","<<",">>"));
//
//        System.out.println(theResultStringOfBooks);

        System.out.println("Forum:");
        Forum forum = new Forum();
        Map<Integer, ForumUser> forumUserMap = forum.getForumUserList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> Period.between(forumUser.getBirthDate(), LocalDate.now()).getYears()>=20)
                .filter(forumUser -> forumUser.getNumberOfPosts() > 0)
                .collect(Collectors.toMap(ForumUser::getId, forumUser -> forumUser));

        System.out.println("Users: " + forumUserMap.size());
        forumUserMap.entrySet().stream()
                .map(entry -> entry.getKey() + ", " + entry.getValue())
                .forEach(System.out::println);
    }
}

