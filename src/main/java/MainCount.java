import model.Expression;
import model.SendCalculation;
import view.InputView;

public class MainCount {
    public static void main(String[] args) {

        Expression expression = new Expression(InputView.inputExpression());
        SendCalculation sendCalculation = new SendCalculation(
                expression.giveEvaluatedNumbers(),
                expression.giveEvaluatedSymbols()
        );
        System.out.println(sendCalculation.Calculation());
    }
}
