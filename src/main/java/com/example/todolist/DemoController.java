package com.example.todolist;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller //このクラスがWEBアプリケーションとして操作できるコントローラプログラムとして動作できるようになります。
public class DemoController {
	
	@RequestMapping(value="/",method=RequestMethod.GET) //http://localhost:8080/でアクセスされた場合(GET)
	public ModelAndView index(ModelAndView mav) {	//Modelは戻り値を持たないため、ビューから値が返ってくる場合には、 ModelAndViewを使用します。
		
		mav.setViewName("index");	//resources/index.html
		mav.addObject("msg","お名前を入力してください");
		
		return mav;		
	}
	@RequestMapping(value="/",method=RequestMethod.POST) //htmlからアクセスされた場合(POST)
	public ModelAndView send(
			@RequestParam("text1")String str,
			ModelAndView mav) {
		mav.setViewName("index");
		mav.addObject("msg","こんにちは" + str + "さん！");	//ビューのmsgを書き換える
		mav.addObject("value",str);
		return mav;
	}
}
