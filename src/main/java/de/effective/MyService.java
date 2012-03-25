package de.effective;


import org.springframework.jmx.export.annotation.ManagedOperation;
import org.springframework.jmx.export.annotation.ManagedResource;

public interface MyService {
    public void sagDochMal(String was);
}
