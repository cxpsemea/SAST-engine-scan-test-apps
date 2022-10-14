import java.util.function.Function;

public class StringProcessor{

private static final Processor<String> processor = new Processor<String>();

public static void main(String[] args) {
   String command = args[0];  
   System.out.println( "input: " + command );
   lambdaExec(command);
}

public static void lambdaExec(String command){
   processor.process(s->exec(s), command);
}

public static String lambdaUnrelated(String command){
   return processor.process(s->s+"not related to anything", command);
}

public static String exec(String command){
    System.out.println( "Exec: " + command );
   try{
      command = processor.process(s->s.trim(), command);
      Runtime.getRuntime().exec(command);
      return "Executed: "+command;
   }catch(Exception e){
       System.out.println( "Exception: " + e );
      return null;
   }
} 
}

