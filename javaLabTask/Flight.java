import java.lang.*;

public class Flight
{
	
	protected String flightId;
	protected int capacity;
	protected Airport departureFrom[];
	protected Schedule departureTime[];
	protected Airport flyingTo[];
	protected Schedule arrivalTime[];
	
	
	
	public void setFlightId(String flightId)
	{
		this.flightId=flightId;
	}
	public void setCapacity(String capacity)
	{
		this.capacity=capacity;
	}
	public void setDepartureFrom(Airport departureFrom)
	{
		this.departureFrom=departureFrom;
	}
	public void setDepartureTime(Schedule departureTime)
	{
		this.departureTime=departureTime;
	}
	
	public void setFlyingTo(Airport flyingTo)
	{
		this.flyingTo=flyingTo;
	}
	public void setArraivalTime(Schedule arrivalTime)
	{
		this.arrivalTime=arrivalTime;
	}
	
	
	public String getFlightId()
	{
		return flightId;
	}
	public int getCapacity()
	{
		return capacity;
	}
	public Airport getDepartureFrom()
	{
		return departureFrom;
	}
	public Schedule getDepartureTime()
	{
		return departureTime;
	}
	public Airport getflyingTo()
	{
		return flyingTo;
	}
	public Schedule getArraivalTime()
	{
		return arrivalTime;
	}
}