package com.example.higherorderfunction

fun main(){
    // Higher order functions
    val add = {a:Int, b:Int -> a+b}
    hof(add)
    hof2("Abhay"){
        a, b -> a+b
    }

    hof3 {
        println("Hi $it")

    }

    val numbers = listOf(1,2,3,4,5)
    println(numbers.filter { numbers -> numbers>3 })

    println(numbers.filter { it >3 })

//    hof{a:Int, b:Int -> a +b} // when we passing a function in function then we can also execute it like this.
}

fun hof(addition: (Int, Int) -> Int){
    val result = addition(4,5)
    println(result)
}

fun hof2(name: String, addition: (Int, Int) -> Int){
    val result = addition(4,5)
    println("Hello $name$result")
}

fun hof3(name:(String) -> Unit){
    name("John")
}