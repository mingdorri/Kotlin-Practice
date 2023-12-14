package com.example.myapplication


// BurgersMenu.kt


// BurgerMenu 클래스를 정의
class BurgersMenu {
    //클래스 안에 displayBurgersMenu라는 함수를 포함
    //displayBurgersMenu 함수는 사용자에게 메뉴를 보여주고, 선택한 메뉴에 따라 해당하는 동작을 수행하도록 함
    fun displayBurgersMenu() {
        // 사용자가 선택한 버거를 저장하는 변수를 String으로 지정
        var selectedBurger: String

        // do-while 루프 : 사용자가 0을 선택하기 전까지 계속 메뉴를 표시함
        do {
            // 다양한 문자열을 포함하는 """(쓰리더블쿼터) 를 사용하여 멀티라인 문자열을 정의
            val burgersMenu = """
                [ Burgers MENU ]
                1. ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거
                2. SmokeShack    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거
                3. Shroom Burger | W 9.4 | 몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거
                4. Cheeseburger  | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거
                5. Hamburger     | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거
                0. 뒤로가기       | 뒤로가기
                
            """.trimIndent() // 들여쓰기 제거

            // 메뉴 출력
            println(burgersMenu)

            // 사용자로부터 숫자로 된 선택 입력 받기
            print("메뉴를 선택해주세요 (숫자 입력): ")
            selectedBurger = readLine() ?: ""


            // 사용자의 선택에 따라 처리
            when (selectedBurger) {
                "1" -> println("선택한 메뉴: ShackBurger")
                "2" -> println("선택한 메뉴: SmokeShack")
                "3" -> println("선택한 메뉴: Shroom Burger")
                "4" -> println("선택한 메뉴: Cheeseburger")
                "5" -> println("선택한 메뉴: Hamburger")
                "0" -> println("이전 메뉴로 돌아갑니다.")
                else -> println("올바른 메뉴 번호를 입력해주세요.")
            }
          // 사용자가 0을 선택하면 루프 종료
        } while (selectedBurger != "0")
    }
}
