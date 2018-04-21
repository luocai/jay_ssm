package com.jay.entity;

public class Role {
	
	private int roleId;
	private String roleName;
	private String rolePer;
	public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public String getRolePer() {
		return rolePer;
	}
	public void setRolePer(String rolePer) {
		this.rolePer = rolePer;
	}
	@Override
	public String toString() {
		return "Role [roleId=" + roleId + ", roleName=" + roleName + ", rolePer=" + rolePer + "]";
	}
	
}
