package com.iamacitizen.core.datasource.mapper;

import com.iamacitizen.core.datasource.Session;
import com.iamacitizen.core.datasource.SessionManager;
import com.iamacitizen.core.exception.SerigyDataSourceException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author felipe
 */
public abstract class AbstractMapperTest {

    protected Session session;

    @Before
    public void beforeTest() throws SerigyDataSourceException {
        session = SessionManager.createSession();
        session.beginTransaction();
        setUp();
    }

    @After
    public void afterTest() throws SerigyDataSourceException {
        tearDown();
        SessionManager.rollbackSession();
    }

    /**
     * Método executado antes da execução de cada teste, logo após abrir uma transação com o banco de dados.
     *
     * @throws SerigyDataSourceException
     */
    public abstract void setUp() throws SerigyDataSourceException;

    /**
     * Método executado após a execução do teste, antes de ser feito um rollback na transação.
     *
     * @throws SerigyDataSourceException
     */
    public abstract void tearDown() throws SerigyDataSourceException;

    @Test
    public abstract void insertTest() throws SerigyDataSourceException;

    @Test
    public abstract void updateTest() throws SerigyDataSourceException;

    @Test
    public abstract void deleteTest() throws SerigyDataSourceException;
}
