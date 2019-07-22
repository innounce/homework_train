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
        int max = (math > english)?math:english;
//        if(math > english)
//            max = math;
//        else
//            max = english;

        return max;
    }


    public void print() {
        System.out.println(name + "\t" + math + "\t" + english + "\t" + (math+english)/2);
    }
}
