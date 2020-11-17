package com.example.ConsumingNytRest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;
import java.util.List;
@JsonIgnoreProperties(ignoreUnknown = true)
public class TopStories {

    private String status;
    private String copyright;
    private String section;
    private String last_updated;
    private Long num_results;
    private List<Results>results;

    public TopStories() {
    results=new ArrayList<>();
    Results result1=new Results();
     results.add(result1);
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCopyright() {
        return copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getLast_updated() {
        return last_updated;
    }

    public void setLast_updated(String last_updated) {
        this.last_updated = last_updated;
    }

    public Long getNum_results() {
        return num_results;
    }

    public void setNum_results(Long num_results) {
        this.num_results = num_results;
    }

    public List<Results> getResults() {
        return results;
    }

    public void setResults(List<Results> results) {
        this.results = results;
    }

    @Override
    public String toString() {
        return "TopStories{" +
                "status='" + status + '\'' +
                ", copyright='" + copyright + '\'' +
                ", section='" + section + '\'' +
                ", last_updated='" + last_updated + '\'' +
                ", num_results=" + num_results +
                ", results=" + results +
                '}';
    }
}
