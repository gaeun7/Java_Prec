package Assignment.Level2;

import java.util.ArrayList;
import java.util.List;

public class CircleCalculator extends Calculator {
    private List<Double> circleAreas; // 원의 넓이를 저장하는 리스트

    public CircleCalculator(List<Double> initialResults, List<Double> initialCircleAreas) {
        super(initialResults);
        this.circleAreas = new ArrayList<>(initialCircleAreas);
    }

    // 원의 넓이를 계산하고 리스트에 추가하는 메소드
    public double calculateCircleArea(double radius) {
        double area = Math.PI * radius * radius; // 원의 넓이 계산
        circleAreas.add(area); // 계산된 넓이를 리스트에 추가
        return area;
    }

    // 저장된 원의 넓이를 조회하는 메소드
    public List<Double> inquiryCircleAreas() {
        return circleAreas;
    }
}