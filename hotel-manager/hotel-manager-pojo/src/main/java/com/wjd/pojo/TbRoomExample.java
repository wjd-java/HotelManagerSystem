package com.wjd.pojo;

import java.util.ArrayList;
import java.util.List;

public class TbRoomExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbRoomExample() {
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

        public Criteria andRoomIdIsNull() {
            addCriterion("room_id is null");
            return (Criteria) this;
        }

        public Criteria andRoomIdIsNotNull() {
            addCriterion("room_id is not null");
            return (Criteria) this;
        }

        public Criteria andRoomIdEqualTo(String value) {
            addCriterion("room_id =", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdNotEqualTo(String value) {
            addCriterion("room_id <>", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdGreaterThan(String value) {
            addCriterion("room_id >", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdGreaterThanOrEqualTo(String value) {
            addCriterion("room_id >=", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdLessThan(String value) {
            addCriterion("room_id <", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdLessThanOrEqualTo(String value) {
            addCriterion("room_id <=", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdLike(String value) {
            addCriterion("room_id like", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdNotLike(String value) {
            addCriterion("room_id not like", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdIn(List<String> values) {
            addCriterion("room_id in", values, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdNotIn(List<String> values) {
            addCriterion("room_id not in", values, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdBetween(String value1, String value2) {
            addCriterion("room_id between", value1, value2, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdNotBetween(String value1, String value2) {
            addCriterion("room_id not between", value1, value2, "roomId");
            return (Criteria) this;
        }

        public Criteria andRootTypeIsNull() {
            addCriterion("root_type is null");
            return (Criteria) this;
        }

        public Criteria andRootTypeIsNotNull() {
            addCriterion("root_type is not null");
            return (Criteria) this;
        }

        public Criteria andRootTypeEqualTo(String value) {
            addCriterion("root_type =", value, "rootType");
            return (Criteria) this;
        }

        public Criteria andRootTypeNotEqualTo(String value) {
            addCriterion("root_type <>", value, "rootType");
            return (Criteria) this;
        }

        public Criteria andRootTypeGreaterThan(String value) {
            addCriterion("root_type >", value, "rootType");
            return (Criteria) this;
        }

        public Criteria andRootTypeGreaterThanOrEqualTo(String value) {
            addCriterion("root_type >=", value, "rootType");
            return (Criteria) this;
        }

        public Criteria andRootTypeLessThan(String value) {
            addCriterion("root_type <", value, "rootType");
            return (Criteria) this;
        }

        public Criteria andRootTypeLessThanOrEqualTo(String value) {
            addCriterion("root_type <=", value, "rootType");
            return (Criteria) this;
        }

        public Criteria andRootTypeLike(String value) {
            addCriterion("root_type like", value, "rootType");
            return (Criteria) this;
        }

        public Criteria andRootTypeNotLike(String value) {
            addCriterion("root_type not like", value, "rootType");
            return (Criteria) this;
        }

        public Criteria andRootTypeIn(List<String> values) {
            addCriterion("root_type in", values, "rootType");
            return (Criteria) this;
        }

        public Criteria andRootTypeNotIn(List<String> values) {
            addCriterion("root_type not in", values, "rootType");
            return (Criteria) this;
        }

        public Criteria andRootTypeBetween(String value1, String value2) {
            addCriterion("root_type between", value1, value2, "rootType");
            return (Criteria) this;
        }

        public Criteria andRootTypeNotBetween(String value1, String value2) {
            addCriterion("root_type not between", value1, value2, "rootType");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Float value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Float value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Float value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Float value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Float value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Float> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Float> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Float value1, Float value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Float value1, Float value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andFreeIsNull() {
            addCriterion("free is null");
            return (Criteria) this;
        }

        public Criteria andFreeIsNotNull() {
            addCriterion("free is not null");
            return (Criteria) this;
        }

        public Criteria andFreeEqualTo(Boolean value) {
            addCriterion("free =", value, "free");
            return (Criteria) this;
        }

        public Criteria andFreeNotEqualTo(Boolean value) {
            addCriterion("free <>", value, "free");
            return (Criteria) this;
        }

        public Criteria andFreeGreaterThan(Boolean value) {
            addCriterion("free >", value, "free");
            return (Criteria) this;
        }

        public Criteria andFreeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("free >=", value, "free");
            return (Criteria) this;
        }

        public Criteria andFreeLessThan(Boolean value) {
            addCriterion("free <", value, "free");
            return (Criteria) this;
        }

        public Criteria andFreeLessThanOrEqualTo(Boolean value) {
            addCriterion("free <=", value, "free");
            return (Criteria) this;
        }

        public Criteria andFreeIn(List<Boolean> values) {
            addCriterion("free in", values, "free");
            return (Criteria) this;
        }

        public Criteria andFreeNotIn(List<Boolean> values) {
            addCriterion("free not in", values, "free");
            return (Criteria) this;
        }

        public Criteria andFreeBetween(Boolean value1, Boolean value2) {
            addCriterion("free between", value1, value2, "free");
            return (Criteria) this;
        }

        public Criteria andFreeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("free not between", value1, value2, "free");
            return (Criteria) this;
        }

        public Criteria andScheduledIsNull() {
            addCriterion("scheduled is null");
            return (Criteria) this;
        }

        public Criteria andScheduledIsNotNull() {
            addCriterion("scheduled is not null");
            return (Criteria) this;
        }

        public Criteria andScheduledEqualTo(Boolean value) {
            addCriterion("scheduled =", value, "scheduled");
            return (Criteria) this;
        }

        public Criteria andScheduledNotEqualTo(Boolean value) {
            addCriterion("scheduled <>", value, "scheduled");
            return (Criteria) this;
        }

        public Criteria andScheduledGreaterThan(Boolean value) {
            addCriterion("scheduled >", value, "scheduled");
            return (Criteria) this;
        }

        public Criteria andScheduledGreaterThanOrEqualTo(Boolean value) {
            addCriterion("scheduled >=", value, "scheduled");
            return (Criteria) this;
        }

        public Criteria andScheduledLessThan(Boolean value) {
            addCriterion("scheduled <", value, "scheduled");
            return (Criteria) this;
        }

        public Criteria andScheduledLessThanOrEqualTo(Boolean value) {
            addCriterion("scheduled <=", value, "scheduled");
            return (Criteria) this;
        }

        public Criteria andScheduledIn(List<Boolean> values) {
            addCriterion("scheduled in", values, "scheduled");
            return (Criteria) this;
        }

        public Criteria andScheduledNotIn(List<Boolean> values) {
            addCriterion("scheduled not in", values, "scheduled");
            return (Criteria) this;
        }

        public Criteria andScheduledBetween(Boolean value1, Boolean value2) {
            addCriterion("scheduled between", value1, value2, "scheduled");
            return (Criteria) this;
        }

        public Criteria andScheduledNotBetween(Boolean value1, Boolean value2) {
            addCriterion("scheduled not between", value1, value2, "scheduled");
            return (Criteria) this;
        }

        public Criteria andAbandonedIsNull() {
            addCriterion("abandoned is null");
            return (Criteria) this;
        }

        public Criteria andAbandonedIsNotNull() {
            addCriterion("abandoned is not null");
            return (Criteria) this;
        }

        public Criteria andAbandonedEqualTo(Boolean value) {
            addCriterion("abandoned =", value, "abandoned");
            return (Criteria) this;
        }

        public Criteria andAbandonedNotEqualTo(Boolean value) {
            addCriterion("abandoned <>", value, "abandoned");
            return (Criteria) this;
        }

        public Criteria andAbandonedGreaterThan(Boolean value) {
            addCriterion("abandoned >", value, "abandoned");
            return (Criteria) this;
        }

        public Criteria andAbandonedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("abandoned >=", value, "abandoned");
            return (Criteria) this;
        }

        public Criteria andAbandonedLessThan(Boolean value) {
            addCriterion("abandoned <", value, "abandoned");
            return (Criteria) this;
        }

        public Criteria andAbandonedLessThanOrEqualTo(Boolean value) {
            addCriterion("abandoned <=", value, "abandoned");
            return (Criteria) this;
        }

        public Criteria andAbandonedIn(List<Boolean> values) {
            addCriterion("abandoned in", values, "abandoned");
            return (Criteria) this;
        }

        public Criteria andAbandonedNotIn(List<Boolean> values) {
            addCriterion("abandoned not in", values, "abandoned");
            return (Criteria) this;
        }

        public Criteria andAbandonedBetween(Boolean value1, Boolean value2) {
            addCriterion("abandoned between", value1, value2, "abandoned");
            return (Criteria) this;
        }

        public Criteria andAbandonedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("abandoned not between", value1, value2, "abandoned");
            return (Criteria) this;
        }

        public Criteria andEuqipmentIsNull() {
            addCriterion("euqipment is null");
            return (Criteria) this;
        }

        public Criteria andEuqipmentIsNotNull() {
            addCriterion("euqipment is not null");
            return (Criteria) this;
        }

        public Criteria andEuqipmentEqualTo(String value) {
            addCriterion("euqipment =", value, "euqipment");
            return (Criteria) this;
        }

        public Criteria andEuqipmentNotEqualTo(String value) {
            addCriterion("euqipment <>", value, "euqipment");
            return (Criteria) this;
        }

        public Criteria andEuqipmentGreaterThan(String value) {
            addCriterion("euqipment >", value, "euqipment");
            return (Criteria) this;
        }

        public Criteria andEuqipmentGreaterThanOrEqualTo(String value) {
            addCriterion("euqipment >=", value, "euqipment");
            return (Criteria) this;
        }

        public Criteria andEuqipmentLessThan(String value) {
            addCriterion("euqipment <", value, "euqipment");
            return (Criteria) this;
        }

        public Criteria andEuqipmentLessThanOrEqualTo(String value) {
            addCriterion("euqipment <=", value, "euqipment");
            return (Criteria) this;
        }

        public Criteria andEuqipmentLike(String value) {
            addCriterion("euqipment like", value, "euqipment");
            return (Criteria) this;
        }

        public Criteria andEuqipmentNotLike(String value) {
            addCriterion("euqipment not like", value, "euqipment");
            return (Criteria) this;
        }

        public Criteria andEuqipmentIn(List<String> values) {
            addCriterion("euqipment in", values, "euqipment");
            return (Criteria) this;
        }

        public Criteria andEuqipmentNotIn(List<String> values) {
            addCriterion("euqipment not in", values, "euqipment");
            return (Criteria) this;
        }

        public Criteria andEuqipmentBetween(String value1, String value2) {
            addCriterion("euqipment between", value1, value2, "euqipment");
            return (Criteria) this;
        }

        public Criteria andEuqipmentNotBetween(String value1, String value2) {
            addCriterion("euqipment not between", value1, value2, "euqipment");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
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