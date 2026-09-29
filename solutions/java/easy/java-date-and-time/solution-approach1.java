// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-date-and-time/problem?isFullScreen=true
// Problem     Java Date and Time
// Difficulty  Easy
// Subdomain   Introduction
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-09-29, 09:22 p.m.
// ──────────────────────────────────────────────────



class Result {
    public static String findDay(int month, int day, int year) {
        Calendar cal = Calendar.getInstance();
        
        cal.set(year, month-1, day);
        int dayofweek = cal.get(Calendar.DAY_OF_WEEK);
        
        switch(dayofweek){
            case Calendar.SUNDAY:
                return "SUNDAY";
            case Calendar.MONDAY:
                return "MONDAY";
            case Calendar.TUESDAY:
                return "TUESDAY";
            case Calendar.WEDNESDAY:
                return "WEDNESDAY";
            case Calendar.THURSDAY:
                return "THURSDAY";
            case Calendar.FRIDAY:
                return "FRIDAY";
            case Calendar.SATURDAY:
                return "SATURDAY";
        }
        return "";        
    }

}

