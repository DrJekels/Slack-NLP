package slack;

import com.ullink.slack.simpleslackapi.ChannelHistoryModule;
import com.ullink.slack.simpleslackapi.SlackChannel;
import com.ullink.slack.simpleslackapi.SlackSession;
import com.ullink.slack.simpleslackapi.events.SlackMessagePosted;
import com.ullink.slack.simpleslackapi.impl.ChannelHistoryModuleFactory;

import java.util.List;

public class FetchMessages {

    public void fetchMessagesFromChannelHistory(SlackSession session, SlackChannel slackChannel) {

        ChannelHistoryModule channelHistoryModule = ChannelHistoryModuleFactory.createChannelHistoryModule(session);
        List<SlackMessagePosted> messages = ChannelHistoryModule.fetchHistoryOfChannel(slackChannel.getId());

    }

}
