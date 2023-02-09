package com.ruoyi.traces.domain;

public class TraceLngLat {

    private Long id;

    private Float lng;

    private Float lat;

    private String cropsId;

    private int status;

    private int outFactoryStatus;

    @Override
    public String toString() {
        return "TraceLngLat{" +
                "id=" + id +
                ", lng=" + lng +
                ", lat=" + lat +
                ", cropsId='" + cropsId + '\'' +
                ", status=" + status +
                ", outFactoryStatus=" + outFactoryStatus +
                '}';
    }

    public int getOutFactoryStatus() {
        return outFactoryStatus;
    }

    public void setOutFactoryStatus(int outFactoryStatus) {
        this.outFactoryStatus = outFactoryStatus;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public Float getLng() {
        return lng;
    }

    public void setLng(Float lng) {
        this.lng = lng;
    }

    public Float getLat() {
        return lat;
    }

    public void setLat(Float lat) {
        this.lat = lat;
    }

    public String getCropsId() {
        return cropsId;
    }

    public void setCropsId(String cropsId) {
        this.cropsId = cropsId == null ? null : cropsId.trim();
    }
}