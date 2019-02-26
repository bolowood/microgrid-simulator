package events;

import utils.EventType;

public class Event {
	
	private EventType eventType;
	
	public EventType getEventType() {
		return eventType;
	}
	
	public void setEventType(EventType type) {
		this.eventType=type;
	}
	
}
