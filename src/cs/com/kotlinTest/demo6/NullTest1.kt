package cs.com.kotlinTest.demo6

class Address(val streetAddress: String,
              val zipCode: Int,
              val city: String,
              val country: String)

class Company(val name: String, val address: Address?)

class Person(val name: String, val company: Company?)

fun Person.countryName():String{
    val country=this.company?.address?.country
    return if (country!=null) country else "Unkonw"
}

fun printShippingLabel(person: Person){
    val address=person.company?.address
            ?:throw IllegalAccessException("No address")
    with(address){
        println(streetAddress)
        println("$zipCode $city, $country")}
}

//todo Person的Elvis运算符来处理null值
fun Person.countryName1():String=
    company?.address?.country?:"Unkown"


fun main(args: Array<String>) {
    val person=Person("Dmitry",null)
    println(person.countryName())

    val address=Address("创伟科技园",31400,"杭州","中国")
    val jetbrains=Company("JetBrains",address)
    val person1=Person("cs",jetbrains)

    printShippingLabel(person)

}