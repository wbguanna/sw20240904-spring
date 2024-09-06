package org.ljw.myapp.controller;

import java.util.List;

import org.ljw.myapp.model.Memo;
import org.ljw.myapp.model.MemoDAO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;

@Controller
public class MemoController {

	private MemoDAO memoDao = new MemoDAO(true);
	
	@GetMapping("/memos")
	public String memos(Model model) {
		List<Memo> memos = memoDao.selectAllMemo();
		model.addAttribute("memos", memos);
		return "memo-list";
	}
	
//	@GetMapping("/memos/details/{id}")
//	public String singleMemo(@PathVariable(required = true) int id, Model model) {
//		model.add
//		
//		return "memo-detail";
//	}
	
	
	
}
