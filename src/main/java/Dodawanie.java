/**
 * Created by inf117182 on 02.06.2017.
 */
public class Dodawanie implements IOperator {
    public String getKey() {
        return "+";
    }

    public double calculate(int a, int b) {
        return a+b;
    }
}
