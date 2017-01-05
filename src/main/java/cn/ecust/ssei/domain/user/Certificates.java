package cn.ecust.ssei.domain.user;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * 证件
 * @author smxiang
 *
 */
@Entity
@Table(name="ssei_certificates")
public class Certificates {
	
	@Id
	@GeneratedValue
	private long id;
	private User user;
	private String name;//证件名称
	private String description;//证件描述
	private String failureData;//失效日期
	private boolean emailStat;//是否发送过邮件
	
	@Id
	@GeneratedValue
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
		
	@ManyToOne
	@JoinColumn(name="userId")
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the failureData
	 */
	public String getFailureData() {
		return failureData;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @param failureData the failureData to set
	 */
	public void setFailureData(String failureData) {
		this.failureData = failureData;
	}

	/**
	 * @return the emailStat
	 */
	public boolean isEmailStat() {
		return emailStat;
	}

	/**
	 * @param emailStat the emailStat to set
	 */
	public void setEmailStat(boolean emailStat) {
		this.emailStat = emailStat;
	}
	
	

}
