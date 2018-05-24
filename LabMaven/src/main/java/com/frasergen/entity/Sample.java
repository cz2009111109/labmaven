package com.frasergen.entity;

public class Sample {
	private int sampleid;
	private String sampleType; //样品类型
	private String sampleState;//采样前状态
	private int senderid; //寄样人
	private String name;//样本名称
	private String serialnumber;//样本编号
	private String Species; //物种
	private String partname; //部位名称
	private String remark; //备注
	private String extractdescription; // 组织样品提取说明
	private String Nanodrop; // DNA样品Nanodrop浓度
	private String Qubit; //DNA样品Qubit浓度
	private String DNAvolume; //DNA体积
	private String DNAdensity; //DNA浓度
	private String RNAdensity; //RNA浓度
	private String RNAvolume; //RNA体积
	private double RIN; //RNA的RIN值 
	public Sample() {
		super();
	}
	
	public Sample(int sampleid, String sampleType, String sampleState, int senderid, String name, String serialnumber,
			String species, String partname, String remark, String extractdescription, String nanodrop, String qubit,
			String dNAvolume, String dNAdensity, String rNAdensity, String rNAvolume, double rIN) {
		super();
		this.sampleid = sampleid;
		this.sampleType = sampleType;
		this.sampleState = sampleState;
		this.senderid = senderid;
		this.name = name;
		this.serialnumber = serialnumber;
		Species = species;
		this.partname = partname;
		this.remark = remark;
		this.extractdescription = extractdescription;
		Nanodrop = nanodrop;
		Qubit = qubit;
		DNAvolume = dNAvolume;
		DNAdensity = dNAdensity;
		RNAdensity = rNAdensity;
		RNAvolume = rNAvolume;
		RIN = rIN;
	}

	public int getSampleid() {
		return sampleid;
	}
	public void setSampleid(int sampleid) {
		this.sampleid = sampleid;
	}
	public String getSampleType() {
		return sampleType;
	}
	public void setSampleType(String sampleType) {
		this.sampleType = sampleType;
	}
	public String getSampleState() {
		return sampleState;
	}
	public void setSampleState(String sampleState) {
		this.sampleState = sampleState;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSerialnumber() {
		return serialnumber;
	}
	public void setSerialnumber(String serialnumber) {
		this.serialnumber = serialnumber;
	}
	public String getSpecies() {
		return Species;
	}
	public void setSpecies(String species) {
		Species = species;
	}
	public String getPartname() {
		return partname;
	}
	public void setPartname(String partname) {
		this.partname = partname;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getExtractdescription() {
		return extractdescription;
	}
	public void setExtractdescription(String extractdescription) {
		this.extractdescription = extractdescription;
	}
	public String getNanodrop() {
		return Nanodrop;
	}
	public void setNanodrop(String nanodrop) {
		Nanodrop = nanodrop;
	}
	public String getQubit() {
		return Qubit;
	}
	public void setQubit(String qubit) {
		Qubit = qubit;
	}
	public String getDNAvolume() {
		return DNAvolume;
	}
	public void setDNAvolume(String dNAvolume) {
		DNAvolume = dNAvolume;
	}
	public String getDNAdensity() {
		return DNAdensity;
	}
	public void setDNAdensity(String dNAdensity) {
		DNAdensity = dNAdensity;
	}
	public String getRNAdensity() {
		return RNAdensity;
	}
	public void setRNAdensity(String rNAdensity) {
		RNAdensity = rNAdensity;
	}
	public String getRNAvolume() {
		return RNAvolume;
	}
	public void setRNAvolume(String rNAvolume) {
		RNAvolume = rNAvolume;
	}
	public double getRIN() {
		return RIN;
	}
	public void setRIN(double rIN) {
		RIN = rIN;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((DNAdensity == null) ? 0 : DNAdensity.hashCode());
		result = prime * result + ((DNAvolume == null) ? 0 : DNAvolume.hashCode());
		result = prime * result + ((Nanodrop == null) ? 0 : Nanodrop.hashCode());
		result = prime * result + ((Qubit == null) ? 0 : Qubit.hashCode());
		long temp;
		temp = Double.doubleToLongBits(RIN);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((RNAdensity == null) ? 0 : RNAdensity.hashCode());
		result = prime * result + ((RNAvolume == null) ? 0 : RNAvolume.hashCode());
		result = prime * result + ((Species == null) ? 0 : Species.hashCode());
		result = prime * result + ((extractdescription == null) ? 0 : extractdescription.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((partname == null) ? 0 : partname.hashCode());
		result = prime * result + ((remark == null) ? 0 : remark.hashCode());
		result = prime * result + ((sampleState == null) ? 0 : sampleState.hashCode());
		result = prime * result + ((sampleType == null) ? 0 : sampleType.hashCode());
		result = prime * result + sampleid;
		result = prime * result + senderid;
		result = prime * result + ((serialnumber == null) ? 0 : serialnumber.hashCode());
		return result;
	}

	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sample other = (Sample) obj;
		if (DNAdensity == null) {
			if (other.DNAdensity != null)
				return false;
		} else if (!DNAdensity.equals(other.DNAdensity))
			return false;
		if (DNAvolume == null) {
			if (other.DNAvolume != null)
				return false;
		} else if (!DNAvolume.equals(other.DNAvolume))
			return false;
		if (Nanodrop == null) {
			if (other.Nanodrop != null)
				return false;
		} else if (!Nanodrop.equals(other.Nanodrop))
			return false;
		if (Qubit == null) {
			if (other.Qubit != null)
				return false;
		} else if (!Qubit.equals(other.Qubit))
			return false;
		if (Double.doubleToLongBits(RIN) != Double.doubleToLongBits(other.RIN))
			return false;
		if (RNAdensity == null) {
			if (other.RNAdensity != null)
				return false;
		} else if (!RNAdensity.equals(other.RNAdensity))
			return false;
		if (RNAvolume == null) {
			if (other.RNAvolume != null)
				return false;
		} else if (!RNAvolume.equals(other.RNAvolume))
			return false;
		if (Species == null) {
			if (other.Species != null)
				return false;
		} else if (!Species.equals(other.Species))
			return false;
		if (extractdescription == null) {
			if (other.extractdescription != null)
				return false;
		} else if (!extractdescription.equals(other.extractdescription))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (partname == null) {
			if (other.partname != null)
				return false;
		} else if (!partname.equals(other.partname))
			return false;
		if (remark == null) {
			if (other.remark != null)
				return false;
		} else if (!remark.equals(other.remark))
			return false;
		if (sampleState == null) {
			if (other.sampleState != null)
				return false;
		} else if (!sampleState.equals(other.sampleState))
			return false;
		if (sampleType == null) {
			if (other.sampleType != null)
				return false;
		} else if (!sampleType.equals(other.sampleType))
			return false;
		if (sampleid != other.sampleid)
			return false;
		if (senderid != other.senderid)
			return false;
		if (serialnumber == null) {
			if (other.serialnumber != null)
				return false;
		} else if (!serialnumber.equals(other.serialnumber))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Sample [sampleid=" + sampleid + ", sampleType=" + sampleType + ", sampleState=" + sampleState
				+ ", senderid=" + senderid + ", name=" + name + ", serialnumber=" + serialnumber + ", Species="
				+ Species + ", partname=" + partname + ", remark=" + remark + ", extractdescription="
				+ extractdescription + ", Nanodrop=" + Nanodrop + ", Qubit=" + Qubit + ", DNAvolume=" + DNAvolume
				+ ", DNAdensity=" + DNAdensity + ", RNAdensity=" + RNAdensity + ", RNAvolume=" + RNAvolume + ", RIN="
				+ RIN + "]";
	}
	/**
	 * @return the senderid
	 */
	public int getSenderid() {
		return senderid;
	}
	/**
	 * @param senderid the senderid to set
	 */
	public void setSenderid(int senderid) {
		this.senderid = senderid;
	}

}
