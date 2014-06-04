/**
 * 2014年6月4日下午2:47:45
 * xingjia
 */
package demo.user;

import com.user.dao.IUserDao;
import com.user.dao.impl.UserDaoImpl;
import com.user.entity.UserEntity;

/**
 * @author xingjia
 *
 */
public class UserService implements IUserDao{
	private UserDaoImpl userDao;
	
	
	/**
	 * @return userDao
	 */
	public UserDaoImpl getUserDao() {
		return userDao;
	}

	/**
	 * @param userDao the userDao to set
	 */
	public void setUserDao(UserDaoImpl userDao) {
		this.userDao = userDao;
	}

	/* (non-Javadoc)
	 * @see com.user.dao.IUserDao#insert(com.user.entity.UserEntity)
	 */
	@Override
	public void insert(UserEntity userEntity) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.user.dao.IUserDao#delete(int)
	 */
	@Override
	public void delete(int vcUid) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.user.dao.IUserDao#execute()
	 */
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		userDao.execute();
		System.out.println("执行userservice中的方法");
	}

}
