import java.lang.*;
public class Start
{
 public static void main(String args[])
 {
 Schedule s1=new Schedule();
 Schedule s2=new Schedule();
 
 s1.setHour(4);
 s1.setMinute(30);
 s2.setHour(5);
 s2.setMinute(40);
 
 Coordinate c1=new Coordinate();
 Coordinate c2=new Coordinate();
 
 c1.setLongitude(121.211);
 c1.setLatitude(622.511);
 c2.setLongitude(311.33);
 c2.setLatitude(426.211);
 
 Airport a1=new Airport();
 Airport a2=new Airport();
 
 a1.setName("Dhaka");
 a1.setLocation(c1);
 
 a2.setName("Chittagong");
 a2.setLocation(c2);
 
 Flight f1 =new Flight();
 
 f1.setFlightId("121-255");
 f1.setCapacity(40);
 f1.setDepartureFrom(a1);
 f1.setDepartureTime(s1);
 f1.setFlyingTo(a2);
 f1.setArrivalTime(s2);
 
 System.out.println("Id: "+f1.getFlightId());
 System.out.println("Capacity: "+f1.getCapacity());
 
 System.out.println("Airport from: " +f1.getDepartureFrom().getName());
 System.out.println("longitude: " +f1.getDepartureFrom().getLocation().getLongitude());
 System.out.println("latitude: " +f1.getDepartureFrom().getLocation().getLatitude());
 System.out.println("Departure time: " +f1.getDepartureTime().getHour()+" hour"+f1.getDepartureTime().getMinute()+" minutes");
 
 System.out.println("Airport To: " +f1.getFlyingTo().getName());
 System.out.println("longitude: " +f1.getFlyingTo().getLocation().getLongitude());
 System.out.println("latitude: " +f1.getFlyingTo().getLocation().getLatitude());
 System.out.println("Arriving time : " +f1.getArrivalTime().getHour()+" hour "+f1.getArrivalTime().getMinute()+"minutes");
 
 } 
 
}