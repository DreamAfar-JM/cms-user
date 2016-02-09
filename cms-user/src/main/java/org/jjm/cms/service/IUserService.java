package org.jjm.cms.service;

import java.util.List;

import org.jjm.cms.model.Group;
import org.jjm.cms.model.Role;
import org.jjm.cms.model.User;

public interface IUserService {

	/**
	 * 添加用户,需要判断用户名是否存在，如果存在抛出异常
	 * @param user 用户对象
	 * @param rids 用户的所有角色id
	 * @param gids 用户的所有组id
	 */
	public void add(User user,Integer[] rids,Integer[] gids);
	
	/**
	 * 更新用户
	 * 如果rids中的角色在用户中已存在，就不做操作
	 * 如果rids中的角色在用户中不存在，就要添加
	 * 如果用户中的角色在rids不存在，就要删除
	 * 对于gids，同上
	 * @param user 用户对象
	 * @param rids 用户的所有角色id
	 * @param gids 用户的所有组id
	 */
	public void update(User user,Integer[] rids,Integer[] gids);
	
	/**
	 * 删除用户
	 * 注意需要把用户和角色和组的对应关系删除
	 * 如果用户存在相应文章不能删除
	 * @param id
	 */
	public void delete(int id);
	
	/**
	 * 更新用户状态   停用/启用
	 * @param id
	 */
	public void updateStatus(int id);
	
	/**
	 * 用户列表
	 */
	public void findUser();
	
	/**
	 * 获取用户信息
	 * @param id
	 * @return
	 */
	public User load(int id);
	
	/**
	 * 获取用户所有角色信息
	 * @param id
	 * @return
	 */
	public List<Role> listUserRoles(int id);
	
	
	/**
	 * 获取用户所有组信息
	 * @param id
	 * @return
	 */
	public List<Group> listUserGroups(int id);
}
