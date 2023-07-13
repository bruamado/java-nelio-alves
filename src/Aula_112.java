import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Aula_112 {

	public static void main(String[] args) {
		LocalDate d04 = LocalDate.parse("2015-04-23");
		LocalDateTime d05 = LocalDateTime.parse("2015-04-23T01:30:26");
		Instant d06 = Instant.parse("2015-04-23T01:30:26Z");
		
		//	Convertendo uma data global (Z) para data local, usando o instant
		LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
		System.out.println("r1: " + r1);
		LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
		System.out.println("r2: " + r2);
		
		LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
		System.out.println("r3: " + r3);
		LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));
		System.out.println("r4: " + r4);
		
		System.out.println();
		// Retornando um item específico da data
		System.out.println("d04 dia: " + d04.getDayOfMonth());
		System.out.println("d04 mês: " + d04.getMonthValue());
		System.out.println("d04 ano: " + d04.getYear());
		
		System.out.println("d05 hora: " + d05.getHour());
		System.out.println("d05 hora: " + d05.getMinute());
		System.out.println("d05 seconds: " + d05.getSecond());
	}

}
