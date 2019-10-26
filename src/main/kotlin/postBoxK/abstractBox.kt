package postBoxK



abstract class abstractBox(var length: Float, var width: Float, var tall: Int) : Box {

    abstract override fun validate(length: Float, width: Float, tall: Int): Boolean

    override fun check(length: Float, width: Float, tall: Int): Boolean {
       return if(  this.length >= length && this.width >= width && this.tall >= tall ) true else false
    }

}
