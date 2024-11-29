import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 배열과 컬렉션 예제
 * 
 * 배열과 컬렉션이란?
 * - 여러 개의 데이터를 저장하고 관리하는 자료구조입니다.
 * - 실생활 예시:
 *   • 배열: 주차장의 주차 공간 번호
 *   • ArrayList: 장바구니에 담긴 상품들
 *   • HashMap: 학생의 이름과 성적 관리
 */public class ArrayAndCollectionExample {
    public static void main(String[] args) {
        /* 1. 배열 (Array)
         * - 같은 타입의 데이터를 순차적으로 저장
         * - 크기가 고정됨
         * - 실생활 예시: 
         *   • 아파트의 각 층 호수
         *   • 학급의 출석부 번호
         */
        int[] numbers = {1, 2, 3, 4, 5};  // 5개의 숫자를 가진 배열
        System.out.println("1. 배열 요소 출력 (학생 번호):");
        for (int num : numbers) {
            System.out.print(num + "번 학생 ");
        }
        System.out.println();

        /* 2. 2차원 배열 (2D Array)
         * - 행과 열로 구성된 표 형태의 데이터 저장
         * - 실생활 예시:
         *   • 극장 좌석 배치
         *   • 바둑판의 돌 위치
         *   • 엑셀 스프레드시트
         */
        int[][] matrix = {
            {1, 2, 3},  // 1행
            {4, 5, 6}   // 2행
        };
        System.out.println("\n2. 2차원 배열 (극장 좌석 번호):");
        for (int row = 0; row < matrix.length; row++) {
            System.out.print((row + 1) + "행: ");
            for (int seat : matrix[row]) {
                System.out.print(seat + "번 좌석 ");
            }
            System.out.println();
        }

        /* 3. ArrayList
         * - 크기가 유동적인 리스트
         * - 데이터 추가/삭제가 자유로움
         * - 실생활 예시:
         *   • 쇼핑몰 장바구니
         *   • 재생목록의 음악
         */
        List<String> fruits = new ArrayList<>();
        System.out.println("\n3. ArrayList 예제 (장바구니):");
        System.out.println("장바구니에 상품 추가:");
        fruits.add("사과");    // 상품 추가
        fruits.add("바나나");   // 상품 추가
        fruits.add("오렌지");   // 상품 추가
        System.out.println("장바구니 목록: " + fruits);
        System.out.println("장바구니에 담긴 상품 수: " + fruits.size());

        /* 4. HashMap
         * - 키(Key)와 값(Value)의 쌍으로 데이터 저장
         * - 실생활 예시:
         *   • 학생 이름(키)과 성적(값)
         *   • 전화번호부: 이름(키)과 전화번호(값)
         */
        Map<String, Integer> scores = new HashMap<>();
        System.out.println("\n4. HashMap 예제 (학생 성적표):");
        // 학생 성적 등록
        scores.put("김철수", 90);  // 90점
        scores.put("이영희", 85);  // 85점
        scores.put("박민수", 88);  // 88점
        
        // 성적 조회
        System.out.println("학생 성적 현황:");
        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            String name = entry.getKey();      // 학생 이름
            Integer score = entry.getValue();   // 점수
            System.out.println(name + " 학생: " + score + "점");
        }
        
        // 특정 학생의 성적 검색
        String studentName = "김철수";
        System.out.println("\n" + studentName + " 학생의 성적: " + 
                         scores.get(studentName) + "점");
    }
}
