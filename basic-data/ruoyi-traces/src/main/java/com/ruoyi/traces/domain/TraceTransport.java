package com.ruoyi.traces.domain;

import java.util.Date;

public class TraceTransport {

    private Long id;

    private String cropsId;

    private String driverId;

    private Date time;

    private String farmerNickName;

    private String farmerUserName;

    private String farmerTel;

    private String farmerDept;

    private Integer status;

    private Integer outFactoryStatus;

    private Integer factoryId;

    private String remarks;

    public Integer getFactoryId() {
        return factoryId;
    }

    public void setFactoryId(Integer factoryId) {
        this.factoryId = factoryId;
    }

    public Integer getOutFactoryStatus() {
        return outFactoryStatus;
    }

    public void setOutFactoryStatus(Integer outFactoryStatus) {
        this.outFactoryStatus = outFactoryStatus;
    }

    public String getFarmerTel() {
        return farmerTel;
    }

    public void setFarmerTel(String farmerTel) {
        this.farmerTel = farmerTel;
    }

    public String getFarmerDept() {
        return farmerDept;
    }

    public void setFarmerDept(String farmerDept) {
        this.farmerDept = farmerDept;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCropsId() {
        return cropsId;
    }

    public void setCropsId(String cropsId) {
        this.cropsId = cropsId == null ? null : cropsId.trim();
    }

    public String getDriverId() {
        return driverId;
    }

    public void setDriverId(String driverId) {
        this.driverId = driverId == null ? null : driverId.trim();
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getFarmerNickName() {
        return farmerNickName;
    }

    public void setFarmerNickName(String farmerNickName) {
        this.farmerNickName = farmerNickName == null ? null : farmerNickName.trim();
    }

    public String getFarmerUserName() {
        return farmerUserName;
    }


    public void setFarmerUserName(String farmerUserName) {
        this.farmerUserName = farmerUserName == null ? null : farmerUserName.trim();
    }


    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    @Override
    public String toString() {
        return "TraceTransport{" +
                "id=" + id +
                ", cropsId='" + cropsId + '\'' +
                ", driverId='" + driverId + '\'' +
                ", time=" + time +
                ", farmerNickName='" + farmerNickName + '\'' +
                ", farmerUserName='" + farmerUserName + '\'' +
                ", farmerTel='" + farmerTel + '\'' +
                ", farmerDept='" + farmerDept + '\'' +
                ", status=" + status +
                ", outFactoryStatus=" + outFactoryStatus +
                ", remarks='" + remarks + '\'' +
                '}';
    }
}