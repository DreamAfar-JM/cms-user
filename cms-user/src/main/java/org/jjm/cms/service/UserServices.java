package org.jjm.cms.service;

import java.util.List;

import javax.inject.Inject;

import org.jjm.cms.dao.IGroupDao;
import org.jjm.cms.dao.IRoleDao;
import org.jjm.cms.dao.IUserDao;
import org.jjm.cms.model.Group;
import org.jjm.cms.model.Role;
import org.jjm.cms.model.User;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServices implements IUserService {

	private IUserDao userDao;
	private IRoleDao roleDao;
	private IGroupDao groupDao;

	public IUserDao getUserDao() {
		return userDao;
	}

	@Inject
	public void setUserDao(IUserDao userDao) {
		this.userDao = userDao;
	}

	public IRoleDao getRoleDao() {
		return roleDao;
	}

	@Inject
	public void setRoleDao(IRoleDao roleDao) {
		this.roleDao = roleDao;
	}

	public IGroupDao getGroupDao() {
		return groupDao;
	}

	@Inject
	public void setGroupDao(IGroupDao groupDao) {
		this.groupDao = groupDao;
	}

	@Override
	public void add(User user, Integer[] rids, Integer[] gids) {

	}

	@Override
	public void update(User user, Integer[] rids, Integer[] gids) {

	}

	@Override
	public void delete(int id) {

	}

	@Override
	public void updateStatus(int id) {

	}

	@Override
	public void findUser() {
		// TODO Auto-generated method stub

	}

	@Override
	public User load(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Role> listUserRoles(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Group> listUserGroups(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
