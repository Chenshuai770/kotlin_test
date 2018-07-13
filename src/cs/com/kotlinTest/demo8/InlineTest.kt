package cs.com.kotlinTest.demo8

import java.util.concurrent.locks.Lock

inline fun<T> synchronized(lock:Lock,action:() -> T):T{
    lock.lock()
    try {
        return action()
    }
    finally {
        lock.unlock()
    }
}

fun foo(lock: Lock){
    println("Before sync")
    synchronized(lock){
        println("Action")
    }
    println("After sync")
}