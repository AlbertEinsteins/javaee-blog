package com.item.javaee.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @ClassName: Sort
 * @Description TODO
 * @Author: jff
 * @Date: 2019-11-04 19:57
 * @Version: 1.0
 **/
@Entity
@Table(name = "sort")
public class Sort implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sort_id")
    private Integer sortId ;

    @Column(name = "sort_level")
    private Integer sortLevel ;

    @Column(name = "sort_name", length = 32)
    private String sortName ;

    protected Sort() { }

    public Sort(Integer sortLevel, String sortName) {
        this.sortLevel = sortLevel;
        this.sortName = sortName;
    }

    public Integer getSortId() {
        return sortId;
    }

    public void setSortId(Integer sortId) {
        this.sortId = sortId;
    }

    public Integer getSortLevel() {
        return sortLevel;
    }

    public void setSortLevel(Integer sortLevel) {
        this.sortLevel = sortLevel;
    }

    public String getSortName() {
        return sortName;
    }

    public void setSortName(String sortName) {
        this.sortName = sortName;
    }
}
