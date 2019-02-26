package modules;

public class ChargingStation implements ModuleInterface {
	
	boolean busy;
	
	//quando l'oggetto viene creato la colonnina è settata a free
	public ChargingStation() {
		this.busy=false;
	}

	public boolean isBusy() {
		return busy;
	}

	public void setBusy(boolean busy) {
		this.busy = busy;
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

}
