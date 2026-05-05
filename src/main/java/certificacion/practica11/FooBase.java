package certificacion.practica11;

interface Bar {
    //void bar();
}


public abstract class FooBase {

    public void bar() {
        System.out.println("In static bar");
    }
}

class Foo extends FooBase implements Bar {

    @Override
    public void bar() {
        System.out.println("In bar");
    }

    public static void main(String[] args) {
        //FooBase.bar();
        new Foo().bar();
    }
}
