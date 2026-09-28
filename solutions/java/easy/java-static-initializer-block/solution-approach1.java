// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-static-initializer-block/problem?isFullScreen=true
// Problem     Java Static Initializer Block
// Difficulty  Easy
// Subdomain   Introduction
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-09-28, 04:45 p.m.
// Technique   static-initializer-block-validation
// Time        O(1)
// Space       O(1)
// Insight     The static initializer block executes once during class loading to validate input dimensions and set a control flag before the main method proceeds.
// Pitfalls    (1) Failing to print the exact required exception string "java.lang.Exception: Breadth and height must be positive" when inputs are non-positive.  (2) Incorrectly assuming the static block can throw a checked exception without handling it, which causes a compilation error.  (3) Neglecting to set the boolean flag to false, which would allow the main method to calculate an area with invalid dimensions.
// ──────────────────────────────────────────────────


    static int B, H;
    static boolean flag = false;
    
    static{
        Scanner in = new Scanner(System.in);
        
        B = in.nextInt();
        H = in.nextInt();
        
        if(B > 0 && H > 0){
            flag = true;
        }
        else{
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }
