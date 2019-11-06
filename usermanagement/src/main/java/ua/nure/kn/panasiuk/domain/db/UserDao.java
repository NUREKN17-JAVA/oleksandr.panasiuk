package ua.nure.kn.panasiuk.domain.db;

import java.util.Collection;

import ua.nure.kn.panasiuk.domain.User;

public interface UserDao {
	
	/**
     * add new record to db with user
     * @param user with null id
     * @return modified user with auto generated id from DB
     *
     */
    User create(User user) throws DatabaseException;

    /**
     *
     * @param id
     * @return
     * @throws DatabaseException
     */
    User find(long id) throws DatabaseException;

    /**
     *
     * @return
     * @throws DatabaseException
     */
    Collection<User> getAll() throws DatabaseException;

    /**
     * all field
     * @param user
     * @throws DatabaseException
     */
    void update (User user) throws DatabaseException;

    /**
     *
     * @param user
     * @throws DatabaseException
     */
    void delete (User user) throws DatabaseException;

    /**
     *
     * @param connectionFactory
     */
    void setConnectionFactory(ConnectionFactory connectionFactory);
    
    Collection<User> findAll() throws DatabaseException;

}
		
}
