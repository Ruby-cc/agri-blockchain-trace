package com.ruoyi.traces.domain;

public class TraceUserCrops {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column trace_user_crops.id
     *
     * @mbg.generated Wed Oct 28 00:08:24 CST 2020
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column trace_user_crops.username
     *
     * @mbg.generated Wed Oct 28 00:08:24 CST 2020
     */
    private String username;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column trace_user_crops.crops_id
     *
     * @mbg.generated Wed Oct 28 00:08:24 CST 2020
     */
    private String cropsId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column trace_user_crops.crops_name
     *
     * @mbg.generated Wed Oct 28 00:08:24 CST 2020
     */
    private String cropsName;

    private Integer status;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getCropsId() {
        return cropsId;
    }

    public void setCropsId(String cropsId) {
        this.cropsId = cropsId == null ? null : cropsId.trim();
    }

    public String getCropsName() {
        return cropsName;
    }

    public void setCropsName(String cropsName) {
        this.cropsName = cropsName == null ? null : cropsName.trim();
    }
}