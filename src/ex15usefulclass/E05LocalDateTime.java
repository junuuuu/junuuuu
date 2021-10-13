package ex15usefulclass;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class E05LocalDateTime
{

	public static void main(String[] args)
	{
		LocalDate localDate = LocalDate.now();
		System.out.println("오늘날짜:"+ localDate);
		
		LocalTime localTime = LocalTime.now();
		System.out.println("현재시간:"+ localTime);
		
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println("지금 이 순간:"+ localDateTime);
		
		DateTimeFormatter format1 = DateTimeFormatter.ofPattern("yyyy년/MM월/dd일");
		DateTimeFormatter format2 = DateTimeFormatter.ofPattern("HH시 mm분 ss초");
		DateTimeFormatter format3 = DateTimeFormatter.ofPattern("오늘은 yyyy년의 w주차, D번째날");
		DateTimeFormatter format4 = DateTimeFormatter.ofPattern("오늘은 M월의 W번째주, d번째날, F번째 E요일");
		
		System.out.println("서식1:"+ localDate.format(format1));
		System.out.println("서식2:"+ localDate.format(format2));
		System.out.println("서식3:"+ localDate.format(format3));
		System.out.println("서식4:"+ localDate.format(format4));
		
		System.out.println("현재년:"+ localDate.getYear());
		System.out.println("현재월:"+ localDate.getMonthValue());
		System.out.println("현재일:"+ localDate.getDayOfMonth());
		System.out.println("현재요일:"+ localDate.getDayOfWeek());
		
		
		LocalDate xMas = LocalDate.of(localDate.getYear(),12,25);
		System.out.println("올해 크리스마스까지...");
		
		Period period = Period.between(localDate, xMas);
		System.out.println(period.getMonths() + "개월"
				+period.getDays()+ "일 남음");
		
		
		System.out.println(ChronoUnit.MONTHS.between(localDateTime, xMas)+ "개월 남음");
		System.out.println(ChronoUnit.DAYS.between(localDateTime, xMas)+ "일 남음");
		
		
		System.out.println("어제 :" + localDateTime.minusDays(1));
		System.out.println("내일 :" + localDateTime.plusDays(1));
		
	}

}
