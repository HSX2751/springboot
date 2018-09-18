package com.hsx.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hsx.domain.Author;

@Controller
@RequestMapping
public class ThymeleafController {
	
	//默认情况下使用springboot总能看到一片叶子，这是因为我们没配置自己的ico导致的，解决方法也很简单，只需要在src/main/static/目录下放置一张名为favicon.ico就可以了

	@GetMapping("/index")
	public ModelAndView index() {
		ModelAndView view = new ModelAndView();
		//设置跳转的视图，默认映射到src/main/resources/templates/{viewName}.html
		view.setViewName("index");
		//设置属性
		view.addObject("title","我的第一个web页面");
		view.addObject("desc", "欢迎进入我的系统");
		Author author = new Author();
		author.setAge(24);
		author.setEmail("1784707225@qq.com");
		author.setName("heshunxing");
		view.addObject("author", author);
		return view;
	}
	
	@GetMapping("/index1")
	public String index1(HttpServletRequest request) {
		//TODO与上面的写法不同，但是结果一致
		//设置属性
		request.setAttribute("title", "我的第二个页面");
		request.setAttribute("desc", "欢迎进入到我的第二个系统");
		Author author = new Author();
		author.setAge(23);
		author.setEmail("2533951191@qq.com");
		author.setName("heshunxing");
		request.setAttribute("author",author);
		//返回的index默认映射到src/main/resources/templates/xxxx.html
		return "index";
	}
}
