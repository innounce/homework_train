package postBox;

public interface Box {

    boolean validate(float length, float width, int tall);

    boolean check(float length, float width, int tall);
}
