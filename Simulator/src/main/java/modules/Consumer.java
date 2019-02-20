package modules;

public class Consumer implements ModuleInterface {
	
	private float chargeProfile;

	public float getChargeProfile() {
		return chargeProfile;
	}

	public void setChargeProfile(float chargeProfile) {
		this.chargeProfile = chargeProfile;
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
