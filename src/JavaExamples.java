public class JavaExamples {
        interface Operationable{
            int calculate(int x, int y);
        }
        private static void m1(){
            Operationable operationableAnon= new Operationable() {
                @Override
                public int calculate(int x, int y) {
                    return x+y;
                }
            };
            int resultAnon=operationableAnon.calculate(10,20);
            System.out.println(resultAnon);


            Operationable operationable=(x, y) -> x+y;
            System.out.println(operationable.calculate(10,20));

            Operationable operation1=(x, y) -> x*y;
            Operationable operation2=(x, y) -> x-y;
            Operationable operation3=(x, y) -> x/y;
            System.out.println(operation1.calculate(2,8));
            System.out.println(operation2.calculate(12,9));
            System.out.println(operation3.calculate(20,5));
        }
    public static void main(String[] args) {
        m1();
    }

}
