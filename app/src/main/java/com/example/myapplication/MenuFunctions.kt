package com.example.myapplication

// MenuFunctions.kt



class MenuFunctions {
    // displayMenu 함수는 사용자에게 메뉴를 보여주고 선택한 메뉴에 따라 해당하는 동작을 수행하도록 함
    fun displayMenu() {
        // 사용자가 선택한 버거를 저장하는 변수를 String으로 지정
        var selectedMenu: String
        // do-while 루프 : 사용자가 0을 선택하기 전까지 계속 메뉴를 표시함
        do {
            // 다양한 문자열을 포함하는 """(쓰리더블쿼터) 를 사용하여 멀티라인 문자열을 정의
            val menu = """
                [ SHAKESHACK MENU ]
                1. Burgers         | 앵거스 비프 통살을 다져만든 버거
                2. Frozen Custard  | 매장에서 신선하게 만드는 아이스크림
                3. Drinks          | 매장에서 직접 만드는 음료
                4. Beer            | 뉴욕 브루클린 브루어리에서 양조한 맥주
                0. 종료            | 프로그램 종료
            """.trimIndent() // 들여쓰기 제거


            // 정의한 메뉴를 화면에 출력
            println(menu)
            // 사용자로부터 선택한 메뉴를 입력받도록 함
            print("메뉴를 선택해주세요 (숫자 입력): ")

            // 사용자의 입력을 selectedMenu 변수에 저장
            selectedMenu = readLine() ?: ""


            // 사용자가 선택한 메뉴에 따라 다양한 동작을 수행
            when (selectedMenu) {
                // 1일 경우 burgersMenu 클래스의 displayBurgersMenu 함수를 호출함
                "1" -> {
                    val burgersMenu = BurgersMenu()
                    burgersMenu.displayBurgersMenu()
                }
                "2" -> println("선택한 메뉴: Frozen Custard")
                "3" -> println("선택한 메뉴: Drinks")
                "4" -> println("선택한 메뉴: Beer")
                "0" -> println("프로그램을 종료합니다.")
                else -> println("다시 입력해 주세요.")
            }
          // 사용자가 0을 선택하기 전까지 계속 루프를 반복
        } while (selectedMenu != "0")
    }
}
