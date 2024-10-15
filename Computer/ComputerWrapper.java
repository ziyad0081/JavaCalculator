package Computer;
import Computer.Adder;
import java.util.Arrays;
import java.util.List;

/**
 * ComputerWrapper
 */
public class ComputerWrapper {
    Computer computerObj;
    private Double op1;
    private Double op2; 
    private Boolean help_flag = false;
    final List<String> operations = Arrays.asList("+","/","x","-");
    public ComputerWrapper(String args[]){
        if(args[0].equals("-i")){
            help_flag = true;
            System.out.println(
                "Usage: java -jar SimpleCalculator.jar [operator] [num1] [num2]\n" + //
                                        "\n" + //
                                        "Where:\n" + //
                                        "  [operator]  The arithmetic operation to perform. It can be one of:\n" + //
                                        "              +  for addition\n" + //
                                        "              -  for subtraction\n" + //
                                        "              x  for multiplication\n" + //
                                        "\n" + //
                                        "  [num1]      The first number (integer or decimal).\n" + //
                                        "  [num2]      The second number (integer or decimal).\n" + //
                                        "\n" + //
                                        "Examples:\n" + //
                                        "  java -jar SimpleCalculator.jar + 5 3    -> Output: 8\n" + //
                                        "  java -jar SimpleCalculator.jar - 7 2    -> Output: 5\n" + //
                                        "  java -jar SimpleCalculator.jar * 4 6    -> Output: 24\n" + //
                                        ""
            );
            return;
        }
        try {
            op1 = Double.parseDouble(args[1]);
            op2 = Double.parseDouble(args[2]);
        } catch (Exception e) {

            throw new NumberFormatException("Illegal arguments (Maybe one or both args arent numbers). Exiting.");
        }
        if(!operations.contains(args[0])){
            throw new IllegalArgumentException("Invalid operation");
        }
        if(args[0].equals("/") && Double.parseDouble(args[2]) == 0){
            throw new IllegalArgumentException("Zero Division. Exiting.");
        }
        if(args.length < 3){
            throw new IllegalArgumentException("Not enough args");
        }
        if(args.length > 3){
            throw new IllegalArgumentException("Too Much Args");
        }

        switch (args[0]) {
            case "+":
                computerObj = new Adder();
                break;
            case "x":
                computerObj = new Multiplier();
                break;
            case "/":
                computerObj = new Divider();
                break;
            case "-":
                computerObj = new Substract();
                break;
            default:
                break;
        }
        
    }
    private Double compute(){
        return computerObj.compute(op1, op2);
    }

    public void PrintComputation(){
        if(help_flag){
            return;
        }
        System.out.println("Result is " + compute());
    }

    

    
}