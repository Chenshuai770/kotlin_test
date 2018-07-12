package cs.com.kotlinTest.demo7

class PersonfromDemo7(val firstName: String,
                      val lastName: String) : Comparable<PersonfromDemo7> {
    override fun compareTo(other: PersonfromDemo7): Int {
        return compareValuesBy(this, other, PersonfromDemo7::lastName, PersonfromDemo7::firstName)
    }

}

fun main(args: Array<String>) {
    val p1=PersonfromDemo7("Alice","Smith")
    val p2=PersonfromDemo7("Bob","Johnson")
    println(p1 < p2)
}