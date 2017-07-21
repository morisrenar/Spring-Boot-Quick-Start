package io.javabrains.springbootstarter.topic;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * Created by bmshamsnahid on 7/21/17.
 */
@Service
public class TopicService {
	private List<Topic> topics = Arrays.asList(
			new Topic("spring", "Spring Framework", "Spring Framework Description"),
			new Topic("Java", "Core Java", "Core java Description"),
			new Topic("Java Script", "Java Script", "Java Script Description")
	);
	
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
}
