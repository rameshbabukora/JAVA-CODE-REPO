package in.nareshit.raghu.entity;

import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.MapKeyColumn;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="emptab")
public class Employee {
	@Id
	@Column(name="eid")
	private Integer empId;
	@Column(name="ename")
	private String empName;
	@Column(name="esal")
	private Double empSal;
	
	@ElementCollection
	/*@CollectionTable(
			name="emp_proj_tab", //child table name
			joinColumns = @JoinColumn(name="eid") //Fk column name
			)
	@Column(name="eproj") //element column name*/ 
	private Set<String> empProjs; 
	
	
	@ElementCollection
	/*@CollectionTable(
			name="emp_mod_tab", //child table name
			joinColumns = @JoinColumn(name="eid") //FK column name
			)
	@Column(name="module") //element column name*/
	//@OrderColumn(name="position") //index column name
	private List<String> empModules;
	
	
	
	@ElementCollection
	/*@CollectionTable(name="emp_clients_tab", //child table
		joinColumns = @JoinColumn(name="eid") //Fk column
	)
	@Column(name="client_name") //element column*/
	//@MapKeyColumn(name="client_code") //index column
	private Map<String,String> empClients;
	
}
