package slack;

import com.ullink.slack.simpleslackapi.*;
import com.ullink.slack.simpleslackapi.replies.SlackChannelReply;

import java.sql.PreparedStatement;

public class SendingMessages {

    public void sendMessageToChannel(SlackSession session) {

        SlackChannel channel = session.findChannelById("achannel");
        session.sendMessage(channel, "Hello World!");

    }

    public void sendDirectMessageToUser(SlackSession session) {

        SlackUser user = session.findUserByUserName("auser");
        session.sendMessageToUser(user, "This is place holder", null);

    }

    public void sendUsingPreparedMessage(SlackSession session) {

        SlackChannel channel = session.findChannelByName("achannel");

        SlackPreparedMessage preparedMessage = new SlackPreparedMessage.Builder()
                .withMessage("Hey this is prepared message")
                .withUnfurl(false)
                .addAttachment(new SlackAttachment())
                .addAttachment(new SlackAttachment())
                .build();

        session.sendMessage(channel, preparedMessage);

    }

}
