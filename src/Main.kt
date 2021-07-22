fun main() {
    println("## testMethod0 ##")
    testMethod0("Hello Kotlin") // 결과값 : 12
    testMethod0("안녕하세요") // 결과값 : 5
    // testMethod1(null) // 오류 발생

    println("## testMethod1 ##")
    testMethod1("Hello Kotlin") // 결과값 : 12
    testMethod1(null) // 결과값 : null

    println("## testMethod2 ##")
    testMethod2("Hello Kotlin") // 결과값 : 12
    testMethod2(null) // 결과값 : null


}
// null 을 허용하지 않는 Method
fun testMethod0(str:String?) {
    // Property 뒤에 !! 연산자를 입력하면 null 을 허용하지 않는 형으로 변환이 발생됩니다.
    println(str!!.length)
}

// null 을 허용하는 Method
fun testMethod1(str:String?) {
    // Property 뒤에 ?. 연산자를 입력하면 Property 또는 Method 를 사용하지 않고 null 을 반환합니다.
    println(str?.length)
    if (str is String) {
        /*
        is 연산자는 형변환이 가능하다면 형변환을 진행합니다. 형변환이 가능하지 않다면 null 을 반환합니다.
        is 연산자를 통한 Smart Casting 이 발생됩니다.
        null 을 허용하는 문자열 Type 인 "Hello Kotlin" 의 경우에는 null 을 허용하지 않는 문자열의 형태로 자동 형변환이 발생됩니다.
        if 문을 벗어나면 Smart Casting 은 해제됩니다.
         */
        println(str.length)
    } else {
        println("$str 은 실행되지 않았습니다. (else)")
    }
    // if 문을 벗어나면 Smart Casting 은 해제됩니다.
    // println(str.length) // 오류 발생
}

fun testMethod2(str:Any?) {
    if(str is String) {
        println(str.length)
    }
    /*
    if(str != null) {
        println(str.length)
    }
    */
}
















