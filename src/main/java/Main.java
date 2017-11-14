import com.ullink.slack.simpleslackapi.impl.SlackSessionFactory;
import edu.stanford.nlp.*;
import com.ullink.slack.simpleslackapi.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

import NLP.*;
import Slack.*;

public class Main {

    public static void main(String[] args) throws IOException {

        SlackAPI api_key = new SlackAPI();

        SlackSession session = SlackSessionFactory.createWebSocketSlackSession(api_key.getApi_key());
        session.connect();
        session.findChannelByName("general");

    }

}
