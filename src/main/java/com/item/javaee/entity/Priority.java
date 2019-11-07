package com.item.javaee.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @ClassName: Priority
 * @Description TODO
 * @Author: jff
 * @Date: 2019-11-04 19:56
 * @Version: 1.0
 **/
@Entity
@Table(name = "priority")
public class Priority implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "priority_id")
    private Integer priorityId ;

    @Column(name = "priority_name", length = 32)
    private String priorityName ;

    @Column(name = "priority_value", length = 32)
    private String priorityValue ;

    protected Priority() { }

    public Priority(String priorityName, String priorityValue) {
        this.priorityName = priorityName;
        this.priorityValue = priorityValue;
    }

    public Integer getPriorityId() {
        return priorityId;
    }

    public void setPriorityId(Integer priorityId) {
        this.priorityId = priorityId;
    }

    public String getPriorityName() {
        return priorityName;
    }

    public void setPriorityName(String priorityName) {
        this.priorityName = priorityName;
    }

    public String getPriorityValue() {
        return priorityValue;
    }

    public void setPriorityValue(String priorityValue) {
        this.priorityValue = priorityValue;
    }
}
