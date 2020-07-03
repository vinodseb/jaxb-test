package com.vinodseb.jaxb;

import lombok.Data;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "customer")
@Data
public class Customer {
    protected List<String> givenName;
    protected String name;
}
