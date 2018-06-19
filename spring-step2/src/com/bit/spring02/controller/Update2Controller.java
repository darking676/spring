package com.bit.spring02.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractCommandController;

import com.bit.spring02.model.GuestDao1;
import com.bit.spring02.model.entity.GuestVo;

public class Update2Controller extends AbstractCommandController {
// commandClass 필요 => servlet.xml
	
	public Update2Controller() {
		System.out.println("Update2Controller run ...");
	}
	
//	@Override
//	protected void onBindAndValidate(HttpServletRequest req,
//			Object command, BindException errors) throws Exception {
//		System.out.println(command);
//		System.out.println("err 개수: "+errors.getErrorCount());
//		String param1 = req.getParameter("name");
//		String param2 = req.getParameter("pay");
//		GuestVo bean = (GuestVo) command;
		
//		if(!param1.equals(bean.getName())){
//			ObjectError error = new ObjectError("errName", "이름을 확인하시오.");
//			errors.addError(error);
//		}
//		
//		if(bean.getPay()==0 && !param2.equals("0")) {
//			ObjectError error = new ObjectError("errPay", "금액을 확인하시오.");
//			errors.addError(error);
//		}
//		System.out.println("onBindAndValidate run ...");
//	}
	
	@Override
	protected ModelAndView handle(HttpServletRequest req,
			HttpServletResponse resp, Object command, BindException errors)
			throws Exception {
		GuestVo bean = (GuestVo) command;
		String viewName = "redirect:/edit.bit?idx="+bean.getSabun();
		
		ModelAndView mav = new ModelAndView();
		
		/* ERRORS */
//		System.out.println("============================================================================");
//		System.out.println("err 개수: "+errors.getErrorCount());
//		
//		System.out.println("err 메시지: "+errors.getMessage());
		
//		List errList = errors.getAllErrors();
//		for(int i=0;i<errList.size();i++){
//			System.out.println(errList.get(i));
//		}
//		System.out.println("============================================================================");
		
		if(errors.getErrorCount()>0){
			mav.addObject("bean", bean);
			mav.addObject("errMsg", "입력내용을 확인하시오.");
			mav.setViewName("edit");
//			errors;
			return mav;
		}
		
//		System.out.println(command);
		
		GuestDao1 dao = new GuestDao1();
		int result = dao.updateOne(bean);
		if(result>0) {viewName="redirect:/detail.bit?idx="+bean.getSabun();}
		mav.setViewName(viewName);
//		mav.setViewName("redirect:/detail.bit?idx="+req.getParameter("sabun"));
		return mav;
	}

}
