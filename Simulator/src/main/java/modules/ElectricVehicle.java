package modules;

public class ElectricVehicle implements ModuleInterface {
	
	private float capacity;
	private float stateOfCharge;
	private float maxPout;
	private float maxPin;

	public float getCapacity() {
		return capacity;
	}

	public void setCapacity(float capacity) {
		this.capacity = capacity;
	}

	public float getStateOfCharge() {
		return stateOfCharge;
	}

	public void setStateOfCharge(float stateOfCharge) {
		this.stateOfCharge = stateOfCharge;
	}

	public float getMaxPout() {
		return maxPout;
	}

	public void setMaxPout(float maxPout) {
		this.maxPout = maxPout;
	}

	public float getMaxPin() {
		return maxPin;
	}

	public void setMaxPin(float maxPin) {
		this.maxPin = maxPin;
	}

	@Override
	public boolean manage() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean controlIfRemove() {
		// TODO Auto-generated method stub
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
