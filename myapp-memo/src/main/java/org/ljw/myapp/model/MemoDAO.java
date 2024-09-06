package org.ljw.myapp.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class MemoDAO {
	private List<Memo> memos;

	public MemoDAO() {
		super();
		memos = new ArrayList<>();
	}
	
	public MemoDAO(boolean test) {
		this();
		if (test) {
			for(int i = 1; i < 5; i++) {
				memos.add(new Memo(i,
						String.format("메모입니다%s트", i)
						,String.format("%s트내용ㅋㅋㅋ", i)
						,LocalDateTime.now()
						,LocalDateTime.now() ));
			}
		} 
	}
	
	public List<Memo> selectAllMemo() {
		return memos;
	}
	
}
