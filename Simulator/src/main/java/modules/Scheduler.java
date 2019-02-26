package modules;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.StringTokenizer;

import events.Event;
import events.VehicleArrive;
import utils.EventType;
import utils.Time;

public class Scheduler {


	//when time is build automatically initializes the start time at zero
	private static Time time = new Time();
	//nella prima implementazione il parking lot sarà solo uno
	private static ParkingLot parkingLot;
	//list of the modules that scheduler has to manage
	private static List<ModuleInterface> modules;

	private static List<Event> events;




	public static void main(String[] args) {
		
		events = new ArrayList<Event>();
		modules = new ArrayList<ModuleInterface>();
		

		/*try {
			parkingLot = readConfigurationFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		readEventFile();
*/
		
		
		VehicleArrive va = new VehicleArrive(50, LocalTime.of(12,10,0,0), LocalTime.of(14,0,0,0));
		va.setEventType(EventType.VEHICLEARRIVE);
		events.add(va);
		ChargingStation cs = new ChargingStation();
		modules.add(cs);


		//ciclo infinito, rimarrà in attesa di scritture di eventi ?? oppure quando finisce il file devo finire il programma??
		for(;;) {


			for (ListIterator<Event> iter = events.listIterator(); iter.hasNext(); ) {

				Event element = iter.next();

				eventManage(element);

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

	/**
	 * Sceglie cosa fare in base al tipo di evento che capita
	 * @param element
	 * se l'evento è:
	 * ARRIVOVEICOLO-->OCCUPA LA PRIMA COLONNINA LIBERA DELLA LISTA 
	 */


	private static void eventManage(Event element) {

		switch(element.getEventType()) {
		case VEHICLEARRIVE:
			/*for(ListIterator<ChargingStation> iter = parkingLot.getChargingPoints().listIterator(); iter.hasNext(); ) {

				ChargingStation cs = iter.next();
				if(!cs.busy) {
					cs.setBusy(true);
				}

			}*/
			
			for (ListIterator<ModuleInterface> iter = modules.listIterator(); iter.hasNext(); ) {

				ModuleInterface mod = iter.next();
				if(mod.getClass().equals(ChargingStation.class)) {
					((ChargingStation)mod).setBusy(true);
				}
			}

			;
		case SUNCHANGES:
			;
		case RESERVATION:
			;
		case CONSUMERARRIVE:
			;
		}

	}




	private static void readEventFile() {
		// TODO Auto-generated method stub

	}



	/*
	 * This method reads from a file all the characteristics of the microcrid  
	 * 
	 */
	private static ParkingLot readConfigurationFile() throws IOException {

		ParkingLot res = new ParkingLot();
		String line;

		BufferedReader br = new BufferedReader(new FileReader("configuration.txt"));

		try {

			line = br.readLine();
			StringTokenizer st = new StringTokenizer(line, "-");

			while (line != null) {
				while(st.hasMoreTokens()) {

				}

				line = br.readLine();
			}

		} finally {
			br.close();
		}

		return res;

	}




	private static void createModule(Event event) {
		// TODO Auto-generated method stub

	}




	private static Event readEvent(long time2) {
		// TODO Auto-generated method stub
		return null;
	}

}


