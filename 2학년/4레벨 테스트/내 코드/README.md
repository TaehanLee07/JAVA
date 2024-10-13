# 방과후 자바 4레벨 시험
---
## 문제

---

### **문제 설명**

다양한 교통수단을 관리하는 프로그램을 작성하세요. 이 프로그램은 두 개 이상의 enum 클래스, wrapper 클래스, 인터페이스, 제네릭 클래스를 사용합니다. 이 프로그램을 통해 자바의 주요 개념을 종합적으로 이해하고 활용할 수 있습니다.

### **요구 사항**

다음 요구 사항에 맞추어 프로그램을 작성하세요.

1. **인터페이스 `Movable` 구현:**
    - **`Movable`** 인터페이스는 다음의 메서드를 선언합니다:
        - **`void move(Double distance)`**
        - **`TransportType getTransportType()`**
2. **enum `TransportType` 정의:**
    - **`TransportType`** enum은 `*CAR*(150, "자동차"), *BICYCLE*(20, "자전거"), *TRAIN*(300, "기차"), *MOTORCYCLE*(100, "오토바이")` 값을 갖습니다.
    - 각 enum 값은 **`speed`** 필드를 갖고, 생성자를 통해 초기화됩니다.
    - 각 enum 값은 **`getSpeed`** 메서드를 통해 속도를 반환합니다.
    - 각 enum 값은 **`description`** 필드를 갖고, 생성자를 통해 초기화됩니다.
    - 각 enum 값은 **`getDescription`** 메서드를 통해 설명을 반환합니다.
3. **enum `FuelType` 정의:**
    - **`FuelType`** enum은 `*GASOLINE*(0.8), *DIESEL*(0.9), *ELECTRIC*(0.95)`  값을 갖습니다.
    - 각 enum 값은 **`efficiency`** 필드를 갖고, 생성자를 통해 초기화됩니다.
    - 각 enum 값은 **`getEfficiency`** 메서드를 통해 효율성을 반환합니다.
    - 각 enum 값은 **`calculateRequiredFuel(Double distance)`** 메서드를 통해 주어진 거리만큼 이동하는 데 필요한 연료를 계산합니다.
4. **클래스 `Car`, `Bicycle`, `Train`, `Motorcycle` 구현:**
    - **`Car`** 클래스는 **`Movable`** 인터페이스를 구현합니다.
    - **`Car`** 클래스는 **`Double`** 타입의 **`fuel`** 필드와 **`FuelType`** 필드를 갖고, **`move`** 메서드에서 연료를 소모합니다.
    - 연료가 주어진 거리만큼 충분히 이동할 수 있는 경우 출력 예시
        - `System.*out*.println("자동차가 " + distance + " 만큼 이동했습니다. 남은 연료: " + fuel);`
    - 연료가 주어진 거리를 이동할 수 없는 경우 출력 예시
        - `System.*out*.println(distance + "만큼 이동하기에 연료가 충분하지 않습니다.");`
    - **`Bicycle`** 클래스는 **`Movable`** 인터페이스를 구현합니다.
    - **`Bicycle`** 클래스는 **`Integer`** 타입의 **`gear`** 필드를 갖고, **`move`** 메서드에서 기어를 이용하여 이동 거리를 출력합니다.
    - **`Train`** 클래스는 **`Movable`** 인터페이스를 구현합니다.
    - **`Train`** 클래스는 **`move`** 메서드에서 속도를 이용하여 이동 거리를 출력합니다.
    - **`Motorcycle`** 클래스는 **`Movable`** 인터페이스를 구현합니다.
    - **`Motorcycle`** 클래스는 **`Double`** 타입의 **`fuel`** 필드와 **`FuelType`** 필드를 갖고, **`move`** 메서드에서 연료를 소모합니다.
    - 연료가 주어진 거리만큼 충분히 이동할 수 있는 경우 출력 예시
        - `System.*out*.println("오토바이가 " + distance + " 만큼 이동했습니다. 남은 연료: " + fuel);`
    - 연료가 주어진 거리를 이동할 수 없는 경우 출력 예시
        - `System.*out*.println(distance + "만큼 이동하기에 연료가 충분하지 않습니다.");`
5. **제네릭 클래스 `TransportManager` 구현:**
    - **`TransportManager`** 클래스는 제네릭 타입 **`T`**를 사용합니다.
    - **`T`** 타입은 **`Movable`** 인터페이스와 이를 구현하는 클래스로 한정합니다.
        - `public class TransportManager <T extends Movable>`
    - **`T`** 타입의 교통수단을 저장하고 관리하는 **`transport`** 필드를 갖습니다.
    - **`setTransport`** 메서드와 **`getTransport`** 메서드를 구현합니다.
    - **`moveTransport`** 메서드는 저장된 교통수단의 **`move`** 메서드를 호출합니다.
6. 메인 클래스 `TestTransportMain1` 실행:
    - 아래 코드와 출력예시를 참고하여 위의 코드들을 작성합니다.

```java
package level4Exam.teacher;

public class TestTransportMain1 {
    public static void main(String[] args) {
        TransportManager<Car> carManager = new TransportManager<>();
        Car car = new Car(50.0, FuelType.GASOLINE);
        carManager.setTransport(car);
        carManager.moveTransport(20.567);
        System.out.println("남은 연료: " + car.getRemainingFuel());
        System.out.println("교통수단 종류: " + car.getTransportType().getDescription());

        System.out.println("--------------------------------");

        TransportManager<Bicycle> bicycleManager = new TransportManager<>();
        Bicycle bicycle = new Bicycle(3);
        bicycleManager.setTransport(bicycle);
        bicycleManager.moveTransport(10.234);
        System.out.println("교통수단 종류: " + bicycle.getTransportType().getDescription());

        System.out.println("--------------------------------");

        TransportManager<Train> trainManager = new TransportManager<>();
        Train train = new Train();
        trainManager.setTransport(train);
        trainManager.moveTransport(100.789);
        System.out.println("교통수단 종류: " + train.getTransportType().getDescription());

        System.out.println("--------------------------------");

        TransportManager<Motorcycle> motorcycleManager = new TransportManager<>();
        Motorcycle motorcycle = new Motorcycle(10.0, FuelType.DIESEL);
        motorcycleManager.setTransport(motorcycle);
        motorcycleManager.moveTransport(5.5);
        System.out.println("남은 연료: " + motorcycle.getRemainingFuel());
        System.out.println("교통수단 종류: " + motorcycle.getTransportType().getDescription());
    }
}
```

```
자동차가 20.567 만큼 이동했습니다. 남은 연료: 24.29125
남은 연료: 24.29125
교통수단 종류: 자동차
--------------------------------
자전거가 10.234 거리를 3단 기어로 이동했습니다.
교통수단 종류: 자전거
--------------------------------
기차가 100.789 거리를 300 속도로 이동했습니다.
교통수단 종류: 기차
--------------------------------
오토바이가 5.5 만큼 이동했습니다. 남은 연료: 3.8888888888888893
남은 연료: 3.8888888888888893
교통수단 종류: 오토바이
```

1. 메인 클래스를 리팩토링하여 중복을 최소화하여 `TestTransportMain2` 를 생성합니다.
# 리뷰
    - 시험은 통과했지만 시간이 부족해 리팩토링쪽에서 많이 개선하지 못한점이 아쉬운 시험이였다.

# 선생님의 풀이

- **Employee**
    
    ```java
    package level4.test.teacher;
    
    public interface Employee {
        double calculateSalary();
        EmployeeType getEmployeeType();
    }
    ```
    
- **EmployeeType**
    
    ```java
    package level4.test.teacher;
    
    public enum EmployeeType {
        FULL_TIME(1.0),
        CONTRACT(0.8),
        INTERN(0.5);
    
        private final double salaryMultiplier;
    
        EmployeeType(double salaryMultiplier) {
            this.salaryMultiplier = salaryMultiplier;
        }
    
        public double adjustBaseSalary(double baseSalary) {
            return baseSalary * salaryMultiplier;
        }
    }
    ```
    
- **FullTimeEmployee implements Employee**
    
    ```java
    package level4.test.teacher;
    
    public class FullTimeEmployee implements Employee {
        private double baseSalary;
        private double bonus;
        private EmployeeType employeeType;
    
        public FullTimeEmployee(double baseSalary, double bonus) {
            this.baseSalary = baseSalary;
            this.bonus = bonus;
            this.employeeType = EmployeeType.FULL_TIME;
        }
    
        @Override
        public double calculateSalary() {
            return employeeType.adjustBaseSalary(baseSalary) + bonus;
        }
    
        @Override
        public EmployeeType getEmployeeType() {
            return employeeType;
        }
    
        @Override
        public String toString() {
            return "FullTimeEmployee{" +
                    "baseSalary=" + baseSalary +
                    ", bonus=" + bonus +
                    ", employeeType=" + employeeType +
                    '}';
        }
    }
    ```
    
- **ContractEmployee implements Employee**
    
    ```java
    package level4.test.teacher;
    
    public class ContractEmployee implements Employee {
        private double baseSalary;
        private EmployeeType employeeType;
    
        public ContractEmployee(double baseSalary) {
            this.baseSalary = baseSalary;
            this.employeeType = EmployeeType.CONTRACT;
        }
    
        @Override
        public double calculateSalary() {
            return employeeType.adjustBaseSalary(baseSalary);
        }
    
        @Override
        public EmployeeType getEmployeeType() {
            return employeeType;
        }
    
        @Override
        public String toString() {
            return "ContractEmployee{" +
                    "baseSalary=" + baseSalary +
                    ", employeeType=" + employeeType +
                    '}';
        }
    }
    ```
    
- **InternEmployee implements Employee**
    
    ```java
    package level4.test.teacher;
    
    public class InternEmployee implements Employee {
        private double baseSalary;
        private EmployeeType employeeType;
    
        public InternEmployee(double baseSalary) {
            this.baseSalary = baseSalary;
            this.employeeType = EmployeeType.INTERN;
        }
    
        @Override
        public double calculateSalary() {
            return employeeType.adjustBaseSalary(baseSalary);
        }
    
        @Override
        public EmployeeType getEmployeeType() {
            return employeeType;
        }
    
        @Override
        public String toString() {
            return "InternEmployee{" +
                    "baseSalary=" + baseSalary +
                    ", employeeType=" + employeeType +
                    '}';
        }
    }
    ```
    
- **TestEmployee**
    
    ```java
    package level4.test.teacher;
    
    public class TestEmployee {
    
        public static void main(String[] args) {
            Employee[] employees = {
                    new FullTimeEmployee(3000, 500),
                    new ContractEmployee(2500),
                    new InternEmployee(1500)
            };
    
            System.out.println("Full Time Employee Salary: " + employees[EmployeeType.FULL_TIME.ordinal()].calculateSalary());
            System.out.println("Contract Employee Salary: " + employees[EmployeeType.CONTRACT.ordinal()].calculateSalary());
            System.out.println("Intern Employee Salary: " + employees[EmployeeType.INTERN.ordinal()].calculateSalary());
    
            System.out.println();
    
            for (Employee emp : employees) {
                info(emp);
            }
        }
    
        private static void info(Employee emp) {
            System.out.println(emp.toString());
        }
    }
    
    /* 다형성 활용 전
    Employee fullTimeEmployee = new FullTimeEmployee(3000, 500);
    Employee contractEmployee = new ContractEmployee(2500);
    Employee internEmployee = new InternEmployee(1500);
    
    System.out.println("Full Time Employee Salary: " + fullTimeEmployee.calculateSalary());
    System.out.println("Contract Employee Salary: " + contractEmployee.calculateSalary());
    System.out.println("Intern Employee Salary: " + internEmployee.calculateSalary());
    
    System.out.println();
    
    System.out.println(fullTimeEmployee.toString());
    System.out.println(contractEmployee.toString());
    System.out.println(internEmployee.toString());
    */
    ```
