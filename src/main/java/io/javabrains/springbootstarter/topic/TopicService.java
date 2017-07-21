package io.javabrains.springbootstarter.topic;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by bmshamsnahid on 7/21/17.
 */
@Service
public class TopicService {
	private List<Topic> topics = new ArrayList<Topic>(Arrays.asList(
			new Topic("spring", "Spring Framework", "Spring Framework Description"),
			new Topic("Java", "Core Java", "Core java Description"),
			new Topic("Java Script", "Java Script", "Java Script Description")
	));
	
	public List<Topic> getAllTopics() {
		return topics;
	}
	
	public Topic getTopic(String id) {
		for(Topic tp: topics) {
			if(tp.getId().equals(id) == true) {
				return tp;
			}
		}
		return null;
	}
	
	public void addTopic(Topic topic) {
		if(topic != null) {
			System.out.println("New Topic id: " + topic.getId());
			System.out.println("New Topic name: " + topic.getName());
			System.out.println("New Topic description: " + topic.getDescription());
		} else {
			System.out.println("New Topic is null");
		}
		topics.add(topic);
	}
}
