import com.sun.corba.se.spi.orb.Operation;

public class SecondLambda {
    static int x=10;
    static int y=20;
    interface Operation{
        int calculate();
    }
    private static void m1(){
        Operation op=()->{
            x=30;
            return x+y;
        };
        System.out.println(op.calculate());
        System.out.println(x);
    }

    public static void main(String[] args) {
        m1();
        m2();
        m3();
        m4();
    }
    private static void m2(){
        int n=70;
        int m=30;
        Operation op=()->{
            //n=100;
            return m+n;
        };
        //n=100;
        System.out.println(op.calculate());
    }
    interface Operationable{
        int calculate(int x, int y);
    }
    private static void m3(){
        Operationable op= SecondLambda::calculate;
        System.out.println(op.calculate(20,10));
        System.out.println(op.calculate(20,0));
    }
            private static int calculate(int x,int y){
        if(y==0){
            return 0;
        }return x/y;
            }

            interface OperationableGeneric<T>{
        T calculate(T x,T y);
            }
            private static void m4(){
                OperationableGeneric<Integer> op1=(x,y)->x+y;
                OperationableGeneric<String> op2=(x,y)->x+y;
                System.out.println(op1.calculate(20,10));
                System.out.println(op2.calculate("20","10"));
            }
}
