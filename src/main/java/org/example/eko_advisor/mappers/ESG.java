package org.example.eko_advisor.mappers;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ESG {
    private List<Principle> principles;

    @AllArgsConstructor
    @NoArgsConstructor
    @Data
    public static class Principle {
        private String abbr;
        private String name;
        private String principle;
        private String text;
        private List<Example> examples;

        @AllArgsConstructor
        @NoArgsConstructor
        @Data
        public static class Example {
            private String text;
            private String pic;
        }
    }
}
