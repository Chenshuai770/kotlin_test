package cs.com.kotlinTest.demo9

import java.util.*
import javax.xml.ws.Service

val serviceImlJava=ServiceLoader.load(Service::class.java)

inline fun<reified T> loadService(): ServiceLoader<T>? {
    return ServiceLoader.load(T::class.java)

}