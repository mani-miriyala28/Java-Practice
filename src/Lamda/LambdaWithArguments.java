package Lamda;

@FunctionalInterface
interface Addable {
    int add(int a, int b);
}
//without using lambda expression
class WithOutLambda implements Addable{
    @Override
    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Addable addable = new WithOutLambda();
        System.out.println("Sum using without lambda: " + addable.add(10, 20));
    }
}
public class LambdaWithArguements {
    public static void main(String[] args) {

        Addable add=(int a,int b)->{
            return a+b;
        };
        System.out.println("Sum using lambda: "+add.add(10,20));

    }

}
