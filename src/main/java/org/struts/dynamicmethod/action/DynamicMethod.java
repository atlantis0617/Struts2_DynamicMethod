package org.struts.dynamicmethod.action;

import com.opensymphony.xwork2.ActionSupport;

public class DynamicMethod extends ActionSupport{

	private static final long serialVersionUID = -1859454742628480930L;
	
	public String add() {
        
        return "add";
         
    }
 
    public String modify() {
         
        return "modify";
         
    }
 
    public String delete() {
         
        return "delete";
     
    }

}
