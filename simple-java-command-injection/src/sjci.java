import java.io.*;

public class sjci {

    public static void main(String args[]) {

        String cmd = null;
        
        try { 
            cmd = args[0];
            System.out.println( "Command is: " + cmd );
        } catch ( Exception e ) {
            System.out.println( "Error caught" );
        } finally {
            System.out.println( "Finally.");
            runCmd( cmd );
        }
        
        System.out.println( "End");
    }
    
    private static void runCmd( String cmd ) {
        try {
            Process p = Runtime.getRuntime().exec(cmd);

        }
        catch (Exception e) {
            e.printStackTrace();
            System.exit(-1);
        }
    }
}