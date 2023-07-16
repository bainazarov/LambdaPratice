public class CustomFuncInterface {
    @FunctionalInterface
    interface Interface1 {
         void method();
    }

    @FunctionalInterface
    interface Interface2 {
        int method(int a);
    }

    @FunctionalInterface
    interface Interface3 {
        int method(int a, int b);
    }

    @FunctionalInterface
    interface Interface4 {
        void method(int a, int b);
    }

    @FunctionalInterface
    interface Interface5 <T> {
        T method (T t);
    }

    public static void main(String[] args) {
        Interface1 interface1 = () -> System.out.println("Hello");
        interface1.method();

        Interface2 interface2 = a -> a * 5;
        int result2 = interface2.method(5);
        System.out.println(result2);

        Interface3 interface3 = (a,b) -> a * b;
        int result3 = interface3.method(2,2);
        System.out.println(result3);

        Interface4 interface4 = (a,b) -> System.out.println(a * b);
        interface4.method(3,3);

        Interface5<String> interface5 = (a) -> String.valueOf(a.length());
        String result5 = interface5.method("hello");
        System.out.println(result5);
    }
}