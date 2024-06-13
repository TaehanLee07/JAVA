package lang.immutable.address;

public class ImmutableAddress {
    private final String value;

    public ImmutableAddress(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "ImmutableAddress{" +
                "value='" + value + '\'' +
                '}';
    }
}

/*
내부 값이 변경되면 안된다. 따라서 value의 필드를 final로 선언했다
값을 변경할 수 있는 setValue()를 제거한다.
이 클래스는 생성자를 통해서만 값을 설정할 수 있고 이 후에는 값을 변경하는 것이 불가능하다.

불변 클래스를 만드는 방법은 아주 단순하다
어떻게든 필드 값을 변경할 수 없게 클래스를 설계하면 된다.
*/
