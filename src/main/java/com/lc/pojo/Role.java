package com.lc.pojo;
// Generated 2019-12-18 19:47:14 by Hibernate Tools 4.3.5.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Role generated by hbm2java
 */
public class Role implements java.io.Serializable {

	private int rid;
	private String rname;
	private Set users = new HashSet(0);

	public Role() {
	}

	public Role(int rid) {
		this.rid = rid;
	}

	public Role(int rid, String rname, Set users) {
		this.rid = rid;
		this.rname = rname;
		this.users = users;
	}

	public int getRid() {
		return this.rid;
	}

	public void setRid(int rid) {
		this.rid = rid;
	}

	public String getRname() {
		return this.rname;
	}

	public void setRname(String rname) {
		this.rname = rname;
	}

	public Set getUsers() {
		return this.users;
	}

	public void setUsers(Set users) {
		this.users = users;
	}

}
