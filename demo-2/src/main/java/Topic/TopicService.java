package Topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	private List<Topic> topics=new ArrayList<>(Arrays.asList(
			new Topic("1","spring","spring framework"),
			new Topic("2","wordpress","cns framework"),
			new Topic("3","angular","web framework")
			));
	public List<Topic> getAllTopics() {
		return topics;
	}
	public Topic getTopic(String id) {
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}
	public void addTopic(Topic topic) {
		topics.add(topic);
	}
	public void updateTopic(Topic topic, String id) {
		for(int i=0;i<topics.size();i++) {
			Topic t=topics.get(i);
			if(t.getClass().equals(id)) {
				topics.set(i,topic);return;
			}
		}
		
	}
	public void deleteTopic(String id) {
		topics.removeIf(t -> t.getId().equals(id));
	}
}
