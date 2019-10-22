package postBox;

public class Box3 implements Box {


    Float length = 23f;
    Float width  = 14f;
    int   tall   = 13;

    @Override
    public boolean validate(float length, float width, int height) {
        return false;
    }
}
