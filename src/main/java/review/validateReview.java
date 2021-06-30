package review;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import common.MemberDTO;
import common.MemberValidator;

//@Controller
public class validateReview {

	
	
	/*home에서 해당 링크를 누르면 컨트롤러로 들어옴
	RequestMapping으로 해당 매핑을 찾아서
	view 페이지로 이동시켜준다.
	*/
	//@RequestMapping("/validate/memberRegist.do")
	public String memberRegist() {
		return "03Validate/memberRegist";
		
	}
	
	/*
	회원 가입 폼에서 [회원가입하기] 버튼을 누르면
	해당 매핑으로 들어온다.
	이때 MemberDTO 커맨드 객체로 파라미터를 받아온다.
	ModelAttribute를 통해 이름을 mInfo로 변경하고
	추후 변경한 이름으로 사용한다.
	 */
	//@RequestMapping("/validate/registProc.do")
	public String registProc(
			@ModelAttribute("mInfo") MemberDTO memberDTO,
			BindingResult result,
			Model model	) {
		/*
		첫번째 파라미터(@ModelAttribute("mInfo") MemberDTO memberDTO)
			: 폼 값을 커맨드 객체를 통해 한번에 받은 후
			어노테이션으로 모델 객체에 저장시 mInfo로 이름을 변경한다.
		두번째 파라미터(BindingResult result)
			: BindingResult 객체는 validator를 통해 폼값을 검증 한 후
			해당 결과를 전송 받을 객체이다.
			폼 값에 문제가 있다면 해당 객체를 통해 확인할 수 있다.
		세번째 파라미터(Model model)
			: 데이터를 저장할 Model 객체
		 */
		
		// 폼 값 검증을 완료했을때 이동할 페이지의 경로
		String viewPage = "03Validate/membetDone";
		
		/*
		유효성 검증을 위해 정의한 클래스의 객체를 생성한 후 전송된
		폼값을 저장한 커맨드 객체를 통해 폼값의 유효성 체크를 실시한다.
		매개변수로 유효성 체크를 할 커맨드 객체와 바인딩 결과(검증결과)를
		저장할 객체를 인자로 전달한다.
		 */
		MemberValidator validator = new MemberValidator();
		validator.validate(memberDTO, result);
		
		
		// return값은 ture 거나 errors 이다.
		// 유효성 검증에 실패했다면
		if(result.hasErrors()) {
			System.out.println("유효성 체크 실패 : " + result.toString());
			
			// Model 객체에 에러메세지 저장 후
			model.addAttribute("formError","폼 값 유효성 체크에 실패하였습니다.");
			
			// 가입페이지로 다시 돌아간다.
			viewPage = "03Validate/memberRegist";
		}
		
		return viewPage;
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
}
