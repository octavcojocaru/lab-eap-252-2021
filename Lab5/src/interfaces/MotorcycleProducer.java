package interfaces;

public class MotorcycleProducer implements Producer<Motorcycle> {

    @Override
    public Motorcycle produce() {
        return new Motorcycle("2", 2020);
    }
}
