package postBox;

public class Box3 extends abstractBox {

    public Box3(Float length, Float width, int tall) {
        super(length, width, tall);
    }

    @Override
    public boolean validate(float length, float width, int tall) {
        if(check(length, width, tall)) {
            System.out.println("Box3");
            return true;
        }
        return false;
    }
}
