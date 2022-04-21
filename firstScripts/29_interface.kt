interface A {
    fun show()
    fun abc()
    {
        println("No error")
    }
}

interface B {
    fun display()
    fun abc()
    {
        println("No error")
    }
}

class C : A, B {
    override fun show() {
        TODO("Not yet implemented")
    }

    override fun display() {
        TODO("Not yet implemented")
    }

    override fun abc() {
        super<A>.abc()
    }
}

fun main() {
    val obj = C()
    obj.abc()
}