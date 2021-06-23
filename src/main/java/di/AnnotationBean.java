package di;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*
@Configuration
	: 해당 클래스를 스프링 설정 파일로 사용하겠다는 선언으로
	XML 설정 파일을 사용하는 대신 Java 파일을 설정파일로
	사용한다.
 */
@Configuration
public class AnnotationBean {

	/*
	@Bean
		: <bean> 태그와 같이 자바빈을 생성할때 선언한다.
		생성된 빈은 컨트롤러에서 getBean()을 통해 주입 받을 수 있다.
		메소드명은 주입 받을떄의 참조변수명으로 사용한다.
		즉, Circle circleBean = new Circle()과 동일하다.
	 */
	@Bean
	public Circle circleBean() {
		
		Point point2 = new Point(7,8);
		Circle circle2 = new Circle();
		circle2.setPoint(point2);
		circle2.setRadian(20);
		
		return circle2;
		
		
	}
	
	
	@Bean
	public Person personBean() {
		Person person2 = new Person();
		person2.setName("성우");
		person2.setAge(10);
		
		ArrayList<String> hobbys = new ArrayList<String>();
		hobbys.add("자전거");
		hobbys.add("드라이브");
		hobbys.add("맛집찾기");
		person2.setHobbys(hobbys);
		
		return person2;
		
		
	}
	
	
	
	
	
}
