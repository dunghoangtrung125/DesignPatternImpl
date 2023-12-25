package observer.sample.observer

interface Observer {
    val name: String
    fun update()
}