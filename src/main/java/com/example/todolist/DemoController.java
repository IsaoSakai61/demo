package com.example.todolist;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller //このクラスがWEBアプリケーションとして操作できるコントローラプログラムとして動作できるようになります。
public class DemoController {
	
	@RequestMapping("/") //http://localhost:8080/でアクセスされた場合
	String Home() {
		return "index";		//resources/index.html
	}
}
