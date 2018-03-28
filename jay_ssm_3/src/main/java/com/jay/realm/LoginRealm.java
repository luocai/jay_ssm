package com.jay.realm;

import java.util.HashSet;
import java.util.Set;

import javax.annotation.Resource;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jay.entity.Role;
import com.jay.entity.User;
import com.jay.service.RoleService;
import com.jay.service.UserService;

@Component
public class LoginRealm extends AuthorizingRealm{

	@Resource(name = "userServiceImpl") // 不用autowired
	private UserService userService;
	@Resource(name = "roleServiceImpl")
	private RoleService roleService;
	
	//权限认证
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
		
		String username = (String) getAvailablePrincipal(principalCollection);
		Role role= null;
		
		try{
			User user = userService.findByName(username);
			role = roleService.findById(user.getRole());
		}catch(Exception e){
			e.printStackTrace();
		}
		
		Set<String> r = new HashSet<>();
		SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
		
		if (role != null){
			r.add(role.getRoleName());
			info.setRoles(r);
		}
		return info;
	}
	
	//登录验证 身份验证
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		
		String username = (String) token.getPrincipal();
		String password = new String((char[])token.getCredentials());
		
		User user = null;
		try{
			user = userService.findByName(username);
		}catch(Exception e){
			e.printStackTrace();
		}
		
		if (user == null){
			System.out.println("该用户不存在");
		}else if (!user.getPassword().equals(password)){
			System.out.println("密码错误");
		}
		
		AuthenticationInfo info = new SimpleAuthenticationInfo(username, password, getName());
		
		return info;
	}

}
