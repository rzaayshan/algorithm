public class Inter {
    static class A{
        public static void funk(){
            System.out.println("sasdf");
        };

    }

    static class B extends A{
        public static void funk(){

            System.out.println("YEs");
           
        }

        static void funk(String s){
            System.out.println(s);
        }

        static int funk1(){
            return 5;
        }
    }

    public static void main(String[] args) {
        final int i=10;
        final int j;
        j=20;
        System.out.println(i);
        System.out.println(j);
//        A.funk();
//        B.funk();
//        B.funk("No");
    }
}
