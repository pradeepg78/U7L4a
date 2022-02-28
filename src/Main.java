import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        LogMessage Log1 = new LogMessage("CLIENT3:security alert – repeated login failures");
        LogMessage Log2 = new LogMessage("Webserver:disk offline");
        LogMessage Log3 = new LogMessage("SERVER1:file not found");
        LogMessage Log4 = new LogMessage("SERVER2:read error on disk DSK1");
        LogMessage Log5 = new LogMessage("SERVER1:write error on disk DSK2");
        LogMessage Log6 = new LogMessage("Webserver:error on /dev/disk");

        System.out.println(Log1.getMachineId());
        System.out.println(Log2.getMachineId());
        System.out.println(Log3.getMachineId());
        System.out.println(Log4.getMachineId());
        System.out.println(Log5.getMachineId());
        System.out.println(Log6.getMachineId());

        System.out.println("--------------------------------------------------");

        System.out.println(Log1.getDescription());
        System.out.println(Log2.getDescription());
        System.out.println(Log3.getDescription());
        System.out.println(Log4.getDescription());
        System.out.println(Log5.getDescription());
        System.out.println(Log6.getDescription());

        System.out.println("--------------------------------------------------");

        System.out.println(Log1.containsWord("disk"));
        System.out.println(Log2.containsWord("disk"));
        System.out.println(Log3.containsWord("disk"));
        System.out.println(Log4.containsWord("disk"));
        System.out.println(Log5.containsWord("disk"));
        System.out.println(Log6.containsWord("disk"));

        System.out.println("--------------------------------------------------");


    }
}
