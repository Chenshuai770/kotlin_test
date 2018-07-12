package cs.com.kotlinTest.demo7

import java.beans.PropertyChangeListener
import java.beans.PropertyChangeSupport

open class PropertyChangeAware {
    protected val changeSupport = PropertyChangeSupport(this)//监听器列表

    fun addPropertyChangeListener(listenner: PropertyChangeListener) {
        changeSupport.addPropertyChangeListener(listenner)
    }

    fun removePropertyChangeListener(listenner: PropertyChangeListener) {
        changeSupport.removePropertyChangeListener(listenner)
    }

}

class PersonbyProperty(val name: String, age: Int, salary: Int) : PropertyChangeAware() {

    var age: Int = age
        set(newValue) {
            val oldValue = field
            field = newValue
            changeSupport.firePropertyChange("age", oldValue, newValue)
        }
    var salary: Int = salary
        set(newValue) {
            val oldValue = field
            field = newValue
            changeSupport.firePropertyChange("salary", oldValue, newValue)
        }
}

fun main(args: Array<String>) {
    val p=PersonbyProperty("Dmitry",34,2000)
    p.addPropertyChangeListener(PropertyChangeListener { evt ->
        println("Property ${evt.propertyName} changed "+
        "from ${evt.oldValue} to ${evt.newValue}")
    })
    p.age=35
    p.salary=2100
}