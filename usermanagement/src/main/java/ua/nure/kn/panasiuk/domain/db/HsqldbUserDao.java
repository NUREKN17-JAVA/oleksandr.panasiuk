package ua.nure.kn.panasiuk.domain.db;

import java.util.Collection;

import ua.nure.kn.panasiuk.domain.User;

public class HsqldbUserDao implements UserDao {

	public HsqldbUserDao() {
		// TODO Auto-generated constructor stub
	}

	public User create(User user) throws DatabaseException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User find(long id) throws DatabaseException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<User> getAll() throws DatabaseException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(User user) throws DatabaseException {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete (User user) throws DatabaseException {
		// TODO Auto-generated method stub

	}

	@Override
	public void setConnectionFactory(ConnectionFactory connectionFactory) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Collection<User> findAll() throws DatabaseException {
		// TODO Auto-generated method stub
		return null;
	}

}
