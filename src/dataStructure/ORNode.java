package dataStructure;

import java.util.ArrayList;
import java.util.List;

public class ORNode extends Node {
	public ORNode() {
		super();
	}
	
	public ORNode(ORNode or) {
		this.id=or.getId();
		this.type=or.getType();
		this.userList=new ArrayList<String>(or.getUserList());
		this.edgeList=new ArrayList<OEdge>(or.getEdgeList());
	}
	
	public ORNode(int id,List<String> userList,List<OEdge> edgeList,int type) {
		super(id,userList,edgeList,type);
	}
}
