package com.millinder.foosball;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * <pre>
 {
     "response_type": "in_channel",
     "text": "It's 80 degrees right now.",
     "attachments": [
             {
         "text":"Partly cloudy today and tomorrow"
         }
     ]
 }
 * </pre>
 */
public class SlackResponse {
    private String response_type = "in_channel";
    private String text;
    private List<SlackAttachment> attachments = new ArrayList<>(3);

    public String getResponse_type() {
        return response_type;
    }

    public void setResponse_type(String response_type) {
        this.response_type = response_type;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<SlackAttachment> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<SlackAttachment> attachments) {
        this.attachments = attachments;
    }
}
