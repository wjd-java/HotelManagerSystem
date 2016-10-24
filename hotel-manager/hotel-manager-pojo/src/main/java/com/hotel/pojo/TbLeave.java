package com.hotel.pojo;

import java.util.Date;

public class TbLeave {
    private String leaveId;

    private Date leaveTime;

    private String idCard;

    private String roomId;

    private Float spendMoney;

    private Float remainMoney;

    public String getLeaveId() {
        return leaveId;
    }

    public void setLeaveId(String leaveId) {
        this.leaveId = leaveId == null ? null : leaveId.trim();
    }

    public Date getLeaveTime() {
        return leaveTime;
    }

    public void setLeaveTime(Date leaveTime) {
        this.leaveTime = leaveTime;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard == null ? null : idCard.trim();
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId == null ? null : roomId.trim();
    }

    public Float getSpendMoney() {
        return spendMoney;
    }

    public void setSpendMoney(Float spendMoney) {
        this.spendMoney = spendMoney;
    }

    public Float getRemainMoney() {
        return remainMoney;
    }

    public void setRemainMoney(Float remainMoney) {
        this.remainMoney = remainMoney;
    }
}