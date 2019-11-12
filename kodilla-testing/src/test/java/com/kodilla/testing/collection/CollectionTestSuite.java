package com.kodilla.testing.collection;

import org.junit.*;

import java.util.ArrayList;

public class CollectionTestSuite {

    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }

    @After
    public void after(){
        System.out.println("Test Case: end");
    }
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList(){
        //given
        ArrayList<Integer> arrayList = new ArrayList<>();
        //when
        ArrayList<Integer> check = OddNumbersExterminator.exterminate(arrayList);
        System.out.println("Testing empty list");
        //then
        Assert.assertEquals(0,check.size());
    }

    @Test
    public void testOddNumbersExterminatorNormalList(){
        //given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();

        ArrayList<Integer> normalArrayList = new ArrayList<>();
        normalArrayList.add(5);
        normalArrayList.add(2);
        normalArrayList.add(4);
        normalArrayList.add(23);
        normalArrayList.add(1991);
        normalArrayList.add(2222);
        ArrayList<Integer> oddNumberList = new ArrayList<>();
        oddNumberList.add(2);
        oddNumberList.add(4);
        oddNumberList.add(2222);
        //when
        ArrayList<Integer> normalListResult = oddNumbersExterminator.exterminate(normalArrayList);

        System.out.println("Testing list with numbers");
        //then
        Assert.assertEquals(normalArrayList,normalListResult);
    }
}
