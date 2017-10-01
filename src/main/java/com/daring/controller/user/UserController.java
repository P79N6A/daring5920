package com.daring.controller.user;

import com.daring.model.user.User;
import com.daring.model.user.UserTemp;
import com.daring.service.UserService;
import com.daring.service.UserTempService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 测试用户
 * @author shenzucai
 * @time 2017.09.23 19:55
 * 使用Controller可以访问jsp页面
 * 使用RestController主要用于json数据格式交互
 */
@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@Autowired
	private UserTempService userTempService;


	@RequestMapping(value = "/get",method = RequestMethod.GET)
	public User getUser(@RequestParam(value = "id",defaultValue = "20170923000001")String id){

		User user = userService.selectByPrimaryKey(id);
		return user;
	}

	@RequestMapping(value = "/gets",method = RequestMethod.GET)
	public List<UserTemp> getUserTemp(String id){

		List<UserTemp> list = userTempService.selectAll();

		return  list;
	}

	@RequestMapping(value = "/getPage",produces = "*/*")
	public String showUser(Model model){

		List<UserTemp> list = userTempService.selectAll();
		model.addAttribute("showUser",list.get(0));
		return "showUser";
	}
}
