package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;
import java.util.Date;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * Objeto Fatura
 **/
@ApiModel(description = "Objeto Fatura")
public class Fatura  {
  
  @SerializedName("dataVencimento")
  private Date dataVencimento = null;
  @SerializedName("saldoFaturaAnterior")
  private BigDecimal saldoFaturaAnterior = null;
  @SerializedName("saldoMulta")
  private BigDecimal saldoMulta = null;
  @SerializedName("saldoCompras")
  private BigDecimal saldoCompras = null;
  @SerializedName("saldoPagamentos")
  private BigDecimal saldoPagamentos = null;
  @SerializedName("saldoTarifas")
  private BigDecimal saldoTarifas = null;
  @SerializedName("saldoDebitos")
  private BigDecimal saldoDebitos = null;
  @SerializedName("saldoCreditos")
  private BigDecimal saldoCreditos = null;
  @SerializedName("saldoAtualFinal")
  private BigDecimal saldoAtualFinal = null;
  @SerializedName("valorMinimoFatura")
  private BigDecimal valorMinimoFatura = null;
  @SerializedName("flagEmiteFatura")
  private Integer flagEmiteFatura = null;

  
  /**
   * Data de Vencimento da Fatura.
   **/
  @ApiModelProperty(value = "Data de Vencimento da Fatura.")
  public Date getDataVencimento() {
    return dataVencimento;
  }
  public void setDataVencimento(Date dataVencimento) {
    this.dataVencimento = dataVencimento;
  }

  
  /**
   * Saldo da Fatura Anterior.
   **/
  @ApiModelProperty(value = "Saldo da Fatura Anterior.")
  public BigDecimal getSaldoFaturaAnterior() {
    return saldoFaturaAnterior;
  }
  public void setSaldoFaturaAnterior(BigDecimal saldoFaturaAnterior) {
    this.saldoFaturaAnterior = saldoFaturaAnterior;
  }

  
  /**
   * Saldo total da Multa lan\u00C3\u00A7ada na Fatura atual.
   **/
  @ApiModelProperty(value = "Saldo total da Multa lan\u00C3\u00A7ada na Fatura atual.")
  public BigDecimal getSaldoMulta() {
    return saldoMulta;
  }
  public void setSaldoMulta(BigDecimal saldoMulta) {
    this.saldoMulta = saldoMulta;
  }

  
  /**
   * Saldo total das Compras lan\u00C3\u00A7adas na Fatura atual.
   **/
  @ApiModelProperty(value = "Saldo total das Compras lan\u00C3\u00A7adas na Fatura atual.")
  public BigDecimal getSaldoCompras() {
    return saldoCompras;
  }
  public void setSaldoCompras(BigDecimal saldoCompras) {
    this.saldoCompras = saldoCompras;
  }

  
  /**
   * Saldo total dos Pagamentos lan\u00C3\u00A7ados na Fatura atual.
   **/
  @ApiModelProperty(value = "Saldo total dos Pagamentos lan\u00C3\u00A7ados na Fatura atual.")
  public BigDecimal getSaldoPagamentos() {
    return saldoPagamentos;
  }
  public void setSaldoPagamentos(BigDecimal saldoPagamentos) {
    this.saldoPagamentos = saldoPagamentos;
  }

  
  /**
   * Saldo total das Tarifas lan\u00C3\u00A7adas na Fatura atual.
   **/
  @ApiModelProperty(value = "Saldo total das Tarifas lan\u00C3\u00A7adas na Fatura atual.")
  public BigDecimal getSaldoTarifas() {
    return saldoTarifas;
  }
  public void setSaldoTarifas(BigDecimal saldoTarifas) {
    this.saldoTarifas = saldoTarifas;
  }

  
  /**
   * Saldo total dos D\u00C3\u00A9bitos lan\u00C3\u00A7ados na Fatura atual.
   **/
  @ApiModelProperty(value = "Saldo total dos D\u00C3\u00A9bitos lan\u00C3\u00A7ados na Fatura atual.")
  public BigDecimal getSaldoDebitos() {
    return saldoDebitos;
  }
  public void setSaldoDebitos(BigDecimal saldoDebitos) {
    this.saldoDebitos = saldoDebitos;
  }

  
  /**
   * Saldo total dos Cr\u00C3\u00A9dito lan\u00C3\u00A7ados na Fatura atual.
   **/
  @ApiModelProperty(value = "Saldo total dos Cr\u00C3\u00A9dito lan\u00C3\u00A7ados na Fatura atual.")
  public BigDecimal getSaldoCreditos() {
    return saldoCreditos;
  }
  public void setSaldoCreditos(BigDecimal saldoCreditos) {
    this.saldoCreditos = saldoCreditos;
  }

  
  /**
   * Salto total devedor da Fatura atual.
   **/
  @ApiModelProperty(value = "Salto total devedor da Fatura atual.")
  public BigDecimal getSaldoAtualFinal() {
    return saldoAtualFinal;
  }
  public void setSaldoAtualFinal(BigDecimal saldoAtualFinal) {
    this.saldoAtualFinal = saldoAtualFinal;
  }

  
  /**
   * Valor m\u00C3\u00ADnimo para Pagamento da Fatura.
   **/
  @ApiModelProperty(value = "Valor m\u00C3\u00ADnimo para Pagamento da Fatura.")
  public BigDecimal getValorMinimoFatura() {
    return valorMinimoFatura;
  }
  public void setValorMinimoFatura(BigDecimal valorMinimoFatura) {
    this.valorMinimoFatura = valorMinimoFatura;
  }

  
  /**
   * Quando ativa, indica que fora emitida uma Fatura.
   **/
  @ApiModelProperty(value = "Quando ativa, indica que fora emitida uma Fatura.")
  public Integer getFlagEmiteFatura() {
    return flagEmiteFatura;
  }
  public void setFlagEmiteFatura(Integer flagEmiteFatura) {
    this.flagEmiteFatura = flagEmiteFatura;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Fatura {\n");
    
    sb.append("  dataVencimento: ").append(dataVencimento).append("\n");
    sb.append("  saldoFaturaAnterior: ").append(saldoFaturaAnterior).append("\n");
    sb.append("  saldoMulta: ").append(saldoMulta).append("\n");
    sb.append("  saldoCompras: ").append(saldoCompras).append("\n");
    sb.append("  saldoPagamentos: ").append(saldoPagamentos).append("\n");
    sb.append("  saldoTarifas: ").append(saldoTarifas).append("\n");
    sb.append("  saldoDebitos: ").append(saldoDebitos).append("\n");
    sb.append("  saldoCreditos: ").append(saldoCreditos).append("\n");
    sb.append("  saldoAtualFinal: ").append(saldoAtualFinal).append("\n");
    sb.append("  valorMinimoFatura: ").append(valorMinimoFatura).append("\n");
    sb.append("  flagEmiteFatura: ").append(flagEmiteFatura).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


