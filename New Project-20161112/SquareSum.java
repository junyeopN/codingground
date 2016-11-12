/*
 * Program to solve minimum square sum problem in JAVA
 * Jun Yeop Na (2016.11.12)
 *
 * We use dynamic programming, using the equation
 * p(n) = min_{1<=i<=n}(p(i) + p(n - i)) to solve
 * the minimum square sum problem.
 */


public class SquareSum
{
    /*
     * We make a table to use for dynamic programming. 
     */ 
    static int table[]; 
    
    
    /*
     * We define a function that first looks up the table
     * to see whether the minimum square sum for the given input
     * integer is already solved.
     * if it is, we just use the value given in the table
     */
    int minimumSquareSum(int n)
    
}