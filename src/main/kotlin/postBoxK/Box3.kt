package postBoxK

class Box3(length: Float, width: Float, tall: Int) : abstractBox(length, width, tall){

    override fun validate(length: Float, width: Float, tall: Int): Boolean =
        if(check(length, width, tall)){
            println("Box3")
            true
        }else
            false

}