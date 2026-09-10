package com.srimannarayana.javapractice.myfirstjavaprograms;

public class OperatorsDemo {

    public static void main(String[] args) {

        System.out.println("========== 1. ARITHMETIC OPERATORS ==========");
        int a = 10, b = 3;
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b) + "   (int/int truncates!)");
        System.out.println("a % b = " + (a % b));

        double x = 7 / 2;      // int division happens first, then converts
        double y = 7.0 / 2;    // true decimal division
        System.out.println("7 / 2 as double   = " + x + "  (still truncated)");
        System.out.println("7.0 / 2 as double = " + y + "  (correct decimal)");
        System.out.println();


        System.out.println("========== 2. ASSIGNMENT OPERATORS ==========");
        int c = 10;
        System.out.println("c = " + c);
        c += 5;  System.out.println("c += 5  -> " + c);
        c -= 3;  System.out.println("c -= 3  -> " + c);
        c *= 2;  System.out.println("c *= 2  -> " + c);
        c /= 4;  System.out.println("c /= 4  -> " + c);
        c %= 4;  System.out.println("c %= 4  -> " + c);
        System.out.println();


        System.out.println("========== 3. INCREMENT / DECREMENT ==========");
        int p = 5;
        int postInc = p++;   // use 5, then p becomes 6
        System.out.println("int p = 5; int postInc = p++; -> postInc = " + postInc + ", p = " + p);

        int preInc = ++p;    // p becomes 7 first, then preInc = 7
        System.out.println("int preInc = ++p; -> preInc = " + preInc + ", p = " + p);

        int postDec = p--;
        System.out.println("int postDec = p--; -> postDec = " + postDec + ", p = " + p);

        int preDec = --p;
        System.out.println("int preDec = --p; -> preDec = " + preDec + ", p = " + p);
        System.out.println();


        System.out.println("========== 4. RELATIONAL OPERATORS ==========");
        int m = 8, n = 12;
        System.out.println("m = " + m + ", n = " + n);
        System.out.println("m == n -> " + (m == n));
        System.out.println("m != n -> " + (m != n));
        System.out.println("m > n  -> " + (m > n));
        System.out.println("m < n  -> " + (m < n));
        System.out.println("m >= n -> " + (m >= n));
        System.out.println("m <= n -> " + (m <= n));
        System.out.println();


        System.out.println("========== 5. LOGICAL OPERATORS ==========");
        boolean t = true, f = false;
        System.out.println("t = " + t + ", f = " + f);
        System.out.println("t && f -> " + (t && f));
        System.out.println("t || f -> " + (t || f));
        System.out.println("!t     -> " + (!t));

        // short-circuit demo: right side never evaluates if left is false
        String str = null;
        if (str != null && str.length() > 0) {
        	 System.out.println("string has content");
        }
        else {
            System.out.println("short-circuit avoided a NullPointerException on str.length()");
        }
        System.out.println();


        System.out.println("========== 6. BITWISE OPERATORS ==========");
        int bitA = 5;  // 0101
        int bitB = 3;  // 0011
        System.out.println("bitA = 5 (0101), bitB = 3 (0011)");
        System.out.println("bitA & bitB  = " + (bitA & bitB));
        System.out.println("bitA | bitB  = " + (bitA | bitB));
        System.out.println("bitA ^ bitB  = " + (bitA ^ bitB));
        System.out.println("~bitA        = " + (~bitA));
        System.out.println("bitA << 1    = " + (bitA << 1) + "  (multiply by 2)");
        System.out.println("bitA >> 1    = " + (bitA >> 1) + "  (divide by 2)");
        System.out.println("bitA >>> 1   = " + (bitA >>> 1) + "  (unsigned right shift)");
        System.out.println();


        System.out.println("========== 7. TERNARY OPERATOR ==========");
        int age = 20;
        String category = (age >= 18) ? "Adult" : "Minor";
        System.out.println("age = " + age + " -> category = " + category);

        int years = 1;
        String suffix = (years == 1) ? "year" : "years";
        System.out.println(years + " " + suffix + " old  (singular/plural handled with ternary)");
        System.out.println();


        System.out.println("========== 8. instanceof OPERATOR ==========");
        Object obj = "Hello Java";
        System.out.println("obj holds a String -> obj instanceof String : " + (obj instanceof String));
        System.out.println("obj holds a String -> obj instanceof Integer: " + (obj instanceof Integer));

        // Java 16+ pattern matching for instanceof
        if (obj instanceof String s) {
            System.out.println("Pattern-matched length of obj as String: " + s.length());
        }
        System.out.println();


        System.out.println("========== 9. OPERATOR PRECEDENCE DEMO ==========");
        int result1 = 10 + 5 * 2;        // * before +
        int result2 = (10 + 5) * 2;      // parentheses override precedence
        System.out.println("10 + 5 * 2   = " + result1 + "  (* runs before +)");
        System.out.println("(10 + 5) * 2 = " + result2 + "  (parentheses force + first)");
    }
}