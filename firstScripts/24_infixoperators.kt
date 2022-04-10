fun main() {
    val skill1 = Skill()
    skill1.skill = "Java"
    val skill2 = Skill()
    skill2.skill = "Kotlin"
    val skill3 = Skill()
    skill3.skill = "Systems"

    skill1.show()
    skill1 add skill2
    skill1.show()
    skill1 + skill3
    skill1.show()
}

class Skill {
    var skill: String? = null

    fun show() {
        println(skill)
    }

    // infix takes only one argument
    infix operator fun plus(s: Skill) {
        skill += " " + s.skill
    }

    infix fun add(s: Skill) {
        skill += " " + s.skill
    }
}