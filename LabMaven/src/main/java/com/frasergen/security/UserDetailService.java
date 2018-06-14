package com.frasergen.security;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.frasergen.dao.UserDao;
import com.frasergen.entity.Share;
import com.frasergen.entity.User;

@Service(value = "userDetailService")
public class UserDetailService implements UserDetailsService{

	@Autowired
	UserDao userDao;
	

	@Override
	public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		System.out.println("name is "+name);
		com.frasergen.entity.User user=userDao.queryByAccount(name);
		if(user==null)
			throw new UsernameNotFoundException("找不到该账户信息！");//抛出异常，会根据配置跳到登录失败页面
		System.out.println("findByUserName:\n"+user.toString());
		List<GrantedAuthority> list = new ArrayList<GrantedAuthority>(); //GrantedAuthority是security提供的权限类，
		//Share share=userDao.getShare(user);
		//list.add(new SimpleGrantedAuthority("ROLE_DIRECTOR"));
		list.add(new SimpleGrantedAuthority("ROLE_LABBER"));
		//getRoles(share, list);
		System.out.println(list.toString());
		org.springframework.security.core.userdetails.User auth_user=new
				org.springframework.security.core.userdetails.User(user.getName(), user.getPassword(), list);//返回包括权限角色的User给security
		System.out.println(auth_user.toString());
		return auth_user;
	}
	/**
     * 返回验证用户
     * @param user
     * @param authorities
     * @return
     */

	private org.springframework.security.core.userdetails.User buildUserForAuthentication(com.frasergen.entity.User user,List<GrantedAuthority> authorities){
		 return new org.springframework.security.core.userdetails.User(user.getName(),user.getPassword(),true,true,true,true,authorities);
		
	}
	/**
     * 获取所属角色
     * @param user
     * @param list
     */
	 public void getRoles(Share share,List<GrantedAuthority> list){
        for (String role:share.getAuthor().split(",")) {
        	//权限如果前缀是ROLE_，security就会认为这是个角色信息，而不是权限，例如ROLE_MENBER就是MENBER角色，CAN_SEND就是CAN_SEND权限
        	System.out.println("getrole:"+role.toString());
        	list.add(new SimpleGrantedAuthority(role));
        }
    }
	
	
}
