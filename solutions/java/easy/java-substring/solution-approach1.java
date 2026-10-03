// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-substring/problem?isFullScreen=true
// Problem     Java Substring
// Difficulty  Easy
// Subdomain   Strings
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-10-03, 08:05 a.m.
// Technique   java-string-substring-method
// Time        O(k) where k is the length of the subst…
// Space       O(k) to store the resulting substring
// Insight     The Java String substring method extracts characters from the start index inclusive to the end index exclusive, matching the problem's requirement for the range [start, end).
// Interview   Before: "I would iterate through the string and append characters to a StringBuilder." After: "Using the built-in substring(start, end) method is more idiomatic and efficient, operating in O(k) time where k is the length of the substring, while correctly handling the exclusive end index requirement."
// Pitfalls    (1) Confusing the inclusive end index in the problem description with the exclusive end index required by the Java substring method.  (2) Failing to account for the StringIndexOutOfBoundsException if the provided start or end indices fall outside the string's valid range.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        
        System.out.println(S.substring(start, end));
    }
}
