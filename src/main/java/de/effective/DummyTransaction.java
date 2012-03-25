package de.effective;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.transaction.*;

/**
 * @author martin.dilger
 */
@Service(value = "dummyTransaction")
public class DummyTransaction implements UserTransaction {
    @Override
    public void begin() throws NotSupportedException, SystemException {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void commit() throws RollbackException, HeuristicMixedException, HeuristicRollbackException, SecurityException, IllegalStateException, SystemException {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void rollback() throws IllegalStateException, SecurityException, SystemException {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setRollbackOnly() throws IllegalStateException, SystemException {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public int getStatus() throws SystemException {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setTransactionTimeout(int i) throws SystemException {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
