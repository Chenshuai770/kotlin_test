package cs.com.kotlinTest.demo11

data class Issue(
        val id: String, val project: String, val type: String,
        val priority: String, val description: String
)

class ImportantIssuesPredicate(val project: String) : (Issue) -> Boolean {
    private fun Issue.isImportant(): Boolean {
        return type == "Bug" && (priority == "Major" || priority == "Critical")
    }

    override fun invoke(p1: Issue): Boolean {
        return p1.project == project && p1.isImportant()
    }


}
val i1=Issue("IDEA-154446","IDEA","Bug","Major","保存失败")
val i2=Issue("KT-123456","Kotlin","Feature","Normal","with/apply")

fun main(args: Array<String>) {
    val predicate=ImportantIssuesPredicate("IDEA")
    for (issue in listOf(i1, i2).filter(predicate)){
        println(issue.id)
    }
}