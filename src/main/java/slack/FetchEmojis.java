package slack;

import com.ullink.slack.simpleslackapi.SlackChannel;
import com.ullink.slack.simpleslackapi.SlackMessageHandle;
import com.ullink.slack.simpleslackapi.SlackSession;
import com.ullink.slack.simpleslackapi.replies.EmojiSlackReply;

import java.util.Map;

public class FetchEmojis {

    public void fetchListOfEmoji(SlackChannel slackChannel, SlackSession session) {

        SlackMessageHandle<EmojiSlackReply> handle = session.listEmoji();
        Map<String, String> emojis = handle.getReply().getEmojis();

        for(String emojiName : emojis.keySet()) {
            String emojiUrl = emojis.get(emojiName);
        }

    }

}
