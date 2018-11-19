package com.squirrel.st.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AcpsAcctMastExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AcpsAcctMastExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andBankAcctIdIsNull() {
            addCriterion("bank_acct_id is null");
            return (Criteria) this;
        }

        public Criteria andBankAcctIdIsNotNull() {
            addCriterion("bank_acct_id is not null");
            return (Criteria) this;
        }

        public Criteria andBankAcctIdEqualTo(String value) {
            addCriterion("bank_acct_id =", value, "bankAcctId");
            return (Criteria) this;
        }

        public Criteria andBankAcctIdNotEqualTo(String value) {
            addCriterion("bank_acct_id <>", value, "bankAcctId");
            return (Criteria) this;
        }

        public Criteria andBankAcctIdGreaterThan(String value) {
            addCriterion("bank_acct_id >", value, "bankAcctId");
            return (Criteria) this;
        }

        public Criteria andBankAcctIdGreaterThanOrEqualTo(String value) {
            addCriterion("bank_acct_id >=", value, "bankAcctId");
            return (Criteria) this;
        }

        public Criteria andBankAcctIdLessThan(String value) {
            addCriterion("bank_acct_id <", value, "bankAcctId");
            return (Criteria) this;
        }

        public Criteria andBankAcctIdLessThanOrEqualTo(String value) {
            addCriterion("bank_acct_id <=", value, "bankAcctId");
            return (Criteria) this;
        }

        public Criteria andBankAcctIdLike(String value) {
            addCriterion("bank_acct_id like", value, "bankAcctId");
            return (Criteria) this;
        }

        public Criteria andBankAcctIdNotLike(String value) {
            addCriterion("bank_acct_id not like", value, "bankAcctId");
            return (Criteria) this;
        }

        public Criteria andBankAcctIdIn(List<String> values) {
            addCriterion("bank_acct_id in", values, "bankAcctId");
            return (Criteria) this;
        }

        public Criteria andBankAcctIdNotIn(List<String> values) {
            addCriterion("bank_acct_id not in", values, "bankAcctId");
            return (Criteria) this;
        }

        public Criteria andBankAcctIdBetween(String value1, String value2) {
            addCriterion("bank_acct_id between", value1, value2, "bankAcctId");
            return (Criteria) this;
        }

        public Criteria andBankAcctIdNotBetween(String value1, String value2) {
            addCriterion("bank_acct_id not between", value1, value2, "bankAcctId");
            return (Criteria) this;
        }

        public Criteria andAcctTypeIsNull() {
            addCriterion("acct_type is null");
            return (Criteria) this;
        }

        public Criteria andAcctTypeIsNotNull() {
            addCriterion("acct_type is not null");
            return (Criteria) this;
        }

        public Criteria andAcctTypeEqualTo(Integer value) {
            addCriterion("acct_type =", value, "acctType");
            return (Criteria) this;
        }

        public Criteria andAcctTypeNotEqualTo(Integer value) {
            addCriterion("acct_type <>", value, "acctType");
            return (Criteria) this;
        }

        public Criteria andAcctTypeGreaterThan(Integer value) {
            addCriterion("acct_type >", value, "acctType");
            return (Criteria) this;
        }

        public Criteria andAcctTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("acct_type >=", value, "acctType");
            return (Criteria) this;
        }

        public Criteria andAcctTypeLessThan(Integer value) {
            addCriterion("acct_type <", value, "acctType");
            return (Criteria) this;
        }

        public Criteria andAcctTypeLessThanOrEqualTo(Integer value) {
            addCriterion("acct_type <=", value, "acctType");
            return (Criteria) this;
        }

        public Criteria andAcctTypeIn(List<Integer> values) {
            addCriterion("acct_type in", values, "acctType");
            return (Criteria) this;
        }

        public Criteria andAcctTypeNotIn(List<Integer> values) {
            addCriterion("acct_type not in", values, "acctType");
            return (Criteria) this;
        }

        public Criteria andAcctTypeBetween(Integer value1, Integer value2) {
            addCriterion("acct_type between", value1, value2, "acctType");
            return (Criteria) this;
        }

        public Criteria andAcctTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("acct_type not between", value1, value2, "acctType");
            return (Criteria) this;
        }

        public Criteria andMastAcctNumIsNull() {
            addCriterion("mast_acct_num is null");
            return (Criteria) this;
        }

        public Criteria andMastAcctNumIsNotNull() {
            addCriterion("mast_acct_num is not null");
            return (Criteria) this;
        }

        public Criteria andMastAcctNumEqualTo(String value) {
            addCriterion("mast_acct_num =", value, "mastAcctNum");
            return (Criteria) this;
        }

        public Criteria andMastAcctNumNotEqualTo(String value) {
            addCriterion("mast_acct_num <>", value, "mastAcctNum");
            return (Criteria) this;
        }

        public Criteria andMastAcctNumGreaterThan(String value) {
            addCriterion("mast_acct_num >", value, "mastAcctNum");
            return (Criteria) this;
        }

        public Criteria andMastAcctNumGreaterThanOrEqualTo(String value) {
            addCriterion("mast_acct_num >=", value, "mastAcctNum");
            return (Criteria) this;
        }

        public Criteria andMastAcctNumLessThan(String value) {
            addCriterion("mast_acct_num <", value, "mastAcctNum");
            return (Criteria) this;
        }

        public Criteria andMastAcctNumLessThanOrEqualTo(String value) {
            addCriterion("mast_acct_num <=", value, "mastAcctNum");
            return (Criteria) this;
        }

        public Criteria andMastAcctNumLike(String value) {
            addCriterion("mast_acct_num like", value, "mastAcctNum");
            return (Criteria) this;
        }

        public Criteria andMastAcctNumNotLike(String value) {
            addCriterion("mast_acct_num not like", value, "mastAcctNum");
            return (Criteria) this;
        }

        public Criteria andMastAcctNumIn(List<String> values) {
            addCriterion("mast_acct_num in", values, "mastAcctNum");
            return (Criteria) this;
        }

        public Criteria andMastAcctNumNotIn(List<String> values) {
            addCriterion("mast_acct_num not in", values, "mastAcctNum");
            return (Criteria) this;
        }

        public Criteria andMastAcctNumBetween(String value1, String value2) {
            addCriterion("mast_acct_num between", value1, value2, "mastAcctNum");
            return (Criteria) this;
        }

        public Criteria andMastAcctNumNotBetween(String value1, String value2) {
            addCriterion("mast_acct_num not between", value1, value2, "mastAcctNum");
            return (Criteria) this;
        }

        public Criteria andPlatformIsNull() {
            addCriterion("platform is null");
            return (Criteria) this;
        }

        public Criteria andPlatformIsNotNull() {
            addCriterion("platform is not null");
            return (Criteria) this;
        }

        public Criteria andPlatformEqualTo(String value) {
            addCriterion("platform =", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotEqualTo(String value) {
            addCriterion("platform <>", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformGreaterThan(String value) {
            addCriterion("platform >", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformGreaterThanOrEqualTo(String value) {
            addCriterion("platform >=", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformLessThan(String value) {
            addCriterion("platform <", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformLessThanOrEqualTo(String value) {
            addCriterion("platform <=", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformLike(String value) {
            addCriterion("platform like", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotLike(String value) {
            addCriterion("platform not like", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformIn(List<String> values) {
            addCriterion("platform in", values, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotIn(List<String> values) {
            addCriterion("platform not in", values, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformBetween(String value1, String value2) {
            addCriterion("platform between", value1, value2, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotBetween(String value1, String value2) {
            addCriterion("platform not between", value1, value2, "platform");
            return (Criteria) this;
        }

        public Criteria andChannelIsNull() {
            addCriterion("channel is null");
            return (Criteria) this;
        }

        public Criteria andChannelIsNotNull() {
            addCriterion("channel is not null");
            return (Criteria) this;
        }

        public Criteria andChannelEqualTo(String value) {
            addCriterion("channel =", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotEqualTo(String value) {
            addCriterion("channel <>", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelGreaterThan(String value) {
            addCriterion("channel >", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelGreaterThanOrEqualTo(String value) {
            addCriterion("channel >=", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLessThan(String value) {
            addCriterion("channel <", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLessThanOrEqualTo(String value) {
            addCriterion("channel <=", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLike(String value) {
            addCriterion("channel like", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotLike(String value) {
            addCriterion("channel not like", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelIn(List<String> values) {
            addCriterion("channel in", values, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotIn(List<String> values) {
            addCriterion("channel not in", values, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelBetween(String value1, String value2) {
            addCriterion("channel between", value1, value2, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotBetween(String value1, String value2) {
            addCriterion("channel not between", value1, value2, "channel");
            return (Criteria) this;
        }

        public Criteria andCustIdIsNull() {
            addCriterion("cust_id is null");
            return (Criteria) this;
        }

        public Criteria andCustIdIsNotNull() {
            addCriterion("cust_id is not null");
            return (Criteria) this;
        }

        public Criteria andCustIdEqualTo(Long value) {
            addCriterion("cust_id =", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotEqualTo(Long value) {
            addCriterion("cust_id <>", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdGreaterThan(Long value) {
            addCriterion("cust_id >", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdGreaterThanOrEqualTo(Long value) {
            addCriterion("cust_id >=", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdLessThan(Long value) {
            addCriterion("cust_id <", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdLessThanOrEqualTo(Long value) {
            addCriterion("cust_id <=", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdIn(List<Long> values) {
            addCriterion("cust_id in", values, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotIn(List<Long> values) {
            addCriterion("cust_id not in", values, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdBetween(Long value1, Long value2) {
            addCriterion("cust_id between", value1, value2, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotBetween(Long value1, Long value2) {
            addCriterion("cust_id not between", value1, value2, "custId");
            return (Criteria) this;
        }

        public Criteria andMerCustIdIsNull() {
            addCriterion("mer_cust_id is null");
            return (Criteria) this;
        }

        public Criteria andMerCustIdIsNotNull() {
            addCriterion("mer_cust_id is not null");
            return (Criteria) this;
        }

        public Criteria andMerCustIdEqualTo(String value) {
            addCriterion("mer_cust_id =", value, "merCustId");
            return (Criteria) this;
        }

        public Criteria andMerCustIdNotEqualTo(String value) {
            addCriterion("mer_cust_id <>", value, "merCustId");
            return (Criteria) this;
        }

        public Criteria andMerCustIdGreaterThan(String value) {
            addCriterion("mer_cust_id >", value, "merCustId");
            return (Criteria) this;
        }

        public Criteria andMerCustIdGreaterThanOrEqualTo(String value) {
            addCriterion("mer_cust_id >=", value, "merCustId");
            return (Criteria) this;
        }

        public Criteria andMerCustIdLessThan(String value) {
            addCriterion("mer_cust_id <", value, "merCustId");
            return (Criteria) this;
        }

        public Criteria andMerCustIdLessThanOrEqualTo(String value) {
            addCriterion("mer_cust_id <=", value, "merCustId");
            return (Criteria) this;
        }

        public Criteria andMerCustIdLike(String value) {
            addCriterion("mer_cust_id like", value, "merCustId");
            return (Criteria) this;
        }

        public Criteria andMerCustIdNotLike(String value) {
            addCriterion("mer_cust_id not like", value, "merCustId");
            return (Criteria) this;
        }

        public Criteria andMerCustIdIn(List<String> values) {
            addCriterion("mer_cust_id in", values, "merCustId");
            return (Criteria) this;
        }

        public Criteria andMerCustIdNotIn(List<String> values) {
            addCriterion("mer_cust_id not in", values, "merCustId");
            return (Criteria) this;
        }

        public Criteria andMerCustIdBetween(String value1, String value2) {
            addCriterion("mer_cust_id between", value1, value2, "merCustId");
            return (Criteria) this;
        }

        public Criteria andMerCustIdNotBetween(String value1, String value2) {
            addCriterion("mer_cust_id not between", value1, value2, "merCustId");
            return (Criteria) this;
        }

        public Criteria andMerCodeIsNull() {
            addCriterion("mer_code is null");
            return (Criteria) this;
        }

        public Criteria andMerCodeIsNotNull() {
            addCriterion("mer_code is not null");
            return (Criteria) this;
        }

        public Criteria andMerCodeEqualTo(String value) {
            addCriterion("mer_code =", value, "merCode");
            return (Criteria) this;
        }

        public Criteria andMerCodeNotEqualTo(String value) {
            addCriterion("mer_code <>", value, "merCode");
            return (Criteria) this;
        }

        public Criteria andMerCodeGreaterThan(String value) {
            addCriterion("mer_code >", value, "merCode");
            return (Criteria) this;
        }

        public Criteria andMerCodeGreaterThanOrEqualTo(String value) {
            addCriterion("mer_code >=", value, "merCode");
            return (Criteria) this;
        }

        public Criteria andMerCodeLessThan(String value) {
            addCriterion("mer_code <", value, "merCode");
            return (Criteria) this;
        }

        public Criteria andMerCodeLessThanOrEqualTo(String value) {
            addCriterion("mer_code <=", value, "merCode");
            return (Criteria) this;
        }

        public Criteria andMerCodeLike(String value) {
            addCriterion("mer_code like", value, "merCode");
            return (Criteria) this;
        }

        public Criteria andMerCodeNotLike(String value) {
            addCriterion("mer_code not like", value, "merCode");
            return (Criteria) this;
        }

        public Criteria andMerCodeIn(List<String> values) {
            addCriterion("mer_code in", values, "merCode");
            return (Criteria) this;
        }

        public Criteria andMerCodeNotIn(List<String> values) {
            addCriterion("mer_code not in", values, "merCode");
            return (Criteria) this;
        }

        public Criteria andMerCodeBetween(String value1, String value2) {
            addCriterion("mer_code between", value1, value2, "merCode");
            return (Criteria) this;
        }

        public Criteria andMerCodeNotBetween(String value1, String value2) {
            addCriterion("mer_code not between", value1, value2, "merCode");
            return (Criteria) this;
        }

        public Criteria andMerCustNameIsNull() {
            addCriterion("mer_cust_name is null");
            return (Criteria) this;
        }

        public Criteria andMerCustNameIsNotNull() {
            addCriterion("mer_cust_name is not null");
            return (Criteria) this;
        }

        public Criteria andMerCustNameEqualTo(String value) {
            addCriterion("mer_cust_name =", value, "merCustName");
            return (Criteria) this;
        }

        public Criteria andMerCustNameNotEqualTo(String value) {
            addCriterion("mer_cust_name <>", value, "merCustName");
            return (Criteria) this;
        }

        public Criteria andMerCustNameGreaterThan(String value) {
            addCriterion("mer_cust_name >", value, "merCustName");
            return (Criteria) this;
        }

        public Criteria andMerCustNameGreaterThanOrEqualTo(String value) {
            addCriterion("mer_cust_name >=", value, "merCustName");
            return (Criteria) this;
        }

        public Criteria andMerCustNameLessThan(String value) {
            addCriterion("mer_cust_name <", value, "merCustName");
            return (Criteria) this;
        }

        public Criteria andMerCustNameLessThanOrEqualTo(String value) {
            addCriterion("mer_cust_name <=", value, "merCustName");
            return (Criteria) this;
        }

        public Criteria andMerCustNameLike(String value) {
            addCriterion("mer_cust_name like", value, "merCustName");
            return (Criteria) this;
        }

        public Criteria andMerCustNameNotLike(String value) {
            addCriterion("mer_cust_name not like", value, "merCustName");
            return (Criteria) this;
        }

        public Criteria andMerCustNameIn(List<String> values) {
            addCriterion("mer_cust_name in", values, "merCustName");
            return (Criteria) this;
        }

        public Criteria andMerCustNameNotIn(List<String> values) {
            addCriterion("mer_cust_name not in", values, "merCustName");
            return (Criteria) this;
        }

        public Criteria andMerCustNameBetween(String value1, String value2) {
            addCriterion("mer_cust_name between", value1, value2, "merCustName");
            return (Criteria) this;
        }

        public Criteria andMerCustNameNotBetween(String value1, String value2) {
            addCriterion("mer_cust_name not between", value1, value2, "merCustName");
            return (Criteria) this;
        }

        public Criteria andTotalBalanceIsNull() {
            addCriterion("total_balance is null");
            return (Criteria) this;
        }

        public Criteria andTotalBalanceIsNotNull() {
            addCriterion("total_balance is not null");
            return (Criteria) this;
        }

        public Criteria andTotalBalanceEqualTo(BigDecimal value) {
            addCriterion("total_balance =", value, "totalBalance");
            return (Criteria) this;
        }

        public Criteria andTotalBalanceNotEqualTo(BigDecimal value) {
            addCriterion("total_balance <>", value, "totalBalance");
            return (Criteria) this;
        }

        public Criteria andTotalBalanceGreaterThan(BigDecimal value) {
            addCriterion("total_balance >", value, "totalBalance");
            return (Criteria) this;
        }

        public Criteria andTotalBalanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("total_balance >=", value, "totalBalance");
            return (Criteria) this;
        }

        public Criteria andTotalBalanceLessThan(BigDecimal value) {
            addCriterion("total_balance <", value, "totalBalance");
            return (Criteria) this;
        }

        public Criteria andTotalBalanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("total_balance <=", value, "totalBalance");
            return (Criteria) this;
        }

        public Criteria andTotalBalanceIn(List<BigDecimal> values) {
            addCriterion("total_balance in", values, "totalBalance");
            return (Criteria) this;
        }

        public Criteria andTotalBalanceNotIn(List<BigDecimal> values) {
            addCriterion("total_balance not in", values, "totalBalance");
            return (Criteria) this;
        }

        public Criteria andTotalBalanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_balance between", value1, value2, "totalBalance");
            return (Criteria) this;
        }

        public Criteria andTotalBalanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_balance not between", value1, value2, "totalBalance");
            return (Criteria) this;
        }

        public Criteria andAvailableBalanceIsNull() {
            addCriterion("available_balance is null");
            return (Criteria) this;
        }

        public Criteria andAvailableBalanceIsNotNull() {
            addCriterion("available_balance is not null");
            return (Criteria) this;
        }

        public Criteria andAvailableBalanceEqualTo(BigDecimal value) {
            addCriterion("available_balance =", value, "availableBalance");
            return (Criteria) this;
        }

        public Criteria andAvailableBalanceNotEqualTo(BigDecimal value) {
            addCriterion("available_balance <>", value, "availableBalance");
            return (Criteria) this;
        }

        public Criteria andAvailableBalanceGreaterThan(BigDecimal value) {
            addCriterion("available_balance >", value, "availableBalance");
            return (Criteria) this;
        }

        public Criteria andAvailableBalanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("available_balance >=", value, "availableBalance");
            return (Criteria) this;
        }

        public Criteria andAvailableBalanceLessThan(BigDecimal value) {
            addCriterion("available_balance <", value, "availableBalance");
            return (Criteria) this;
        }

        public Criteria andAvailableBalanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("available_balance <=", value, "availableBalance");
            return (Criteria) this;
        }

        public Criteria andAvailableBalanceIn(List<BigDecimal> values) {
            addCriterion("available_balance in", values, "availableBalance");
            return (Criteria) this;
        }

        public Criteria andAvailableBalanceNotIn(List<BigDecimal> values) {
            addCriterion("available_balance not in", values, "availableBalance");
            return (Criteria) this;
        }

        public Criteria andAvailableBalanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("available_balance between", value1, value2, "availableBalance");
            return (Criteria) this;
        }

        public Criteria andAvailableBalanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("available_balance not between", value1, value2, "availableBalance");
            return (Criteria) this;
        }

        public Criteria andAvailableDrawBalanceIsNull() {
            addCriterion("available_draw_balance is null");
            return (Criteria) this;
        }

        public Criteria andAvailableDrawBalanceIsNotNull() {
            addCriterion("available_draw_balance is not null");
            return (Criteria) this;
        }

        public Criteria andAvailableDrawBalanceEqualTo(BigDecimal value) {
            addCriterion("available_draw_balance =", value, "availableDrawBalance");
            return (Criteria) this;
        }

        public Criteria andAvailableDrawBalanceNotEqualTo(BigDecimal value) {
            addCriterion("available_draw_balance <>", value, "availableDrawBalance");
            return (Criteria) this;
        }

        public Criteria andAvailableDrawBalanceGreaterThan(BigDecimal value) {
            addCriterion("available_draw_balance >", value, "availableDrawBalance");
            return (Criteria) this;
        }

        public Criteria andAvailableDrawBalanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("available_draw_balance >=", value, "availableDrawBalance");
            return (Criteria) this;
        }

        public Criteria andAvailableDrawBalanceLessThan(BigDecimal value) {
            addCriterion("available_draw_balance <", value, "availableDrawBalance");
            return (Criteria) this;
        }

        public Criteria andAvailableDrawBalanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("available_draw_balance <=", value, "availableDrawBalance");
            return (Criteria) this;
        }

        public Criteria andAvailableDrawBalanceIn(List<BigDecimal> values) {
            addCriterion("available_draw_balance in", values, "availableDrawBalance");
            return (Criteria) this;
        }

        public Criteria andAvailableDrawBalanceNotIn(List<BigDecimal> values) {
            addCriterion("available_draw_balance not in", values, "availableDrawBalance");
            return (Criteria) this;
        }

        public Criteria andAvailableDrawBalanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("available_draw_balance between", value1, value2, "availableDrawBalance");
            return (Criteria) this;
        }

        public Criteria andAvailableDrawBalanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("available_draw_balance not between", value1, value2, "availableDrawBalance");
            return (Criteria) this;
        }

        public Criteria andFrozenBalanceIsNull() {
            addCriterion("frozen_balance is null");
            return (Criteria) this;
        }

        public Criteria andFrozenBalanceIsNotNull() {
            addCriterion("frozen_balance is not null");
            return (Criteria) this;
        }

        public Criteria andFrozenBalanceEqualTo(BigDecimal value) {
            addCriterion("frozen_balance =", value, "frozenBalance");
            return (Criteria) this;
        }

        public Criteria andFrozenBalanceNotEqualTo(BigDecimal value) {
            addCriterion("frozen_balance <>", value, "frozenBalance");
            return (Criteria) this;
        }

        public Criteria andFrozenBalanceGreaterThan(BigDecimal value) {
            addCriterion("frozen_balance >", value, "frozenBalance");
            return (Criteria) this;
        }

        public Criteria andFrozenBalanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("frozen_balance >=", value, "frozenBalance");
            return (Criteria) this;
        }

        public Criteria andFrozenBalanceLessThan(BigDecimal value) {
            addCriterion("frozen_balance <", value, "frozenBalance");
            return (Criteria) this;
        }

        public Criteria andFrozenBalanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("frozen_balance <=", value, "frozenBalance");
            return (Criteria) this;
        }

        public Criteria andFrozenBalanceIn(List<BigDecimal> values) {
            addCriterion("frozen_balance in", values, "frozenBalance");
            return (Criteria) this;
        }

        public Criteria andFrozenBalanceNotIn(List<BigDecimal> values) {
            addCriterion("frozen_balance not in", values, "frozenBalance");
            return (Criteria) this;
        }

        public Criteria andFrozenBalanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("frozen_balance between", value1, value2, "frozenBalance");
            return (Criteria) this;
        }

        public Criteria andFrozenBalanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("frozen_balance not between", value1, value2, "frozenBalance");
            return (Criteria) this;
        }

        public Criteria andPendingPaymentBalanceIsNull() {
            addCriterion("pending_payment_balance is null");
            return (Criteria) this;
        }

        public Criteria andPendingPaymentBalanceIsNotNull() {
            addCriterion("pending_payment_balance is not null");
            return (Criteria) this;
        }

        public Criteria andPendingPaymentBalanceEqualTo(BigDecimal value) {
            addCriterion("pending_payment_balance =", value, "pendingPaymentBalance");
            return (Criteria) this;
        }

        public Criteria andPendingPaymentBalanceNotEqualTo(BigDecimal value) {
            addCriterion("pending_payment_balance <>", value, "pendingPaymentBalance");
            return (Criteria) this;
        }

        public Criteria andPendingPaymentBalanceGreaterThan(BigDecimal value) {
            addCriterion("pending_payment_balance >", value, "pendingPaymentBalance");
            return (Criteria) this;
        }

        public Criteria andPendingPaymentBalanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("pending_payment_balance >=", value, "pendingPaymentBalance");
            return (Criteria) this;
        }

        public Criteria andPendingPaymentBalanceLessThan(BigDecimal value) {
            addCriterion("pending_payment_balance <", value, "pendingPaymentBalance");
            return (Criteria) this;
        }

        public Criteria andPendingPaymentBalanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("pending_payment_balance <=", value, "pendingPaymentBalance");
            return (Criteria) this;
        }

        public Criteria andPendingPaymentBalanceIn(List<BigDecimal> values) {
            addCriterion("pending_payment_balance in", values, "pendingPaymentBalance");
            return (Criteria) this;
        }

        public Criteria andPendingPaymentBalanceNotIn(List<BigDecimal> values) {
            addCriterion("pending_payment_balance not in", values, "pendingPaymentBalance");
            return (Criteria) this;
        }

        public Criteria andPendingPaymentBalanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pending_payment_balance between", value1, value2, "pendingPaymentBalance");
            return (Criteria) this;
        }

        public Criteria andPendingPaymentBalanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pending_payment_balance not between", value1, value2, "pendingPaymentBalance");
            return (Criteria) this;
        }

        public Criteria andPreMinusAmtIsNull() {
            addCriterion("pre_minus_amt is null");
            return (Criteria) this;
        }

        public Criteria andPreMinusAmtIsNotNull() {
            addCriterion("pre_minus_amt is not null");
            return (Criteria) this;
        }

        public Criteria andPreMinusAmtEqualTo(BigDecimal value) {
            addCriterion("pre_minus_amt =", value, "preMinusAmt");
            return (Criteria) this;
        }

        public Criteria andPreMinusAmtNotEqualTo(BigDecimal value) {
            addCriterion("pre_minus_amt <>", value, "preMinusAmt");
            return (Criteria) this;
        }

        public Criteria andPreMinusAmtGreaterThan(BigDecimal value) {
            addCriterion("pre_minus_amt >", value, "preMinusAmt");
            return (Criteria) this;
        }

        public Criteria andPreMinusAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("pre_minus_amt >=", value, "preMinusAmt");
            return (Criteria) this;
        }

        public Criteria andPreMinusAmtLessThan(BigDecimal value) {
            addCriterion("pre_minus_amt <", value, "preMinusAmt");
            return (Criteria) this;
        }

        public Criteria andPreMinusAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("pre_minus_amt <=", value, "preMinusAmt");
            return (Criteria) this;
        }

        public Criteria andPreMinusAmtIn(List<BigDecimal> values) {
            addCriterion("pre_minus_amt in", values, "preMinusAmt");
            return (Criteria) this;
        }

        public Criteria andPreMinusAmtNotIn(List<BigDecimal> values) {
            addCriterion("pre_minus_amt not in", values, "preMinusAmt");
            return (Criteria) this;
        }

        public Criteria andPreMinusAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pre_minus_amt between", value1, value2, "preMinusAmt");
            return (Criteria) this;
        }

        public Criteria andPreMinusAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pre_minus_amt not between", value1, value2, "preMinusAmt");
            return (Criteria) this;
        }

        public Criteria andTotalModCountIsNull() {
            addCriterion("total_mod_count is null");
            return (Criteria) this;
        }

        public Criteria andTotalModCountIsNotNull() {
            addCriterion("total_mod_count is not null");
            return (Criteria) this;
        }

        public Criteria andTotalModCountEqualTo(Integer value) {
            addCriterion("total_mod_count =", value, "totalModCount");
            return (Criteria) this;
        }

        public Criteria andTotalModCountNotEqualTo(Integer value) {
            addCriterion("total_mod_count <>", value, "totalModCount");
            return (Criteria) this;
        }

        public Criteria andTotalModCountGreaterThan(Integer value) {
            addCriterion("total_mod_count >", value, "totalModCount");
            return (Criteria) this;
        }

        public Criteria andTotalModCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_mod_count >=", value, "totalModCount");
            return (Criteria) this;
        }

        public Criteria andTotalModCountLessThan(Integer value) {
            addCriterion("total_mod_count <", value, "totalModCount");
            return (Criteria) this;
        }

        public Criteria andTotalModCountLessThanOrEqualTo(Integer value) {
            addCriterion("total_mod_count <=", value, "totalModCount");
            return (Criteria) this;
        }

        public Criteria andTotalModCountIn(List<Integer> values) {
            addCriterion("total_mod_count in", values, "totalModCount");
            return (Criteria) this;
        }

        public Criteria andTotalModCountNotIn(List<Integer> values) {
            addCriterion("total_mod_count not in", values, "totalModCount");
            return (Criteria) this;
        }

        public Criteria andTotalModCountBetween(Integer value1, Integer value2) {
            addCriterion("total_mod_count between", value1, value2, "totalModCount");
            return (Criteria) this;
        }

        public Criteria andTotalModCountNotBetween(Integer value1, Integer value2) {
            addCriterion("total_mod_count not between", value1, value2, "totalModCount");
            return (Criteria) this;
        }

        public Criteria andCumDrAmtIsNull() {
            addCriterion("cum_dr_amt is null");
            return (Criteria) this;
        }

        public Criteria andCumDrAmtIsNotNull() {
            addCriterion("cum_dr_amt is not null");
            return (Criteria) this;
        }

        public Criteria andCumDrAmtEqualTo(BigDecimal value) {
            addCriterion("cum_dr_amt =", value, "cumDrAmt");
            return (Criteria) this;
        }

        public Criteria andCumDrAmtNotEqualTo(BigDecimal value) {
            addCriterion("cum_dr_amt <>", value, "cumDrAmt");
            return (Criteria) this;
        }

        public Criteria andCumDrAmtGreaterThan(BigDecimal value) {
            addCriterion("cum_dr_amt >", value, "cumDrAmt");
            return (Criteria) this;
        }

        public Criteria andCumDrAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("cum_dr_amt >=", value, "cumDrAmt");
            return (Criteria) this;
        }

        public Criteria andCumDrAmtLessThan(BigDecimal value) {
            addCriterion("cum_dr_amt <", value, "cumDrAmt");
            return (Criteria) this;
        }

        public Criteria andCumDrAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("cum_dr_amt <=", value, "cumDrAmt");
            return (Criteria) this;
        }

        public Criteria andCumDrAmtIn(List<BigDecimal> values) {
            addCriterion("cum_dr_amt in", values, "cumDrAmt");
            return (Criteria) this;
        }

        public Criteria andCumDrAmtNotIn(List<BigDecimal> values) {
            addCriterion("cum_dr_amt not in", values, "cumDrAmt");
            return (Criteria) this;
        }

        public Criteria andCumDrAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cum_dr_amt between", value1, value2, "cumDrAmt");
            return (Criteria) this;
        }

        public Criteria andCumDrAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cum_dr_amt not between", value1, value2, "cumDrAmt");
            return (Criteria) this;
        }

        public Criteria andCumCrAmtIsNull() {
            addCriterion("cum_cr_amt is null");
            return (Criteria) this;
        }

        public Criteria andCumCrAmtIsNotNull() {
            addCriterion("cum_cr_amt is not null");
            return (Criteria) this;
        }

        public Criteria andCumCrAmtEqualTo(BigDecimal value) {
            addCriterion("cum_cr_amt =", value, "cumCrAmt");
            return (Criteria) this;
        }

        public Criteria andCumCrAmtNotEqualTo(BigDecimal value) {
            addCriterion("cum_cr_amt <>", value, "cumCrAmt");
            return (Criteria) this;
        }

        public Criteria andCumCrAmtGreaterThan(BigDecimal value) {
            addCriterion("cum_cr_amt >", value, "cumCrAmt");
            return (Criteria) this;
        }

        public Criteria andCumCrAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("cum_cr_amt >=", value, "cumCrAmt");
            return (Criteria) this;
        }

        public Criteria andCumCrAmtLessThan(BigDecimal value) {
            addCriterion("cum_cr_amt <", value, "cumCrAmt");
            return (Criteria) this;
        }

        public Criteria andCumCrAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("cum_cr_amt <=", value, "cumCrAmt");
            return (Criteria) this;
        }

        public Criteria andCumCrAmtIn(List<BigDecimal> values) {
            addCriterion("cum_cr_amt in", values, "cumCrAmt");
            return (Criteria) this;
        }

        public Criteria andCumCrAmtNotIn(List<BigDecimal> values) {
            addCriterion("cum_cr_amt not in", values, "cumCrAmt");
            return (Criteria) this;
        }

        public Criteria andCumCrAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cum_cr_amt between", value1, value2, "cumCrAmt");
            return (Criteria) this;
        }

        public Criteria andCumCrAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cum_cr_amt not between", value1, value2, "cumCrAmt");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andOptIdIsNull() {
            addCriterion("opt_id is null");
            return (Criteria) this;
        }

        public Criteria andOptIdIsNotNull() {
            addCriterion("opt_id is not null");
            return (Criteria) this;
        }

        public Criteria andOptIdEqualTo(Long value) {
            addCriterion("opt_id =", value, "optId");
            return (Criteria) this;
        }

        public Criteria andOptIdNotEqualTo(Long value) {
            addCriterion("opt_id <>", value, "optId");
            return (Criteria) this;
        }

        public Criteria andOptIdGreaterThan(Long value) {
            addCriterion("opt_id >", value, "optId");
            return (Criteria) this;
        }

        public Criteria andOptIdGreaterThanOrEqualTo(Long value) {
            addCriterion("opt_id >=", value, "optId");
            return (Criteria) this;
        }

        public Criteria andOptIdLessThan(Long value) {
            addCriterion("opt_id <", value, "optId");
            return (Criteria) this;
        }

        public Criteria andOptIdLessThanOrEqualTo(Long value) {
            addCriterion("opt_id <=", value, "optId");
            return (Criteria) this;
        }

        public Criteria andOptIdIn(List<Long> values) {
            addCriterion("opt_id in", values, "optId");
            return (Criteria) this;
        }

        public Criteria andOptIdNotIn(List<Long> values) {
            addCriterion("opt_id not in", values, "optId");
            return (Criteria) this;
        }

        public Criteria andOptIdBetween(Long value1, Long value2) {
            addCriterion("opt_id between", value1, value2, "optId");
            return (Criteria) this;
        }

        public Criteria andOptIdNotBetween(Long value1, Long value2) {
            addCriterion("opt_id not between", value1, value2, "optId");
            return (Criteria) this;
        }

        public Criteria andLastUserIdIsNull() {
            addCriterion("last_user_id is null");
            return (Criteria) this;
        }

        public Criteria andLastUserIdIsNotNull() {
            addCriterion("last_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andLastUserIdEqualTo(String value) {
            addCriterion("last_user_id =", value, "lastUserId");
            return (Criteria) this;
        }

        public Criteria andLastUserIdNotEqualTo(String value) {
            addCriterion("last_user_id <>", value, "lastUserId");
            return (Criteria) this;
        }

        public Criteria andLastUserIdGreaterThan(String value) {
            addCriterion("last_user_id >", value, "lastUserId");
            return (Criteria) this;
        }

        public Criteria andLastUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("last_user_id >=", value, "lastUserId");
            return (Criteria) this;
        }

        public Criteria andLastUserIdLessThan(String value) {
            addCriterion("last_user_id <", value, "lastUserId");
            return (Criteria) this;
        }

        public Criteria andLastUserIdLessThanOrEqualTo(String value) {
            addCriterion("last_user_id <=", value, "lastUserId");
            return (Criteria) this;
        }

        public Criteria andLastUserIdLike(String value) {
            addCriterion("last_user_id like", value, "lastUserId");
            return (Criteria) this;
        }

        public Criteria andLastUserIdNotLike(String value) {
            addCriterion("last_user_id not like", value, "lastUserId");
            return (Criteria) this;
        }

        public Criteria andLastUserIdIn(List<String> values) {
            addCriterion("last_user_id in", values, "lastUserId");
            return (Criteria) this;
        }

        public Criteria andLastUserIdNotIn(List<String> values) {
            addCriterion("last_user_id not in", values, "lastUserId");
            return (Criteria) this;
        }

        public Criteria andLastUserIdBetween(String value1, String value2) {
            addCriterion("last_user_id between", value1, value2, "lastUserId");
            return (Criteria) this;
        }

        public Criteria andLastUserIdNotBetween(String value1, String value2) {
            addCriterion("last_user_id not between", value1, value2, "lastUserId");
            return (Criteria) this;
        }

        public Criteria andLastTimeIsNull() {
            addCriterion("last_time is null");
            return (Criteria) this;
        }

        public Criteria andLastTimeIsNotNull() {
            addCriterion("last_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastTimeEqualTo(Date value) {
            addCriterion("last_time =", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeNotEqualTo(Date value) {
            addCriterion("last_time <>", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeGreaterThan(Date value) {
            addCriterion("last_time >", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_time >=", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeLessThan(Date value) {
            addCriterion("last_time <", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeLessThanOrEqualTo(Date value) {
            addCriterion("last_time <=", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeIn(List<Date> values) {
            addCriterion("last_time in", values, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeNotIn(List<Date> values) {
            addCriterion("last_time not in", values, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeBetween(Date value1, Date value2) {
            addCriterion("last_time between", value1, value2, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeNotBetween(Date value1, Date value2) {
            addCriterion("last_time not between", value1, value2, "lastTime");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}