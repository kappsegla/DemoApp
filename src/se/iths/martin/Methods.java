package se.iths.martin;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Methods {

    public static void method1(){

    }

    public void method2()
    {

    }
    public static void main(String[] args) {

        //Anropa statisk metod egen klass
        method1();

        //Anropa statisk metod annan klass
        Methods.method1();

        //Anrop instance metod
        Methods m = new Methods();
        m.method2();
    }

    private static class Building {
        public static void paint(Building building) {
        }
    }
}
