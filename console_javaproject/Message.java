package JavaProject;

import java.io.Serializable;

public class Message implements Serializable {

    private static final long serialVersionUID = 1L;

    private String messageId;
    private String senderId;
    private String receiverId;
    private String subject;
    private String messageContent;
    private String date;

    public Message(String messageId, String senderId,
                   String receiverId, String subject,
                   String messageContent, String date) {

        this.messageId = messageId;
        this.senderId = senderId;
        this.receiverId = receiverId;
        this.subject = subject;
        this.messageContent = messageContent;
        this.date = date;
    }

    public String getMessageId() {
        return messageId;
    }

    public String getSenderId() {
        return senderId;
    }

    public String getReceiverId() {
        return receiverId;
    }

    public String getSubject() {
        return subject;
    }

    public String getMessageContent() {
        return messageContent;
    }

    public String getDate() {
        return date;
    }
}