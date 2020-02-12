@Controller
public class UserController {
	
	// 로그인 페이지로 이동
	@RequestMapping("/user/login.do")
	public String login(){
		logger.info("경로 : login");

		return "user/login";
	}

	// 회원가입 페이지로 이동
	@RequestMapping("/user/inert.do")
	public String inert(){
		logger.info("경로 : inert

		return "user/inert";
	}
}