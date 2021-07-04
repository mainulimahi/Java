import java.lang.*;

public class Airport
{
	
	protected String name;
	protected Coordinate location[];
	
	
	
	public void setName(String name)
	{
		this.name=name;
	}
	public void setLocation(Coordinate location)
	{
		this.location=location;
	}
	
	public String getName()
	{
		return name;
	}
	public String getLocation()
	{
		return location;
	}
	
	
}