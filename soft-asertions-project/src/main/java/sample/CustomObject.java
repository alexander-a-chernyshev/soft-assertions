package sample;

public class CustomObject {
    private final int value;

    public CustomObject(int value) {
        this.value = value;
    }

    private void method1() {
        // no implementation
    }
    private void method2() {
        // no implementation
    }
    private void method3() {
        // no implementation
    }
    private void method4() {
        // no implementation
    }
    private void method5() {
        // no implementation
    }
    private void method6() {
        // no implementation
    }
    private void method7() {
        // no implementation
    }
    private void method8() {
        // no implementation
    }
    private void method9() {
        // no implementation
    }
    private void method10() {
        // no implementation
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomObject that = (CustomObject) o;
        return value == that.value;
    }
}
