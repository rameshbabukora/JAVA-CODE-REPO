package in.nareshit.raghu.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Data
@Entity
@Table(name="quote_tab")
public class Quote {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="quote_id")
	private Integer id;
	
	@Column(name="quote_code")
	private String code;
	
	@Column(name="quote_cost")
	private Double cost;
	
	@Column(name="quote_tx_dte")
	@Temporal(TemporalType.DATE)
	private Date txDate;
}
