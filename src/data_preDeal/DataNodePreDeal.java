package data_preDeal;

import java.util.ArrayList;
import java.util.List;

import org.json.*;


import dataStructure.Node;
import dataStructure.OCNode;
import dataStructure.ORNode;
import dataStructure.OUser;


/**
 * @author victor
 *
 */
public class DataNodePreDeal {
    List<Node> globalONodeList;
    List<OUser> globalOUserList;
    int occount;
    int orcount;
    /**
     * @param globalOcNode
     * @param globalOrNode
     * @param globalOvNode
     * @param globalOUser
     */
    public DataNodePreDeal(List<Node> globalONodeList,List<OUser> globalOUserList) {
        this.globalONodeList=globalONodeList;
        this.globalOUserList=globalOUserList;
        occount=0;
        orcount=67;
    }

    public void dealNode(JSONArray jaNodes) {
        for(int i=0;i<jaNodes.length();i++) {
            JSONObject nodeJsObj=jaNodes.getJSONObject(i);
            String nodeType=nodeJsObj.getString("type");
            if(nodeType.equals("value")) continue;
            Integer nodeRef=nodeJsObj.getInt("ref");
            String nodeUserList=nodeJsObj.getString("users");
            String nodeName=nodeJsObj.getString("name");
            
            if(nodeType.equals("class")||nodeType.equals("builtInClass")) {//class节点
                Node ocn=new OCNode();
                ocn.setId(occount);
                occount++;
                ocn.setType(0);//在整个系统中的id号
                List<String> ulist=convertToUList(ocn,0,nodeUserList);//用户列表
                ocn.setUserList(ulist);
                globalONodeList.add(ocn);
            }else if(nodeType.equals("relation")) {//relation节点
                ORNode orn=new ORNode();
                orn.setId(orcount);
                orcount++;
                orn.setType(1);
                List<String> ulist=convertToUList(orn,1,nodeUserList);//用户列表
                orn.setUserList(ulist);
                globalONodeList.add(orn);
            }
        }
    }

    List<String> convertToUList(Node nd,Integer type,String uStr) {//uStr是一个String类型的串
    	uStr=uStr.trim();
        List<String> userList=new ArrayList<String>();
        String[] ulist=uStr.split(" ");
        for(int i=0;i<ulist.length;i++) {
        	userList.add(ulist[i]);
        	int u=-1;
        	for(u=0;u<globalOUserList.size();u++) {
        		OUser ou=globalOUserList.get(u);
        		if(ou.getUname().equals(ulist[i])) break;
        	}
        	if(u==globalOUserList.size()) {//不包含当前用户时
        		OUser ou=new OUser();
        		ou.setUname(ulist[i]);
        		ou.setUid(globalOUserList.size());
//        		if(type==0) ou.getRefONodeList().add(nd.getId());
//        		else if(type==1) ou.getRefOrNodeList().add(nd.getId());
        		ou.getRefONodeList().add(nd.getId());
        		globalOUserList.add(ou);
        	}else {//在当前用户在该集合中
        		for(u=0;u<globalOUserList.size();u++) {
        			OUser ou=globalOUserList.get(u);
        			if(ou.getUname().equals(ulist[i])) {//如果两者相等的话
//        				if(type==0) ou.getRefOcNodeList().add(nd.getId());
//                		else if(type==1) ou.getRefOrNodeList().add(nd.getId());
        				ou.getRefONodeList().add(nd.getId());
        				break;
        			}
        		}
        	}
        }
        return userList;
    }

    
    
}
