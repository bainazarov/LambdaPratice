public class FourImplementation {
    public void FirstImplementation() {
        @FunctionalInterface
        interface Interface1 {
            void method();
        }
        class MyClass1 implements Interface1 {
            public void method() {
                System.out.println("HelloDefault");
            }
        }

        Interface1 i1 = new Interface1() {
            public void method() {
                System.out.println("HelloAnonim");
            }
        };

        Interface1 i2 = () -> System.out.println("HelloLambda");

        Interface1 i3 = new MyClass1()::method;
    }

    public void SecondImplementation() {
        @FunctionalInterface
                interface Interface2 {
            int method(int a);
        }
        class MyClass2 implements Interface2 {

            @Override
            public int method(int a) {
                return a * 2;
            }
        }

        Interface2 i1 = new Interface2() {
            @Override
            public int method(int a) {
                return a * 2;
            }
        };

        Interface2 i2 = a -> a * 2;

        Interface2 i3 = new MyClass2()::method;
    }

    public void ThirdImplementation() {
        @FunctionalInterface
                interface Interface3 {
            int method(int a, int b);
        }

        class MyClass3 implements Interface3 {

            @Override
            public int method(int a, int b) {
                return a + b;
            }
        }

        Interface3 i1 = new Interface3() {
            @Override
            public int method(int a, int b) {
                return a * b;
            }
        };

        Interface3 i2 = (a,b) -> a + b;

        Interface3 i3 = new MyClass3()::method;
    }

    public void FourthImplementation() {
        @FunctionalInterface
                interface Interface4 {
            void method(String s1, String s2);
        }

        class MyClass4 implements Interface4 {

            @Override
            public void method(String s1, String s2) {
                System.out.println(s1 + " " + s2);
            }
        }

        Interface4 i1 = new Interface4() {
            @Override
            public void method(String s1, String s2) {
                System.out.println(s1 + " " + s2);
            }
        };

        Interface4 i2 = (s1,s2) -> System.out.println(s1 + " " + s2);

        Interface4 i3 = new MyClass4()::method;
    }
}
