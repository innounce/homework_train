package postBox;

public  abstract class abstractBox implements Box{

    float length;
    float width ;
    int   tall  ;

    public abstractBox(Float length, Float width, int tall) {
        this.length = length;
        this.width = width;
        this.tall = tall;
    }

    abstract public boolean validate(float length, float width, int tall);

    public boolean check(float length, float width, int tall){
        if(this.length >= length && this.width >= width && this.tall >= tall)
            return true;
        else
            return false;
    }
}
