import java.util.Date;
import java.text.SimpleDateFormat;

public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        return String.format("Hello, %s. Lovely to see you.", name);
    }


public String dateAnnouncement() {
    Date now = new Date();
    SimpleDateFormat formatter = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy");
    return "It is currently " + formatter.format(now);
}
    public String respondBeforeAlexis(String conversation) {
        if (conversation.indexOf("Alexis") != -1) {
            return "Right away, sir. She certainly isn't sophisticated enough for that.";
        }
        if (conversation.indexOf("Alfred") != -1) {
            return "At your service. As you wish, naturally.";
        }
        return "Right. And with that I shall retire.";
    }
    
	// NINJA BONUS
	// See the specs to overload the guestGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
}
