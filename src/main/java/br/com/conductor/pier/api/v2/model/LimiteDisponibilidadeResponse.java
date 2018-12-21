package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Limit Availability
 **/
@ApiModel(description = "Limit Availability")
public class LimiteDisponibilidadeResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("limiteGlobal")
  private BigDecimal limiteGlobal = null;
  @SerializedName("limiteCompra")
  private BigDecimal limiteCompra = null;
  @SerializedName("limiteParcelado")
  private BigDecimal limiteParcelado = null;
  @SerializedName("limiteParcelas")
  private BigDecimal limiteParcelas = null;
  @SerializedName("limiteSaqueGlobal")
  private BigDecimal limiteSaqueGlobal = null;
  @SerializedName("limiteSaquePeriodo")
  private BigDecimal limiteSaquePeriodo = null;
  @SerializedName("limiteConsignado")
  private BigDecimal limiteConsignado = null;
  @SerializedName("limiteInternacionalCompra")
  private BigDecimal limiteInternacionalCompra = null;
  @SerializedName("limiteInternacionalParcelado")
  private BigDecimal limiteInternacionalParcelado = null;
  @SerializedName("limiteInternacionalParcelas")
  private BigDecimal limiteInternacionalParcelas = null;
  @SerializedName("limiteInternacionalSaqueGlobal")
  private BigDecimal limiteInternacionalSaqueGlobal = null;
  @SerializedName("limiteInternacionalSaquePeriodo")
  private BigDecimal limiteInternacionalSaquePeriodo = null;
  @SerializedName("limiteMaximo")
  private BigDecimal limiteMaximo = null;
  @SerializedName("saldoDisponivelGlobal")
  private BigDecimal saldoDisponivelGlobal = null;
  @SerializedName("saldoDisponivelCompra")
  private BigDecimal saldoDisponivelCompra = null;
  @SerializedName("saldoDisponivelParcelado")
  private BigDecimal saldoDisponivelParcelado = null;
  @SerializedName("saldoDisponivelParcelas")
  private BigDecimal saldoDisponivelParcelas = null;
  @SerializedName("saldoDisponivelSaque")
  private BigDecimal saldoDisponivelSaque = null;
  @SerializedName("saldoPontosFidelidade")
  private BigDecimal saldoPontosFidelidade = null;
  @SerializedName("saldoDisponivelCompraInternacional")
  private BigDecimal saldoDisponivelCompraInternacional = null;
  @SerializedName("saldoDisponivelSaqueInternacional")
  private BigDecimal saldoDisponivelSaqueInternacional = null;

  
  /**
   * Identification Code of the Availability aand Limit (id)
   **/
  @ApiModelProperty(value = "Identification Code of the Availability aand Limit (id)")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Value of the Credit limit
   **/
  @ApiModelProperty(value = "Value of the Credit limit")
  public BigDecimal getLimiteGlobal() {
    return limiteGlobal;
  }
  public void setLimiteGlobal(BigDecimal limiteGlobal) {
    this.limiteGlobal = limiteGlobal;
  }

  
  /**
   * Value of the credit limit to use in national shops
   **/
  @ApiModelProperty(value = "Value of the credit limit to use in national shops")
  public BigDecimal getLimiteCompra() {
    return limiteCompra;
  }
  public void setLimiteCompra(BigDecimal limiteCompra) {
    this.limiteCompra = limiteCompra;
  }

  
  /**
   * Value of credit limit for transactions of parceled shops
   **/
  @ApiModelProperty(value = "Value of credit limit for transactions of parceled shops")
  public BigDecimal getLimiteParcelado() {
    return limiteParcelado;
  }
  public void setLimiteParcelado(BigDecimal limiteParcelado) {
    this.limiteParcelado = limiteParcelado;
  }

  
  /**
   * Value of accumulated credit limit of the sum of parcels that are made in this modality
   **/
  @ApiModelProperty(value = "Value of accumulated credit limit of the sum of parcels that are made in this modality")
  public BigDecimal getLimiteParcelas() {
    return limiteParcelas;
  }
  public void setLimiteParcelas(BigDecimal limiteParcelas) {
    this.limiteParcelas = limiteParcelas;
  }

  
  /**
   * Value of the credit limit for transactions of National Withdrawal
   **/
  @ApiModelProperty(value = "Value of the credit limit for transactions of National Withdrawal")
  public BigDecimal getLimiteSaqueGlobal() {
    return limiteSaqueGlobal;
  }
  public void setLimiteSaqueGlobal(BigDecimal limiteSaqueGlobal) {
    this.limiteSaqueGlobal = limiteSaqueGlobal;
  }

  
  /**
   * Value of the credit limit for transactions of National Withdrawal inside of each billing cycle
   **/
  @ApiModelProperty(value = "Value of the credit limit for transactions of National Withdrawal inside of each billing cycle")
  public BigDecimal getLimiteSaquePeriodo() {
    return limiteSaquePeriodo;
  }
  public void setLimiteSaquePeriodo(BigDecimal limiteSaquePeriodo) {
    this.limiteSaquePeriodo = limiteSaquePeriodo;
  }

  
  /**
   * Value of the credit margin for consignations (discount in payroll)
   **/
  @ApiModelProperty(value = "Value of the credit margin for consignations (discount in payroll)")
  public BigDecimal getLimiteConsignado() {
    return limiteConsignado;
  }
  public void setLimiteConsignado(BigDecimal limiteConsignado) {
    this.limiteConsignado = limiteConsignado;
  }

  
  /**
   * Value of the Credit limit to use in international shops
   **/
  @ApiModelProperty(value = "Value of the Credit limit to use in international shops")
  public BigDecimal getLimiteInternacionalCompra() {
    return limiteInternacionalCompra;
  }
  public void setLimiteInternacionalCompra(BigDecimal limiteInternacionalCompra) {
    this.limiteInternacionalCompra = limiteInternacionalCompra;
  }

  
  /**
   * Value of the credit limit for international transactions of parceled shops
   **/
  @ApiModelProperty(value = "Value of the credit limit for international transactions of parceled shops")
  public BigDecimal getLimiteInternacionalParcelado() {
    return limiteInternacionalParcelado;
  }
  public void setLimiteInternacionalParcelado(BigDecimal limiteInternacionalParcelado) {
    this.limiteInternacionalParcelado = limiteInternacionalParcelado;
  }

  
  /**
   * Value of the credit limit accumulated of the sum of international shop parcels that are made in this modality
   **/
  @ApiModelProperty(value = "Value of the credit limit accumulated of the sum of international shop parcels that are made in this modality")
  public BigDecimal getLimiteInternacionalParcelas() {
    return limiteInternacionalParcelas;
  }
  public void setLimiteInternacionalParcelas(BigDecimal limiteInternacionalParcelas) {
    this.limiteInternacionalParcelas = limiteInternacionalParcelas;
  }

  
  /**
   * Value of Credit limit for transactions of international withdrawals
   **/
  @ApiModelProperty(value = "Value of Credit limit for transactions of international withdrawals")
  public BigDecimal getLimiteInternacionalSaqueGlobal() {
    return limiteInternacionalSaqueGlobal;
  }
  public void setLimiteInternacionalSaqueGlobal(BigDecimal limiteInternacionalSaqueGlobal) {
    this.limiteInternacionalSaqueGlobal = limiteInternacionalSaqueGlobal;
  }

  
  /**
   * Value of the credit limit for transactions of international Withdrawal inside of each billing cycle
   **/
  @ApiModelProperty(value = "Value of the credit limit for transactions of international Withdrawal inside of each billing cycle")
  public BigDecimal getLimiteInternacionalSaquePeriodo() {
    return limiteInternacionalSaquePeriodo;
  }
  public void setLimiteInternacionalSaquePeriodo(BigDecimal limiteInternacionalSaquePeriodo) {
    this.limiteInternacionalSaquePeriodo = limiteInternacionalSaquePeriodo;
  }

  
  /**
   * Maximum value of the credit limit to make transactions
   **/
  @ApiModelProperty(value = "Maximum value of the credit limit to make transactions")
  public BigDecimal getLimiteMaximo() {
    return limiteMaximo;
  }
  public void setLimiteMaximo(BigDecimal limiteMaximo) {
    this.limiteMaximo = limiteMaximo;
  }

  
  /**
   * Credit value available for the transactions
   **/
  @ApiModelProperty(value = "Credit value available for the transactions")
  public BigDecimal getSaldoDisponivelGlobal() {
    return saldoDisponivelGlobal;
  }
  public void setSaldoDisponivelGlobal(BigDecimal saldoDisponivelGlobal) {
    this.saldoDisponivelGlobal = saldoDisponivelGlobal;
  }

  
  /**
   * Credit Value available for transactions of National shop
   **/
  @ApiModelProperty(value = "Credit Value available for transactions of National shop")
  public BigDecimal getSaldoDisponivelCompra() {
    return saldoDisponivelCompra;
  }
  public void setSaldoDisponivelCompra(BigDecimal saldoDisponivelCompra) {
    this.saldoDisponivelCompra = saldoDisponivelCompra;
  }

  
  /**
   * Value of the available credit for transactions of Parceled National Shop
   **/
  @ApiModelProperty(value = "Value of the available credit for transactions of Parceled National Shop")
  public BigDecimal getSaldoDisponivelParcelado() {
    return saldoDisponivelParcelado;
  }
  public void setSaldoDisponivelParcelado(BigDecimal saldoDisponivelParcelado) {
    this.saldoDisponivelParcelado = saldoDisponivelParcelado;
  }

  
  /**
   * Credit value available to use as the National parcel value in a determined billing cycle
   **/
  @ApiModelProperty(value = "Credit value available to use as the National parcel value in a determined billing cycle")
  public BigDecimal getSaldoDisponivelParcelas() {
    return saldoDisponivelParcelas;
  }
  public void setSaldoDisponivelParcelas(BigDecimal saldoDisponivelParcelas) {
    this.saldoDisponivelParcelas = saldoDisponivelParcelas;
  }

  
  /**
   * Value of the credit that the cardholder has available to make transactions of National Withdrawal
   **/
  @ApiModelProperty(value = "Value of the credit that the cardholder has available to make transactions of National Withdrawal")
  public BigDecimal getSaldoDisponivelSaque() {
    return saldoDisponivelSaque;
  }
  public void setSaldoDisponivelSaque(BigDecimal saldoDisponivelSaque) {
    this.saldoDisponivelSaque = saldoDisponivelSaque;
  }

  
  /**
   * Current Balance of the Fidelity Point Program
   **/
  @ApiModelProperty(value = "Current Balance of the Fidelity Point Program")
  public BigDecimal getSaldoPontosFidelidade() {
    return saldoPontosFidelidade;
  }
  public void setSaldoPontosFidelidade(BigDecimal saldoPontosFidelidade) {
    this.saldoPontosFidelidade = saldoPontosFidelidade;
  }

  
  /**
   * Value of the available credit for transactions of international shop
   **/
  @ApiModelProperty(value = "Value of the available credit for transactions of international shop")
  public BigDecimal getSaldoDisponivelCompraInternacional() {
    return saldoDisponivelCompraInternacional;
  }
  public void setSaldoDisponivelCompraInternacional(BigDecimal saldoDisponivelCompraInternacional) {
    this.saldoDisponivelCompraInternacional = saldoDisponivelCompraInternacional;
  }

  
  /**
   * Value of available credit for transactions of international Withdrawal
   **/
  @ApiModelProperty(value = "Value of available credit for transactions of international Withdrawal")
  public BigDecimal getSaldoDisponivelSaqueInternacional() {
    return saldoDisponivelSaqueInternacional;
  }
  public void setSaldoDisponivelSaqueInternacional(BigDecimal saldoDisponivelSaqueInternacional) {
    this.saldoDisponivelSaqueInternacional = saldoDisponivelSaqueInternacional;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class LimiteDisponibilidadeResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  limiteGlobal: ").append(limiteGlobal).append("\n");
    sb.append("  limiteCompra: ").append(limiteCompra).append("\n");
    sb.append("  limiteParcelado: ").append(limiteParcelado).append("\n");
    sb.append("  limiteParcelas: ").append(limiteParcelas).append("\n");
    sb.append("  limiteSaqueGlobal: ").append(limiteSaqueGlobal).append("\n");
    sb.append("  limiteSaquePeriodo: ").append(limiteSaquePeriodo).append("\n");
    sb.append("  limiteConsignado: ").append(limiteConsignado).append("\n");
    sb.append("  limiteInternacionalCompra: ").append(limiteInternacionalCompra).append("\n");
    sb.append("  limiteInternacionalParcelado: ").append(limiteInternacionalParcelado).append("\n");
    sb.append("  limiteInternacionalParcelas: ").append(limiteInternacionalParcelas).append("\n");
    sb.append("  limiteInternacionalSaqueGlobal: ").append(limiteInternacionalSaqueGlobal).append("\n");
    sb.append("  limiteInternacionalSaquePeriodo: ").append(limiteInternacionalSaquePeriodo).append("\n");
    sb.append("  limiteMaximo: ").append(limiteMaximo).append("\n");
    sb.append("  saldoDisponivelGlobal: ").append(saldoDisponivelGlobal).append("\n");
    sb.append("  saldoDisponivelCompra: ").append(saldoDisponivelCompra).append("\n");
    sb.append("  saldoDisponivelParcelado: ").append(saldoDisponivelParcelado).append("\n");
    sb.append("  saldoDisponivelParcelas: ").append(saldoDisponivelParcelas).append("\n");
    sb.append("  saldoDisponivelSaque: ").append(saldoDisponivelSaque).append("\n");
    sb.append("  saldoPontosFidelidade: ").append(saldoPontosFidelidade).append("\n");
    sb.append("  saldoDisponivelCompraInternacional: ").append(saldoDisponivelCompraInternacional).append("\n");
    sb.append("  saldoDisponivelSaqueInternacional: ").append(saldoDisponivelSaqueInternacional).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
