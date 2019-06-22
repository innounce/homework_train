package com;

public class Person {
    Float weight ;
    Float height ;

    public Person (Float weight, Float height){
        this.weight =weight;
        this.height =height;

    }

    public void Hello(){
        System.out.println("Hello World 2 !");
    }
    public void bmiJ(){
        System.out.println( weight / ( height * height ) );
    }
}
