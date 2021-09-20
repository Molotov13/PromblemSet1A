
/*
 * @Leo
 * @9.20
 * ProblemSet 1-A
 */
public class ProblemSet1_A{
    public static void quadratic(int a, int b,int c){
        // a is the coefficient of x^2
        // b is the coefficient of x
        // c is the constant
        double rt1 = (-b + Math.sqrt((double)(b*b-4*a*c))) / (double)(2*a);
        double rt2 = (-b - Math.sqrt((double)(b*b-4*a*c))) / (double)(2*a);
        System.out.println("QUADRATIC FORMULA");
        System.out.println("The solutions for "+a+"x^2 + "+b+"x "+c+" are "+ rt1 +" and "+ rt2 +".\n");
    }
    public static void slope(int x1, int y1, int x2, int y2){
        // x1 and x2 are x-coordinate of the two points
        // y1 and y2 are y-coordinate of the two points
        double m = (double)(y1 - y2)/ (double)(x1 - x2);
        System.out.println("SLOPE FORMULA");
        System.out.println("A line connecting the points ("+x1+","+y1+") and ("+x2+","+y2+") has a slope of "+ m+".\n");
    }
    public static void midpoint(int x1, int y1, int x2, int y2){
        // x1 and x2 are x-coordinate of the two points
        // y1 and y2 are y-coordinate of the two points
        System.out.println("SLOPE FORMULA");
        System.out.println("The midpoint between ("+x1+","+y1+") and ("+x2+","+y2+") is ("+ ((double)(x1+x2))/2+","+((double)(y1+y2))/2+").\n");
    }
    public static void sumArith(double ft, double dif, int num){
        // ft is the first term
        // dif is the common difference
        // num is the number of terms
        double res = (ft + ft + (num - 1) * dif) * num / 2;
        System.out.println("SUM OF AN ARTITHMETIC SERIES");
        System.out.println("The sum of the first "+num+" terms of an arithmetic series that starts with "+ft+" and increases by "+ dif + " is "+res+".\n");
    }
    public static void sumGeo(double ft, double rate, int num){
        // ft is the first term
        // rate is the increasing rate
        // num is the number of terms
        double res = ft * (1 - Math.pow(rate,num)) / (1 - rate);
        System.out.println("SUM OF AN GEOMETRIC SERIES");
        System.out.println("The sum of the first "+num+" terms of a finite geometric series that starts with "+ft+" and increases by a rate of "+ rate + " is "+res+".\n");
    }
    public static void main(String args[]){
        quadratic(1,5,6);
        slope(0,0,2,3);
        midpoint(0,0,2,3);
        sumArith(1,1,5);
        sumGeo(1,2,3);
        return;
    }
}
