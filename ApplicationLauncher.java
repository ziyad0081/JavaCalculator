import Computer.ComputerWrapper;

public class ApplicationLauncher {
    static ComputerWrapper wrapper ;

    public static void main(String[] args) {
        

        try {
            wrapper = new ComputerWrapper(args);
            
        } catch (Exception e) {
            System.err.println(e.getMessage());
            return ;
        }
        wrapper.PrintComputation();
    }
}
