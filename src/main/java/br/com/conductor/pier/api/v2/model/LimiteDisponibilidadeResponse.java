package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Limite Disponibilidade
 **/
@ApiModel(description = "Limite Disponibilidade")
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
   * C\u00F3digo de Identifica\u00E7\u00E3o de Limite e Disponibilidade (id).
   **/
  @ApiModelProperty(value = "C\u00F3digo de Identifica\u00E7\u00E3o de Limite e Disponibilidade (id).")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Valor do limite de cr\u00E9dito.
   **/
  @ApiModelProperty(value = "Valor do limite de cr\u00E9dito.")
  public BigDecimal getLimiteGlobal() {
    return limiteGlobal;
  }
  public void setLimiteGlobal(BigDecimal limiteGlobal) {
    this.limiteGlobal = limiteGlobal;
  }

  
  /**
   * Valor do limite de cr\u00E9dito para uso exclusivo em compras nacionais.
   **/
  @ApiModelProperty(value = "Valor do limite de cr\u00E9dito para uso exclusivo em compras nacionais.")
  public BigDecimal getLimiteCompra() {
    return limiteCompra;
  }
  public void setLimiteCompra(BigDecimal limiteCompra) {
    this.limiteCompra = limiteCompra;
  }

  
  /**
   * Valor do limite de cr\u00E9dito para transa\u00E7\u00F5es de compras parceladas.
   **/
  @ApiModelProperty(value = "Valor do limite de cr\u00E9dito para transa\u00E7\u00F5es de compras parceladas.")
  public BigDecimal getLimiteParcelado() {
    return limiteParcelado;
  }
  public void setLimiteParcelado(BigDecimal limiteParcelado) {
    this.limiteParcelado = limiteParcelado;
  }

  
  /**
   * Valor do limite de cr\u00E9dito acumulado da soma das parcelas das compras que forem realizadas nesta modalidade.
   **/
  @ApiModelProperty(value = "Valor do limite de cr\u00E9dito acumulado da soma das parcelas das compras que forem realizadas nesta modalidade.")
  public BigDecimal getLimiteParcelas() {
    return limiteParcelas;
  }
  public void setLimiteParcelas(BigDecimal limiteParcelas) {
    this.limiteParcelas = limiteParcelas;
  }

  
  /**
   * Valor do limite de cr\u00E9dito para transa\u00E7\u00F5es de Saque Nacional.
   **/
  @ApiModelProperty(value = "Valor do limite de cr\u00E9dito para transa\u00E7\u00F5es de Saque Nacional.")
  public BigDecimal getLimiteSaqueGlobal() {
    return limiteSaqueGlobal;
  }
  public void setLimiteSaqueGlobal(BigDecimal limiteSaqueGlobal) {
    this.limiteSaqueGlobal = limiteSaqueGlobal;
  }

  
  /**
   * Valor do limite de cr\u00E9dito para transa\u00E7\u00F5es de Saque Nacional dentro de cada ciclo de faturamento.
   **/
  @ApiModelProperty(value = "Valor do limite de cr\u00E9dito para transa\u00E7\u00F5es de Saque Nacional dentro de cada ciclo de faturamento.")
  public BigDecimal getLimiteSaquePeriodo() {
    return limiteSaquePeriodo;
  }
  public void setLimiteSaquePeriodo(BigDecimal limiteSaquePeriodo) {
    this.limiteSaquePeriodo = limiteSaquePeriodo;
  }

  
  /**
   * Valor da margem de cr\u00E9dito para consigna\u00E7\u00F5es (desconto em folha).
   **/
  @ApiModelProperty(value = "Valor da margem de cr\u00E9dito para consigna\u00E7\u00F5es (desconto em folha).")
  public BigDecimal getLimiteConsignado() {
    return limiteConsignado;
  }
  public void setLimiteConsignado(BigDecimal limiteConsignado) {
    this.limiteConsignado = limiteConsignado;
  }

  
  /**
   * Valor do limite de cr\u00E9dito para uso exclusivo em compras internacionais.
   **/
  @ApiModelProperty(value = "Valor do limite de cr\u00E9dito para uso exclusivo em compras internacionais.")
  public BigDecimal getLimiteInternacionalCompra() {
    return limiteInternacionalCompra;
  }
  public void setLimiteInternacionalCompra(BigDecimal limiteInternacionalCompra) {
    this.limiteInternacionalCompra = limiteInternacionalCompra;
  }

  
  /**
   * Valor do limite de cr\u00E9dito para transa\u00E7\u00F5es internacionais de compras parceladas.
   **/
  @ApiModelProperty(value = "Valor do limite de cr\u00E9dito para transa\u00E7\u00F5es internacionais de compras parceladas.")
  public BigDecimal getLimiteInternacionalParcelado() {
    return limiteInternacionalParcelado;
  }
  public void setLimiteInternacionalParcelado(BigDecimal limiteInternacionalParcelado) {
    this.limiteInternacionalParcelado = limiteInternacionalParcelado;
  }

  
  /**
   * Valor do limite de cr\u00E9dito acumulado da soma das parcelas das compras internacionais que forem realizadas nesta modalidade.
   **/
  @ApiModelProperty(value = "Valor do limite de cr\u00E9dito acumulado da soma das parcelas das compras internacionais que forem realizadas nesta modalidade.")
  public BigDecimal getLimiteInternacionalParcelas() {
    return limiteInternacionalParcelas;
  }
  public void setLimiteInternacionalParcelas(BigDecimal limiteInternacionalParcelas) {
    this.limiteInternacionalParcelas = limiteInternacionalParcelas;
  }

  
  /**
   * Valor do limite de cr\u00E9dito para transa\u00E7\u00F5es de saque internacional.
   **/
  @ApiModelProperty(value = "Valor do limite de cr\u00E9dito para transa\u00E7\u00F5es de saque internacional.")
  public BigDecimal getLimiteInternacionalSaqueGlobal() {
    return limiteInternacionalSaqueGlobal;
  }
  public void setLimiteInternacionalSaqueGlobal(BigDecimal limiteInternacionalSaqueGlobal) {
    this.limiteInternacionalSaqueGlobal = limiteInternacionalSaqueGlobal;
  }

  
  /**
   * Valor do limite de cr\u00E9dito para transa\u00E7\u00F5es de saque internacional dentro de cada ciclo de faturamento.
   **/
  @ApiModelProperty(value = "Valor do limite de cr\u00E9dito para transa\u00E7\u00F5es de saque internacional dentro de cada ciclo de faturamento.")
  public BigDecimal getLimiteInternacionalSaquePeriodo() {
    return limiteInternacionalSaquePeriodo;
  }
  public void setLimiteInternacionalSaquePeriodo(BigDecimal limiteInternacionalSaquePeriodo) {
    this.limiteInternacionalSaquePeriodo = limiteInternacionalSaquePeriodo;
  }

  
  /**
   * Valor m\u00E1ximo do limite de cr\u00E9dito para realizar transa\u00E7\u00F5es.
   **/
  @ApiModelProperty(value = "Valor m\u00E1ximo do limite de cr\u00E9dito para realizar transa\u00E7\u00F5es.")
  public BigDecimal getLimiteMaximo() {
    return limiteMaximo;
  }
  public void setLimiteMaximo(BigDecimal limiteMaximo) {
    this.limiteMaximo = limiteMaximo;
  }

  
  /**
   * Valor de cr\u00E9dito dispon\u00EDvel para transa\u00E7\u00F5es.
   **/
  @ApiModelProperty(value = "Valor de cr\u00E9dito dispon\u00EDvel para transa\u00E7\u00F5es.")
  public BigDecimal getSaldoDisponivelGlobal() {
    return saldoDisponivelGlobal;
  }
  public void setSaldoDisponivelGlobal(BigDecimal saldoDisponivelGlobal) {
    this.saldoDisponivelGlobal = saldoDisponivelGlobal;
  }

  
  /**
   * Valor de cr\u00E9dito dispon\u00EDvel para transa\u00E7\u00F5es de compra nacional.
   **/
  @ApiModelProperty(value = "Valor de cr\u00E9dito dispon\u00EDvel para transa\u00E7\u00F5es de compra nacional.")
  public BigDecimal getSaldoDisponivelCompra() {
    return saldoDisponivelCompra;
  }
  public void setSaldoDisponivelCompra(BigDecimal saldoDisponivelCompra) {
    this.saldoDisponivelCompra = saldoDisponivelCompra;
  }

  
  /**
   * Valor de cr\u00E9dito dispon\u00EDvel para transa\u00E7\u00F5es de compra nacional parcelada.
   **/
  @ApiModelProperty(value = "Valor de cr\u00E9dito dispon\u00EDvel para transa\u00E7\u00F5es de compra nacional parcelada.")
  public BigDecimal getSaldoDisponivelParcelado() {
    return saldoDisponivelParcelado;
  }
  public void setSaldoDisponivelParcelado(BigDecimal saldoDisponivelParcelado) {
    this.saldoDisponivelParcelado = saldoDisponivelParcelado;
  }

  
  /**
   * Valor de cr\u00E9dito dispon\u00EDvel para utilizar como valor de parcelas Nacionais em um determinado ciclo de faturamento.
   **/
  @ApiModelProperty(value = "Valor de cr\u00E9dito dispon\u00EDvel para utilizar como valor de parcelas Nacionais em um determinado ciclo de faturamento.")
  public BigDecimal getSaldoDisponivelParcelas() {
    return saldoDisponivelParcelas;
  }
  public void setSaldoDisponivelParcelas(BigDecimal saldoDisponivelParcelas) {
    this.saldoDisponivelParcelas = saldoDisponivelParcelas;
  }

  
  /**
   * Valor de cr\u00E9dito que o portador possui dispon\u00EDvel para realizar transa\u00E7\u00F5es de Saque Nacional.
   **/
  @ApiModelProperty(value = "Valor de cr\u00E9dito que o portador possui dispon\u00EDvel para realizar transa\u00E7\u00F5es de Saque Nacional.")
  public BigDecimal getSaldoDisponivelSaque() {
    return saldoDisponivelSaque;
  }
  public void setSaldoDisponivelSaque(BigDecimal saldoDisponivelSaque) {
    this.saldoDisponivelSaque = saldoDisponivelSaque;
  }

  
  /**
   * Saldo atual de pontos do programa de fidelidade.
   **/
  @ApiModelProperty(value = "Saldo atual de pontos do programa de fidelidade.")
  public BigDecimal getSaldoPontosFidelidade() {
    return saldoPontosFidelidade;
  }
  public void setSaldoPontosFidelidade(BigDecimal saldoPontosFidelidade) {
    this.saldoPontosFidelidade = saldoPontosFidelidade;
  }

  
  /**
   * Valor de cr\u00E9dito dispon\u00EDvel para transa\u00E7\u00F5es de compra internacional.
   **/
  @ApiModelProperty(value = "Valor de cr\u00E9dito dispon\u00EDvel para transa\u00E7\u00F5es de compra internacional.")
  public BigDecimal getSaldoDisponivelCompraInternacional() {
    return saldoDisponivelCompraInternacional;
  }
  public void setSaldoDisponivelCompraInternacional(BigDecimal saldoDisponivelCompraInternacional) {
    this.saldoDisponivelCompraInternacional = saldoDisponivelCompraInternacional;
  }

  
  /**
   * Valor de cr\u00E9dito dispon\u00EDvel para transa\u00E7\u00F5es de saque internacional.
   **/
  @ApiModelProperty(value = "Valor de cr\u00E9dito dispon\u00EDvel para transa\u00E7\u00F5es de saque internacional.")
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
