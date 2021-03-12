package lab.interfaces;

public class Computer2 implements Reader, Writer {

    @Override
    public void read() {
        System.out.println("Reading...");
    }

    @Override // @Override not mandatory
    public void write() {
        System.out.println("Writing...");
    }
}
