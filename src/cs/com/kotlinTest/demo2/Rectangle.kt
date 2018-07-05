package cs.com.kotlinTest.demo2

class Rectangle(val height:Int,val width: Int){
//    val isSquare : Boolean
//    get() {
//        return height==width
//    }

    val isSquare : Boolean
    get() = height==width

}