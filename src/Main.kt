fun main() {
    testMethod0("Hello Kotlin") // 결과값 : 12
    testMethod0("안녕하세요") // 결과값 : 5
    // testMethod1(null) // 오류 발생

    testMethod1("Hello Kotlin") // 결과값 : 12
    testMethod1(null) // 결과값 : null


}

fun testMethod0(str:String?) {
    // Property 뒤에 !! 연산자를 입력하면 null 을 허용하지 않는 형으로 변환이 발생됩니다.
    println(str!!.length)
}
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
    }
    // if 문을 벗어나면 Smart Casting 은 해제됩니다.
    // println(str.length) // 오류 발생

    /*
        2021.07.22.Thursday
        114분 (1시간 54분)

        31강
        ~ 09:30

        32강 (10분)
        ~ 10:10

        33강 (13분)
        ~ 11:10

        34강 (19분)
        ~ 13:30

        35강 (10분)
        ~ 14:10

        36강 (14분)
        ~ 15:10

        37강 (4분)
        ~ 15: 30
     */
}
















