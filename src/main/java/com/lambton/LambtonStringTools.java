/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lambton;

import java.util.ArrayList;

/**
 *
 * @author Pritesh Patel
 */
public class LambtonStringTools 
{
    //1 - REVERSE STRING
    public static String reverse(String s){
    char[] ch = s.toCharArray();
    String reversestr = "";
    String word = "";
    ArrayList<String> stringarray = new ArrayList<>();
        for (int i = 0; i < ch.length ; i++) {
    if(ch[i] != ' '){
        word = word + ch[i];
    }
    if (ch[i] == ' '){
        stringarray.add(word);
        word = "";
    }
}
        for (int i = stringarray.size() - 1; i >= 0 ; i--) {
    reversestr = reversestr + stringarray.get(i) + " ";
}{
       return null;
}
    //public static void main(String[] args) {
     //   System.out.println(reverse("faliure will never overtake me if my determination to suceed is srtong enough "));




    
    //2 - FORMAT INITIALS OF STRING
    public static String initials(String s) 
    {
        String init  = new String();


        return null;
    }
        
    //3 - FIND MOST FREQUENT CHARACTER FROM STRING
    public static String mostFrequent(String s)
        String str[] = new String[];


        for (int i = 0; i < str.length(); i++)
        {
            char ch = str.(j);

            for (int j = i + 1; j < str.length(); j++)
            {

            }
        }
        return null;
    }
    
    //4 - CONVERT BINARY NUMBER TO DECIMALS
    public static int binaryToDecimal(String s) 
    {  int decimal;
        for (int i = 0; i < s.length() ; i++) {
        }
        decimal = Integer.parseInt(s,2);
        return decimal;
    }
    public static int main(String[] args) {
        System.out.println(reverse("faliure will never overtake me if my determination to suceed is srtong enough "));
        System.out.println("decimal number is " + binaryToDecimal("1000"));
        System.out.println("decimal number is " + binaryToDecimal("10001"));
        System.out.println("decimal number is " + binaryToDecimal("111111"));
   {

       return 0;
    }
     
    //5 - REPLACING SUBSTRING WITH NEW STRING IN EXISTING STRING
    public static String replaceSubString(String originalString, String findString, String newString) 
    {
        String str[]= new String[ "Lambton College in Toronto"];
        System.out.println(replaceSubString.toString("college","university"));

        return null;
    }
}
