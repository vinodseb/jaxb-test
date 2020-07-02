package com.vinodseb.jaxb;

import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlRootElement(name = "customer")
@Getter
@Setter
public class Customer {
    protected List<String> givenName;
    protected String name;
}
