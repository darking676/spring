package com.bit.spring02.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.bit.spring02.model.GuestDao1;

public class DeleteController extends AbstractController {

	public DeleteController() {
		System.out.println("DeleteController run ...");
	}
	
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest req,
			HttpServletResponse resp) throws Exception {
		GuestDao1 dao = new GuestDao1();
		String idx = req.getParameter("idx");
		ModelAndView mav = new ModelAndView("redirect:/detail.bit?idx="+idx);
		if(dao.deleteOne(Integer.parseInt(idx))>0) {
			mav = new ModelAndView("redirect:/list.bit");
		}
		return mav;
	}

}
