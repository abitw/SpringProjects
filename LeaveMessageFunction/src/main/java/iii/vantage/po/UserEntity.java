package iii.vantage.po;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import lombok.Data;

//lombok.Data講解 >> https://kucw.github.io/blog/2020/3/java-lombok/

@Entity
@Table(name="VANTAGE_USER")
@Data
public class UserEntity implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="USER_UID")
	private Long userUid;
	
	@Column(name="NAME")
	@NotNull
	private String name;
	
	@Column(name = "MOBILE_PHONE")
	@NotNull
	private String mobilePhone;
	
	@Column(name = "EMAIL")
	@Pattern(regexp = "^\\w{1,63}@[a-zA-Z0-9]{2,63}\\.[a-zA-Z]{2,63}(\\.[a-zA-Z]{2,63})?$")
	@NotNull
	private String email;
	
	@Column(name = "PASSWORD")
	@NotNull
	private String password;
	
}
