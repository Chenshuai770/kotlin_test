package cs.com.kotlinTest.demo6

interface Processor<T>{
    fun processor():T
}

class ProcessorIml : Processor<Unit>{
    override fun processor() {

    }


}