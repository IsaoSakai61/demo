package com.example.todolist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController //このクラスがWEBアプリケーションとして操作できるコントローラプログラムとして動作できるようになります。
public class DemoApplication {

	@RequestMapping("/") //http://localhost:8080/でアクセスされた場合
	String Home() {
		return "Hello World";
	}
	 
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
