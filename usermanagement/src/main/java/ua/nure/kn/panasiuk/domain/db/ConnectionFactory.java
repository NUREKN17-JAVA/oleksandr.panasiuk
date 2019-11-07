package ua.nure.kn.panasiuk.domain.db;

import java.sql.Connection;

public interface ConnectionFactory {

    Connection createConnection() throws DatabaseException;
}
