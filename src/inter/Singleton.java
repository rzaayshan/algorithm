package inter;

public class Singleton {
    public static void main(String[] args) {
        Thread t1 = new Thread(){
            @Override
            public void run() {
                ABC obj1 = ABC.getInstance();
            }
        };

        Thread t2 = new Thread(){
            @Override
            public void run() {
                ABC obj2 = ABC.getInstance();
            }
        };

        t1.start();
        t2.start();


        DEF o1 = DEF.INSTANCE;
        o1.i=4;
        o1.show();
        DEF o2 = DEF.INSTANCE;
        o2.i=128;
        o1.show();

    }
}

class ABC{
    public static ABC obj;
    private ABC(){
        System.out.println("Instance created");
    }

    public static ABC getInstance(){
        if(obj==null)
            synchronized (ABC.class){
                if(obj==null)
                    obj=new ABC();
        }
        return obj;
    }

}

enum DEF{
    INSTANCE;
    int i;
    public void show(){
        System.out.println(i);
    }

}
