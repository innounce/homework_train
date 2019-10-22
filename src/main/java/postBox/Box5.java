package postBox;

public class Box5 extends abstractBox {

    public Box5(Float length, Float width, int tall) {
        super(length, width, tall);
    }

    @Override
    public boolean validate(float length, float width, int tall) {
        if(check(length, width, tall)) {
            System.out.println("Box5");
            return true;
        }
        return false;
    }
}
