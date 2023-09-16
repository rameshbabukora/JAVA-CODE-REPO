package in.nareshit.raghu.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="emp_tabs")
public class Employee {
	@Id
	@Column(name="eid")
	private Integer eid;
	
	@Column(name="ename")
	private String ename;
	
	@Column(name="esal")
	private Double esal;
	
	@Column(name="eimg")
	@Lob
	private byte[] eimg;
	
	@Column(name="edesc")
	@Lob
	private char[] edesc;
}
