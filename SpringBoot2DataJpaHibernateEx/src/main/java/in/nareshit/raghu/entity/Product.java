package in.nareshit.raghu.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;


@Data
@Entity
@Table(name="product")
public class Product {
	@Id
	@Column(name="pid")
	private Integer pid;
	@Column(name="pname")
	private String pname;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="exdte")
	private Date expDate; //Date and Time
	
	@Temporal(TemporalType.DATE)
	@Column(name="crdte")
	private Date createdDate; //Date
	
	@Temporal(TemporalType.TIME)
	@Column(name="pckdte")
	private Date packingTime;//time
}
