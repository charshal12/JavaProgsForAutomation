package com.dataStructureExamples.DynamicArrays;

public class Main {
    public static void main(String[] args) {
        DynamicArrays dynamicArrays= new DynamicArrays();


        dynamicArrays.add("A");
        dynamicArrays.add("B");
        dynamicArrays.add("C");
        dynamicArrays.add("D");
//        dynamicArrays.add("E");

        dynamicArrays.insert(2, "X");
        dynamicArrays.delete("A");
        System.out.println("Index for search: "+ dynamicArrays.search("C"));

        System.out.println("DynamicArrays Capacity "+dynamicArrays.capacity);
        System.out.println("DynamicArrays Size "+dynamicArrays.size);
        System.out.println(dynamicArrays);

        System.out.println("empty: "+ dynamicArrays.isEmpty());

    }
}
