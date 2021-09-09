package com.mayank.DIP_Principle;

import java.util.List;

    public interface RelationshipBrowser {
        List<Person> findAllChildrenOf(Person person);
    }

