package com.intuitive.main;

import com.agile.api.APIException;
import com.agile.api.IAgileSession;
import com.agile.api.IDataObject;
import com.agile.api.INode;
import com.agile.px.ActionResult;
import com.agile.px.ICustomAction;

public class UpdateCodeMain implements ICustomAction {

	public ActionResult doAction(IAgileSession sess, INode arg1, IDataObject arg2) {
		
		String currentUser = null;
		try {
			currentUser = sess.getCurrentUser().getName();
		} catch (APIException e) {
			e.printStackTrace();
		}
		
		return new ActionResult(ActionResult.STRING, "Current Logged In user is ==>"+currentUser);
	}

	
	
}
