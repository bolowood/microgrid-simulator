package events;

import java.time.LocalTime;

public class VehicleArrive extends Event {
	
	private float stateOfCharge;
	private LocalTime arrival;
	private LocalTime departure;
	
	public VehicleArrive(float SoC, LocalTime arrival, LocalTime departure) {
		this.stateOfCharge=SoC;
		this.arrival=arrival;
		this.departure=departure;
	}
	
	public float getStateOfCharge() {
		return stateOfCharge;
	}
	public void setStateOfCharge(float stateOfCharge) {
		this.stateOfCharge = stateOfCharge;
	}
	public LocalTime getArrival() {
		return arrival;
	}
	public void setArrival(LocalTime arrival) {
		this.arrival = arrival;
	}
	public LocalTime getDeparture() {
		return departure;
	}
	public void setDeparture(LocalTime departure) {
		this.departure = departure;
	}
	
	
	
	

}
