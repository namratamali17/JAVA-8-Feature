import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTimeFeature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate cuuerntDate=LocalDate.now();
		System.out.println("current date "+cuuerntDate);
		
		LocalTime currentTime=LocalTime.now();
		System.out.println("current time is"+currentTime);
        
		LocalDateTime dateTime=LocalDateTime.now();
		System.out.println("current date and time"+dateTime);
		
		
	}

}
