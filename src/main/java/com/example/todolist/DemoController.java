package com.example.todolist;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller //このクラスがWEBアプリケーションとして操作できるコントローラプログラムとして動作できるようになります。
public class DemoController {
	
	@RequestMapping("/{num}") //http://localhost:8080/numでアクセスされた場合
	public String index(@PathVariable int num, Model model) {	//ModelはWebページで使用するデータを管理するクラスです。
		int sum = 0;
		for(int i=0; i<=num; i++) {
			sum += i;
		}
		model.addAttribute("msg","sum=" + sum);//ビュー側で第一引数で指定した名前でデータを取り出します。
		return "index";		//resources/index.html
	}
}
