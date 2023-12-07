package com.example.myapplication


//Calculator 라는 클래스를 정의함
class Calculator {
    //클래스 내에 선언된 Calculator 라는 메소드를 정의하며 3개의 파라미터를 받음 string으로 메소드를 반환하며 계산 결과를 문자열로 나타냄
    fun calculate(num1: Double, num2: Double, operator: Char): String {
        // 조건에 따라서 동작을 수행하도록 함
        return when (operator) {
            '+' -> (num1 + num2).toString()
            '-' -> (num1 - num2).toString()
            '*' -> (num1 * num2).toString()
            // num1 과 num2 를 나눈 결과를 실수로 변환한 후 문자열로 반환함
            '/' -> (num1.toDouble() / num2.toDouble()).toString()
            // 제시한 연산자 외에 다른 값을 입력 받았을 시에 해당 메세지를 문자열로 반환함
            else -> "다시 입력해주세요."
        }
    }
}


            fun main() {

                // readLine() 함수를 사용해 외부에서 입력한 값을 toDdouble() 함수를 사용해 실수로 변환함
                // '!!' 이라는 연산자는 null 이 절대 될 수 없다고 단언하는 연산자
                println("첫 번째 숫자를 입력하세요: ")
                var num1 = readLine()!!.toDouble()

                println("두 번째 숫자를 입력하세요: ")
                var num2 = readLine()!!.toDouble()

                println("사용할 연산자를 입력하세요 (+, -, *, /): ")
                // single() 함수를 사용해서 입력한 문자열의 첫번째 문자를 추출함
                var operator = readLine()!!.single()

                // Calculator 클래스의 인스턴스 생성
                val calculator = Calculator()


                val result = calculator.calculate(num1, num2, operator)
                println("계산이 완료되었습니다: $result")

            }





