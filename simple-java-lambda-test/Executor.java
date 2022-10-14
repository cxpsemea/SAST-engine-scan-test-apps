import java.lang.Runtime;
import java.util.function.Function;

public class Executor {

    private static final Processor<String> processor = new Processor<String>();


    public static void main(String[] args) {
        String command = args[0];  
        if(args[0].length() < 5){  
            exec1(command);
        } else {           
            exec2(command);
        }
    }

    private static void exec1(String command){
        command = process(s->s.toUpperCase(),command);
        exec(command);
    }
    
    //There is no taint propagation through this method
    private static void exec2(String command){
        command = process(s->"Taint stops here.",command);
        exec(command);
    }  

    public static String process(Function<String, String> fun, String command){
       return processor.process(fun, command);
    }  

    private static void exec(String command){
       command = process(s->s.trim(),command);
       try{
           System.out.println( "Running command: " + command );
          Runtime.getRuntime().exec(command);
       }
       catch(Exception e){}
    }
}

