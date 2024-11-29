/**
 * 객체지향 프로그래밍 예제
 * 
 * 객체지향 프로그래밍이란?
 * - 실제 세계의 사물이나 개념을 객체로 모델링하여 프로그래밍하는 방식
 * - 실생활 예시:
 *   • 자동차 = 객체
 *   • 자동차의 특성(브랜드, 모델, 연식) = 속성(필드)
 *   • 자동차의 기능(시동걸기, 가속하기) = 메소드
 */
public class OOPExample {
    public static void main(String[] args) {
        /* 객체 생성 및 사용
         * - new 키워드로 객체를 생성
         * - 실생활 예시: 자동차 공장에서 새로운 자동차 제작
         */
        System.out.println("1. 첫 번째 자동차 객체 생성 및 사용:");
        Car myCar = new Car("현대", "소나타", 2020);
        myCar.start();      // 시동 걸기
        myCar.accelerate(); // 가속하기
        myCar.showInfo();   // 정보 표시

        /* 다른 객체 생성
         * - 같은 설계도(클래스)로 다른 객체 생성
         * - 실생활 예시: 같은 모델이지만 다른 자동차 제작
         */
        System.out.println("\n2. 두 번째 자동차 객체 생성 및 사용:");
        Car friendCar = new Car("기아", "K5", 2021);
        friendCar.showInfo();
    }
}

/**
 * Car 클래스 - 자동차를 표현하는 설계도
 * - 클래스는 객체의 설계도 역할
 * - 실생활 예시: 자동차 설계도면
 */
class Car {
    /* 인스턴스 변수 (필드)
     * - 객체의 속성을 저장
     * - private 접근 제어자로 정보 은닉
     * - 실생활 예시: 자동차의 브랜드, 모델명, 연식 등
     */
    private String brand;    // 자동차 브랜드
    private String model;    // 자동차 모델
    private int year;        // 출시 연도
    private boolean isRunning; // 시동 상태

    /* 생성자
     * - 객체를 생성할 때 호출되는 특별한 메소드
     * - 객체의 초기 상태를 설정
     * - 실생활 예시: 자동차 조립 과정
     */
    public Car(String brand, String model, int year) {
        // this는 현재 객체를 가리킴
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.isRunning = false;  // 처음에는 시동이 꺼진 상태
    }

    /* 메소드
     * - 객체의 행동을 정의
     * - 실생활 예시: 자동차의 기능들
     */
    // 시동 걸기 메소드
    public void start() {
        isRunning = true;
        System.out.println(brand + " " + model + "의 시동을 겁니다.");
    }

    // 가속하기 메소드
    public void accelerate() {
        if (isRunning) {
            System.out.println(brand + " " + model + "이(가) 가속합니다!");
        } else {
            System.out.println("먼저 시동을 걸어주세요.");
        }
    }

    // 정보 표시 메소드
    public void showInfo() {
        System.out.println("\n== 자동차 정보 ==");
        System.out.println("브랜드: " + brand);
        System.out.println("모델: " + model);
        System.out.println("연식: " + year + "년");
        System.out.println("시동 상태: " + (isRunning ? "켜짐" : "꺼짐"));
    }
}