package dataStructure;

import java.util.ArrayList;
import java.util.List;

public abstract class Node {
	Integer id;//node id
	List<String> userList;//user list
	List<OEdge> edgeList;//所有与当前节点相连的边
	int type;
	
	public Node() {
		this.id=-1;
		this.userList=new ArrayList<String>();
		this.edgeList=new ArrayList<OEdge>();
		this.type=-1;
	}
	
	public Node(Node nd) {
		this.id=nd.getId();
		this.userList=new ArrayList<String>(nd.getUserList());
		this.edgeList=new ArrayList<OEdge>(nd.getEdgeList());
		this.type=nd.getType();
	}
	
	public Node(int id,List<String> userList,List<OEdge> edgeList,int type) {
		this.id=id;
		this.userList=userList;
		this.edgeList=edgeList;
		this.type=type;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public List<String> getUserList() {
		return userList;
	}
	public void setUserList(List<String> userList) {
		this.userList = userList;
	}

	public List<OEdge> getEdgeList() {
		return edgeList;
	}

	public void setEdgeList(List<OEdge> edgeList) {
		this.edgeList = edgeList;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}
	
	
}
