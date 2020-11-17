package com.example.ConsumingNytRest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Results {


    private String section;
    private String subsection;
    private String title;
    private String _abstract;
    private String url;
    private String uri;
    private String byline;
    private String item_type;
    private String updated_date;
    private String created_date;
    private String published_date;
    private String material_type_facet;
    private String[] des_facet;
    private String[] org_facet;
    private String[] per_facet;
    private String[] geo_facet;
    private List<Multimedia> multimedia;

    public Results() {

        multimedia= new ArrayList<>();
        Multimedia multimedia1=new Multimedia();
        multimedia.add(multimedia1);
    }


    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getSubsection() {
        return subsection;
    }

    public void setSubsection(String subsection) {
        this.subsection = subsection;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String get_abstract() {
        return _abstract;
    }

    public void set_abstract(String _abstract) {
        this._abstract = _abstract;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getByline() {
        return byline;
    }

    public void setByline(String byline) {
        this.byline = byline;
    }

    public String getItem_type() {
        return item_type;
    }

    public void setItem_type(String item_type) {
        this.item_type = item_type;
    }

    public String getUpdated_date() {
        return updated_date;
    }

    public void setUpdated_date(String updated_date) {
        this.updated_date = updated_date;
    }

    public String getCreated_date() {
        return created_date;
    }

    public void setCreated_date(String created_date) {
        this.created_date = created_date;
    }

    public String getPublished_date() {
        return published_date;
    }

    public void setPublished_date(String published_date) {
        this.published_date = published_date;
    }

    public String getMaterial_type_facet() {
        return material_type_facet;
    }

    public void setMaterial_type_facet(String material_type_facet) {
        this.material_type_facet = material_type_facet;
    }

    public String[] getDes_facet() {
        return des_facet;
    }

    public void setDes_facet(String[] des_facet) {
        this.des_facet = des_facet;
    }

    public String[] getOrg_facet() {
        return org_facet;
    }

    public void setOrg_facet(String[] org_facet) {
        this.org_facet = org_facet;
    }

    public String[] getPer_facet() {
        return per_facet;
    }

    public void setPer_facet(String[] per_facet) {
        this.per_facet = per_facet;
    }

    public String[] getGeo_facet() {
        return geo_facet;
    }

    public void setGeo_facet(String[] geo_facet) {
        this.geo_facet = geo_facet;
    }

    public List<Multimedia> getMultimedia() {
        return multimedia;
    }

    public void setMultimedia(List<Multimedia> multimedia) {
        this.multimedia = multimedia;
    }

    @Override
    public String toString() {
        return "Results{" +
                "section='" + section + '\'' +
                ", subsection='" + subsection + '\'' +
                ", title='" + title + '\'' +
                ", _abstract='" + _abstract + '\'' +
                ", url='" + url + '\'' +
                ", uri='" + uri + '\'' +
                ", byline='" + byline + '\'' +
                ", item_type='" + item_type + '\'' +
                ", updated_date='" + updated_date + '\'' +
                ", created_date='" + created_date + '\'' +
                ", published_date='" + published_date + '\'' +
                ", material_type_facet='" + material_type_facet + '\'' +
                ", des_facet=" + Arrays.toString(des_facet) +
                ", org_facet=" + Arrays.toString(org_facet) +
                ", per_facet=" + Arrays.toString(per_facet) +
                ", geo_facet=" + Arrays.toString(geo_facet) +
                ", multimedia=" + multimedia +
                '}';
    }
}
