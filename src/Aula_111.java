import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Aula_111 {

	public static void main(String[] args) {
		LocalDate d04 = LocalDate.parse("2015-04-23");
		System.out.println(d04);
		
		LocalDateTime d05 = LocalDateTime.parse("2015-04-23T01:30:26");
		System.out.println(d05);
		
		Instant d06 = Instant.parse("2015-04-23T01:30:26Z");
		System.out.println(d06);
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());		
		
		System.out.println();
		System.out.println("d04: " + d04.format(fmt1)); // Podemos chamar a formatação tanto a
		System.out.println("d04: " + fmt1.format(d04)); // partir da data, quanto do format
		
		System.out.println();
		System.out.println("d05: " + d05.format(fmt2)); // Podemos chamar a formatação tanto a
		System.out.println("d05: " + fmt2.format(d05)); // partir da data, quanto do format
		
		System.out.println("d06: " + fmt3.format(d06)); // Como o d06 está em uma data Zulu (padrão ISO)
														// é necessário chamar a formatação através do formatter
	}

}
