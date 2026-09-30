// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-strings-introduction/problem?isFullScreen=true
// Problem     Java Strings Introduction
// Difficulty  Easy
// Subdomain   Strings
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-09-30, 07:55 a.m.
// Technique   string-manipulation-and-comparison
// Time        O(N+M)
// Space       O(N+M)
// Insight     The solution leverages standard Java String methods to compute length, perform lexicographical comparison, and manipulate substrings for capitalization.
// Interview   Before: "I would use a loop to compare characters one by one." After: "Using compareTo is more idiomatic and efficient, running in O(N+M) time where N and M are the lengths of the strings, which is optimal for this problem."
// Pitfalls    (1) Using the == operator instead of compareTo for lexicographical comparison will compare object references rather than string content.  (2) Calling substring(1) on a single-character string is valid, but calling substring(0, 1) on an empty string would throw a StringIndexOutOfBoundsException.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        
        int lenA = A.length();
        int lenB = B.length();
        System.out.println(lenA+lenB);
        
        if(A.compareTo(B) > 0)
            System.out.println("Yes");
        else
            System.out.println("No");
            
        System.out.println(A.substring(0, 1).toUpperCase() + A.substring(1) + " " + B.substring(0, 1).toUpperCase() + B.substring(1));
    }
}



