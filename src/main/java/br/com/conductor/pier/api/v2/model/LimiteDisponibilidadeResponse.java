package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * {{{limite_disponibilidade_response_description}}}
 **/
@ApiModel(description = "{{{limite_disponibilidade_response_description}}}")
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
   * {{{limite_disponibilidade_response_id_value}}}
   **/
  @ApiModelProperty(value = "{{{limite_disponibilidade_response_id_value}}}")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{limite_disponibilidade_response_limite_global_value}}}
   **/
  @ApiModelProperty(value = "{{{limite_disponibilidade_response_limite_global_value}}}")
  public BigDecimal getLimiteGlobal() {
    return limiteGlobal;
  }
  public void setLimiteGlobal(BigDecimal limiteGlobal) {
    this.limiteGlobal = limiteGlobal;
  }

  
  /**
   * {{{limite_disponibilidade_response_limite_compra_value}}}
   **/
  @ApiModelProperty(value = "{{{limite_disponibilidade_response_limite_compra_value}}}")
  public BigDecimal getLimiteCompra() {
    return limiteCompra;
  }
  public void setLimiteCompra(BigDecimal limiteCompra) {
    this.limiteCompra = limiteCompra;
  }

  
  /**
   * {{{limite_disponibilidade_response_limite_parcelado_value}}}
   **/
  @ApiModelProperty(value = "{{{limite_disponibilidade_response_limite_parcelado_value}}}")
  public BigDecimal getLimiteParcelado() {
    return limiteParcelado;
  }
  public void setLimiteParcelado(BigDecimal limiteParcelado) {
    this.limiteParcelado = limiteParcelado;
  }

  
  /**
   * {{{limite_disponibilidade_response_limite_parcelas_value}}}
   **/
  @ApiModelProperty(value = "{{{limite_disponibilidade_response_limite_parcelas_value}}}")
  public BigDecimal getLimiteParcelas() {
    return limiteParcelas;
  }
  public void setLimiteParcelas(BigDecimal limiteParcelas) {
    this.limiteParcelas = limiteParcelas;
  }

  
  /**
   * {{{limite_disponibilidade_response_limite_saque_global_value}}}
   **/
  @ApiModelProperty(value = "{{{limite_disponibilidade_response_limite_saque_global_value}}}")
  public BigDecimal getLimiteSaqueGlobal() {
    return limiteSaqueGlobal;
  }
  public void setLimiteSaqueGlobal(BigDecimal limiteSaqueGlobal) {
    this.limiteSaqueGlobal = limiteSaqueGlobal;
  }

  
  /**
   * {{{limite_disponibilidade_response_limite_saque_periodo_value}}}
   **/
  @ApiModelProperty(value = "{{{limite_disponibilidade_response_limite_saque_periodo_value}}}")
  public BigDecimal getLimiteSaquePeriodo() {
    return limiteSaquePeriodo;
  }
  public void setLimiteSaquePeriodo(BigDecimal limiteSaquePeriodo) {
    this.limiteSaquePeriodo = limiteSaquePeriodo;
  }

  
  /**
   * {{{limite_disponibilidade_response_limite_consignado_value}}}
   **/
  @ApiModelProperty(value = "{{{limite_disponibilidade_response_limite_consignado_value}}}")
  public BigDecimal getLimiteConsignado() {
    return limiteConsignado;
  }
  public void setLimiteConsignado(BigDecimal limiteConsignado) {
    this.limiteConsignado = limiteConsignado;
  }

  
  /**
   * {{{limite_disponibilidade_response_limite_internacional_compra_value}}}
   **/
  @ApiModelProperty(value = "{{{limite_disponibilidade_response_limite_internacional_compra_value}}}")
  public BigDecimal getLimiteInternacionalCompra() {
    return limiteInternacionalCompra;
  }
  public void setLimiteInternacionalCompra(BigDecimal limiteInternacionalCompra) {
    this.limiteInternacionalCompra = limiteInternacionalCompra;
  }

  
  /**
   * {{{limite_disponibilidade_response_limite_internacional_parcelado_value}}}
   **/
  @ApiModelProperty(value = "{{{limite_disponibilidade_response_limite_internacional_parcelado_value}}}")
  public BigDecimal getLimiteInternacionalParcelado() {
    return limiteInternacionalParcelado;
  }
  public void setLimiteInternacionalParcelado(BigDecimal limiteInternacionalParcelado) {
    this.limiteInternacionalParcelado = limiteInternacionalParcelado;
  }

  
  /**
   * {{{limite_disponibilidade_response_limite_internacional_parcelas_value}}}
   **/
  @ApiModelProperty(value = "{{{limite_disponibilidade_response_limite_internacional_parcelas_value}}}")
  public BigDecimal getLimiteInternacionalParcelas() {
    return limiteInternacionalParcelas;
  }
  public void setLimiteInternacionalParcelas(BigDecimal limiteInternacionalParcelas) {
    this.limiteInternacionalParcelas = limiteInternacionalParcelas;
  }

  
  /**
   * {{{limite_disponibilidade_response_limite_internacional_saque_global_value}}}
   **/
  @ApiModelProperty(value = "{{{limite_disponibilidade_response_limite_internacional_saque_global_value}}}")
  public BigDecimal getLimiteInternacionalSaqueGlobal() {
    return limiteInternacionalSaqueGlobal;
  }
  public void setLimiteInternacionalSaqueGlobal(BigDecimal limiteInternacionalSaqueGlobal) {
    this.limiteInternacionalSaqueGlobal = limiteInternacionalSaqueGlobal;
  }

  
  /**
   * {{{limite_disponibilidade_response_limite_internacional_saque_periodo_value}}}
   **/
  @ApiModelProperty(value = "{{{limite_disponibilidade_response_limite_internacional_saque_periodo_value}}}")
  public BigDecimal getLimiteInternacionalSaquePeriodo() {
    return limiteInternacionalSaquePeriodo;
  }
  public void setLimiteInternacionalSaquePeriodo(BigDecimal limiteInternacionalSaquePeriodo) {
    this.limiteInternacionalSaquePeriodo = limiteInternacionalSaquePeriodo;
  }

  
  /**
   * {{{limite_disponibilidade_response_limite_maximo_value}}}
   **/
  @ApiModelProperty(value = "{{{limite_disponibilidade_response_limite_maximo_value}}}")
  public BigDecimal getLimiteMaximo() {
    return limiteMaximo;
  }
  public void setLimiteMaximo(BigDecimal limiteMaximo) {
    this.limiteMaximo = limiteMaximo;
  }

  
  /**
   * {{{limite_disponibilidade_response_saldo_disponivel_global_value}}}
   **/
  @ApiModelProperty(value = "{{{limite_disponibilidade_response_saldo_disponivel_global_value}}}")
  public BigDecimal getSaldoDisponivelGlobal() {
    return saldoDisponivelGlobal;
  }
  public void setSaldoDisponivelGlobal(BigDecimal saldoDisponivelGlobal) {
    this.saldoDisponivelGlobal = saldoDisponivelGlobal;
  }

  
  /**
   * {{{limite_disponibilidade_response_saldo_disponivel_compra_value}}}
   **/
  @ApiModelProperty(value = "{{{limite_disponibilidade_response_saldo_disponivel_compra_value}}}")
  public BigDecimal getSaldoDisponivelCompra() {
    return saldoDisponivelCompra;
  }
  public void setSaldoDisponivelCompra(BigDecimal saldoDisponivelCompra) {
    this.saldoDisponivelCompra = saldoDisponivelCompra;
  }

  
  /**
   * {{{limite_disponibilidade_response_saldo_disponivel_parcelado_value}}}
   **/
  @ApiModelProperty(value = "{{{limite_disponibilidade_response_saldo_disponivel_parcelado_value}}}")
  public BigDecimal getSaldoDisponivelParcelado() {
    return saldoDisponivelParcelado;
  }
  public void setSaldoDisponivelParcelado(BigDecimal saldoDisponivelParcelado) {
    this.saldoDisponivelParcelado = saldoDisponivelParcelado;
  }

  
  /**
   * {{{limite_disponibilidade_response_saldo_disponivel_parcelas_value}}}
   **/
  @ApiModelProperty(value = "{{{limite_disponibilidade_response_saldo_disponivel_parcelas_value}}}")
  public BigDecimal getSaldoDisponivelParcelas() {
    return saldoDisponivelParcelas;
  }
  public void setSaldoDisponivelParcelas(BigDecimal saldoDisponivelParcelas) {
    this.saldoDisponivelParcelas = saldoDisponivelParcelas;
  }

  
  /**
   * {{{limite_disponibilidade_response_saldo_disponivel_saque_value}}}
   **/
  @ApiModelProperty(value = "{{{limite_disponibilidade_response_saldo_disponivel_saque_value}}}")
  public BigDecimal getSaldoDisponivelSaque() {
    return saldoDisponivelSaque;
  }
  public void setSaldoDisponivelSaque(BigDecimal saldoDisponivelSaque) {
    this.saldoDisponivelSaque = saldoDisponivelSaque;
  }

  
  /**
   * {{{limite_disponibilidade_response_saldo_pontos_fidelidade_value}}}
   **/
  @ApiModelProperty(value = "{{{limite_disponibilidade_response_saldo_pontos_fidelidade_value}}}")
  public BigDecimal getSaldoPontosFidelidade() {
    return saldoPontosFidelidade;
  }
  public void setSaldoPontosFidelidade(BigDecimal saldoPontosFidelidade) {
    this.saldoPontosFidelidade = saldoPontosFidelidade;
  }

  
  /**
   * {{{limite_disponibilidade_response_saldo_disponivel_compra_internacional_value}}}
   **/
  @ApiModelProperty(value = "{{{limite_disponibilidade_response_saldo_disponivel_compra_internacional_value}}}")
  public BigDecimal getSaldoDisponivelCompraInternacional() {
    return saldoDisponivelCompraInternacional;
  }
  public void setSaldoDisponivelCompraInternacional(BigDecimal saldoDisponivelCompraInternacional) {
    this.saldoDisponivelCompraInternacional = saldoDisponivelCompraInternacional;
  }

  
  /**
   * {{{limite_disponibilidade_response_saldo_disponivel_saque_internacional_value}}}
   **/
  @ApiModelProperty(value = "{{{limite_disponibilidade_response_saldo_disponivel_saque_internacional_value}}}")
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


