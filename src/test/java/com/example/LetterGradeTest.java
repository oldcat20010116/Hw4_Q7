package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class LetterGradeTest {

    @Test
    public void testGradeA() {
        assertEquals('A', LetterGrade.calculateLetterGrade(95));
        // Add more test cases for grade A
    }

    @Test
    public void testGradeB() {
        assertEquals('B', LetterGrade.calculateLetterGrade(88));
        // Add more test cases for grade B
    }

    @Test
    public void testGradeC() {
        assertEquals('C', LetterGrade.calculateLetterGrade(74));
        // Add more test cases for grade C
    }

    @Test
    public void testGradeD() {
        assertEquals('D', LetterGrade.calculateLetterGrade(61));
        // Add more test cases for grade D
    }

    @Test
    public void testGradeF() {
        assertEquals('F', LetterGrade.calculateLetterGrade(30));
        // Add more test cases for grade F
    }

    @Test
    public void testGradeX() {
        assertEquals('X', LetterGrade.calculateLetterGrade(-5));
        assertEquals('X', LetterGrade.calculateLetterGrade(120));
        // Add more test cases for grade X
    }

    @Test
    public void testLetterGradeWithValidScores() {
        assertEquals('A', LetterGrade.calculateLetterGrade(90));
        assertEquals('A', LetterGrade.calculateLetterGrade(100));
        assertEquals('B', LetterGrade.calculateLetterGrade(80));
        assertEquals('B', LetterGrade.calculateLetterGrade(89));
        assertEquals('C', LetterGrade.calculateLetterGrade(70));
        assertEquals('C', LetterGrade.calculateLetterGrade(79));
        assertEquals('D', LetterGrade.calculateLetterGrade(60));
        assertEquals('D', LetterGrade.calculateLetterGrade(69));
        assertEquals('F', LetterGrade.calculateLetterGrade(0));
        assertEquals('F', LetterGrade.calculateLetterGrade(59));
    }

    @Test
    public void testLetterGradeWithInvalidScores() {
        assertEquals('X', LetterGrade.calculateLetterGrade(-1));
        assertEquals('X', LetterGrade.calculateLetterGrade(101));
    }
}