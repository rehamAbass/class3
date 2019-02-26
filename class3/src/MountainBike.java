public class MountainBike extends Bicycle {
	private double seatHeight;
	
	public void seatHeight(double seatHeight) {
		this.seatHeight = seatHeight;
	}
	public String toString() {
		return String.format("Speed = %d, seat = %f", 
				getSpeed(), seatHeight);
	}
}
