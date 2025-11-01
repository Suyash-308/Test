package Q_4;

public class DemoException {
    public static void main(String[] args) {
int a=23;
        try{
            int b = a / 0;
        }catch (ArithmeticException e){
            System.out.println("Exception");
        }finally {

        }
    }
}
