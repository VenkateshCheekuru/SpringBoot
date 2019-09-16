package com.tcs.anz.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	
	private List<Topic> topics=new ArrayList(Arrays.asList(
			new Topic("spring","Spring framewok","explantion"),
			new Topic("Java","java framewok","Desciption"),
			new Topic("SQL","SQL framewok","LOL")
			));
	
	public List<Topic> getAllTopics(){
		return topics;
	}
	
	public Topic getTopic(String id) {
		Topic topic=null;
		for(Topic t:topics) {
			if(t!=null) {
				if(t.getId().contains(id)) {
					topic=t;
					break;
				}
			}
		}
	  return topic;
	
	}

	public void addTopic(Topic topic) {
		topics.add(topic);
		
		
	}

	public void updateTopic(String id,Topic topic) {
		for(int i=0;i<topics.size();i++) {
			Topic t=topics.get(i);
			if(t.getId().equals(id)) {
				topics.set(i, topic);
				return;
			}
		}
		
		
	}

	public void deleteTopic(String id) {
		topics.removeIf(t->t.getId().equals(id));
	}
	
	
	

}
