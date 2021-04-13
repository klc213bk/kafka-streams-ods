package com.transglobe.kafka.streams.ods.common;

import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ProductionDetail {
	@JsonProperty("DETAIL_ID")
	Long detailId;
	
	@JsonProperty("PRODUCTION_ID")
	Long productionId;
	
	@JsonProperty("POLICY_ID")
	Long policyId;
	
	@JsonProperty("ITEM_ID")
	Long itemId;
	
	@JsonProperty("PRODUCT_ID")
	Long productId;
	
	@JsonProperty("POLICY_YEAR")
	Integer policyYear;
	
	@JsonProperty("PRODUCTION_VALUE")
	BigDecimal productionValue;
	
	@JsonProperty("EFFECTIVE_DATE")
	Date effeciveDate ;
	
	@JsonProperty("HIERARCHY_DATE")
	Date hierarchyDate;
	
	@JsonProperty("PRODUCER_ID")
	Long producerId;
	
	@JsonProperty("PRODUCER_POSITION")
	String producerPosition;
	
	@JsonProperty("BENEFIT_TYPE")
	String benefitType;
	
	@JsonProperty("FEE_TYPE")
	Integer feeType;
	
	@JsonProperty("CHARGE_MODE")
	String chargeMode;
	
	@JsonProperty("PREM_LIST_ID")
	Long premListId;
	
	@JsonProperty("COMM_ITEM_ID")
	Long commItemId;
	
	@JsonProperty("POLICY_CHG_ID")
	Long policyChgId;
	
	@JsonProperty("EXCHANGE_RATE")
	BigDecimal exchangeRate;
	
	@JsonProperty("RELATED_ID")
	Long relatedId;
	
	@JsonProperty("INSURED_ID")
	Long insuredId ;
	
	@JsonProperty("POL_PRODUCTION_VALUE")
	BigDecimal polProductionValue;
	
	@JsonProperty("POL_CURRENCY_ID")
	Integer polCurrencyId;
	
	@JsonProperty("HIERARCHY_EXIST_INDI")
	String hierarchyExistIndi;
	
	@JsonProperty("AGGREGATION_ID")
	Long aggregationId;
	
	@JsonProperty("PRODUCT_VERSION")
	Long productVersion;
	
	@JsonProperty("SOURCE_TABLE")
	String sourceTable;
	
	@JsonProperty("SOURCE_ID")
	Long sourceId;
	
	@JsonProperty("RESULT_LIST_ID")
	Long resultListId;
	
	@JsonProperty("FINISH_TIME")
	Date finishTime;
	
	@JsonProperty("INSERTED_BY")
	Long insertedBy;
	
	@JsonProperty("UPDATED_BY")
	Long updatedBy;
	
	@JsonProperty("INSERT_TIME")
	Date insertTime;
	
	@JsonProperty("UPDATE_TIME")
	Date updateTime;
	
	@JsonProperty("INSERT_TIMESTAMP")
	Date insertTimestamp;
	
	@JsonProperty("UPDATE_TIMESTAMP")
	Date updateTimestamp;
	
	@JsonProperty("COMMISSION_RATE")
	BigDecimal commissionRate;
	
	@JsonProperty("CHEQUE_INDI")
	String chequeIndi;
	
	@JsonProperty("PREM_ALLOCATE_YEAR")
	Integer premAllocateYear;
	
	@JsonProperty("RECALCULATED_INDI")
	String recalculatedIndi;
	
	@JsonProperty("EXCLUDE_POLICY_INDI")
	String excludePolicyindi;
	
	@JsonProperty("CHANNEL_ORG_ID")
	Long channelOrgId;
	
	@JsonProperty("AGENT_CATE")
	String agentCate;
	
	@JsonProperty("YEAR_MONTH")
	String yearMonth;
	
	@JsonProperty("CONVERSION_CATE")
	Integer conversionCate;
	
	@JsonProperty("ORDER_ID")
	Integer orderId ;
	
	@JsonProperty("ASSIGN_RATE")
	Integer assignRate;
	
	@JsonProperty("DATA_DATE")
	Date dataDate;
	
	@JsonProperty("TBL_UPD_TIME")
	Date tblUpdTime;
	
	public Long getDetailId() {
		return detailId;
	}
	public void setDetailId(Long detailId) {
		this.detailId = detailId;
	}
	public Long getProductionId() {
		return productionId;
	}
	public void setProductionId(Long productionId) {
		this.productionId = productionId;
	}
	public Long getPolicyId() {
		return policyId;
	}
	public void setPolicyId(Long policyId) {
		this.policyId = policyId;
	}
	public Long getItemId() {
		return itemId;
	}
	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}
	public Long getProductId() {
		return productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}
	public Integer getPolicyYear() {
		return policyYear;
	}
	public void setPolicyYear(Integer policyYear) {
		this.policyYear = policyYear;
	}
	public BigDecimal getProductionValue() {
		return productionValue;
	}
	public void setProductionValue(BigDecimal productionValue) {
		this.productionValue = productionValue;
	}
	public Date getEffeciveDate() {
		return effeciveDate;
	}
	public void setEffeciveDate(Date effeciveDate) {
		this.effeciveDate = effeciveDate;
	}
	public Date getHierarchyDate() {
		return hierarchyDate;
	}
	public void setHierarchyDate(Date hierarchyDate) {
		this.hierarchyDate = hierarchyDate;
	}
	public Long getProducerId() {
		return producerId;
	}
	public void setProducerId(Long producerId) {
		this.producerId = producerId;
	}
	public String getProducerPosition() {
		return producerPosition;
	}
	public void setProducerPosition(String producerPosition) {
		this.producerPosition = producerPosition;
	}
	public String getBenefitType() {
		return benefitType;
	}
	public void setBenefitType(String benefitType) {
		this.benefitType = benefitType;
	}
	public Integer getFeeType() {
		return feeType;
	}
	public void setFeeType(Integer feeType) {
		this.feeType = feeType;
	}
	public String getChargeMode() {
		return chargeMode;
	}
	public void setChargeMode(String chargeMode) {
		this.chargeMode = chargeMode;
	}
	public Long getPremListId() {
		return premListId;
	}
	public void setPremListId(Long premListId) {
		this.premListId = premListId;
	}
	public Long getCommItemId() {
		return commItemId;
	}
	public void setCommItemId(Long commItemId) {
		this.commItemId = commItemId;
	}
	public Long getPolicyChgId() {
		return policyChgId;
	}
	public void setPolicyChgId(Long policyChgId) {
		this.policyChgId = policyChgId;
	}
	public BigDecimal getExchangeRate() {
		return exchangeRate;
	}
	public void setExchangeRate(BigDecimal exchangeRate) {
		this.exchangeRate = exchangeRate;
	}
	public Long getRelatedId() {
		return relatedId;
	}
	public void setErlatedId(Long relatedId) {
		this.relatedId = relatedId;
	}
	public Long getInsuredId() {
		return insuredId;
	}
	public void setInsuredId(Long insuredId) {
		this.insuredId = insuredId;
	}
	public BigDecimal getPolProductionValue() {
		return polProductionValue;
	}
	public void setPolProductionValue(BigDecimal polProductionValue) {
		this.polProductionValue = polProductionValue;
	}
	public Integer getPolCurrencyId() {
		return polCurrencyId;
	}
	public void setPolCurrencyId(Integer polCurrencyId) {
		this.polCurrencyId = polCurrencyId;
	}
	public String getHierarchyExistIndi() {
		return hierarchyExistIndi;
	}
	public void setHierarchyExistIndi(String hierarchyExistIndi) {
		this.hierarchyExistIndi = hierarchyExistIndi;
	}
	public Long getAggregationId() {
		return aggregationId;
	}
	public void setAggregationId(Long aggregationId) {
		this.aggregationId = aggregationId;
	}
	public Long getProductVersion() {
		return productVersion;
	}
	public void setProductVersion(Long productVersion) {
		this.productVersion = productVersion;
	}
	public String getSourceTable() {
		return sourceTable;
	}
	public void setSourceTable(String sourceTable) {
		this.sourceTable = sourceTable;
	}
	public Long getSourceId() {
		return sourceId;
	}
	public void setSourceId(Long sourceId) {
		this.sourceId = sourceId;
	}
	public Long getResultListId() {
		return resultListId;
	}
	public void setResultListId(Long resultListId) {
		this.resultListId = resultListId;
	}
	public Date getFinishTime() {
		return finishTime;
	}
	public void setFinishTime(Date finishTime) {
		this.finishTime = finishTime;
	}
	public Long getInsertedBy() {
		return insertedBy;
	}
	public void setInsertedBy(Long insertedBy) {
		this.insertedBy = insertedBy;
	}
	public Long getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(Long updatedBy) {
		this.updatedBy = updatedBy;
	}
	public Date getInsertTime() {
		return insertTime;
	}
	public void setInsertTime(Date insertTime) {
		this.insertTime = insertTime;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	public Date getInsertTimestamp() {
		return insertTimestamp;
	}
	public void setInsertTimestamp(Date insertTimestamp) {
		this.insertTimestamp = insertTimestamp;
	}
	public Date getUpdateTimestamp() {
		return updateTimestamp;
	}
	public void setUpdateTimestamp(Date updateTimestamp) {
		this.updateTimestamp = updateTimestamp;
	}
	public BigDecimal getCommissionRate() {
		return commissionRate;
	}
	public void setCommissionRate(BigDecimal commissionRate) {
		this.commissionRate = commissionRate;
	}
	public String getChequeIndi() {
		return chequeIndi;
	}
	public void setChequeIndi(String chequeIndi) {
		this.chequeIndi = chequeIndi;
	}
	public Integer getPremAllocateYear() {
		return premAllocateYear;
	}
	public void setPremAllocateYear(Integer premAllocateYear) {
		this.premAllocateYear = premAllocateYear;
	}
	public String getRecalculatedIndi() {
		return recalculatedIndi;
	}
	public void setRecalculatedIndi(String recalculatedIndi) {
		this.recalculatedIndi = recalculatedIndi;
	}
	public String getExcludePolicyindi() {
		return excludePolicyindi;
	}
	public void setExcludePolicyindi(String excludePolicyindi) {
		this.excludePolicyindi = excludePolicyindi;
	}
	public Long getChannelOrgId() {
		return channelOrgId;
	}
	public void setChannelOrgId(Long channelOrgId) {
		this.channelOrgId = channelOrgId;
	}
	public String getAgentCate() {
		return agentCate;
	}
	public void setAgentCate(String agentCate) {
		this.agentCate = agentCate;
	}
	public String getYearMonth() {
		return yearMonth;
	}
	public void setYearMonth(String yearMonth) {
		this.yearMonth = yearMonth;
	}
	public Integer getConversionCate() {
		return conversionCate;
	}
	public void setConversionCate(Integer conversionCate) {
		this.conversionCate = conversionCate;
	}
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public Integer getAssignRate() {
		return assignRate;
	}
	public void setAssignRate(Integer assignRate) {
		this.assignRate = assignRate;
	}
	public Date getDataDate() {
		return dataDate;
	}
	public void setDataDate(Date dataDate) {
		this.dataDate = dataDate;
	}
	public Date getTblUpdTime() {
		return tblUpdTime;
	}
	public void setTblUpdTime(Date tblUpdTime) {
		this.tblUpdTime = tblUpdTime;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((agentCate == null) ? 0 : agentCate.hashCode());
		result = prime * result + ((aggregationId == null) ? 0 : aggregationId.hashCode());
		result = prime * result + ((assignRate == null) ? 0 : assignRate.hashCode());
		result = prime * result + ((benefitType == null) ? 0 : benefitType.hashCode());
		result = prime * result + ((channelOrgId == null) ? 0 : channelOrgId.hashCode());
		result = prime * result + ((chargeMode == null) ? 0 : chargeMode.hashCode());
		result = prime * result + ((chequeIndi == null) ? 0 : chequeIndi.hashCode());
		result = prime * result + ((commItemId == null) ? 0 : commItemId.hashCode());
		result = prime * result + ((commissionRate == null) ? 0 : commissionRate.hashCode());
		result = prime * result + ((conversionCate == null) ? 0 : conversionCate.hashCode());
//		result = prime * result + ((dataDate == null) ? 0 : dataDate.hashCode());
		result = prime * result + ((detailId == null) ? 0 : detailId.hashCode());
		result = prime * result + ((effeciveDate == null) ? 0 : effeciveDate.hashCode());
		result = prime * result + ((relatedId == null) ? 0 : relatedId.hashCode());
		result = prime * result + ((exchangeRate == null) ? 0 : exchangeRate.hashCode());
		result = prime * result + ((excludePolicyindi == null) ? 0 : excludePolicyindi.hashCode());
		result = prime * result + ((feeType == null) ? 0 : feeType.hashCode());
		result = prime * result + ((finishTime == null) ? 0 : finishTime.hashCode());
		result = prime * result + ((hierarchyDate == null) ? 0 : hierarchyDate.hashCode());
		result = prime * result + ((hierarchyExistIndi == null) ? 0 : hierarchyExistIndi.hashCode());
		result = prime * result + ((insertTime == null) ? 0 : insertTime.hashCode());
		result = prime * result + ((insertTimestamp == null) ? 0 : insertTimestamp.hashCode());
		result = prime * result + ((insertedBy == null) ? 0 : insertedBy.hashCode());
		result = prime * result + ((insuredId == null) ? 0 : insuredId.hashCode());
		result = prime * result + ((itemId == null) ? 0 : itemId.hashCode());
		result = prime * result + ((orderId == null) ? 0 : orderId.hashCode());
		result = prime * result + ((polCurrencyId == null) ? 0 : polCurrencyId.hashCode());
		result = prime * result + ((polProductionValue == null) ? 0 : polProductionValue.hashCode());
		result = prime * result + ((policyChgId == null) ? 0 : policyChgId.hashCode());
		result = prime * result + ((policyId == null) ? 0 : policyId.hashCode());
		result = prime * result + ((policyYear == null) ? 0 : policyYear.hashCode());
		result = prime * result + ((premAllocateYear == null) ? 0 : premAllocateYear.hashCode());
		result = prime * result + ((premListId == null) ? 0 : premListId.hashCode());
		result = prime * result + ((producerId == null) ? 0 : producerId.hashCode());
		result = prime * result + ((producerPosition == null) ? 0 : producerPosition.hashCode());
		result = prime * result + ((productId == null) ? 0 : productId.hashCode());
		result = prime * result + ((productVersion == null) ? 0 : productVersion.hashCode());
		result = prime * result + ((productionId == null) ? 0 : productionId.hashCode());
		result = prime * result + ((productionValue == null) ? 0 : productionValue.hashCode());
		result = prime * result + ((recalculatedIndi == null) ? 0 : recalculatedIndi.hashCode());
		result = prime * result + ((resultListId == null) ? 0 : resultListId.hashCode());
		result = prime * result + ((sourceId == null) ? 0 : sourceId.hashCode());
		result = prime * result + ((sourceTable == null) ? 0 : sourceTable.hashCode());
//		result = prime * result + ((tblUpdTime == null) ? 0 : tblUpdTime.hashCode());
		result = prime * result + ((updateTime == null) ? 0 : updateTime.hashCode());
		result = prime * result + ((updateTimestamp == null) ? 0 : updateTimestamp.hashCode());
		result = prime * result + ((updatedBy == null) ? 0 : updatedBy.hashCode());
		result = prime * result + ((yearMonth == null) ? 0 : yearMonth.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProductionDetail other = (ProductionDetail) obj;
		if (agentCate == null) {
			if (other.agentCate != null)
				return false;
		} else if (!agentCate.equals(other.agentCate))
			return false;
		if (aggregationId == null) {
			if (other.aggregationId != null)
				return false;
		} else if (!aggregationId.equals(other.aggregationId))
			return false;
		if (assignRate == null) {
			if (other.assignRate != null)
				return false;
		} else if (!assignRate.equals(other.assignRate))
			return false;
		if (benefitType == null) {
			if (other.benefitType != null)
				return false;
		} else if (!benefitType.equals(other.benefitType))
			return false;
		if (channelOrgId == null) {
			if (other.channelOrgId != null)
				return false;
		} else if (!channelOrgId.equals(other.channelOrgId))
			return false;
		if (chargeMode == null) {
			if (other.chargeMode != null)
				return false;
		} else if (!chargeMode.equals(other.chargeMode))
			return false;
		if (chequeIndi == null) {
			if (other.chequeIndi != null)
				return false;
		} else if (!chequeIndi.equals(other.chequeIndi))
			return false;
		if (commItemId == null) {
			if (other.commItemId != null)
				return false;
		} else if (!commItemId.equals(other.commItemId))
			return false;
		if (commissionRate == null) {
			if (other.commissionRate != null)
				return false;
		} else if (!commissionRate.equals(other.commissionRate))
			return false;
		if (conversionCate == null) {
			if (other.conversionCate != null)
				return false;
		} else if (!conversionCate.equals(other.conversionCate))
			return false;
//		if (dataDate == null) {
//			if (other.dataDate != null)
//				return false;
//		} else if (!dataDate.equals(other.dataDate))
//			return false;
		if (detailId == null) {
			if (other.detailId != null)
				return false;
		} else if (!detailId.equals(other.detailId))
			return false;
		if (effeciveDate == null) {
			if (other.effeciveDate != null)
				return false;
		} else if (!effeciveDate.equals(other.effeciveDate))
			return false;
		if (relatedId == null) {
			if (other.relatedId != null)
				return false;
		} else if (!relatedId.equals(other.relatedId))
			return false;
		if (exchangeRate == null) {
			if (other.exchangeRate != null)
				return false;
		} else if (!exchangeRate.equals(other.exchangeRate))
			return false;
		if (excludePolicyindi == null) {
			if (other.excludePolicyindi != null)
				return false;
		} else if (!excludePolicyindi.equals(other.excludePolicyindi))
			return false;
		if (feeType == null) {
			if (other.feeType != null)
				return false;
		} else if (!feeType.equals(other.feeType))
			return false;
		if (finishTime == null) {
			if (other.finishTime != null)
				return false;
		} else if (!finishTime.equals(other.finishTime))
			return false;
		if (hierarchyDate == null) {
			if (other.hierarchyDate != null)
				return false;
		} else if (!hierarchyDate.equals(other.hierarchyDate))
			return false;
		if (hierarchyExistIndi == null) {
			if (other.hierarchyExistIndi != null)
				return false;
		} else if (!hierarchyExistIndi.equals(other.hierarchyExistIndi))
			return false;
		if (insertTime == null) {
			if (other.insertTime != null)
				return false;
		} else if (!insertTime.equals(other.insertTime))
			return false;
		if (insertTimestamp == null) {
			if (other.insertTimestamp != null)
				return false;
		} else if (!insertTimestamp.equals(other.insertTimestamp))
			return false;
		if (insertedBy == null) {
			if (other.insertedBy != null)
				return false;
		} else if (!insertedBy.equals(other.insertedBy))
			return false;
		if (insuredId == null) {
			if (other.insuredId != null)
				return false;
		} else if (!insuredId.equals(other.insuredId))
			return false;
		if (itemId == null) {
			if (other.itemId != null)
				return false;
		} else if (!itemId.equals(other.itemId))
			return false;
		if (orderId == null) {
			if (other.orderId != null)
				return false;
		} else if (!orderId.equals(other.orderId))
			return false;
		if (polCurrencyId == null) {
			if (other.polCurrencyId != null)
				return false;
		} else if (!polCurrencyId.equals(other.polCurrencyId))
			return false;
		if (polProductionValue == null) {
			if (other.polProductionValue != null)
				return false;
		} else if (!polProductionValue.equals(other.polProductionValue))
			return false;
		if (policyChgId == null) {
			if (other.policyChgId != null)
				return false;
		} else if (!policyChgId.equals(other.policyChgId))
			return false;
		if (policyId == null) {
			if (other.policyId != null)
				return false;
		} else if (!policyId.equals(other.policyId))
			return false;
		if (policyYear == null) {
			if (other.policyYear != null)
				return false;
		} else if (!policyYear.equals(other.policyYear))
			return false;
		if (premAllocateYear == null) {
			if (other.premAllocateYear != null)
				return false;
		} else if (!premAllocateYear.equals(other.premAllocateYear))
			return false;
		if (premListId == null) {
			if (other.premListId != null)
				return false;
		} else if (!premListId.equals(other.premListId))
			return false;
		if (producerId == null) {
			if (other.producerId != null)
				return false;
		} else if (!producerId.equals(other.producerId))
			return false;
		if (producerPosition == null) {
			if (other.producerPosition != null)
				return false;
		} else if (!producerPosition.equals(other.producerPosition))
			return false;
		if (productId == null) {
			if (other.productId != null)
				return false;
		} else if (!productId.equals(other.productId))
			return false;
		if (productVersion == null) {
			if (other.productVersion != null)
				return false;
		} else if (!productVersion.equals(other.productVersion))
			return false;
		if (productionId == null) {
			if (other.productionId != null)
				return false;
		} else if (!productionId.equals(other.productionId))
			return false;
		if (productionValue == null) {
			if (other.productionValue != null)
				return false;
		} else if (!productionValue.equals(other.productionValue))
			return false;
		if (recalculatedIndi == null) {
			if (other.recalculatedIndi != null)
				return false;
		} else if (!recalculatedIndi.equals(other.recalculatedIndi))
			return false;
		if (resultListId == null) {
			if (other.resultListId != null)
				return false;
		} else if (!resultListId.equals(other.resultListId))
			return false;
		if (sourceId == null) {
			if (other.sourceId != null)
				return false;
		} else if (!sourceId.equals(other.sourceId))
			return false;
		if (sourceTable == null) {
			if (other.sourceTable != null)
				return false;
		} else if (!sourceTable.equals(other.sourceTable))
			return false;
//		if (tblUpdTime == null) {
//			if (other.tblUpdTime != null)
//				return false;
//		} else if (!tblUpdTime.equals(other.tblUpdTime))
//			return false;
		if (updateTime == null) {
			if (other.updateTime != null)
				return false;
		} else if (!updateTime.equals(other.updateTime))
			return false;
		if (updateTimestamp == null) {
			if (other.updateTimestamp != null)
				return false;
		} else if (!updateTimestamp.equals(other.updateTimestamp))
			return false;
		if (updatedBy == null) {
			if (other.updatedBy != null)
				return false;
		} else if (!updatedBy.equals(other.updatedBy))
			return false;
		if (yearMonth == null) {
			if (other.yearMonth != null)
				return false;
		} else if (!yearMonth.equals(other.yearMonth))
			return false;
		return true;
	}
	
	
}
