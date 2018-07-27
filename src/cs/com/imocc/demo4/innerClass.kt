package cs.com.imocc.demo4

/**
 * 静态内部类和外部类和java相反
 */
class OutClass{

    val name="gaosho"

    class InnerStatic{

        fun helloStatic(): Unit {
            val outClass=OutClass()//需要引用外部类才能使用
            println(outClass.name)
        }
    }

    inner class InnerIn{
        fun helloInstance(): Unit {
            val outClass=OutClass()
            println(this@OutClass.name)
            println(name)//todo 简单写法
        }
    }

}


interface OnClickListener{
    fun onClick(): Unit {

    }
}

class View{
    var onClickListener:OnClickListener?=null
}




fun main(args: Array<String>) {
    val innerStatic=OutClass.InnerStatic()//todo 这里直接看出来kotlin这里的类是静态内部类
    val innerInstance=OutClass().InnerIn()

    val view =View()

    view.onClickListener=object :OnClickListener{ //todo 对比java的匿名内部类
        override fun onClick() {
            super.onClick()
        }
    }
}