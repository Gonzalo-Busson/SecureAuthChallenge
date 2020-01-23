import backEnd.APITest;
import frontEnd.Notifications;
import frontEnd.Offers;
import frontEnd.Search;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses({
        Search.class,
        Notifications.class,
        Offers.class,
})

public class  TestSuite {
}