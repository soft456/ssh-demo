/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.sneb.struts.action;

import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.sneb.bean.Account;
import com.sneb.business.AccountBusiness;
import com.sneb.struts.form.AccountForm;

/**
 * MyEclipse Struts Creation date: 11-27-2016
 * 
 * XDoclet definition:
 * 
 * @struts.action validate="true"
 * @struts.action-forward name="show" path="/index.jsp"
 */
public class AccountAction extends Action {

	private AccountBusiness accountBusiness;

	/*
	 * Generated Methods
	 */

	public AccountBusiness getAccountBusiness() {
		return accountBusiness;
	}

	public void setAccountBusiness(AccountBusiness accountBusiness) {
		this.accountBusiness = accountBusiness;
	}

	/**
	 * Method execute
	 * 
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return ActionForward
	 * @throws UnsupportedEncodingException
	 */
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub

		AccountForm aform = (AccountForm) form;
		aform.setRemoteIp(request.getRemoteAddr());	
		
		if ("list".endsWith(aform.getOperateType())) {
			return list(mapping, form, request, response);
		} else if ("add".endsWith(aform.getOperateType())) {
			return add(mapping, form, request, response);
		}
		if ("addPost".endsWith(aform.getOperateType())) {
			return addPost(mapping, form, request, response);
		}
		if ("update".endsWith(aform.getOperateType())) {
			return update(mapping, form, request, response);
		}
		if ("updatePost".endsWith(aform.getOperateType())) {
			return updatePost(mapping, form, request, response);
		}
		if ("detail".endsWith(aform.getOperateType())) {
			return detail(mapping, form, request, response);
		}
		if ("delete".endsWith(aform.getOperateType())) {
			return delete(mapping, form, request, response);
		} else {
			return null;
		}

	}

	/**
	 * 列表页
	 * 
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return ActionForward
	 */
	public ActionForward list(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {

		List<Account> list = accountBusiness.findAll();
		AccountForm aform = (AccountForm) form;
		aform.setListAccount(list);
		request.setAttribute("data", aform);

		return mapping.findForward("show");
	}

	/**
	 * 显示添加表单
	 * 
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return ActionForward
	 */
	public ActionForward add(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		return mapping.findForward("add");
	}

	/**
	 * 添加处理
	 * 
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return ActionForward
	 */
	public ActionForward addPost(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {

		AccountForm aform = (AccountForm) form;
		accountBusiness.add(aform);
		return list(mapping, form, request, response);
	}

	/**
	 * 显示修改表单
	 * 
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return ActionForward
	 */
	public ActionForward update(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {

		AccountForm aform = (AccountForm) form;
		aform = accountBusiness.findByIdOfForm(aform);
		request.setAttribute("data", aform);

		return mapping.findForward("update");
	}

	/**
	 * 修改表单提交
	 * 
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return ActionForward
	 */
	public ActionForward updatePost(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {

		AccountForm aform = (AccountForm) form;
		accountBusiness.update(aform);

		return list(mapping, form, request, response);
	}

	/**
	 * 显示详细信息
	 * 
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return ActionForward
	 */
	public ActionForward detail(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {

		AccountForm aform = (AccountForm) form;
		aform = accountBusiness.findByIdOfForm(aform);
		request.setAttribute("data", aform);

		return mapping.findForward("detail");
	}

	/**
	 * 删除
	 * 
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return ActionForward
	 */
	public ActionForward delete(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {

		AccountForm aform = (AccountForm) form;
		String userId = aform.getUserId();
		Account a = accountBusiness.findById(userId);
		accountBusiness.delete(a);
		return list(mapping, form, request, response);
	}

}