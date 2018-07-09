package cs.com.kotlinTest.demo4

interface Clickable{
    fun click()
    fun showOff()= println("I'm Clickable")
}

interface Foucusable{
    fun setfoucuse(b:Boolean)=
            println("I${if (b) "got" else "lost" }foucus.")
    fun showOff()= println("I'm Foucusable")
}

class Button :Clickable,Foucusable{
    override fun showOff() {
        super<Foucusable>.showOff()
    }

    override fun click() {

    }

}



fun main(args: Array<String>) {
    val button=Button()
    button.showOff()
    button.setfoucuse(true)
    button.click()
}



