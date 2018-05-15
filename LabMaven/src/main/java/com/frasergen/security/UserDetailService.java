package com.frasergen.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.frasergen.dao.CilentUserManageDao;

@Service(value = "userDetailService")
public class UserDetailService implements UserDetailsService{

	@Autowired
	CilentUserManageDao cDao;
	
	@Override
	public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		System.out.println("name is "+name);
		return null;
	}

}
