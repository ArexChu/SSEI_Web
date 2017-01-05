package cn.ecust.ssei.domain.user;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import cn.ecust.ssei.domain.Privilege;

/**
 * 岗位
 * 
 * @author tyg
 * 
 */
@Entity
@Table(name = "ssei_role")
public class Role {
	private Long id;
	private String name;
	private String description;
	private int companyType;//权限的企业类型 1:'使用', 2:'制造',3:'检验
	private Set<User> users = new HashSet<User>();
	private Set<Privilege> privileges = new HashSet<Privilege>();
	
	@Id
	@GeneratedValue
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	

	@OneToMany(mappedBy="role" ,orphanRemoval=true ,cascade=CascadeType.MERGE)
	public Set<User> getUsers() {
		return users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}


	public String getName() {
		return name;
	}

	

	/**
	 * @return the companyType
	 */
	public int getCompanyType() {
		return companyType;
	}

	/**
	 * @param companyType the companyType to set
	 */
	public void setCompanyType(int companyType) {
		this.companyType = companyType;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	@ManyToMany(fetch=FetchType.EAGER,cascade=CascadeType.MERGE)
	@JoinTable(name="role_privileges",
				joinColumns={@JoinColumn(name="roleId")},
				inverseJoinColumns={@JoinColumn(name="privilegeId")}
				
			)
	public Set<Privilege> getPrivileges() {
		return privileges;
	}

	public void setPrivileges(Set<Privilege> privileges) {
		this.privileges = privileges;
	}

}
