package cs.com.kotlinTest.demo6

class PersonfromDemo6(val firstName: String, val lastName: String) {
    override fun equals(other: Any?): Boolean {
        val otherPerson = other as? PersonfromDemo6 ?: return false //todo ?: 用手遮去就是正常的属于这个并进行判断

        return otherPerson.firstName == firstName &&
                otherPerson.lastName == lastName
    }

    override fun hashCode(): Int {
        return firstName.hashCode()*37+lastName.hashCode()
    }
}

fun main(args: Array<String>) {
    val p1=PersonfromDemo6("Dmitry","Jemerov")
    val p2=PersonfromDemo6("Dmitry","Jemerov")
    val p3=Person("Dmitry",null)
    println(p1.equals(p2))
    println(p1.equals(p3))
}
