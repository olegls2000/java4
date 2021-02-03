package pattern;

public class CarBuilder {
    private Body body;
    private Wheel[] wheels;
    private Engine engine;

    public CarBuilder body(Body body) {
        this.body = body;
        return this;
    }

    public CarBuilder wheels(Wheel[] wheels) {
        this.wheels = wheels;
        return this;
    }

    public CarBuilder engine(Engine engine) {
        this.engine = engine;
        return this;
    }

    public Car builder()
    {
        if (this.body == null || this.wheels == null || this.engine == null)
        {
            throw new IllegalArgumentException("Car is not ready!");
        }
        return new Car(this.body, this.wheels, this.engine);
    }
}
