package Q_1;

public class Overriding {
    public static void main(String[] args) {


     class A{
        public  void m1(){
            System.out.println("m1");
        }
    }
    class B extends A{
        @Override
        public  void m1(){
            System.out.println("m1");
        }
    }
}
}
