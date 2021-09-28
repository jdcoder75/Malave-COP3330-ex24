package ex24;
import java.util.*;

/*
 *  UCF COP3330 Fall 2021 Assignment 24 Solution
 *  Copyright 2021 Jose Malave
 */
public class App 
{
    public static boolean isAnagram(String firstString, String secondString)
    {
        String s1 = firstString.replaceAll("\\s", "");
        String s2 = secondString.replaceAll("\\s", "");
        boolean status = true;
        if (s1.length() != s2.length()) {
            status = false;
        }

            return status;
        }

    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        System.out.println( "Enter two strings and I'll tell you if they are anagrams:" );
        System.out.println( "Enter the first string:" );
        String firstString = sc.nextLine();
        System.out.println( "Enter the second string:" );
        String secondString = sc.nextLine();

        boolean anagram = isAnagram(firstString,secondString);

        if (anagram == true) {
            System.out.println("\""+ firstString +"\" and \""+secondString+"\" are anagrams");
        }
        else {
            System.out.println("\""+ firstString +"\" and \\\""+secondString+"\" are anagrams");
        }
        }

    }



