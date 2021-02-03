package pattern;

public class Carbuilder {
    private Body body;
    private Wheel[] wheels;
    private Engine engine;
    public Car build(){
        return new Car(this.body,this.wheels,this.engine);

    }

    public Carbuilder body(Body body) {
        this.body = body;
        return this;
    }

    public  Carbuilder wheels(Wheel[] wheels) {
        this.wheels = wheels;
        return this;

    }

    public  Carbuilder engine(Engine engine) {
        this.engine = engine;
        return this;

    }
}
