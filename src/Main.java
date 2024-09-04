
/**
*****************************************************************************************************
* By writing your name in the space provided below, you are honouring the CIS academic honesty pledge 
* “I have neither given nor received unauthorized aid on this piece of work.”
* NAME: Tony Huang
*****************************************************************************************************
*/

public class Main {

    public static void main(String[] args) {
    int sum2 = add(3, 8);
    int sum4 = add(3, 8, 4, 9);
    String morning = morningGreeting("Tony");
    String afternoon = afternoonGreeting("Tony");
    String thrice = triple("oohbaby");
    double dividing2 = half(3);
    double roundingpos = roundPositiveValueToNearestInteger(4.3);
    double roundingneg = roundNegativeValueToNearestInteger(-4.3);
        System.out.println(roundingneg);
        System.out.println(roundingpos);
        System.out.println(dividing2);
        System.out.println(thrice);
        System.out.println(afternoon);
        System.out.println(morning);
        System.out.println(sum4);
        System.out.println(sum2);
    }

    // 1. add
    public static int add(int num1, int num2){
        return(num1 + num2);

    }
    // 2. add
    public static int add(int a, int b, int c, int d){
        return(add(d, add(c, add(a, b))));

    }
    // 3. morningGreeting
    public static String morningGreeting(String name){
        return("早上好，" + name);
    }
    // 4. afternoonGreeting
    public static String afternoonGreeting(String name){
        return("下午好，" + name);
    }
    // 5. triple
    public static String triple(String a){
        return(a + a + a);
    }
    // 6. half
    public static double half(double a){
        return((a/2));
    }
    // 7. roundPositiveValueToNearestInteger
    public static double roundPositiveValueToNearestInteger(double a){
        return((int)(a+0.5));
    }
    // 8. roundNegativeValueToNearestInteger
    public static double roundNegativeValueToNearestInteger(double a){
        return((int)(a-0.5));
    }
}
