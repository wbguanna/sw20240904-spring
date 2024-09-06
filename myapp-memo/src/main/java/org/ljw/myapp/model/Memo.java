package org.ljw.myapp.model;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
// 세개 차이는 알겠는데 생략해도 되는 경우가 뭐였더라?
//@RequiredArgsConstructor
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Memo {
	
	/**
CREATE TABLE MEMO(
 	ID INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
 	TITLE VARCHAR(50) NOT NULL,
 	CONTENT VARCHAR(50),
 	CREATED_TIME TIMESTAMP WITH TIME ZONE,
 	UPDATED_TIME TIMESTAMP WITH TIME ZONE
 )
	 */
	
	private int id;
	private String title;
	private String content;
	private LocalDateTime createdTime;
	private LocalDateTime updatedTime;
	private User user;
}
