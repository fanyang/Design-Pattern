package designpattern.spring.aop;

import java.util.Random;

public class ForumServiceImpl implements ForumService {

	@Override
	public void removeTopic(int topicId) {

		try {
			Thread.sleep(new Random().nextInt(100));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Remove topic: " + topicId);
		
	}

	
	@Override
	public void removeForum(int forumId) {
		
		try {
			Thread.sleep(new Random().nextInt(100));
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("Remove forum: " + forumId);
		
	}
	
	
}