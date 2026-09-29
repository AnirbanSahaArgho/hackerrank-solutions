// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-currency-formatter/problem?isFullScreen=true
// Problem     Java Currency Formatter
// Difficulty  Easy
// Subdomain   Introduction
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-09-29, 09:36 p.m.
// Technique   java-numberformat-locale-localization
// Time        O(1)
// Space       O(1)
// Insight     The solution utilizes the Java NumberFormat class with specific Locale instances to apply region-dependent currency formatting rules to a double-precision input.
// Interview   Before: "How would you format a currency value for different countries?" After: "I use NumberFormat.getCurrencyInstance with specific Locales, including a custom Locale for India, to achieve O(1) formatting for each region."
// Pitfalls    (1) Failing to construct the Indian Locale using the required 'en' language code as specified in the problem statement.  (2) Assuming all currencies have built-in Locale constants when some, like India, require manual instantiation.
// ──────────────────────────────────────────────────

import java.util.*;
import java.text.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat india = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        
        System.out.println("US: " + us.format(payment));
        System.out.println("India: " + india.format(payment));
        System.out.println("China: " + china.format(payment));
        System.out.println("France: " + france.format(payment));
    }
}
