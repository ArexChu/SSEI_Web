package cn.ecust.ssei.domain.pipe;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import cn.ecust.ssei.domain.pipe.pipedetailmaintain.PipeDetailMaintain;
import cn.ecust.ssei.domain.pipe.pipeonlinemaintain.PipeOnlineMaintain;

@Entity
@Table(name="ssei_pipeMaintain")
public class PipeMaintain {
	
	private long id;//主键
	private String m_ID;//检验的编号
	private String m_Prop;//检验的性质，是年检还是在线,还是安装
	private String m_Start_Date;//检验开始日期
	private String m_End_Date;//检验结束的日期

	private String m_Bas_Prob;//问题记载
	
	private String p_finished;//检验是否完成 1：未完成   2：完成
	
	private PipeBasic pipeBasic;//管道的基本资料
	private PipeDetailMaintain pipeDetailMaintain;//全面检验
	private PipeOnlineMaintain pipeOnlineMaintain;//在线检验

	@Id
	@GeneratedValue
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	/**
	 * @return the p_finished
	 */
	public String getP_finished() {
		return p_finished;
	}

	/**
	 * @param p_finished the p_finished to set
	 */
	public void setP_finished(String p_finished) {
		this.p_finished = p_finished;
	}

	public String getM_ID() {
		return m_ID;
	}

	public void setM_ID(String m_ID) {
		this.m_ID = m_ID;
	}

	public String getM_Prop() {
		return m_Prop;
	}

	public void setM_Prop(String m_Prop) {
		this.m_Prop = m_Prop;
	}

	public String getM_Start_Date() {
		return m_Start_Date;
	}

	public void setM_Start_Date(String m_Start_Date) {
		this.m_Start_Date = m_Start_Date;
	}

	public String getM_End_Date() {
		return m_End_Date;
	}

	public void setM_End_Date(String m_End_Date) {
		this.m_End_Date = m_End_Date;
	}

	

	public String getM_Bas_Prob() {
		return m_Bas_Prob;
	}

	public void setM_Bas_Prob(String m_Bas_Prob) {
		this.m_Bas_Prob = m_Bas_Prob;
	}
	
	@ManyToOne(cascade=CascadeType.MERGE)
	@JoinColumn(name="pipeId")
	public PipeBasic getPipeBasic() {
		return pipeBasic;
	}

	public void setPipeBasic(PipeBasic pipeBasic) {
		this.pipeBasic = pipeBasic;
	}
	
	
	@OneToOne(orphanRemoval=true , cascade=CascadeType.ALL)
    @JoinColumn(name = "detailid")
	public PipeDetailMaintain getPipeDetailMaintain() {
		return pipeDetailMaintain;
	}
	
	public void setPipeDetailMaintain(PipeDetailMaintain pipeDetailMaintain) {
		this.pipeDetailMaintain = pipeDetailMaintain;
	}
	
	@OneToOne(orphanRemoval=true , cascade=CascadeType.ALL)
    @JoinColumn(name = "onlineid")
	public PipeOnlineMaintain getPipeOnlineMaintain() {
		return pipeOnlineMaintain;
	}

	public void setPipeOnlineMaintain(PipeOnlineMaintain pipeOnlineMaintain) {
		this.pipeOnlineMaintain = pipeOnlineMaintain;
	}

}
