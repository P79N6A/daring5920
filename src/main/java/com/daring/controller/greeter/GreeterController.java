package com.daring.controller.greeter;

import com.daring.model.greeter.Greeter;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.concurrent.atomic.AtomicLong;

/**
 * 欢迎控制器
 * @author shenzucai
 * @time 2017.09.23 13:20
 */
@RestController
public class GreeterController {
	private static final String template = "Hello, %s!";
	/**
	 * 可以记录被访问的次数
	 */
	private final AtomicLong counter = new AtomicLong();

	@RequestMapping("/greeting")
	/**
	 * 默认get方式
	 * @author shenzucai
	 * @time 2017.09.23 13:42
	 * @param name
	 * @return true
	 */
	public Greeter greeting(@RequestParam(value="name", defaultValue="World",required = false) String name, HttpServletRequest request) {
		Greeter greeter = new Greeter();
		greeter.setId(String.valueOf(counter.incrementAndGet()));
		greeter.setName(String.format(template,null==name?request.getRemoteUser():name));
		return greeter;

	}
}
