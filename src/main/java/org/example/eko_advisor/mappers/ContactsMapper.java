package org.example.eko_advisor.mappers;

public class ContactsMapper {
    CreatorsMapper[] creators;

    public ContactsMapper(CreatorsMapper[] creators) {
        this.creators = creators;
    }

    public CreatorsMapper[] getCreators() {
        return creators;
    }

    public void setCreators(CreatorsMapper[] creators) {
        this.creators = creators;
    }
}
