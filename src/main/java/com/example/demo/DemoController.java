package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import jakarta.annotation.PostConstruct;

@Controller //このクラスがWEBアプリケーションとして操作できるコントローラプログラムとして動作できるようになります。
public class DemoController {
	
	@Autowired
	UserRepository repos;
	
	@GetMapping("/") //http://localhost:8080/でアクセスされた場合(GET)
	public ModelAndView index(
			@ModelAttribute("formModel")User user,
			ModelAndView mav) {	//Modelは戻り値を持たないため、ビューから値が返ってくる場合には、 ModelAndViewを使用します。
		
		mav.setViewName("index");	//resources/index.html
		Iterable<User> list = repos.findAll();
		mav.addObject("data", list);
		
		return mav;		
	}
	
	@PostMapping("/") //htmlからアクセスされた場合(POST)
	@Transactional(readOnly=false)
	public ModelAndView form(
			@ModelAttribute("formModel1")User user,
			ModelAndView mav) {
		repos.saveAndFlush(user);
		return new ModelAndView("redirect:/");
	}
	
	@PostConstruct
    public void init() {
        //初期データ作成
        User user1 = new User();
        user1.setName("島根　花子");
        repos.saveAndFlush(user1);

        user1 = new User();
        user1.setName("大阪　太郎");
        repos.saveAndFlush(user1);
    }
}
