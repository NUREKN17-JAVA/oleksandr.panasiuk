package ua.nure.kn.panasiuk.domain.db;


import java.util.Collection;
import java.util.Date;

import org.dbunit.database.IDatabaseConnection;
import org.dbunit.dataset.IDataSet;

import junit.framework.TestCase;
import ua.nure.kn.panasiuk.domain.User;


public class HsqldbUserDaoTest extends TestCase {
	
	private UserDao userDao;
	protected IDatabaseConnection getConnection() throws Exception {
        return null;
    }

    
    protected IDataSet getDataSet() throws Exception {
        return null;
    }

   
    public void setUp() throws Exception {
       super.setUp();
       connectionFactory = new ConnectionFactoryImpl();
       userDao = new HsqldbUserDao(connectionFactory);
    }

 
    public void tearDown() throws Exception {
        super.tearDown();

    }

	public void testCreate() throws DatabaseException {
		User user = new User();
        user.setFirstName("Aleksandr");
        user.setLastName("Panasiuk");
        user.setDateOfBirthd(new Date());

        assertNull(user.getId());

        User userExpected = userDao.create(user);
        assertNotNull(userExpected);
        assertNotNull(userExpected.getId());
        assertEquals(userExpected.getFirstName(), user.getFirstName());
        assertEquals(userExpected.getLastName(), user.getFullName());
        assertEquals(userExpected.getDateOfBirthd(), user.getDateOfBirthd());
	}
	   public void testFindAll() throws DatabaseException {
	        int expectedUsersNumber = 2;
	        Collection<User> users = userDao.findAll();
	        assertNotNull("Collection is null", users);
	        assertEquals("Collection size.", expectedUsersNumber, users.size());
	    }

}
