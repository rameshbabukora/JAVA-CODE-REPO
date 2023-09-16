package in.nareshit.raghu.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class Student {

	private String id;
	@NonNull
	private String name;
	@NonNull
	private Double fee;
	
}
