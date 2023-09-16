package in.nareshit.raghu.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="emptab")
public class Employee {
	@Id
	private Integer eid;
	private String ename;
	private Double esal;

	@OneToOne
	@JoinColumn(name="pidFk")
	/*@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="pidFk",unique = true)*/
	private Profile epob;
}
