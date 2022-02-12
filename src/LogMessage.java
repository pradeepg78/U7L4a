import java.util.ArrayList;
import java.util.Arrays;

public class LogMessage
{
    private String machineId;
    private String description;

    /** Precondition: message is a valid log message. */
    public LogMessage(String message)
    {
        int colon = message.indexOf(":");
        machineId = message.substring(0, colon);
        description = message.substring(colon + 1);
    }

    /** Returns true if the description in this log message properly contains keyword;
     * false otherwise.
     */
    public boolean containsWord(String keyword)
    {
        if (description.equals(keyword)) return true;
        if (description.indexOf(keyword + " ") == 0) return true;
        if (description.indexOf(" " + keyword + " ") != -1) return true;
        if (description.length() > keyword.length())
        {
            if (description.substring(description.length() - keyword.length() - 1).equals(" " + keyword)) return true;
        }

        return false;
    }

    public String getMachineId()
    { return machineId; }

    public String getDescription()
    { return description; }

// There may be instance variables, constructors, and methods that are not shown.
}
