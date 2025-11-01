package Q_1;

public class Inheritance {
    public static void main(String[] args) {


        class A {
            int a = 3;
            public static void m1() {
                System.out.println("parent - m1");
            }
        }

        class B extends A {
            public void m2(){
                System.out.println("child-m2");
            }

        }
    }
}
