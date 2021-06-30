package review;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import common.MemberDTO;

/*
유효성 검증을 위한 클래스 정의를 위해 Validator 인터페이스를 구현한다.
차후 support(), validate() 두개의 메소드를 오버라이딩 한다.
 */
public class MemberValidator implements Validator{

	/*
	support()
		: 매개변수로 전달된 객체가 유효성 검증을 지원할 수 있는
		커맨드 객체인지 판단한다. 만약 해당 메소드를 통과하지 못하면
		유효성 검증을 위한 validate() 메소드는 아예 호출되지 않는다.
		support()메소드는 자동으로 호출된다.
	 */
	@Override
	public boolean supports(Class<?> clazz) {
		//유효성 검증을 지원할 수 있는 커맨드 객체인지 판단
		return MemberDTO.class.isAssignableFrom(clazz);
	}
	
	
	/*
	ValidateController에서 객체 생성했던 코드 참조하기
	
	MemberValidator validator = new MemberValidator();
	validator.validate(memberDTO, result);
	 */
	@Override
	public void validate(Object obj, Errors errors) {

		// 커맨드 객체는 Object로 반환됨 => 사용하기 위해 형변환 필요
		MemberDTO memberDTO = (MemberDTO)obj;
		
		// 검증1 : 단순 if문을 사용하는 방식(아이디 검증)
		String member_id = memberDTO.getId();
		if(member_id==null || member_id.trim().isEmpty()) {
			System.out.println("아이디가 null입니다.");
			// 검증에 실패한 경우 해당 메소드를 통해 검증 결과 반환
			errors.rejectValue("id", "idError");
			
		}
		
		// 검증2 : 내장메소드를 통한 검증(패스워드검증)
		/*
		유효성 검증을 위해 전달되는 객체는 커맨드 객체가 아니라면
		validate()메소드 내로 진입자체가 불가능하다.
		해당 함수에서 "pw"라는 문장은 getter()를 호출하여 저장된
		패스워드를 얻어온다고 생각하면 된다.
		 */
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "pw", "pwError");
		
		// 검증3 : 사용자 정의 메소드를 통해 검증(이름 검증)
		boolean nameValidate = myEmptyOrWhitespace(memberDTO.getName());
		
		if(nameValidate==false) {
			System.out.println("이름이 null입니다.");
			errors.rejectValue("name", "nameError");
		}
		
		
	}
	
	
	// 사용자 정의 메소드 : 값이 null이거나 길이가 0일때 false반환
	public boolean myEmptyOrWhitespace(String value) {
		if(value==null || value.trim().length()==0) {
			return false;
		}else {
			return true;
		}
	}
	
}

















