package org.example.eko_advisor.mappers;

import java.util.List;

public class ContactsMapper {
    List<CreatorsMapper> creators;

    public ContactsMapper(CreatorsMapper[] creators) {
        this.creators = List.of(creators);
    }

    public ContactsMapper() {
    }

    public List<CreatorsMapper> getCreators() {
        return creators;
    }

    public void setCreators(List<CreatorsMapper> creators) {
        this.creators = creators;
    }
}
