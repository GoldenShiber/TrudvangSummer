package com.trudvang.summer.rulebook;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class RuleBook implements Serializable {

    private Long id;
    private String version;
    private List<Rule> ruleList;

    public RuleBook(Long id, String version, List<Rule> ruleList){
        this.id=id;
        this.version=version;
        this.ruleList=ruleList;
    }

    public RuleBook(){
        this.id = 0l;
        this.version = "";
        this.ruleList = new ArrayList<>();
    }

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id=id;
    }

    public String getVersion(){
        return version;
    }

    public void setVersion(String version){
        this.version=version;
    }

    public List<Rule> getRuleList(){
        return ruleList;
    }

    public void setRuleList(List<Rule> ruleList){
        this.ruleList=ruleList;
    }

}
