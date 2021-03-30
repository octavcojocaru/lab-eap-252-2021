package interfaces;

public class CarProducerImpl implements Producer<Car>{

    @Override
    public Car produce() {
       return new Car("1", 2021);
    }
}
