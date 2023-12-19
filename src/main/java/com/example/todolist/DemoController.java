package com.example.todolist;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //このクラスがWEBアプリケーションとして操作できるコントローラプログラムとして動作できるようになります。
public class DemoController {
	
	@RequestMapping("/") //http://localhost:8080/でアクセスされた場合
	String Home() {
		return "Hello World2";
	}
}
