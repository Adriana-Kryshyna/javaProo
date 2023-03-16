package FORLAMBDA;

public class Calculate {
    public static void main(String[] args) {
        Number number;
        Number number1;
        Number number2;
        Number number4;

        number= (x,y)-> x+y;
        int result = number.num(20,40);
        System.out.println(result);

         number1= (x,y)-> x-y;
        int result1 = number1.num(20,5);
        System.out.println(result1);

        number2= (x,y)-> x*y;
        int result2 = number2.num(5,5);
        System.out.println(result2);

        number4= (x,y)-> x/y;
        int result4 = number4.num(20,5);
        System.out.println(result4);

    }
}
    interface Number{
        int num (int x, int y);
    }



