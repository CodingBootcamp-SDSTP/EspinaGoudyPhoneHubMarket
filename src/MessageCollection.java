import java.util.ArrayList;

public class MessageCollection
{
	ArrayList<Message> messages;

	public MessageCollection() {
		messages = new ArrayList<Message>();
	}

	public void addMessage(Message message) {
		messages.add(message);
	}

	public void removeMessage(Message message) {
		messages.remove(message);
	}

	public ArrayList<Message> getAllMessages() {
		return(messages);
	}

	public Message getMessageByIndex(int n ) {
		return(messages.get(n));
	}

	public int getMessageCount() {
		return(messages.size());
	}
}
