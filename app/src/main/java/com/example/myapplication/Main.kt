package com.example.myapplication



fun main() {
    val menuFunctions = MenuFunctions()


    // 사용자가 주문을 완료하거나 프로그램을 종료할 때까지 반복하는 do-while 루프
    do {
        // 초기 화면은 환영 메세지가 출력됨
        println("어서오세요 Shakeshack 입니다. 주문을 하시겠어요?")

        var order: String
        // 주문 여부를 묻고 사용자 입력을 받음
        print("1. 예, 2. 아니오: ")
        order = readLine() ?: ""

        // 사용자의 선택에 따라 다른 동작이 수행됨
        when (order) {
            "1" -> {
                // "1"을 선택한 경우 MainFunctions 클래스의 displayMenu 함수를 호출함
                menuFunctions.displayMenu()
            }
            // "1" 또는 "2" 이외의 선택인 경우 오류 메세지 출력
            "2" -> println("이용해주셔서 감사합니다. 안녕히 가세요!")
            else -> {
                println("올바른 선택이 아닙니다. 초기화면으로 돌아갑니다.")
            }
        }
      // 사용자가 "2"를 선택할 때까지 루프를 반복함
    } while (order != "2")
}