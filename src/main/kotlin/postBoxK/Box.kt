package postBoxK

open interface Box {

    fun validate(length: Float, width: Float, tall: Int): Boolean

    fun check(length: Float, width: Float, tall: Int): Boolean
}