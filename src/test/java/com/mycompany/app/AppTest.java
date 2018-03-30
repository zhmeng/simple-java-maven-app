package com.mycompany.app;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest {
    public static void main(String[] args)  {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(10);
        list.add(10);
        list.add(10);
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){
            Integer integer = iterator.next();
            System.out.println("inter: " +  integer);
            if(integer==10)
                iterator.remove();
//                list.remove(integer);   //注意这个地方
        }
    }
}
