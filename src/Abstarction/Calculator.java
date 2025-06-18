package Abstarction;

interface Calculate {
    int a=10;
    int operation(int a,int b);
}
class Addition implements Calculate {
    @Override
    public int operation(int a, int b) {
        return a+b;
    }
}
class Subtraction implements Calculate {
    public int operation(int a, int b) {
        return a-b;
    }
}

class Multiplication implements Calculate {
    public int operation(int a, int b) {
        return a*b;
    }
}
 public class Calculator{
     public static void main(String[] args) {
         Addition add = new Addition();
         Subtraction sub = new Subtraction();
         Multiplication mul = new Multiplication();
         System.out.println(add.operation(20,10));
         System.out.println(sub.operation(20,10));
         System.out.println(mul.operation(20,10));
         Calculate addition=((a, b) -> a+b);
         int sum=addition.operation(20,10);
         System.out.println("sum is : "+sum);
     }
 }
