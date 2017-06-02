import java.util.HashMap;
import java.util.List;

/**
 * Created by inf117182 on 02.06.2017.
 */
public class Kalkulator {

    private List<IOperator> operators;
    private IOperator myOperator;

    public Kalkulator(List<IOperator> operators) {
        this.operators = operators;
    }

    public double calculate(int first, int second, String operator) {

        this.operators.forEach((operatorObject) -> {
            if(operatorObject.getKey().equals(operator)) {
                myOperator = operatorObject;
            }

        });

        return myOperator.calculate(first, second);
    }
}
