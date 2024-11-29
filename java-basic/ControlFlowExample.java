/**
 * 제어문과 반복문 예제
 * 
 * 프로그래밍에서 제어문이란?
 * - 프로그램의 실행 흐름을 제어하는 구문입니다.
 * - 실생활 예시:
 *   • if문: 날씨가 좋으면 산책을 간다
 *   • switch문: 신호등의 색깔에 따라 행동을 결정
 *   • 반복문: 아침 운동을 10번 반복
 */
public class ControlFlowExample {
    public static void main(String[] args) {
        /* 1. if-else문 (조건문)
         * - 특정 조건에 따라 다른 동작을 수행
         * - 실생활 예시: 시험 점수에 따른 등급 부여
         */
        int score = 85;  // 시험 점수
        System.out.println("1. if-else 예제 (시험 점수 등급):");
        if (score >= 90) {  // 90점 이상이면
            System.out.println("우수 (A등급)");
        } else if (score >= 80) {  // 80점 이상이면
            System.out.println("양호 (B등급)");
        } else {  // 그 외의 경우
            System.out.println("노력 필요 (C등급)");
        }

        /* 2. switch문
         * - 하나의 값에 따라 여러 가지 경우 중 하나를 선택
         * - 실생활 예시: 
         *   • 신호등: 빨간불(정지), 노란불(주의), 초록불(진행)
         *   • 계절: 봄(꽃구경), 여름(수영), 가을(단풍구경), 겨울(스키)
         */
        char grade = 'B';  // 학점
        System.out.println("\n2. switch 예제 (학점에 따른 평가):");
        switch (grade) {
            case 'A':
                System.out.println("Excellent! (탁월함)");
                break;
            case 'B':
                System.out.println("Good! (우수함)");
                break;
            default:
                System.out.println("Keep trying! (더 노력하세요)");
        }

        /* 3. for 반복문
         * - 정해진 횟수만큼 반복
         * - 실생활 예시:
         *   • 운동: 팔굽혀펴기 10회
         *   • 학습: 영단어 5번 반복해서 외우기
         */
        System.out.println("\n3. for 반복문 (운동 횟수 세기):");
        for (int i = 1; i <= 3; i++) {
            System.out.println("운동 " + i + "회 완료!");
        }

        /* 4. while 반복문
         * - 조건이 참인 동안 계속 반복
         * - 실생활 예시:
         *   • 식당에서 손님이 있는 동안 계속 서빙하기
         *   • 배터리가 없을 때까지 핸드폰 사용하기
         */
        System.out.println("\n4. while 반복문 (카운트다운):");
        int count = 3;  // 카운트다운 시작 숫자
        while (count > 0) {
            System.out.println("카운트다운: " + count);
            count--;  // count를 1씩 감소
        }
        System.out.println("발사!");
    }
}