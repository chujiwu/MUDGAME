package personalproj.chujiwu.mudapp;

import java.util.HashMap;

public class EventManager {
	HashMap<String, GameEvent> events = new HashMap<String, GameEvent>();
	public boolean load() {
		EventConverter eventConv = new EventConverter();
		eventConv.xml2events(events);
		
		return false;
	}
}
