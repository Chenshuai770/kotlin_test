package cs.com.kotlinTest.demo7

import cs.com.kotlinTest.demo6.s
import org.omg.CORBA.INTERNAL
import java.beans.PropertyChangeListener
import java.beans.PropertyChangeSupport
import kotlin.properties.Delegates
import kotlin.reflect.KProperty

class PersonByObservable1(
        val name: String, age: Int, salary: Int
) : PropertyChangeAware() {
    private val observable1 = { prop: KProperty<*>, oldValue: Int, newValue: Int ->
        changeSupport.firePropertyChange(prop.name, oldValue, newValue)
    }
    var age: Int by Delegates.observable(age, observable1)
    var salary: Int by Delegates.observable(salary, observable1)

}

class ObservableProperty1(
        var propValue: Int, val changeSupport: PropertyChangeSupport
) {
    operator fun getValue(p: PersonByObservable1, prop: KProperty<*>): Int = propValue

    operator fun setValue(p: PersonByObservable1, prop: KProperty<*>, newValue: Int) {
        val oldValue = propValue
        propValue = newValue
        changeSupport.firePropertyChange(prop.name, oldValue, newValue)
    }
}

fun main(args: Array<String>) {
    val p = PersonByObservable1("Dmitry", 34, 2000)
    p.addPropertyChangeListener(PropertyChangeListener { evt ->
        println("Property ${evt.propertyName} changed " +
                "from ${evt.oldValue} to ${evt.newValue}")
    })
    p.age = 35
    p.salary = 2100

}