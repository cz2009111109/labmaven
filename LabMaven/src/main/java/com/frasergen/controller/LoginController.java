package com.frasergen.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.frasergen.entity.Share;
import com.frasergen.entity.User;
import com.frasergen.service.imp.RoleServiceImp;
import com.frasergen.service.imp.UserServiceImp;

@Controller
public class LoginController {

		@Autowired
		UserServiceImp userService;
		
		@Autowired
		RoleServiceImp roleServiceImp;
		
		@Autowired
		private AuthenticationManager myAuthenticationManager;
		
		@ResponseBody
		@RequestMapping(value="/login")
		public Share loginPage(@RequestParam(defaultValue="") String name,@RequestParam(defaultValue="") String password,HttpServletRequest request){
			User user=new User();
			user.setName(name);
			user.setPassword(password);
			user.setState(0);
			UsernamePasswordAuthenticationToken authRequest=new UsernamePasswordAuthenticationToken(name,password);
			System.out.println(authRequest.toString());
			try {
				Authentication authentication=myAuthenticationManager.authenticate(authRequest);
				SecurityContextHolder.getContext().setAuthentication(authentication);
				HttpSession session=request.getSession();
				session.setAttribute("SPRING_SECURITY_CONTEXT", SecurityContextHolder.getContext());
				Share share=userService.getShare(userService.queryByAccount(name));
				System.out.println(share.toString());
				return share;
				
			} catch (AuthenticationException ex) {
				// TODO: handle exception
				System.out.println("异常");
				return null;
			}
		}
		
		
		@RequestMapping(value = "/loginPage", method = RequestMethod.GET)
		public String loginPage(@RequestParam(value = "error", required = false) String error, Model model) {
			if (error != null) {
				return "login-failure";
			}
			return "login";
		}

	
}
