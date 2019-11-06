package ua.nure.kn.panasiuk.domain.db;

import junit.framework.TestCase;
public class DaoFactoryTest extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testGetUserDao() {
        DaoFactory daoFactory = DaoFactory.getInstance();
        assertNotNull("DaoFactory is null",daoFactory);
        UserDao userDao = daoFactory.getUserDao();
        assertNotNull("UserDao is null",userDao);
    }

}
