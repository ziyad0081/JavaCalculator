    import Computer.ComputerWrapper;

    public class ApplicationLauncher {
        static ComputerWrapper wrapper ;

        public static void main(String[] args) {
            

            try {
                wrapper = new ComputerWrapper(args);
                wrapper.PrintComputation();    
            } catch (Exception e) {
                System.err.println(e.getMessage());
                System.err.println("Run with arg -i for help manual");
                return ;
            }
            
        }
    }
