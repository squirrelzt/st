package com.squirrel.st.domain;

import java.math.BigDecimal;
import java.util.Date;

public class AcpsAcctMast {
    private Long id;

    private String bankAcctId;

    private Integer acctType;

    private String mastAcctNum;

    private String platform;

    private String channel;

    private Long custId;

    private String merCustId;

    private String merCode;

    private String merCustName;

    private BigDecimal totalBalance;

    private BigDecimal availableBalance;

    private BigDecimal availableDrawBalance;

    private BigDecimal frozenBalance;

    private BigDecimal pendingPaymentBalance;

    private BigDecimal preMinusAmt;

    private Integer totalModCount;

    private BigDecimal cumDrAmt;

    private BigDecimal cumCrAmt;

    private Integer status;

    private Date createTime;

    private Date updateTime;

    private Long optId;

    private String lastUserId;

    private Date lastTime;

    private String mobile;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBankAcctId() {
        return bankAcctId;
    }

    public void setBankAcctId(String bankAcctId) {
        this.bankAcctId = bankAcctId == null ? null : bankAcctId.trim();
    }

    public Integer getAcctType() {
        return acctType;
    }

    public void setAcctType(Integer acctType) {
        this.acctType = acctType;
    }

    public String getMastAcctNum() {
        return mastAcctNum;
    }

    public void setMastAcctNum(String mastAcctNum) {
        this.mastAcctNum = mastAcctNum == null ? null : mastAcctNum.trim();
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform == null ? null : platform.trim();
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel == null ? null : channel.trim();
    }

    public Long getCustId() {
        return custId;
    }

    public void setCustId(Long custId) {
        this.custId = custId;
    }

    public String getMerCustId() {
        return merCustId;
    }

    public void setMerCustId(String merCustId) {
        this.merCustId = merCustId == null ? null : merCustId.trim();
    }

    public String getMerCode() {
        return merCode;
    }

    public void setMerCode(String merCode) {
        this.merCode = merCode == null ? null : merCode.trim();
    }

    public String getMerCustName() {
        return merCustName;
    }

    public void setMerCustName(String merCustName) {
        this.merCustName = merCustName == null ? null : merCustName.trim();
    }

    public BigDecimal getTotalBalance() {
        return totalBalance;
    }

    public void setTotalBalance(BigDecimal totalBalance) {
        this.totalBalance = totalBalance;
    }

    public BigDecimal getAvailableBalance() {
        return availableBalance;
    }

    public void setAvailableBalance(BigDecimal availableBalance) {
        this.availableBalance = availableBalance;
    }

    public BigDecimal getAvailableDrawBalance() {
        return availableDrawBalance;
    }

    public void setAvailableDrawBalance(BigDecimal availableDrawBalance) {
        this.availableDrawBalance = availableDrawBalance;
    }

    public BigDecimal getFrozenBalance() {
        return frozenBalance;
    }

    public void setFrozenBalance(BigDecimal frozenBalance) {
        this.frozenBalance = frozenBalance;
    }

    public BigDecimal getPendingPaymentBalance() {
        return pendingPaymentBalance;
    }

    public void setPendingPaymentBalance(BigDecimal pendingPaymentBalance) {
        this.pendingPaymentBalance = pendingPaymentBalance;
    }

    public BigDecimal getPreMinusAmt() {
        return preMinusAmt;
    }

    public void setPreMinusAmt(BigDecimal preMinusAmt) {
        this.preMinusAmt = preMinusAmt;
    }

    public Integer getTotalModCount() {
        return totalModCount;
    }

    public void setTotalModCount(Integer totalModCount) {
        this.totalModCount = totalModCount;
    }

    public BigDecimal getCumDrAmt() {
        return cumDrAmt;
    }

    public void setCumDrAmt(BigDecimal cumDrAmt) {
        this.cumDrAmt = cumDrAmt;
    }

    public BigDecimal getCumCrAmt() {
        return cumCrAmt;
    }

    public void setCumCrAmt(BigDecimal cumCrAmt) {
        this.cumCrAmt = cumCrAmt;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Long getOptId() {
        return optId;
    }

    public void setOptId(Long optId) {
        this.optId = optId;
    }

    public String getLastUserId() {
        return lastUserId;
    }

    public void setLastUserId(String lastUserId) {
        this.lastUserId = lastUserId == null ? null : lastUserId.trim();
    }

    public Date getLastTime() {
        return lastTime;
    }

    public void setLastTime(Date lastTime) {
        this.lastTime = lastTime;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }
}