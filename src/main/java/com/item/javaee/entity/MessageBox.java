package com.item.javaee.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName: MessageBox
 * @Description TODO
 * @Author: jff
 * @Date: 2019-11-04 19:56
 * @Version: 1.0
 **/
@Entity
@Table(name = "messageBox")
public class MessageBox implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "msg_id")
    private Integer msgId ;

    @Column(name = "msg_content", length = 128)
    private String msgContent ;

    @Column(name = "msg_time")
    private Date msgTime ;

    @Column(name = "msg_fid")
    private Integer msgFid ;

    @Column(name = "msg_lookup_num")
    private Integer msgLookupNum ;

    protected MessageBox() { }

    public MessageBox(String msgContent, Date msgTime, Integer msgFid, Integer msgLookupNum) {
        this.msgContent = msgContent;
        this.msgTime = msgTime;
        this.msgFid = msgFid;
        this.msgLookupNum = msgLookupNum;
    }

    public Integer getMsgId() {
        return msgId;
    }

    public void setMsgId(Integer msgId) {
        this.msgId = msgId;
    }

    public String getMsgContent() {
        return msgContent;
    }

    public void setMsgContent(String msgContent) {
        this.msgContent = msgContent;
    }

    public Date getMsgTime() {
        return msgTime;
    }

    public void setMsgTime(Date msgTime) {
        this.msgTime = msgTime;
    }

    public Integer getMsgFid() {
        return msgFid;
    }

    public void setMsgFid(Integer msgFid) {
        this.msgFid = msgFid;
    }

    public Integer getMsgLookupNum() {
        return msgLookupNum;
    }

    public void setMsgLookupNum(Integer msgLookupNum) {
        this.msgLookupNum = msgLookupNum;
    }
}
