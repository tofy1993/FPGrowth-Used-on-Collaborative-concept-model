package dataStructure;

import java.util.ArrayList;
import java.util.List;

public class OUser {
	String uname;
	Integer uid;
	List<Integer> refONodeList;
	List<OEdge> recommendOEdgeList;
	
	public OUser() {
		uname="";
		uid=-1;
		refONodeList=new ArrayList<Integer>();
		recommendOEdgeList=new ArrayList<OEdge>();
	}
	
	
	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public List<Integer> getRefONodeList() {
		return refONodeList;
	}

	public void setRefONodeList(List<Integer> refONodeList) {
		this.refONodeList = refONodeList;
	}

	public List<OEdge> getRecommendOEdgeList() {
		return recommendOEdgeList;
	}

	public void setRecommendOEdgeList(List<OEdge> recommendOEdgeList) {
		this.recommendOEdgeList = recommendOEdgeList;
	}
	
}
