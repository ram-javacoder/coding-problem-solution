package trainingPart2Qs;

import java.util.ArrayList;
import java.util.List;

interface Subscriber {

	void update(String videoTitle);

}

class User implements Subscriber {

	private String name;

	User(String name) {

		this.name = name;
	}

	@Override
	public void update(String videoTitle) {

		System.out.println(name + " received notification : New video uploaded - " + videoTitle);

	}

}

interface YoutubeChannel {

	void subscribe(Subscriber subscriber);

	void unscbscribe(Subscriber subscriber);

	void notifySubscribers(String videoTitle);

}

class Channel implements YoutubeChannel {

	private List<Subscriber> subscribers = new ArrayList<>();

	private String channelName;

	public Channel(String channelName) {

		this.channelName = channelName;
	}

	@Override
	public void subscribe(Subscriber subscriber) {

		subscribers.add(subscriber);

	}

	@Override
	public void unscbscribe(Subscriber subscriber) {
		subscribers.remove(subscriber);

	}

	@Override
	public void notifySubscribers(String videoTitle) {
		System.out.println("Notification " + channelName + " uploaded a new video : " + videoTitle);
		for (Subscriber subscriber : subscribers) {
			subscriber.update(videoTitle);

		}

	}
	
	public void uploadVideo(String videoTitle) {
		
		notifySubscribers(videoTitle);
	}

}

public class YoutubeNotificationSystem {

	public static void main(String[] args) {

		Channel channel = new Channel("TechWorld");
		
		Subscriber user1 =  new User("Alice");
		Subscriber user2 = new User("Bob");
		Subscriber user3 =new User("Charlie");
		
		channel.subscribe(user1);
		channel.subscribe(user2);
		channel.subscribe(user3);

		channel.uploadVideo("Design pattern in Java");
	}
}
