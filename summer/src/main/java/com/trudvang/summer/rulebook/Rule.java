package com.trudvang.summer.rulebook;

public class Rule {

    private String title;
    private String description;
    private RuleFunction ruleFunction;

    private Rule(RuleBuilder builder){
        this.title = builder.title;
        this.description= builder.description;
        this.ruleFunction = builder.ruleFunction;
    }

    public static class RuleBuilder {

        private String title;
        private String description;
        private RuleFunction ruleFunction;

        public RuleBuilder(String title, String description){
            this.title = title;
            this.description= description;
        }

        public RuleBuilder withRuleFunction(RuleFunction ruleFunction){
            this.ruleFunction = ruleFunction;
            return this;
        }

        public Rule build(){
            return new Rule(this);
        }

    }

    public String getTitle(){
        return title;
    }

    public String getDescription(){
        return description;
    }

    public RuleFunction getRuleFunction(){
        return ruleFunction;
    }

}
