/* 
Write a program that solves the following equation and displays the value x and y:
1) 3.4x+50.2y=44.5 2) 2.1x+.55y=5.9 (Assume Cramer’s rule to solve equation ax+by=e
x=ed-bf/ad-bc cx+dy=f y=af-ec/ad-bc )
*/
public class prac1B {
    public static void main(String[] args) {
        double a = 3.4, b = 50.2, e = 44.5, c = 2.1, d = 0.55, f = 5.9;
        System.out.println("x= " + ((e * d) - (b * f)) / ((a * d) - (b * c)) + " y= " + ((a * f) - (e * c)) / ((a * d) - (b * c)));
    }
}

