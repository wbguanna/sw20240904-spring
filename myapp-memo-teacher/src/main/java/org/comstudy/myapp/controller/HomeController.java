package org.comstudy.myapp.controller;

import java.util.ArrayList;
import java.util.List;

import org.comstudy.myapp.model.Memo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	private static List<Memo> memoList = new ArrayList<Memo>();
	static {
		for (int i=1; i<=20; i++) {
			memoList.add(new Memo(100+i,String.format("메모연슴%d", i), String.format("내용%d", i)));
		}
	}
	
	@GetMapping("/home")
	public String home(Model model) {
		Memo memo1 = new Memo(101, "메모연슴", "내용");
		Memo memo2 = Memo.builder().id(102).title("메모연습2트").content("내용222222").build(); // 체인방식의 객체생성
		System.out.println(memo1);
		System.out.println(memo2);
		
		model.addAttribute("memo1", memo1);
		model.addAttribute("memo2", memo2);
		
		//바인딩
		model.addAttribute("memo", memoList);
		return "home";
	}
	@GetMapping("/test")
	public String test(Model model) {
		Memo memo2 = Memo.builder().id(102).title("메모연습2트").content("내용222222").build(); // 체인방식의 객체생성
		System.out.println(memo2);
		
		model.addAttribute("memo2", memo2);
		
		//바인딩
//		model.addAttribute("memo", memoList);
		return "home";
	}
	@GetMapping("/memos")
	public String memos(Model model) {
		Memo memo2 = Memo.builder().id(102).title("메모연습2트").content("내용222222").build(); // 체인방식의 객체생성
		System.out.println(memo2);
		
		//바인딩
		model.addAttribute("memos", memoList);
		return "memos";
	}
}
