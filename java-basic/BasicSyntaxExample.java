/**
 * Java 기본 문법과 데이터 타입 예제
 * 
 * 프로그래밍에서 데이터 타입이란?
 * - 컴퓨터가 처리하는 다양한 종류의 데이터를 분류한 것입니다.
 * - 마치 우리가 실생활에서 물건을 종류별로 분류하는 것과 같습니다.
 *   예) 음식(과일, 채소, 육류), 의류(상의, 하의, 신발) 등
 */
public class BasicSyntaxExample {
    public static void main(String[] args) {
        /* 1. 기본 데이터 타입 (Primitive Data Types)
         * 
         * int (정수): 
         * - 소수점이 없는 숫자를 저장
         * - 실생활 예시: 사과의 개수, 학생 수, 나이
         */
        int number = 10;  // 예: 사과 10개

        /* double (실수):
         * - 소수점이 있는 숫자를 저장
         * - 실생활 예시: 키, 몸무게, 온도, 시험 점수
         */
        double decimal = 3.14;  // 예: 원주율 또는 키 170.5cm

        /* boolean (논리값):
         * - true(참) 또는 false(거짓) 두 가지 값만 가짐
         * - 실생활 예시: 전등의 켜짐/꺼짐, 출석/결석, 합격/불합격
         */
        boolean isTrue = true;  // 예: 전등이 켜져있음(true)

        /* char (문자):
         * - 한 글자를 저장
         * - 실생활 예시: 학점(A,B,C), 혈액형(A,B,O,AB)
         */
        char character = 'A';  // 예: 학점 A

        /* 2. 참조 데이터 타입 (Reference Data Type)
         * String (문자열):
         * - 여러 글자를 저장할 수 있는 타입
         * - 실생활 예시: 이름, 주소, 전화번호
         */
        String text = "Hello Java!";  // 예: 인사말

        /* 3. 형변환 (Type Casting)
         * - 다른 타입의 데이터로 변환하는 것
         * - 실생활 예시: 
         *   • 달러를 원화로 환전
         *   • 킬로그램을 파운드로 변환
         */
        // double을 int로 변환 (소수점 이하 버림)
        int intValue = (int) decimal;  // 3.14 → 3
        // int를 double로 변환 (소수점 추가)
        double doubleValue = number;   // 10 → 10.0
        
        // 4. 결과 출력
        System.out.println("정수값 (int): " + number + " - 예: 사과 " + number + "개");
        System.out.println("실수값 (double): " + decimal + " - 예: 원주율");
        System.out.println("논리값 (boolean): " + isTrue + " - 예: 전등 켜짐");
        System.out.println("문자값 (char): " + character + " - 예: 학점");
        System.out.println("문자열 (String): " + text + " - 예: 인사말");
        System.out.println("형변환 결과: " + intValue + " (3.14를 정수로), " + 
                         doubleValue + " (10을 실수로)");
    }
}