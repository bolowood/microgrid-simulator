package modules;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import utils.Event;
import utils.Time;

public class Scheduler {
	
	
	//when time is build automatically initializes the start time at zero
	private static Time time = new Time();
	
	//list of the modules that scheduler has to manage
	private static List<ModuleInterface> modules;
	
	
	public static void main(String[] args) {
		
		Event event;
		modules = new ArrayList<ModuleInterface>();
		
		while((event = readEvent(time.getTime()))!=null) {
			
			createModule(event);
			
		}
		
		for (ListIterator<ModuleInterface> iter = modules.listIterator(); iter.hasNext(); ) {
			
		    ModuleInterface element = iter.next();
		    element.manage();
		    iter.remove();
		    // 1 - can call methods of element
		    // 2 - can use iter.remove() to remove the current element from the list
		    // 3 - can use iter.add(...) to insert a new element into the list
		    //     between element and iter->next()
		    // 4 - can use iter.set(...) to replace the current element

		    // ...
		}
		
//		while(!modules.isEmpty()) {
//			
//		}
		
	}




	private static void createModule(Event event) {
		// TODO Auto-generated method stub
		
	}




	private static Event readEvent(long time2) {
		// TODO Auto-generated method stub
		return null;
	}
	
}


