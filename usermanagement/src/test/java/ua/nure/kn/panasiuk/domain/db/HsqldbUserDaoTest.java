package ua.nure.kn.panasiuk.domain.db;


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
    }

 
    public void tearDown() throws Exception {
        super.tearDown();

    }

	public void testCreate() {
		User user = new User();
        user.setFirstName("Alex");
        user.setLastName("Kornienko");
        user.setDateOfBirthd(new Date());

        assertNull(user.getId());

        User userExpected = userDao.create(user);
        assertNotNull(userExpected);
        assertNotNull(userExpected.getId());
        assertEquals(userExpected.getFirstName(), user.getFirstName());
        assertEquals(userExpected.getLastName(), user.getFullName());
        assertEquals(userExpected.getDateOfBirthd(), user.getDateOfBirthd());
	}

}
