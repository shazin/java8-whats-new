package lk.cms.java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.TemporalAmount;
import java.time.temporal.TemporalUnit;
import java.util.Locale;

/**
 * 
 * @author Shazin
 *
 */
public class DateTimeApi {

	/*
	 * EST - -05:00
HST - -10:00
MST - -07:00
ACT - Australia/Darwin
AET - Australia/Sydney
AGT - America/Argentina/Buenos_Aires
ART - Africa/Cairo
AST - America/Anchorage
BET - America/Sao_Paulo
BST - Asia/Dhaka
CAT - Africa/Harare
CNT - America/St_Johns
CST - America/Chicago
CTT - Asia/Shanghai
EAT - Africa/Addis_Ababa
ECT - Europe/Paris
IET - America/Indiana/Indianapolis
IST - Asia/Kolkata
JST - Asia/Tokyo
MIT - Pacific/Apia
NET - Asia/Yerevan
NST - Pacific/Auckland
PLT - Asia/Karachi
PNT - America/Phoenix
PRT - America/Puerto_Rico
PST - America/Los_Angeles
SST - Pacific/Guadalcanal
VST - Asia/Ho_Chi_Minh
	 */
	
	public static void main(String[] args) {
		LocalDateTime localDateTime = LocalDateTime.now();
		ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime, ZoneId.of("Asia/Karachi"));
		
		System.out.println("LocalDateTime : "+localDateTime);
		System.out.println("ZonedDateTime : "+zonedDateTime);
		
		LocalDateTime localDateCairo = LocalDateTime.now(ZoneId.of("Africa/Cairo"));
		System.out.println("LocalDateTime Cairo : "+localDateCairo);
		
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter
													.ofPattern("yyyy-MM-dd HH:mm:ss");
		
		System.out.println("Formatted Date Time : "+dateTimeFormatter.parse("2015-12-01 12:00:00"));
		
		LocalDate yesterday = LocalDate.now().minusDays(1);
		LocalDate today = LocalDate.now();
		
		System.out.println("Today Greater than yesterday? "+today.isAfter(yesterday));
		System.out.println("Today Less than yesterday? "+today.isBefore(yesterday));
	}
}
