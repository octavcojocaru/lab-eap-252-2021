package enums;

public class MyObject {

    private int number;
    private MyEnum myEnum; // Enum field

    public MyObject(int number, MyEnum myEnum) {
        this.number = number;
        this.myEnum = myEnum;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public MyEnum getMyEnum() {
        return myEnum;
    }

    public void setMyEnum(MyEnum myEnum) {
        this.myEnum = myEnum;
    }

    @Override
    public String toString() {
        return "MyObject{" +
                "number=" + number +
                ", myEnum=" + myEnum +
                '}';
    }
}
