package com.frasergen.entity;

public class SampleProject {
	private int sampleProjectid;
	private int sampleid;
	private int projectid;
	public SampleProject() {
		super();
	}
	public SampleProject(int sampleProjectid, int sampleid, int projectid) {
		super();
		this.sampleProjectid = sampleProjectid;
		this.sampleid = sampleid;
		this.projectid = projectid;
	}
	public int getSampleProjectid() {
		return sampleProjectid;
	}
	public void setSampleProjectid(int sampleProjectid) {
		this.sampleProjectid = sampleProjectid;
	}
	public int getSampleid() {
		return sampleid;
	}
	public void setSampleid(int sampleid) {
		this.sampleid = sampleid;
	}
	public int getProjectid() {
		return projectid;
	}
	public void setProjectid(int projectid) {
		this.projectid = projectid;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + projectid;
		result = prime * result + sampleProjectid;
		result = prime * result + sampleid;
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
		SampleProject other = (SampleProject) obj;
		if (projectid != other.projectid)
			return false;
		if (sampleProjectid != other.sampleProjectid)
			return false;
		if (sampleid != other.sampleid)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "SampleProject [sampleProjectid=" + sampleProjectid + ", sampleid=" + sampleid + ", projectid="
				+ projectid + "]";
	}
	
}
