package dataStructure;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class OCNode extends Node{
	public OCNode() {
		super();
	}
	
	public OCNode(OCNode oc) {
		this.id=oc.getId();
		this.type=oc.getType();
		this.userList=new ArrayList<String>(oc.getUserList());
		this.edgeList=new ArrayList<OEdge>(oc.getEdgeList());
	}
	
	public OCNode(int id,List<String> userList,List<OEdge> edgeList,int type) {
		super(id,userList,edgeList,type);
	}
	
}
