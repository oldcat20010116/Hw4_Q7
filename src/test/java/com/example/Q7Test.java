package com.example;

import com.sun.org.apache.bcel.internal.generic.NEW;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

import static org.junit.Assert.assertEquals;

public class Q7Test {

    public static Collection<Objects[]> data() {
        return Arrays.asList(new Objects[][]){
            {100, 'A'},
            {100, 'A'},
            {100, 'A'},
            {100, 'A'},
            {100, 'A'},
            {100, 'A'},
            {100, 'A'},

        });
    }
}