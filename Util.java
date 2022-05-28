package test;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Util {

	public static String getCurrentDate() {
		LocalDate now = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
		String formatedNow = now.format(formatter);
		
		return formatedNow;
	}
}
// 로그인 후 글 작성해도 작성자 익명., list할땐작성자 비어있음. 123도 마찬가지.