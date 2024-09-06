package com.example.demo.model;

import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@EqualsAndHashCode
public class User {
	private String id;
	private String name;
	private String email;
	
	public boolean isValid() {
		return name != null && id != null && email != null &&
				name.isBlank() && id.isBlank() && email.isBlank();
	}
	
}
