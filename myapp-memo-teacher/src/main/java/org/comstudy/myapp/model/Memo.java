package org.comstudy.myapp.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
//import lombok.Getter;
//import lombok.Setter;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
//@Getter
//@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class Memo {
	private int id;
	private String title;
	private String content;
}
