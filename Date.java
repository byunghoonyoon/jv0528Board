package test;
import java.text.SimpleDateFormat;

public class Date {
		SimpleDateFormat format1 = new SimpleDateFormat("yyyy.MM.dd");
		int Year;
		int Month;
		int Day;
		public Date(int Data1,int Data2,int Data3){
			Year = Data1;
			Month = Data2;
			Day = Data3;
		}
		public int getYear() {
			return Year;
		}
		public void setYear(int year) {
			Year = year;
		}
		public int getMonth() {
			return Month;
		}
		public void setMonth(int month) {
			Month = month;
		}
		public int getDay() {
			return Day;
		}
		public void setDay(int day) {
			Day = day;
		}

	}
