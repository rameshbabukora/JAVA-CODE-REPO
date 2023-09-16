package in.nareshit.raghu.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="stdtab")
public class Student {
	@Id
	private Integer sid;
	private String sname;
	private String addr;

	@ManyToMany
	@JoinTable(name="stdcrstab",
	 joinColumns = @JoinColumn(name="sidFk"),
	 inverseJoinColumns = @JoinColumn(name="cidFk")
	)
	private List<Course> cobs;//HAS-A


}
