package de.effective;

import org.springframework.jmx.export.annotation.ManagedOperation;
import org.springframework.jmx.export.annotation.ManagedResource;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author martin.dilger
 */
@Component
@ManagedResource(objectName="effective:name=laberService")
@Transactional
public class MyServiceImpl implements MyService {
    @Override
    @ManagedOperation()
    public void sagDochMal(String was) {
        System.out.println("Ich sag " + was);
    }
}
