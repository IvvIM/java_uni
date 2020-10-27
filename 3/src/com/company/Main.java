package com.company;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void SortOnlyC(List<String> list)
    {
        String found;
        for(int i = 0; i < list.size(); i++)
        {
            for(int j = i; j < list.size(); j++)
            {
                if(list.get(j).charAt(0) == 'c')
                {
                    if(list.get(j).charAt(1) < )
                }
            }
        }
    }

    public static void main(String[] args) {
	    List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");
        SortOnlyC(myList);
    }
}
