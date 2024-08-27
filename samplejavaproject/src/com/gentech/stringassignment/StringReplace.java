package com.gentech.stringassignment;

public class StringReplace {
    public static void main(String[] args) {
        String oldString = "hello world";
        String newString = "goodbye";

        StringBuilder sb = new StringBuilder();
        sb.append(newString);
        sb.append(oldString.substring(oldString.indexOf("world")));
        String result = sb.toString();

        System.out.println("Old String: " + oldString);
        System.out.println("New String: " + newString);
        System.out.println("Result: " + result);
    }
}