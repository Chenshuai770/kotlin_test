package cs.com.kotlinTest.demo9

interface FieldValidator<in T>{
    fun validate(input:T):Boolean
}

object DefaultStringValidator:FieldValidator<String>{
    override fun validate(input: String): Boolean {
        return input.isNotBlank()
    }

}

object DefaultIntalidator:FieldValidator<Int>{
    override fun validate(input: Int): Boolean {
        return input>=0
    }

}