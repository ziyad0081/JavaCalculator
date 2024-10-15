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
    final List<String> operations = Arrays.asList("+","/","x","-");
    public ComputerWrapper(String args[]){
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
        System.out.println("Result is " + compute());
    }

    

    
}