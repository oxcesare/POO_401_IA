package certificacion.fase10.practica01;

public class StaticTest {

    void m1(){
        StaticTest.m2();
        m4();

    }

    static void m2(){

    }

    void m3(){
        m1();
        m2();

    }

    static void m4(){

    }
}
