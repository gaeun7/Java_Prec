package week03.BasicReference;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(); // 객체 생성

        // 기본형 매개변수
        char type = 'D';
        car.brakePedal(type);

        // 메서드 실행 완료 후 전달할 매개값으로 지정된 type 값 확인
        System.out.println("type = " + type); // 기존에 선언한 값 'D' 출력, 원본 값 변경되지 않음
        // 메서드 실행 완료 후 반환된 car 인스턴스의 gear 타입 확인
        System.out.println("gear = " + car.gear); // 객체 내부에서 type을 변경하여 수정했기 때문에 'P' 출력

        System.out.println();
        // 참조형 매개변수
        Tire tire = new Tire();
        tire.company = "금호"; // 금호 타이어 객체 생성

        // 차 객체의 타이어를 등록하는 메서드 호출한 후 반환값으로 차 객체의 타이어 객체 반환
        Tire carInstanceTire = car.setTire(tire);

        // 메서드 실행 완료 후 전달할 매개값으로 지정된 참조형 변수 tire의 company 값 확인
        System.out.println("tire.company = " + tire.company); // "KIA" 출력
        // 전달할 매개값으로 지정된 tire 인스턴스의 주소값이 전달되었기 때문에 호출된 메서드에 의해 값이 변경됨.

        // 메서드 실행 완료 후 반환된 car 인스턴스의 tire 객체 값이 반환되어 저장된 참조형 변수 carInstanceTire의 company 값 확인
        System.out.println("carInstanceTire.company = " + carInstanceTire.company); // "KIA" 출력
    }
}
