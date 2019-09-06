package com.squirrel.st.domain;

import java.math.BigDecimal;
import java.util.Date;

public class Account {
    private Long id;

    private String acctNum;

    private Long custId;

    private String acctName;

    private Integer acctType;

    private BigDecimal totalBalance;

    private BigDecimal availableBalance;

    private BigDecimal availableDrawBalance;

    private BigDecimal frozenBalance;

    private Integer status;

    private Boolean isEnabled;

    private Boolean hasBindBankAccount;

    private Boolean isPayLocked;

    private Boolean isReceiveLocked;

    private Boolean isDrawLocked;

    private Date createTime;

    private Date updateTime;

    private Long optId;

    private String mobile;

    private String thirdCustId;

    private Long defaultBindDetailId;

    private Integer delFlag;

    private String acctShortName;

    private String schemaCode;

    private String prodCode;

    private String currency;

    private String frezCode;

    private String frezReason;

    private String acctClsFlag;

    private Date acctClsDate;

    private BigDecimal preMinusAmt;

    private Integer totalModCount;

    private String specialAcctInd;

    private BigDecimal cumDrAmt;

    private BigDecimal cumCrAmt;

    private String lastUserId;

    private Date lastTime;

    private String systemOnlyAcctFlag;

    private Date lastFrezDate;

    private Date lastUnfrezDate;

    private Date lastModifyDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAcctNum() {
        return acctNum;
    }

    public void setAcctNum(String acctNum) {
        this.acctNum = acctNum == null ? null : acctNum.trim();
    }

    public Long getCustId() {
        return custId;
    }

    public void setCustId(Long custId) {
        this.custId = custId;
    }

    public String getAcctName() {
        return acctName;
    }

    public void setAcctName(String acctName) {
        this.acctName = acctName == null ? null : acctName.trim();
    }

    public Integer getAcctType() {
        return acctType;
    }

    public void setAcctType(Integer acctType) {
        this.acctType = acctType;
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Boolean getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(Boolean isEnabled) {
        this.isEnabled = isEnabled;
    }

    public Boolean getHasBindBankAccount() {
        return hasBindBankAccount;
    }

    public void setHasBindBankAccount(Boolean hasBindBankAccount) {
        this.hasBindBankAccount = hasBindBankAccount;
    }

    public Boolean getIsPayLocked() {
        return isPayLocked;
    }

    public void setIsPayLocked(Boolean isPayLocked) {
        this.isPayLocked = isPayLocked;
    }

    public Boolean getIsReceiveLocked() {
        return isReceiveLocked;
    }

    public void setIsReceiveLocked(Boolean isReceiveLocked) {
        this.isReceiveLocked = isReceiveLocked;
    }

    public Boolean getIsDrawLocked() {
        return isDrawLocked;
    }

    public void setIsDrawLocked(Boolean isDrawLocked) {
        this.isDrawLocked = isDrawLocked;
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

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getThirdCustId() {
        return thirdCustId;
    }

    public void setThirdCustId(String thirdCustId) {
        this.thirdCustId = thirdCustId == null ? null : thirdCustId.trim();
    }

    public Long getDefaultBindDetailId() {
        return defaultBindDetailId;
    }

    public void setDefaultBindDetailId(Long defaultBindDetailId) {
        this.defaultBindDetailId = defaultBindDetailId;
    }

    public Integer getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }

    public String getAcctShortName() {
        return acctShortName;
    }

    public void setAcctShortName(String acctShortName) {
        this.acctShortName = acctShortName == null ? null : acctShortName.trim();
    }

    public String getSchemaCode() {
        return schemaCode;
    }

    public void setSchemaCode(String schemaCode) {
        this.schemaCode = schemaCode == null ? null : schemaCode.trim();
    }

    public String getProdCode() {
        return prodCode;
    }

    public void setProdCode(String prodCode) {
        this.prodCode = prodCode == null ? null : prodCode.trim();
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency == null ? null : currency.trim();
    }

    public String getFrezCode() {
        return frezCode;
    }

    public void setFrezCode(String frezCode) {
        this.frezCode = frezCode == null ? null : frezCode.trim();
    }

    public String getFrezReason() {
        return frezReason;
    }

    public void setFrezReason(String frezReason) {
        this.frezReason = frezReason == null ? null : frezReason.trim();
    }

    public String getAcctClsFlag() {
        return acctClsFlag;
    }

    public void setAcctClsFlag(String acctClsFlag) {
        this.acctClsFlag = acctClsFlag == null ? null : acctClsFlag.trim();
    }

    public Date getAcctClsDate() {
        return acctClsDate;
    }

    public void setAcctClsDate(Date acctClsDate) {
        this.acctClsDate = acctClsDate;
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

    public String getSpecialAcctInd() {
        return specialAcctInd;
    }

    public void setSpecialAcctInd(String specialAcctInd) {
        this.specialAcctInd = specialAcctInd == null ? null : specialAcctInd.trim();
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

    public String getSystemOnlyAcctFlag() {
        return systemOnlyAcctFlag;
    }

    public void setSystemOnlyAcctFlag(String systemOnlyAcctFlag) {
        this.systemOnlyAcctFlag = systemOnlyAcctFlag == null ? null : systemOnlyAcctFlag.trim();
    }

    public Date getLastFrezDate() {
        return lastFrezDate;
    }

    public void setLastFrezDate(Date lastFrezDate) {
        this.lastFrezDate = lastFrezDate;
    }

    public Date getLastUnfrezDate() {
        return lastUnfrezDate;
    }

    public void setLastUnfrezDate(Date lastUnfrezDate) {
        this.lastUnfrezDate = lastUnfrezDate;
    }

    public Date getLastModifyDate() {
        return lastModifyDate;
    }

    public void setLastModifyDate(Date lastModifyDate) {
        this.lastModifyDate = lastModifyDate;
    }
}