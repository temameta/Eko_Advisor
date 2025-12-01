package org.example.eko_advisor.mappers;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Advice {
    @NoArgsConstructor
    @AllArgsConstructor
    @Data
    public static class Home {
        private String header;
        private String advise;
    }
    @NoArgsConstructor
    @AllArgsConstructor
    @Data
    public static class Company {
        private String header;
        private String advise;
    }
    @JsonProperty("home")
    private List<Home> home;
    @JsonProperty("company")
    private List<Company> company;
}
