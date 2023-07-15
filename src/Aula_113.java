import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Aula_113 {

	public static void main(String[] args) {
		LocalDate d04 = LocalDate.parse("2015-04-23");
		LocalDateTime d05 = LocalDateTime.parse("2015-04-23T01:30:26");
		Instant d06 = Instant.parse("2015-04-23T01:30:26Z");
		
		System.out.println("d05 original: " + d05);
		
		LocalDateTime pastWeekLocalDate = d05.minusWeeks(1);
		LocalDateTime nextWeekLocalDate = d05.plusWeeks(1);
		System.out.println("pastWeekLocalDate: " + pastWeekLocalDate);
		System.out.println("nextWeekLocalDate: " + nextWeekLocalDate);
		
		Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
		Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);
		System.out.println("pastWeekInstant: " + pastWeekInstant);
		System.out.println("nextWeekInstant: " + nextWeekInstant);
		
		Duration t2 = Duration.between(pastWeekLocalDate, d04.atTime(0, 0));
		Duration t1 = Duration.between(pastWeekLocalDate, d05);
		System.out.println("t1 dias = " + t1.toDays());
	}

}
