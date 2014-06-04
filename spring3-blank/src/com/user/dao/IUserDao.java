/**
 * ионГ10:35:55
 * xingjia
 */
package com.user.dao;

import com.user.entity.UserEntity;

/**
 * @author xingjia
 *
 */
public interface IUserDao {
	public void insert(UserEntity userEntity);
	public void delete(int vcUid);
	public void execute();
}
