package in.nareshit.raghu.entity;

import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="usertab")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;
	
	@Column(name="uname")
	private String name;
	
	@Column(name="umail")
	private String email;
	
	@Column(name="upwd")
	private String pwd;
	
	@ElementCollection(fetch = FetchType.EAGER)
	@CollectionTable(
			name="user_roles_tab",
			joinColumns = @JoinColumn(name="uid")
			)
	@Column(name="urole")
	private Set<String> roles;
}
