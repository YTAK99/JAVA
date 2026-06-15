import java.util.Calendar;

public class WeekExample {
    enum Week {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    };
    
	public static void main(String[] args) {
		//Week 열거 타입 변수 선언
		Week today = null;
 
		//Calendar 얻기
		Calendar cal = Calendar.getInstance();
		
		//오늘의 요일 얻기(1~7)
		int iweek = cal.get(Calendar.DAY_OF_WEEK);

		//숫자를 열거 상수로 변환해서 변수에 대입
		switch (iweek) {
			case 1: today = Week.SUNDAY; break;
			case 2: today = Week.MONDAY; break;
			case 3: today = Week.TUESDAY; break;
			case 4: today = Week.WEDNESDAY; break;
			case 5: today = Week.THURSDAY; break;
			case 6: today = Week.FRIDAY; break;
			case 7: today = Week.SATURDAY; break;
		}
		
        System.out.println("오늘 요일 : " + today);

		//열거 타입 변수를 사용
		if(today == Week.SUNDAY) {
			System.out.println("오늘은 쉬는 날 입니다.");
		} else {
			System.out.println("오늘은 평일입니다.");
		}
	}
}