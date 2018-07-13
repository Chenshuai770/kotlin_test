package cs.com.kotlinTest.demo8
//高阶函数 在lambda里面的定义,这里不是很明白,建议联网查看
//此方法只能返回 单接函数
data class PersonbyContactListFilters(
        val firstName: String,
        val lastName: String,
        val phoneNumber: String?

)

class ContactListFilters {
    var prefix: String = ""
    var onlywihtPhoneNumber: Boolean = false


    fun getPredicate(): (PersonbyContactListFilters) -> Boolean { //此方法声明为返回的函数
        val startWithPrefix = { p: PersonbyContactListFilters ->
            p.firstName.startsWith(prefix) || p.lastName.startsWith(prefix)
        }

        if (!onlywihtPhoneNumber) {
            return startWithPrefix
        }

        return {
            startWithPrefix(it) && it.phoneNumber != null
        }
    }
}

fun main(args: Array<String>) {
    val contacts = listOf(PersonbyContactListFilters("Dmitry", "Jemerov", "123-4567"),
            PersonbyContactListFilters("chen", "shuai", "null"),
            PersonbyContactListFilters("Dmitry", "GG", "123-4567")
    )

    val contactListFilters = ContactListFilters()

    with(contactListFilters) {
        prefix = "Dm"
        onlywihtPhoneNumber = true
    }

    println(contacts.filter(contactListFilters.getPredicate()))

}