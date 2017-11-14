package Slack;

import com.ullink.slack.simpleslackapi.*;
import com.ullink.slack.simpleslackapi.impl.SlackSessionFactory;

public class ChannelID {

    private SlackChannel channelName;
    private SlackChannel channelID;
    private SlackAPI api_key = new SlackAPI();
    private SlackSession session = SlackSessionFactory.createWebSocketSlackSession(api_key.getApi_key());

    private void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    private void setChannelID() { this.channelID = session.findChannelByName(this.channelName); }

    private SlackChannel getChannelName() {
        return this.channelName;
    }

    public SlackChannel getChannelID() { return this.channelID; }

}
