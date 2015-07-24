package org.apriori;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apriori.Apriori.ItemSet;
import org.json.JSONObject;

import dataStructure.OUser;


public class ReadTxt {	
	public static void readFile(List<Set<String>> trans) {
		String pathname = "/Users/victor/Desktop/marketdata.txt";
		try { // 防止文件建立或读取失败，用catch捕捉错误并打印，也可以throw  
            /* 读入TXT文件 */   
            File filename = new File(pathname); // 要读取以上路径的input。txt文件  
            InputStreamReader reader = new InputStreamReader(  
                    new FileInputStream(filename)); // 建立一个输入流对象reader  
            BufferedReader br = new BufferedReader(reader); // 建立一个对象，它把文件内容转成计算机能读懂的语言  
            String line = "";  
            line = br.readLine();  
            while (line != null) { 
            	String newline=line;
            	String params[]=newline.split(",");
            	params[params.length-1]=params[params.length-1].split("\\.")[0];
            	trans.add(new ItemSet(params));
                line = br.readLine(); // 一次读入一行数据  
            }    
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
		return;
	}	
	
	public static JSONObject readFile3() {
//		String pathname = "C:\\Users\\付\\Desktop\\fulldataset.js"; // 绝对路径或相对路径都可以，这里是绝对路径
		String pathname = "/Users/victor/Downloads/fulldataset.js";
		try { // 防止文件建立或读取失败，用catch捕捉错误并打印，也可以throw  
			  
            /* 读入TXT文件 */   
            File filename = new File(pathname); // 要读取以上路径的input。txt文件  
            InputStreamReader reader = new InputStreamReader(  
                    new FileInputStream(filename)); // 建立一个输入流对象reader  
            BufferedReader br = new BufferedReader(reader); // 建立一个对象，它把文件内容转成计算机能读懂的语言  
            String line = "";  
            line = br.readLine();  
            String newline="";
            while (line != null) {  
            	newline+=line;
                line = br.readLine(); // 一次读入一行数据  
            }    
            JSONObject jsonobj = new JSONObject(newline); 
            //JSONArray nodeArray=jsonobj.getJSONArray("nodes");//节点的所有内容都在这了
            return jsonobj;
            //System.out.println(_dataarray.toString());
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
		return null;
	}	
	
	
	
	public static void writeFile3(List<OUser> globalOUserList) {//这部分暂时用不到，先保留在这
		/* 写入Txt文件 */  
        File writename = new File("/Users/victor/Desktop/marketdata.txt"); // 相对路径，如果没有则要建立一个新的output。txt文件  
        try {
			writename.createNewFile();
			BufferedWriter out = new BufferedWriter(new FileWriter(writename)); 
			for(int i=0;i<globalOUserList.size();i++) {
		    	OUser ou=globalOUserList.get(i);
		    	for(int j=0;j<ou.getRefONodeList().size();j++) {
		    		if(j==(ou.getRefONodeList().size()-1)) out.write(ou.getRefONodeList().get(j)+"\r");
		    		else out.write(ou.getRefONodeList().get(j)+",");
		    	}
//		    	out.write("\r");
		    }
	        out.flush(); // 把缓存区内容压入文件  
	        out.close(); // 最后记得关闭文件
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // 创建新文件  
        
	}
	
}
