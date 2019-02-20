package modules;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import events.Event;
import utils.Time;

public class Scheduler {


	//when time is build automatically initializes the start time at zero
	private static Time time = new Time();

	private static List<ParkingLot> parkingLots;
	//list of the modules that scheduler has to manage
	private static List<ModuleInterface> modules;

	private static List<Event> events;




	public static void main(String[] args) {

		readConfigurationFile();

		readEventFile();

		modules = new ArrayList<ModuleInterface>();


		//ciclo infinito, rimarrà in attesa di scritture di eventi ?? oppure quando finisce il file devo finire il programma??
		for(;;) {

//			while((event = readEvent(time.getTime()))!=null) {
//
//				createModule(event);
//
//			}

			for (ListIterator<Event> iter = events.listIterator(); iter.hasNext(); ) {

				Event element = iter.next();
				
				//doThings(event);

				//controllare l'esito di manage e le eccezioni --> fare eccezioni ad hoc??
				
				}

				// 1 - can call methods of element
				// 2 - can use iter.remove() to remove the current element from the list
				// 3 - can use iter.add(...) to insert a new element into the list
				//     between element and iter->next()
				// 4 - can use iter.set(...) to replace the current element

				// ...

			for (ListIterator<ModuleInterface> iter = modules.listIterator(); iter.hasNext(); ) {

				ModuleInterface element = iter.next();

				//controllare l'esito di manage e le eccezioni --> fare eccezioni ad hoc??
				element.manage();

				if(element.controlIfRemove()) {
					iter.remove();
				}

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

			//terminate tutte le operazioni eseguo lo step temporale. 
			time.step();

		}//for(;;)

}




	private static void readEventFile() {
		// TODO Auto-generated method stub

	}




	private static void readConfigurationFile() {
		// TODO Auto-generated method stub

	}




	private static void createModule(Event event) {
		// TODO Auto-generated method stub

	}




	private static Event readEvent(long time2) {
		// TODO Auto-generated method stub
		return null;
	}

}


