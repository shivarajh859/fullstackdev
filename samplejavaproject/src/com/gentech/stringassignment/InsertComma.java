package com.gentech.stringassignment;

public class InsertComma {
    public static void main(String[] args) {
        String str = "SUNDAYMONDAYTUESDAYWEDNESDAYTHURSDAYFRIDAYSATURDAY";
        String newStr = str.replace("DAY", "DAY,");
        // Remove the extra comma at the end
        newStr = newStr.substring(0, newStr.length() - 1);
        System.out.println(newStr);
    }
}
