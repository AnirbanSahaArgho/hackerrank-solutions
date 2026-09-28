// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-static-initializer-block/problem?isFullScreen=true
// Problem     Java Static Initializer Block
// Difficulty  Easy
// Subdomain   Introduction
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-09-28, 04:45 p.m.
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
