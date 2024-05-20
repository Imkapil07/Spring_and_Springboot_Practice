package in.kp.entity;

import java.io.Serializable;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class AccountPK implements Serializable {

	private Long accNum;
	private String accType;
	
}
