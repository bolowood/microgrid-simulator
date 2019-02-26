package modules;

import java.util.List;

public class ParkingLot {
	
	ParkingLot(){
	}
	
	public float getStorage() {
		return storage;
	}
	public void setStorage(float storage) {
		this.storage = storage;
	}
	public List<ChargingStation> getChargingPoints() {
		return chargingPoints;
	}
	public void setChargingPoints(List<ChargingStation> chargingPoints) {
		this.chargingPoints = chargingPoints;
	}

	private float storage;
	private List<ChargingStation> chargingPoints;
	
	
	
	

}
