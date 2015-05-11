Exported from https://code.google.com/p/meetup-java-client/
Original author is Sean Sullivan.

```java
import meetup.ClientSettings;
import meetup.Event;
import meetup.EventSearchCriteria;
import meetup.MeetupClient;

public class Example
{
    public static void main(String[] args)
    {
        ClientSettings settings = new ClientSettings();
        settings.setMeetupKey("foo");

        MeetupClient c = new MeetupClient();
        c.setClientSettings(settings);

        EventSearchCriteria criteria = new EventSearchCriteria();
        criteria.setZipCode("97201");
        criteria.setRadiusInMiles(2);

        List<Event> events = c.getEvents(criteria);

        for (Event e : events) 
        {
           System.out.println(e.getName());
        }
    }
}
```
