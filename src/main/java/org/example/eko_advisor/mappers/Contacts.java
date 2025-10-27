package org.example.eko_advisor.mappers;

import java.util.List;

public class Contacts {
    List<Creator> creators;

    public Contacts(List<Creator> creators) {
        this.creators = creators;
    }

    public Contacts() {
    }

    public List<Creator> getCreators() {
        return creators;
    }

    public void setCreators(List<Creator> creators) {
        this.creators = creators;
    }

    public Creator getCreatorByAbbr(String abbr) {
        for (Creator creator : this.creators)
            if (creator.getAbbr().equals(abbr))
                return creator;
        return null;
    }
}
