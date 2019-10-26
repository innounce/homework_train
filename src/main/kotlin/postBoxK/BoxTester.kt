package postBoxK

import java.util.*

fun main() {

    val box3 = Box3(23f, 14f, 13)
    val box5 = Box5(39.5f, 27.5f, 23)

    val list = mutableListOf<Box>()
    list.add(box3)
    list.add(box5)

    val scanner = Scanner(System.`in`)

    var lengthIn: Float
    var widthIn: Float
    var tallIn: Int

    while (true) {
        print("Please enter object's length: ")
        lengthIn = scanner.nextFloat()
        print("Please enter object's width: ")
        widthIn = scanner.nextFloat()
        print("Please enter object's height: ")
        tallIn = scanner.nextInt()

        if (!(lengthIn == 0f && widthIn == 0f && tallIn == 0)) {

            for (box in list) {
                if (box.validate(lengthIn, widthIn, tallIn)) {
                    break
                }
            }
        } else
            break

    }
}