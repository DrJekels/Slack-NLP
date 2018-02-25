
import NLP.*;
import Slack.*;
import com.ullink.slack.simpleslackapi.impl.SlackSessionFactory;


public class SlackIntegration {

    public static void main(String[] args) {

        System.out.println("Hello Friend!");

        SlackSessionFactory sessionFactory = new SlackSessionFactory().createWebSocketSlackSession();

    }

}
