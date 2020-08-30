package shop.carrental.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import lombok.Setter;
import lombok.extern.log4j.Log4j;
import shop.carrental.mapper.UserMapper;

@Controller
@RequestMapping("/users/*")
@Log4j
public class UserController {

	@Setter(onMethod_ = @Autowired)
	private UserMapper userMapper;

	@RequestMapping("")
	public void basic() {
		log.info("정상 접근 성공");
	}

	@RequestMapping("/getAdmin")
	public String getAdmin() {
		log.info("getAdmin 접근");
		log.info("UserVO 정보: " + userMapper.getAdmin());
		return "getAdmin";
	}

}