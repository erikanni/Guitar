class Guitar {

	public int strings;
	public String brand;


	public Guitar(int strings, String brand)
	{
		this.strings = strings;
		this.brand = brand;
	}
	public void removeString()
	{
		strings--;
	}
	public void play()
	{
	    System.out.println("Wonderwall");
	}
	public void addString()
	{
		strings++;
	}
	public int getNumStrings()
	{
		return strings;
	}
	public String getBrand()
	{
		return brand;
	}
	public String toString()
	{
		return ("Strings: "+ strings + " Brand: " + brand);
	}
}


class ElectricGuitar extends Guitar {
	public int volume;
	public boolean onOrOff;

	public ElectricGuitar(int strings, String brand, int vol, boolean onoff)
	{

		super(strings, brand);
		volume = vol;
		onOrOff = onoff;
		
	}
	@Override public void play()
	{
	    System.out.println("Back in Black");
	}
	public void setVolume(int newVol)
	{
		volume = newVol;
	}
	public int getVolume()
	{
		return volume;
	}
	public void turnOn()
	{
	    onOrOff = true;
	}
	public void turnOff()
	{
	    onOrOff = false;
	}
	public boolean getOnOrOff()
	{
		return onOrOff;
	}
	@Override public String toString()
	{
		return (super.toString() + " volume: " + volume + ", Is On?: " + onOrOff);
	}
}


public class Testing {
	public static void main(String args[])
	{

		ElectricGuitar strat = new ElectricGuitar(6, "fender", 25, true);
		Guitar martin = new Guitar(6, "martin");
		System.out.println("Guitar (superclass) toString: ");
		System.out.println(martin.toString());
		System.out.println("");
		System.out.println("ElectricGuitar (subclass) toString: ");
		System.out.println(strat.toString());
		System.out.println("");
		System.out.println("Play Guitar: ");
		martin.play();
		System.out.println("");
		System.out.println("Play ElectricGuitar (Overridden method): ");
		strat.play();
		System.out.println("");
		strat.removeString();
		strat.setVolume(75);
		System.out.println("ElectricGuitar toString after removeString and setVolume: ");
		System.out.println(strat.toString());


	}
}
