package com.squirrel.st.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AccountExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AccountExample() {
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

        public Criteria andAcctNumIsNull() {
            addCriterion("acct_num is null");
            return (Criteria) this;
        }

        public Criteria andAcctNumIsNotNull() {
            addCriterion("acct_num is not null");
            return (Criteria) this;
        }

        public Criteria andAcctNumEqualTo(String value) {
            addCriterion("acct_num =", value, "acctNum");
            return (Criteria) this;
        }

        public Criteria andAcctNumNotEqualTo(String value) {
            addCriterion("acct_num <>", value, "acctNum");
            return (Criteria) this;
        }

        public Criteria andAcctNumGreaterThan(String value) {
            addCriterion("acct_num >", value, "acctNum");
            return (Criteria) this;
        }

        public Criteria andAcctNumGreaterThanOrEqualTo(String value) {
            addCriterion("acct_num >=", value, "acctNum");
            return (Criteria) this;
        }

        public Criteria andAcctNumLessThan(String value) {
            addCriterion("acct_num <", value, "acctNum");
            return (Criteria) this;
        }

        public Criteria andAcctNumLessThanOrEqualTo(String value) {
            addCriterion("acct_num <=", value, "acctNum");
            return (Criteria) this;
        }

        public Criteria andAcctNumLike(String value) {
            addCriterion("acct_num like", value, "acctNum");
            return (Criteria) this;
        }

        public Criteria andAcctNumNotLike(String value) {
            addCriterion("acct_num not like", value, "acctNum");
            return (Criteria) this;
        }

        public Criteria andAcctNumIn(List<String> values) {
            addCriterion("acct_num in", values, "acctNum");
            return (Criteria) this;
        }

        public Criteria andAcctNumNotIn(List<String> values) {
            addCriterion("acct_num not in", values, "acctNum");
            return (Criteria) this;
        }

        public Criteria andAcctNumBetween(String value1, String value2) {
            addCriterion("acct_num between", value1, value2, "acctNum");
            return (Criteria) this;
        }

        public Criteria andAcctNumNotBetween(String value1, String value2) {
            addCriterion("acct_num not between", value1, value2, "acctNum");
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

        public Criteria andAcctNameIsNull() {
            addCriterion("acct_name is null");
            return (Criteria) this;
        }

        public Criteria andAcctNameIsNotNull() {
            addCriterion("acct_name is not null");
            return (Criteria) this;
        }

        public Criteria andAcctNameEqualTo(String value) {
            addCriterion("acct_name =", value, "acctName");
            return (Criteria) this;
        }

        public Criteria andAcctNameNotEqualTo(String value) {
            addCriterion("acct_name <>", value, "acctName");
            return (Criteria) this;
        }

        public Criteria andAcctNameGreaterThan(String value) {
            addCriterion("acct_name >", value, "acctName");
            return (Criteria) this;
        }

        public Criteria andAcctNameGreaterThanOrEqualTo(String value) {
            addCriterion("acct_name >=", value, "acctName");
            return (Criteria) this;
        }

        public Criteria andAcctNameLessThan(String value) {
            addCriterion("acct_name <", value, "acctName");
            return (Criteria) this;
        }

        public Criteria andAcctNameLessThanOrEqualTo(String value) {
            addCriterion("acct_name <=", value, "acctName");
            return (Criteria) this;
        }

        public Criteria andAcctNameLike(String value) {
            addCriterion("acct_name like", value, "acctName");
            return (Criteria) this;
        }

        public Criteria andAcctNameNotLike(String value) {
            addCriterion("acct_name not like", value, "acctName");
            return (Criteria) this;
        }

        public Criteria andAcctNameIn(List<String> values) {
            addCriterion("acct_name in", values, "acctName");
            return (Criteria) this;
        }

        public Criteria andAcctNameNotIn(List<String> values) {
            addCriterion("acct_name not in", values, "acctName");
            return (Criteria) this;
        }

        public Criteria andAcctNameBetween(String value1, String value2) {
            addCriterion("acct_name between", value1, value2, "acctName");
            return (Criteria) this;
        }

        public Criteria andAcctNameNotBetween(String value1, String value2) {
            addCriterion("acct_name not between", value1, value2, "acctName");
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

        public Criteria andIsEnabledIsNull() {
            addCriterion("is_enabled is null");
            return (Criteria) this;
        }

        public Criteria andIsEnabledIsNotNull() {
            addCriterion("is_enabled is not null");
            return (Criteria) this;
        }

        public Criteria andIsEnabledEqualTo(Boolean value) {
            addCriterion("is_enabled =", value, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsEnabledNotEqualTo(Boolean value) {
            addCriterion("is_enabled <>", value, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsEnabledGreaterThan(Boolean value) {
            addCriterion("is_enabled >", value, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsEnabledGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_enabled >=", value, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsEnabledLessThan(Boolean value) {
            addCriterion("is_enabled <", value, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsEnabledLessThanOrEqualTo(Boolean value) {
            addCriterion("is_enabled <=", value, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsEnabledIn(List<Boolean> values) {
            addCriterion("is_enabled in", values, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsEnabledNotIn(List<Boolean> values) {
            addCriterion("is_enabled not in", values, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsEnabledBetween(Boolean value1, Boolean value2) {
            addCriterion("is_enabled between", value1, value2, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsEnabledNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_enabled not between", value1, value2, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andHasBindBankAccountIsNull() {
            addCriterion("has_bind_bank_account is null");
            return (Criteria) this;
        }

        public Criteria andHasBindBankAccountIsNotNull() {
            addCriterion("has_bind_bank_account is not null");
            return (Criteria) this;
        }

        public Criteria andHasBindBankAccountEqualTo(Boolean value) {
            addCriterion("has_bind_bank_account =", value, "hasBindBankAccount");
            return (Criteria) this;
        }

        public Criteria andHasBindBankAccountNotEqualTo(Boolean value) {
            addCriterion("has_bind_bank_account <>", value, "hasBindBankAccount");
            return (Criteria) this;
        }

        public Criteria andHasBindBankAccountGreaterThan(Boolean value) {
            addCriterion("has_bind_bank_account >", value, "hasBindBankAccount");
            return (Criteria) this;
        }

        public Criteria andHasBindBankAccountGreaterThanOrEqualTo(Boolean value) {
            addCriterion("has_bind_bank_account >=", value, "hasBindBankAccount");
            return (Criteria) this;
        }

        public Criteria andHasBindBankAccountLessThan(Boolean value) {
            addCriterion("has_bind_bank_account <", value, "hasBindBankAccount");
            return (Criteria) this;
        }

        public Criteria andHasBindBankAccountLessThanOrEqualTo(Boolean value) {
            addCriterion("has_bind_bank_account <=", value, "hasBindBankAccount");
            return (Criteria) this;
        }

        public Criteria andHasBindBankAccountIn(List<Boolean> values) {
            addCriterion("has_bind_bank_account in", values, "hasBindBankAccount");
            return (Criteria) this;
        }

        public Criteria andHasBindBankAccountNotIn(List<Boolean> values) {
            addCriterion("has_bind_bank_account not in", values, "hasBindBankAccount");
            return (Criteria) this;
        }

        public Criteria andHasBindBankAccountBetween(Boolean value1, Boolean value2) {
            addCriterion("has_bind_bank_account between", value1, value2, "hasBindBankAccount");
            return (Criteria) this;
        }

        public Criteria andHasBindBankAccountNotBetween(Boolean value1, Boolean value2) {
            addCriterion("has_bind_bank_account not between", value1, value2, "hasBindBankAccount");
            return (Criteria) this;
        }

        public Criteria andIsPayLockedIsNull() {
            addCriterion("is_pay_locked is null");
            return (Criteria) this;
        }

        public Criteria andIsPayLockedIsNotNull() {
            addCriterion("is_pay_locked is not null");
            return (Criteria) this;
        }

        public Criteria andIsPayLockedEqualTo(Boolean value) {
            addCriterion("is_pay_locked =", value, "isPayLocked");
            return (Criteria) this;
        }

        public Criteria andIsPayLockedNotEqualTo(Boolean value) {
            addCriterion("is_pay_locked <>", value, "isPayLocked");
            return (Criteria) this;
        }

        public Criteria andIsPayLockedGreaterThan(Boolean value) {
            addCriterion("is_pay_locked >", value, "isPayLocked");
            return (Criteria) this;
        }

        public Criteria andIsPayLockedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_pay_locked >=", value, "isPayLocked");
            return (Criteria) this;
        }

        public Criteria andIsPayLockedLessThan(Boolean value) {
            addCriterion("is_pay_locked <", value, "isPayLocked");
            return (Criteria) this;
        }

        public Criteria andIsPayLockedLessThanOrEqualTo(Boolean value) {
            addCriterion("is_pay_locked <=", value, "isPayLocked");
            return (Criteria) this;
        }

        public Criteria andIsPayLockedIn(List<Boolean> values) {
            addCriterion("is_pay_locked in", values, "isPayLocked");
            return (Criteria) this;
        }

        public Criteria andIsPayLockedNotIn(List<Boolean> values) {
            addCriterion("is_pay_locked not in", values, "isPayLocked");
            return (Criteria) this;
        }

        public Criteria andIsPayLockedBetween(Boolean value1, Boolean value2) {
            addCriterion("is_pay_locked between", value1, value2, "isPayLocked");
            return (Criteria) this;
        }

        public Criteria andIsPayLockedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_pay_locked not between", value1, value2, "isPayLocked");
            return (Criteria) this;
        }

        public Criteria andIsReceiveLockedIsNull() {
            addCriterion("is_receive_locked is null");
            return (Criteria) this;
        }

        public Criteria andIsReceiveLockedIsNotNull() {
            addCriterion("is_receive_locked is not null");
            return (Criteria) this;
        }

        public Criteria andIsReceiveLockedEqualTo(Boolean value) {
            addCriterion("is_receive_locked =", value, "isReceiveLocked");
            return (Criteria) this;
        }

        public Criteria andIsReceiveLockedNotEqualTo(Boolean value) {
            addCriterion("is_receive_locked <>", value, "isReceiveLocked");
            return (Criteria) this;
        }

        public Criteria andIsReceiveLockedGreaterThan(Boolean value) {
            addCriterion("is_receive_locked >", value, "isReceiveLocked");
            return (Criteria) this;
        }

        public Criteria andIsReceiveLockedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_receive_locked >=", value, "isReceiveLocked");
            return (Criteria) this;
        }

        public Criteria andIsReceiveLockedLessThan(Boolean value) {
            addCriterion("is_receive_locked <", value, "isReceiveLocked");
            return (Criteria) this;
        }

        public Criteria andIsReceiveLockedLessThanOrEqualTo(Boolean value) {
            addCriterion("is_receive_locked <=", value, "isReceiveLocked");
            return (Criteria) this;
        }

        public Criteria andIsReceiveLockedIn(List<Boolean> values) {
            addCriterion("is_receive_locked in", values, "isReceiveLocked");
            return (Criteria) this;
        }

        public Criteria andIsReceiveLockedNotIn(List<Boolean> values) {
            addCriterion("is_receive_locked not in", values, "isReceiveLocked");
            return (Criteria) this;
        }

        public Criteria andIsReceiveLockedBetween(Boolean value1, Boolean value2) {
            addCriterion("is_receive_locked between", value1, value2, "isReceiveLocked");
            return (Criteria) this;
        }

        public Criteria andIsReceiveLockedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_receive_locked not between", value1, value2, "isReceiveLocked");
            return (Criteria) this;
        }

        public Criteria andIsDrawLockedIsNull() {
            addCriterion("is_draw_locked is null");
            return (Criteria) this;
        }

        public Criteria andIsDrawLockedIsNotNull() {
            addCriterion("is_draw_locked is not null");
            return (Criteria) this;
        }

        public Criteria andIsDrawLockedEqualTo(Boolean value) {
            addCriterion("is_draw_locked =", value, "isDrawLocked");
            return (Criteria) this;
        }

        public Criteria andIsDrawLockedNotEqualTo(Boolean value) {
            addCriterion("is_draw_locked <>", value, "isDrawLocked");
            return (Criteria) this;
        }

        public Criteria andIsDrawLockedGreaterThan(Boolean value) {
            addCriterion("is_draw_locked >", value, "isDrawLocked");
            return (Criteria) this;
        }

        public Criteria andIsDrawLockedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_draw_locked >=", value, "isDrawLocked");
            return (Criteria) this;
        }

        public Criteria andIsDrawLockedLessThan(Boolean value) {
            addCriterion("is_draw_locked <", value, "isDrawLocked");
            return (Criteria) this;
        }

        public Criteria andIsDrawLockedLessThanOrEqualTo(Boolean value) {
            addCriterion("is_draw_locked <=", value, "isDrawLocked");
            return (Criteria) this;
        }

        public Criteria andIsDrawLockedIn(List<Boolean> values) {
            addCriterion("is_draw_locked in", values, "isDrawLocked");
            return (Criteria) this;
        }

        public Criteria andIsDrawLockedNotIn(List<Boolean> values) {
            addCriterion("is_draw_locked not in", values, "isDrawLocked");
            return (Criteria) this;
        }

        public Criteria andIsDrawLockedBetween(Boolean value1, Boolean value2) {
            addCriterion("is_draw_locked between", value1, value2, "isDrawLocked");
            return (Criteria) this;
        }

        public Criteria andIsDrawLockedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_draw_locked not between", value1, value2, "isDrawLocked");
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

        public Criteria andThirdCustIdIsNull() {
            addCriterion("third_cust_id is null");
            return (Criteria) this;
        }

        public Criteria andThirdCustIdIsNotNull() {
            addCriterion("third_cust_id is not null");
            return (Criteria) this;
        }

        public Criteria andThirdCustIdEqualTo(String value) {
            addCriterion("third_cust_id =", value, "thirdCustId");
            return (Criteria) this;
        }

        public Criteria andThirdCustIdNotEqualTo(String value) {
            addCriterion("third_cust_id <>", value, "thirdCustId");
            return (Criteria) this;
        }

        public Criteria andThirdCustIdGreaterThan(String value) {
            addCriterion("third_cust_id >", value, "thirdCustId");
            return (Criteria) this;
        }

        public Criteria andThirdCustIdGreaterThanOrEqualTo(String value) {
            addCriterion("third_cust_id >=", value, "thirdCustId");
            return (Criteria) this;
        }

        public Criteria andThirdCustIdLessThan(String value) {
            addCriterion("third_cust_id <", value, "thirdCustId");
            return (Criteria) this;
        }

        public Criteria andThirdCustIdLessThanOrEqualTo(String value) {
            addCriterion("third_cust_id <=", value, "thirdCustId");
            return (Criteria) this;
        }

        public Criteria andThirdCustIdLike(String value) {
            addCriterion("third_cust_id like", value, "thirdCustId");
            return (Criteria) this;
        }

        public Criteria andThirdCustIdNotLike(String value) {
            addCriterion("third_cust_id not like", value, "thirdCustId");
            return (Criteria) this;
        }

        public Criteria andThirdCustIdIn(List<String> values) {
            addCriterion("third_cust_id in", values, "thirdCustId");
            return (Criteria) this;
        }

        public Criteria andThirdCustIdNotIn(List<String> values) {
            addCriterion("third_cust_id not in", values, "thirdCustId");
            return (Criteria) this;
        }

        public Criteria andThirdCustIdBetween(String value1, String value2) {
            addCriterion("third_cust_id between", value1, value2, "thirdCustId");
            return (Criteria) this;
        }

        public Criteria andThirdCustIdNotBetween(String value1, String value2) {
            addCriterion("third_cust_id not between", value1, value2, "thirdCustId");
            return (Criteria) this;
        }

        public Criteria andDefaultBindDetailIdIsNull() {
            addCriterion("default_bind_detail_id is null");
            return (Criteria) this;
        }

        public Criteria andDefaultBindDetailIdIsNotNull() {
            addCriterion("default_bind_detail_id is not null");
            return (Criteria) this;
        }

        public Criteria andDefaultBindDetailIdEqualTo(Long value) {
            addCriterion("default_bind_detail_id =", value, "defaultBindDetailId");
            return (Criteria) this;
        }

        public Criteria andDefaultBindDetailIdNotEqualTo(Long value) {
            addCriterion("default_bind_detail_id <>", value, "defaultBindDetailId");
            return (Criteria) this;
        }

        public Criteria andDefaultBindDetailIdGreaterThan(Long value) {
            addCriterion("default_bind_detail_id >", value, "defaultBindDetailId");
            return (Criteria) this;
        }

        public Criteria andDefaultBindDetailIdGreaterThanOrEqualTo(Long value) {
            addCriterion("default_bind_detail_id >=", value, "defaultBindDetailId");
            return (Criteria) this;
        }

        public Criteria andDefaultBindDetailIdLessThan(Long value) {
            addCriterion("default_bind_detail_id <", value, "defaultBindDetailId");
            return (Criteria) this;
        }

        public Criteria andDefaultBindDetailIdLessThanOrEqualTo(Long value) {
            addCriterion("default_bind_detail_id <=", value, "defaultBindDetailId");
            return (Criteria) this;
        }

        public Criteria andDefaultBindDetailIdIn(List<Long> values) {
            addCriterion("default_bind_detail_id in", values, "defaultBindDetailId");
            return (Criteria) this;
        }

        public Criteria andDefaultBindDetailIdNotIn(List<Long> values) {
            addCriterion("default_bind_detail_id not in", values, "defaultBindDetailId");
            return (Criteria) this;
        }

        public Criteria andDefaultBindDetailIdBetween(Long value1, Long value2) {
            addCriterion("default_bind_detail_id between", value1, value2, "defaultBindDetailId");
            return (Criteria) this;
        }

        public Criteria andDefaultBindDetailIdNotBetween(Long value1, Long value2) {
            addCriterion("default_bind_detail_id not between", value1, value2, "defaultBindDetailId");
            return (Criteria) this;
        }

        public Criteria andDelFlagIsNull() {
            addCriterion("del_flag is null");
            return (Criteria) this;
        }

        public Criteria andDelFlagIsNotNull() {
            addCriterion("del_flag is not null");
            return (Criteria) this;
        }

        public Criteria andDelFlagEqualTo(Integer value) {
            addCriterion("del_flag =", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotEqualTo(Integer value) {
            addCriterion("del_flag <>", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagGreaterThan(Integer value) {
            addCriterion("del_flag >", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("del_flag >=", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLessThan(Integer value) {
            addCriterion("del_flag <", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLessThanOrEqualTo(Integer value) {
            addCriterion("del_flag <=", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagIn(List<Integer> values) {
            addCriterion("del_flag in", values, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotIn(List<Integer> values) {
            addCriterion("del_flag not in", values, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagBetween(Integer value1, Integer value2) {
            addCriterion("del_flag between", value1, value2, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("del_flag not between", value1, value2, "delFlag");
            return (Criteria) this;
        }

        public Criteria andAcctShortNameIsNull() {
            addCriterion("acct_short_name is null");
            return (Criteria) this;
        }

        public Criteria andAcctShortNameIsNotNull() {
            addCriterion("acct_short_name is not null");
            return (Criteria) this;
        }

        public Criteria andAcctShortNameEqualTo(String value) {
            addCriterion("acct_short_name =", value, "acctShortName");
            return (Criteria) this;
        }

        public Criteria andAcctShortNameNotEqualTo(String value) {
            addCriterion("acct_short_name <>", value, "acctShortName");
            return (Criteria) this;
        }

        public Criteria andAcctShortNameGreaterThan(String value) {
            addCriterion("acct_short_name >", value, "acctShortName");
            return (Criteria) this;
        }

        public Criteria andAcctShortNameGreaterThanOrEqualTo(String value) {
            addCriterion("acct_short_name >=", value, "acctShortName");
            return (Criteria) this;
        }

        public Criteria andAcctShortNameLessThan(String value) {
            addCriterion("acct_short_name <", value, "acctShortName");
            return (Criteria) this;
        }

        public Criteria andAcctShortNameLessThanOrEqualTo(String value) {
            addCriterion("acct_short_name <=", value, "acctShortName");
            return (Criteria) this;
        }

        public Criteria andAcctShortNameLike(String value) {
            addCriterion("acct_short_name like", value, "acctShortName");
            return (Criteria) this;
        }

        public Criteria andAcctShortNameNotLike(String value) {
            addCriterion("acct_short_name not like", value, "acctShortName");
            return (Criteria) this;
        }

        public Criteria andAcctShortNameIn(List<String> values) {
            addCriterion("acct_short_name in", values, "acctShortName");
            return (Criteria) this;
        }

        public Criteria andAcctShortNameNotIn(List<String> values) {
            addCriterion("acct_short_name not in", values, "acctShortName");
            return (Criteria) this;
        }

        public Criteria andAcctShortNameBetween(String value1, String value2) {
            addCriterion("acct_short_name between", value1, value2, "acctShortName");
            return (Criteria) this;
        }

        public Criteria andAcctShortNameNotBetween(String value1, String value2) {
            addCriterion("acct_short_name not between", value1, value2, "acctShortName");
            return (Criteria) this;
        }

        public Criteria andSchemaCodeIsNull() {
            addCriterion("schema_code is null");
            return (Criteria) this;
        }

        public Criteria andSchemaCodeIsNotNull() {
            addCriterion("schema_code is not null");
            return (Criteria) this;
        }

        public Criteria andSchemaCodeEqualTo(String value) {
            addCriterion("schema_code =", value, "schemaCode");
            return (Criteria) this;
        }

        public Criteria andSchemaCodeNotEqualTo(String value) {
            addCriterion("schema_code <>", value, "schemaCode");
            return (Criteria) this;
        }

        public Criteria andSchemaCodeGreaterThan(String value) {
            addCriterion("schema_code >", value, "schemaCode");
            return (Criteria) this;
        }

        public Criteria andSchemaCodeGreaterThanOrEqualTo(String value) {
            addCriterion("schema_code >=", value, "schemaCode");
            return (Criteria) this;
        }

        public Criteria andSchemaCodeLessThan(String value) {
            addCriterion("schema_code <", value, "schemaCode");
            return (Criteria) this;
        }

        public Criteria andSchemaCodeLessThanOrEqualTo(String value) {
            addCriterion("schema_code <=", value, "schemaCode");
            return (Criteria) this;
        }

        public Criteria andSchemaCodeLike(String value) {
            addCriterion("schema_code like", value, "schemaCode");
            return (Criteria) this;
        }

        public Criteria andSchemaCodeNotLike(String value) {
            addCriterion("schema_code not like", value, "schemaCode");
            return (Criteria) this;
        }

        public Criteria andSchemaCodeIn(List<String> values) {
            addCriterion("schema_code in", values, "schemaCode");
            return (Criteria) this;
        }

        public Criteria andSchemaCodeNotIn(List<String> values) {
            addCriterion("schema_code not in", values, "schemaCode");
            return (Criteria) this;
        }

        public Criteria andSchemaCodeBetween(String value1, String value2) {
            addCriterion("schema_code between", value1, value2, "schemaCode");
            return (Criteria) this;
        }

        public Criteria andSchemaCodeNotBetween(String value1, String value2) {
            addCriterion("schema_code not between", value1, value2, "schemaCode");
            return (Criteria) this;
        }

        public Criteria andProdCodeIsNull() {
            addCriterion("prod_code is null");
            return (Criteria) this;
        }

        public Criteria andProdCodeIsNotNull() {
            addCriterion("prod_code is not null");
            return (Criteria) this;
        }

        public Criteria andProdCodeEqualTo(String value) {
            addCriterion("prod_code =", value, "prodCode");
            return (Criteria) this;
        }

        public Criteria andProdCodeNotEqualTo(String value) {
            addCriterion("prod_code <>", value, "prodCode");
            return (Criteria) this;
        }

        public Criteria andProdCodeGreaterThan(String value) {
            addCriterion("prod_code >", value, "prodCode");
            return (Criteria) this;
        }

        public Criteria andProdCodeGreaterThanOrEqualTo(String value) {
            addCriterion("prod_code >=", value, "prodCode");
            return (Criteria) this;
        }

        public Criteria andProdCodeLessThan(String value) {
            addCriterion("prod_code <", value, "prodCode");
            return (Criteria) this;
        }

        public Criteria andProdCodeLessThanOrEqualTo(String value) {
            addCriterion("prod_code <=", value, "prodCode");
            return (Criteria) this;
        }

        public Criteria andProdCodeLike(String value) {
            addCriterion("prod_code like", value, "prodCode");
            return (Criteria) this;
        }

        public Criteria andProdCodeNotLike(String value) {
            addCriterion("prod_code not like", value, "prodCode");
            return (Criteria) this;
        }

        public Criteria andProdCodeIn(List<String> values) {
            addCriterion("prod_code in", values, "prodCode");
            return (Criteria) this;
        }

        public Criteria andProdCodeNotIn(List<String> values) {
            addCriterion("prod_code not in", values, "prodCode");
            return (Criteria) this;
        }

        public Criteria andProdCodeBetween(String value1, String value2) {
            addCriterion("prod_code between", value1, value2, "prodCode");
            return (Criteria) this;
        }

        public Criteria andProdCodeNotBetween(String value1, String value2) {
            addCriterion("prod_code not between", value1, value2, "prodCode");
            return (Criteria) this;
        }

        public Criteria andCurrencyIsNull() {
            addCriterion("currency is null");
            return (Criteria) this;
        }

        public Criteria andCurrencyIsNotNull() {
            addCriterion("currency is not null");
            return (Criteria) this;
        }

        public Criteria andCurrencyEqualTo(String value) {
            addCriterion("currency =", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotEqualTo(String value) {
            addCriterion("currency <>", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyGreaterThan(String value) {
            addCriterion("currency >", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyGreaterThanOrEqualTo(String value) {
            addCriterion("currency >=", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLessThan(String value) {
            addCriterion("currency <", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLessThanOrEqualTo(String value) {
            addCriterion("currency <=", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLike(String value) {
            addCriterion("currency like", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotLike(String value) {
            addCriterion("currency not like", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyIn(List<String> values) {
            addCriterion("currency in", values, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotIn(List<String> values) {
            addCriterion("currency not in", values, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyBetween(String value1, String value2) {
            addCriterion("currency between", value1, value2, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotBetween(String value1, String value2) {
            addCriterion("currency not between", value1, value2, "currency");
            return (Criteria) this;
        }

        public Criteria andFrezCodeIsNull() {
            addCriterion("frez_code is null");
            return (Criteria) this;
        }

        public Criteria andFrezCodeIsNotNull() {
            addCriterion("frez_code is not null");
            return (Criteria) this;
        }

        public Criteria andFrezCodeEqualTo(String value) {
            addCriterion("frez_code =", value, "frezCode");
            return (Criteria) this;
        }

        public Criteria andFrezCodeNotEqualTo(String value) {
            addCriterion("frez_code <>", value, "frezCode");
            return (Criteria) this;
        }

        public Criteria andFrezCodeGreaterThan(String value) {
            addCriterion("frez_code >", value, "frezCode");
            return (Criteria) this;
        }

        public Criteria andFrezCodeGreaterThanOrEqualTo(String value) {
            addCriterion("frez_code >=", value, "frezCode");
            return (Criteria) this;
        }

        public Criteria andFrezCodeLessThan(String value) {
            addCriterion("frez_code <", value, "frezCode");
            return (Criteria) this;
        }

        public Criteria andFrezCodeLessThanOrEqualTo(String value) {
            addCriterion("frez_code <=", value, "frezCode");
            return (Criteria) this;
        }

        public Criteria andFrezCodeLike(String value) {
            addCriterion("frez_code like", value, "frezCode");
            return (Criteria) this;
        }

        public Criteria andFrezCodeNotLike(String value) {
            addCriterion("frez_code not like", value, "frezCode");
            return (Criteria) this;
        }

        public Criteria andFrezCodeIn(List<String> values) {
            addCriterion("frez_code in", values, "frezCode");
            return (Criteria) this;
        }

        public Criteria andFrezCodeNotIn(List<String> values) {
            addCriterion("frez_code not in", values, "frezCode");
            return (Criteria) this;
        }

        public Criteria andFrezCodeBetween(String value1, String value2) {
            addCriterion("frez_code between", value1, value2, "frezCode");
            return (Criteria) this;
        }

        public Criteria andFrezCodeNotBetween(String value1, String value2) {
            addCriterion("frez_code not between", value1, value2, "frezCode");
            return (Criteria) this;
        }

        public Criteria andFrezReasonIsNull() {
            addCriterion("frez_reason is null");
            return (Criteria) this;
        }

        public Criteria andFrezReasonIsNotNull() {
            addCriterion("frez_reason is not null");
            return (Criteria) this;
        }

        public Criteria andFrezReasonEqualTo(String value) {
            addCriterion("frez_reason =", value, "frezReason");
            return (Criteria) this;
        }

        public Criteria andFrezReasonNotEqualTo(String value) {
            addCriterion("frez_reason <>", value, "frezReason");
            return (Criteria) this;
        }

        public Criteria andFrezReasonGreaterThan(String value) {
            addCriterion("frez_reason >", value, "frezReason");
            return (Criteria) this;
        }

        public Criteria andFrezReasonGreaterThanOrEqualTo(String value) {
            addCriterion("frez_reason >=", value, "frezReason");
            return (Criteria) this;
        }

        public Criteria andFrezReasonLessThan(String value) {
            addCriterion("frez_reason <", value, "frezReason");
            return (Criteria) this;
        }

        public Criteria andFrezReasonLessThanOrEqualTo(String value) {
            addCriterion("frez_reason <=", value, "frezReason");
            return (Criteria) this;
        }

        public Criteria andFrezReasonLike(String value) {
            addCriterion("frez_reason like", value, "frezReason");
            return (Criteria) this;
        }

        public Criteria andFrezReasonNotLike(String value) {
            addCriterion("frez_reason not like", value, "frezReason");
            return (Criteria) this;
        }

        public Criteria andFrezReasonIn(List<String> values) {
            addCriterion("frez_reason in", values, "frezReason");
            return (Criteria) this;
        }

        public Criteria andFrezReasonNotIn(List<String> values) {
            addCriterion("frez_reason not in", values, "frezReason");
            return (Criteria) this;
        }

        public Criteria andFrezReasonBetween(String value1, String value2) {
            addCriterion("frez_reason between", value1, value2, "frezReason");
            return (Criteria) this;
        }

        public Criteria andFrezReasonNotBetween(String value1, String value2) {
            addCriterion("frez_reason not between", value1, value2, "frezReason");
            return (Criteria) this;
        }

        public Criteria andAcctClsFlagIsNull() {
            addCriterion("acct_cls_flag is null");
            return (Criteria) this;
        }

        public Criteria andAcctClsFlagIsNotNull() {
            addCriterion("acct_cls_flag is not null");
            return (Criteria) this;
        }

        public Criteria andAcctClsFlagEqualTo(String value) {
            addCriterion("acct_cls_flag =", value, "acctClsFlag");
            return (Criteria) this;
        }

        public Criteria andAcctClsFlagNotEqualTo(String value) {
            addCriterion("acct_cls_flag <>", value, "acctClsFlag");
            return (Criteria) this;
        }

        public Criteria andAcctClsFlagGreaterThan(String value) {
            addCriterion("acct_cls_flag >", value, "acctClsFlag");
            return (Criteria) this;
        }

        public Criteria andAcctClsFlagGreaterThanOrEqualTo(String value) {
            addCriterion("acct_cls_flag >=", value, "acctClsFlag");
            return (Criteria) this;
        }

        public Criteria andAcctClsFlagLessThan(String value) {
            addCriterion("acct_cls_flag <", value, "acctClsFlag");
            return (Criteria) this;
        }

        public Criteria andAcctClsFlagLessThanOrEqualTo(String value) {
            addCriterion("acct_cls_flag <=", value, "acctClsFlag");
            return (Criteria) this;
        }

        public Criteria andAcctClsFlagLike(String value) {
            addCriterion("acct_cls_flag like", value, "acctClsFlag");
            return (Criteria) this;
        }

        public Criteria andAcctClsFlagNotLike(String value) {
            addCriterion("acct_cls_flag not like", value, "acctClsFlag");
            return (Criteria) this;
        }

        public Criteria andAcctClsFlagIn(List<String> values) {
            addCriterion("acct_cls_flag in", values, "acctClsFlag");
            return (Criteria) this;
        }

        public Criteria andAcctClsFlagNotIn(List<String> values) {
            addCriterion("acct_cls_flag not in", values, "acctClsFlag");
            return (Criteria) this;
        }

        public Criteria andAcctClsFlagBetween(String value1, String value2) {
            addCriterion("acct_cls_flag between", value1, value2, "acctClsFlag");
            return (Criteria) this;
        }

        public Criteria andAcctClsFlagNotBetween(String value1, String value2) {
            addCriterion("acct_cls_flag not between", value1, value2, "acctClsFlag");
            return (Criteria) this;
        }

        public Criteria andAcctClsDateIsNull() {
            addCriterion("acct_cls_date is null");
            return (Criteria) this;
        }

        public Criteria andAcctClsDateIsNotNull() {
            addCriterion("acct_cls_date is not null");
            return (Criteria) this;
        }

        public Criteria andAcctClsDateEqualTo(Date value) {
            addCriterion("acct_cls_date =", value, "acctClsDate");
            return (Criteria) this;
        }

        public Criteria andAcctClsDateNotEqualTo(Date value) {
            addCriterion("acct_cls_date <>", value, "acctClsDate");
            return (Criteria) this;
        }

        public Criteria andAcctClsDateGreaterThan(Date value) {
            addCriterion("acct_cls_date >", value, "acctClsDate");
            return (Criteria) this;
        }

        public Criteria andAcctClsDateGreaterThanOrEqualTo(Date value) {
            addCriterion("acct_cls_date >=", value, "acctClsDate");
            return (Criteria) this;
        }

        public Criteria andAcctClsDateLessThan(Date value) {
            addCriterion("acct_cls_date <", value, "acctClsDate");
            return (Criteria) this;
        }

        public Criteria andAcctClsDateLessThanOrEqualTo(Date value) {
            addCriterion("acct_cls_date <=", value, "acctClsDate");
            return (Criteria) this;
        }

        public Criteria andAcctClsDateIn(List<Date> values) {
            addCriterion("acct_cls_date in", values, "acctClsDate");
            return (Criteria) this;
        }

        public Criteria andAcctClsDateNotIn(List<Date> values) {
            addCriterion("acct_cls_date not in", values, "acctClsDate");
            return (Criteria) this;
        }

        public Criteria andAcctClsDateBetween(Date value1, Date value2) {
            addCriterion("acct_cls_date between", value1, value2, "acctClsDate");
            return (Criteria) this;
        }

        public Criteria andAcctClsDateNotBetween(Date value1, Date value2) {
            addCriterion("acct_cls_date not between", value1, value2, "acctClsDate");
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

        public Criteria andSpecialAcctIndIsNull() {
            addCriterion("special_acct_ind is null");
            return (Criteria) this;
        }

        public Criteria andSpecialAcctIndIsNotNull() {
            addCriterion("special_acct_ind is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialAcctIndEqualTo(String value) {
            addCriterion("special_acct_ind =", value, "specialAcctInd");
            return (Criteria) this;
        }

        public Criteria andSpecialAcctIndNotEqualTo(String value) {
            addCriterion("special_acct_ind <>", value, "specialAcctInd");
            return (Criteria) this;
        }

        public Criteria andSpecialAcctIndGreaterThan(String value) {
            addCriterion("special_acct_ind >", value, "specialAcctInd");
            return (Criteria) this;
        }

        public Criteria andSpecialAcctIndGreaterThanOrEqualTo(String value) {
            addCriterion("special_acct_ind >=", value, "specialAcctInd");
            return (Criteria) this;
        }

        public Criteria andSpecialAcctIndLessThan(String value) {
            addCriterion("special_acct_ind <", value, "specialAcctInd");
            return (Criteria) this;
        }

        public Criteria andSpecialAcctIndLessThanOrEqualTo(String value) {
            addCriterion("special_acct_ind <=", value, "specialAcctInd");
            return (Criteria) this;
        }

        public Criteria andSpecialAcctIndLike(String value) {
            addCriterion("special_acct_ind like", value, "specialAcctInd");
            return (Criteria) this;
        }

        public Criteria andSpecialAcctIndNotLike(String value) {
            addCriterion("special_acct_ind not like", value, "specialAcctInd");
            return (Criteria) this;
        }

        public Criteria andSpecialAcctIndIn(List<String> values) {
            addCriterion("special_acct_ind in", values, "specialAcctInd");
            return (Criteria) this;
        }

        public Criteria andSpecialAcctIndNotIn(List<String> values) {
            addCriterion("special_acct_ind not in", values, "specialAcctInd");
            return (Criteria) this;
        }

        public Criteria andSpecialAcctIndBetween(String value1, String value2) {
            addCriterion("special_acct_ind between", value1, value2, "specialAcctInd");
            return (Criteria) this;
        }

        public Criteria andSpecialAcctIndNotBetween(String value1, String value2) {
            addCriterion("special_acct_ind not between", value1, value2, "specialAcctInd");
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

        public Criteria andSystemOnlyAcctFlagIsNull() {
            addCriterion("system_only_acct_flag is null");
            return (Criteria) this;
        }

        public Criteria andSystemOnlyAcctFlagIsNotNull() {
            addCriterion("system_only_acct_flag is not null");
            return (Criteria) this;
        }

        public Criteria andSystemOnlyAcctFlagEqualTo(String value) {
            addCriterion("system_only_acct_flag =", value, "systemOnlyAcctFlag");
            return (Criteria) this;
        }

        public Criteria andSystemOnlyAcctFlagNotEqualTo(String value) {
            addCriterion("system_only_acct_flag <>", value, "systemOnlyAcctFlag");
            return (Criteria) this;
        }

        public Criteria andSystemOnlyAcctFlagGreaterThan(String value) {
            addCriterion("system_only_acct_flag >", value, "systemOnlyAcctFlag");
            return (Criteria) this;
        }

        public Criteria andSystemOnlyAcctFlagGreaterThanOrEqualTo(String value) {
            addCriterion("system_only_acct_flag >=", value, "systemOnlyAcctFlag");
            return (Criteria) this;
        }

        public Criteria andSystemOnlyAcctFlagLessThan(String value) {
            addCriterion("system_only_acct_flag <", value, "systemOnlyAcctFlag");
            return (Criteria) this;
        }

        public Criteria andSystemOnlyAcctFlagLessThanOrEqualTo(String value) {
            addCriterion("system_only_acct_flag <=", value, "systemOnlyAcctFlag");
            return (Criteria) this;
        }

        public Criteria andSystemOnlyAcctFlagLike(String value) {
            addCriterion("system_only_acct_flag like", value, "systemOnlyAcctFlag");
            return (Criteria) this;
        }

        public Criteria andSystemOnlyAcctFlagNotLike(String value) {
            addCriterion("system_only_acct_flag not like", value, "systemOnlyAcctFlag");
            return (Criteria) this;
        }

        public Criteria andSystemOnlyAcctFlagIn(List<String> values) {
            addCriterion("system_only_acct_flag in", values, "systemOnlyAcctFlag");
            return (Criteria) this;
        }

        public Criteria andSystemOnlyAcctFlagNotIn(List<String> values) {
            addCriterion("system_only_acct_flag not in", values, "systemOnlyAcctFlag");
            return (Criteria) this;
        }

        public Criteria andSystemOnlyAcctFlagBetween(String value1, String value2) {
            addCriterion("system_only_acct_flag between", value1, value2, "systemOnlyAcctFlag");
            return (Criteria) this;
        }

        public Criteria andSystemOnlyAcctFlagNotBetween(String value1, String value2) {
            addCriterion("system_only_acct_flag not between", value1, value2, "systemOnlyAcctFlag");
            return (Criteria) this;
        }

        public Criteria andLastFrezDateIsNull() {
            addCriterion("last_frez_date is null");
            return (Criteria) this;
        }

        public Criteria andLastFrezDateIsNotNull() {
            addCriterion("last_frez_date is not null");
            return (Criteria) this;
        }

        public Criteria andLastFrezDateEqualTo(Date value) {
            addCriterion("last_frez_date =", value, "lastFrezDate");
            return (Criteria) this;
        }

        public Criteria andLastFrezDateNotEqualTo(Date value) {
            addCriterion("last_frez_date <>", value, "lastFrezDate");
            return (Criteria) this;
        }

        public Criteria andLastFrezDateGreaterThan(Date value) {
            addCriterion("last_frez_date >", value, "lastFrezDate");
            return (Criteria) this;
        }

        public Criteria andLastFrezDateGreaterThanOrEqualTo(Date value) {
            addCriterion("last_frez_date >=", value, "lastFrezDate");
            return (Criteria) this;
        }

        public Criteria andLastFrezDateLessThan(Date value) {
            addCriterion("last_frez_date <", value, "lastFrezDate");
            return (Criteria) this;
        }

        public Criteria andLastFrezDateLessThanOrEqualTo(Date value) {
            addCriterion("last_frez_date <=", value, "lastFrezDate");
            return (Criteria) this;
        }

        public Criteria andLastFrezDateIn(List<Date> values) {
            addCriterion("last_frez_date in", values, "lastFrezDate");
            return (Criteria) this;
        }

        public Criteria andLastFrezDateNotIn(List<Date> values) {
            addCriterion("last_frez_date not in", values, "lastFrezDate");
            return (Criteria) this;
        }

        public Criteria andLastFrezDateBetween(Date value1, Date value2) {
            addCriterion("last_frez_date between", value1, value2, "lastFrezDate");
            return (Criteria) this;
        }

        public Criteria andLastFrezDateNotBetween(Date value1, Date value2) {
            addCriterion("last_frez_date not between", value1, value2, "lastFrezDate");
            return (Criteria) this;
        }

        public Criteria andLastUnfrezDateIsNull() {
            addCriterion("last_unfrez_date is null");
            return (Criteria) this;
        }

        public Criteria andLastUnfrezDateIsNotNull() {
            addCriterion("last_unfrez_date is not null");
            return (Criteria) this;
        }

        public Criteria andLastUnfrezDateEqualTo(Date value) {
            addCriterion("last_unfrez_date =", value, "lastUnfrezDate");
            return (Criteria) this;
        }

        public Criteria andLastUnfrezDateNotEqualTo(Date value) {
            addCriterion("last_unfrez_date <>", value, "lastUnfrezDate");
            return (Criteria) this;
        }

        public Criteria andLastUnfrezDateGreaterThan(Date value) {
            addCriterion("last_unfrez_date >", value, "lastUnfrezDate");
            return (Criteria) this;
        }

        public Criteria andLastUnfrezDateGreaterThanOrEqualTo(Date value) {
            addCriterion("last_unfrez_date >=", value, "lastUnfrezDate");
            return (Criteria) this;
        }

        public Criteria andLastUnfrezDateLessThan(Date value) {
            addCriterion("last_unfrez_date <", value, "lastUnfrezDate");
            return (Criteria) this;
        }

        public Criteria andLastUnfrezDateLessThanOrEqualTo(Date value) {
            addCriterion("last_unfrez_date <=", value, "lastUnfrezDate");
            return (Criteria) this;
        }

        public Criteria andLastUnfrezDateIn(List<Date> values) {
            addCriterion("last_unfrez_date in", values, "lastUnfrezDate");
            return (Criteria) this;
        }

        public Criteria andLastUnfrezDateNotIn(List<Date> values) {
            addCriterion("last_unfrez_date not in", values, "lastUnfrezDate");
            return (Criteria) this;
        }

        public Criteria andLastUnfrezDateBetween(Date value1, Date value2) {
            addCriterion("last_unfrez_date between", value1, value2, "lastUnfrezDate");
            return (Criteria) this;
        }

        public Criteria andLastUnfrezDateNotBetween(Date value1, Date value2) {
            addCriterion("last_unfrez_date not between", value1, value2, "lastUnfrezDate");
            return (Criteria) this;
        }

        public Criteria andLastModifyDateIsNull() {
            addCriterion("last_modify_date is null");
            return (Criteria) this;
        }

        public Criteria andLastModifyDateIsNotNull() {
            addCriterion("last_modify_date is not null");
            return (Criteria) this;
        }

        public Criteria andLastModifyDateEqualTo(Date value) {
            addCriterion("last_modify_date =", value, "lastModifyDate");
            return (Criteria) this;
        }

        public Criteria andLastModifyDateNotEqualTo(Date value) {
            addCriterion("last_modify_date <>", value, "lastModifyDate");
            return (Criteria) this;
        }

        public Criteria andLastModifyDateGreaterThan(Date value) {
            addCriterion("last_modify_date >", value, "lastModifyDate");
            return (Criteria) this;
        }

        public Criteria andLastModifyDateGreaterThanOrEqualTo(Date value) {
            addCriterion("last_modify_date >=", value, "lastModifyDate");
            return (Criteria) this;
        }

        public Criteria andLastModifyDateLessThan(Date value) {
            addCriterion("last_modify_date <", value, "lastModifyDate");
            return (Criteria) this;
        }

        public Criteria andLastModifyDateLessThanOrEqualTo(Date value) {
            addCriterion("last_modify_date <=", value, "lastModifyDate");
            return (Criteria) this;
        }

        public Criteria andLastModifyDateIn(List<Date> values) {
            addCriterion("last_modify_date in", values, "lastModifyDate");
            return (Criteria) this;
        }

        public Criteria andLastModifyDateNotIn(List<Date> values) {
            addCriterion("last_modify_date not in", values, "lastModifyDate");
            return (Criteria) this;
        }

        public Criteria andLastModifyDateBetween(Date value1, Date value2) {
            addCriterion("last_modify_date between", value1, value2, "lastModifyDate");
            return (Criteria) this;
        }

        public Criteria andLastModifyDateNotBetween(Date value1, Date value2) {
            addCriterion("last_modify_date not between", value1, value2, "lastModifyDate");
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