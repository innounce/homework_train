package Student;

public class Student {
    String name;
    int math;
    int english;

    public Student(String name, int math, int english) {
        this.name = name;
        this.math = math;
        this.english = english;
    }

    public int hightest(){
        int max = (math > english)? math : english ;
//        if(math > english)
//            max = math;
//        else
//            max = english;

        return max;
    }


    public void print() {
        System.out.println(name + "\t" + math + "\t" + english + "\t" + getAverage() + "\t" + ((getAverage() >=60 )? "PASS" : "FAILED") );
        if( getAverage() >=60 )
            System.out.println( "PASS" );
        else
            System.out.println( "FAILED" );
    }

    private int getAverage() {
        return (math+english)/2;
    }
}
