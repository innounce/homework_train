package postBox;

import java.util.ArrayList;
import java.util.Scanner;

public class BoxTester {
    public static void main(String[] args) {
        Box box3 = new Box3(23f, 14f, 13);
        Box box5 = new Box5(39.5f, 27.5f, 23);

        ArrayList<Box> list = new ArrayList<>();
        list.add(box3);
        list.add(box5);

        Scanner scanner = new Scanner(System.in);

        float lengthIn;
        float widthIn;
        int tallIn;
        do{
            System.out.print("Please enter object's length: ");
            lengthIn = scanner.nextFloat();
            System.out.print("Please enter object's width: ");
            widthIn = scanner.nextFloat();
            System.out.print("Please enter object's height: ");
            tallIn = scanner.nextInt();

            for( int i = 0 ; i < list.size() ; i++ ){
                Box box = list.get(i);
                if( box.validate(lengthIn, widthIn, tallIn) ){
                    break;
                }
            }

        }while ( !(lengthIn == 0 && widthIn == 0 && tallIn == 0) );

    }
}
