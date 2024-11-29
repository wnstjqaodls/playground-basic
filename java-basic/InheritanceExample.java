/**
 * 상속과 다형성 예제
 * 
 * 상속과 다형성이란?
 * - 상속: 기존 클래스의 특성을 물려받아 새로운 클래스를 만드는 것
 * - 다형성: 같은 타입이지만 실행 결과가 다양한 객체를 이용할 수 있는 성질
 * 
 * 실생활 예시:
 * - 상속: 
 *   • 포유류(부모) -> 강아지, 고양이(자식)
 *   • 스마트폰(부모) -> 아이폰, 갤럭시(자식)
 * - 다형성:
 *   • 동물은 모두 소리를 내지만 각자 다른 소리를 냄
 *   • 자동차는 모두 달리지만 각자 다른 방식으로 달림
 */public class InheritanceExample {
    public static void main(String[] args) {
        /* 1. 부모 클래스 객체 생성
         * - 가장 기본적인 형태의 객체
         * - 실생활 예시: 일반적인 동물의 특성
         */
        System.out.println("1. 부모 클래스 객체 사용:");
        Animal animal = new Animal("동물");
        animal.makeSound();  // 기본 동물 소리

        /* 2. 자식 클래스 객체 생성
         * - 부모의 특성을 물려받고 자신만의 특성도 가짐
         * - 실생활 예시: 강아지는 동물의 특성을 가지면서 자신만의 특성도 가짐
         */
        System.out.println("\n2. 자식 클래스 객체 사용:");
        Dog dog = new Dog("멍멍이");
        dog.makeSound();  // 강아지만의 소리
        dog.fetch();      // 강아지만의 특별한 기능

        Cat cat = new Cat("야옹이");
        cat.makeSound();  // 고양이만의 소리
        cat.scratch();    // 고양이만의 특별한 기능

        /* 3. 다형성 예제
         * - 부모 타입으로 자식 객체를 다루는 것
         * - 실생활 예시: 
         *   • 동물원에서 모든 동물을 'Animal'로 관리
         *   • 주차장에서 모든 차량을 'Car'로 관리
         */
        System.out.println("\n3. 다형성 예제 (동물원):");
        Animal[] animals = {
            new Dog("바둑이"),   // 강아지도 동물
            new Cat("나비"),     // 고양이도 동물
            new Dog("흰둥이")    // 다른 강아지도 동물
        };

        // 각 동물들이 자신의 방식으로 소리를 냄
        System.out.println("동물원의 동물들의 소리:");
        for (Animal a : animals) {
            a.makeSound();  // 각자의 방식으로 소리를 냄
        }
    }
}

/* 부모 클래스 (Animal)
 * - 모든 동물의 공통적인 특성을 정의
 * - 실생활 예시: 모든 동물의 기본적인 특성
 */
class Animal {
    protected String name;  // protected로 자식 클래스에서 접근 가능

    // 생성자
    public Animal(String name) {
        this.name = name;
    }

    // 모든 동물이 가지는 기본 행동
    public void makeSound() {
        System.out.println(name + "이(가) 소리를 냅니다.");
    }
}

/* 자식 클래스 (Dog)
 * - Animal을 상속받아 강아지만의 특성을 추가
 * - 실생활 예시: 강아지는 동물이면서 자신만의 특성을 가짐
 */
class Dog extends Animal {
    // 부모 클래스의 생성자 호출
    public Dog(String name) {
        super(name);  // super는 부모 클래스를 가리킴
    }

    // 메소드 오버라이딩 - 부모의 메소드를 자신만의 방식으로 재정의
    @Override
    public void makeSound() {
        System.out.println(name + "이(가) 멍멍 짖습니다.");
    }

    // 강아지만의 특별한 메소드
    public void fetch() {
        System.out.println(name + "이(가) 공을 가져옵니다.");
    }
}

/* 자식 클래스 (Cat)
 * - Animal을 상속받아 고양이만의 특성을 추가
 * - 실생활 예시: 고양이는 동물이면서 자신만의 특성을 가짐
 */
class Cat extends Animal {
    // 부모 클래스의 생성자 호출
    public Cat(String name) {
        super(name);
    }

    // 메소드 오버라이딩
    @Override
    public void makeSound() {
        System.out.println(name + "이(가) 야옹 웁니다.");
    }

    // 고양이만의 특별한 메소드
    public void scratch() {
        System.out.println(name + "이(가) 긁적긁적 합니다.");
    }
}
