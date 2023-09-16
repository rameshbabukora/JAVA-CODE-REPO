package in.nareshit.raghu.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="coursetab")
public class Course {
	@Id
	private Integer cid;
	private String cname;
	private Double camount;
	
}
