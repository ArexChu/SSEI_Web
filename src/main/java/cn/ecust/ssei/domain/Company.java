package cn.ecust.ssei.domain;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import cn.ecust.ssei.domain.pipe.PipeBasic;
import cn.ecust.ssei.domain.pipe.pipeinstall.PipeInstall;
import cn.ecust.ssei.domain.user.User;
import cn.ecust.ssei.domain.vessel.VesselBasic;


/**
 * 公司
 * @author smxiang
 *
 */
@Entity
@Table(name="ssei_company")
public class Company implements java.io.Serializable{
	
	public  Company(){
		super();
	}
	
	public Company(long id,String name){
		super();
		this.id =id;
		this.name=name;
	}
	
	private long id;//主键
	private Set<User> users;
	private Set<PipeBasic> pipeBasics;
	private Set<PipeInstall> pi_Cons_Com;
	private Set<PipeInstall> pi_Ins_Com;
	private Set<VesselBasic> v_Use_Com;
	private Set<VesselBasic> v_De_Com;
	private Set<VesselBasic> v_Man_Com;
	private Set<VesselBasic> v_Install_Com;
	
	
	
	private String name;//公司名称
	private String address;//公司地址
	private String department;//公司负责特种设备的部门
	private String poscode;//邮编
	private String contacts;//联系人
	private String contactsPhone;//联系人电话
	private String code;//组织机构代码
	private int type;//公司类型 1:'使用', 2:'制造',3:'检验
	
	
	/**
	 * @return the pi_Cons_Com
	 */
	@OneToMany(mappedBy="pi_Cons_Com", orphanRemoval=true , cascade=CascadeType.MERGE)
	public Set<PipeInstall> getPi_Cons_Com() {
		return pi_Cons_Com;
	}
	/**
	 * @param pi_Cons_Com the pi_Cons_Com to set
	 */
	public void setPi_Cons_Com(Set<PipeInstall> pi_Cons_Com) {
		this.pi_Cons_Com = pi_Cons_Com;
	}
	/**
	 * @return the pi_Ins_Com
	 */
	@OneToMany(mappedBy="pi_Ins_Com", orphanRemoval=true , cascade=CascadeType.MERGE)
	public Set<PipeInstall> getPi_Ins_Com() {
		return pi_Ins_Com;
	}
	/**
	 * @param pi_Ins_Com the pi_Ins_Com to set
	 */
	public void setPi_Ins_Com(Set<PipeInstall> pi_Ins_Com) {
		this.pi_Ins_Com = pi_Ins_Com;
	}
	/**
	 * @return the pipeBasics
	 */
	@OneToMany(mappedBy="company", orphanRemoval=true , cascade=CascadeType.MERGE)
	public Set<PipeBasic> getPipeBasics() {
		return pipeBasics;
	}
	/**
	 * @param pipeBasics the pipeBasics to set
	 */
	public void setPipeBasics(Set<PipeBasic> pipeBasics) {
		this.pipeBasics = pipeBasics;
	}
	/**
	 * @return the id
	 */
	@Id
	@GeneratedValue
	public long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}
	/**
	 * @return the users
	 */
	@OneToMany(mappedBy="company",orphanRemoval=true, cascade=CascadeType.MERGE)
	public Set<User> getUsers() {
		return users;
	}
	/**
	 * @param users the users to set
	 */
	public void setUsers(Set<User> users) {
		this.users = users;
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
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return the department
	 */
	public String getDepartment() {
		return department;
	}
	/**
	 * @param department the department to set
	 */
	public void setDepartment(String department) {
		this.department = department;
	}
	/**
	 * @return the poscode
	 */
	public String getPoscode() {
		return poscode;
	}
	/**
	 * @param poscode the poscode to set
	 */
	public void setPoscode(String poscode) {
		this.poscode = poscode;
	}
	/**
	 * @return the contacts
	 */
	public String getContacts() {
		return contacts;
	}
	/**
	 * @param contacts the contacts to set
	 */
	public void setContacts(String contacts) {
		this.contacts = contacts;
	}
	/**
	 * @return the contactsPhone
	 */
	public String getContactsPhone() {
		return contactsPhone;
	}
	/**
	 * @param contactsPhone the contactsPhone to set
	 */
	public void setContactsPhone(String contactsPhone) {
		this.contactsPhone = contactsPhone;
	}
	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}
	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}
	/**
	 * @return the type
	 */
	public int getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(int type) {
		this.type = type;
	}
	/**
	 * @return the v_Use_Com
	 */
	@OneToMany(mappedBy="v_Use_Com", orphanRemoval=true , cascade=CascadeType.MERGE)
	public Set<VesselBasic> getV_Use_Com() {
		return v_Use_Com;
	}
	/**
	 * @param v_Use_Com the v_Use_Com to set
	 */
	public void setV_Use_Com(Set<VesselBasic> v_Use_Com) {
		this.v_Use_Com = v_Use_Com;
	}
	/**
	 * @return the v_De_Com
	 */
	@OneToMany(mappedBy="v_De_Com", orphanRemoval=true , cascade=CascadeType.MERGE)
	public Set<VesselBasic> getV_De_Com() {
		return v_De_Com;
	}
	/**
	 * @param v_De_Com the v_De_Com to set
	 */
	public void setV_De_Com(Set<VesselBasic> v_De_Com) {
		this.v_De_Com = v_De_Com;
	}
	/**
	 * @return the v_Man_Com
	 */
	@OneToMany(mappedBy="v_Man_Com", orphanRemoval=true , cascade=CascadeType.MERGE)
	public Set<VesselBasic> getV_Man_Com() {
		return v_Man_Com;
	}
	/**
	 * @param v_Man_Com the v_Man_Com to set
	 */
	public void setV_Man_Com(Set<VesselBasic> v_Man_Com) {
		this.v_Man_Com = v_Man_Com;
	}
	/**
	 * @return the v_Install_Com
	 */
	@OneToMany(mappedBy="v_Install_Com", orphanRemoval=true , cascade=CascadeType.MERGE)
	public Set<VesselBasic> getV_Install_Com() {
		return v_Install_Com;
	}
	/**
	 * @param v_Install_Com the v_Install_Com to set
	 */
	public void setV_Install_Com(Set<VesselBasic> v_Install_Com) {
		this.v_Install_Com = v_Install_Com;
	}
	
	
	
	
	
	
}
