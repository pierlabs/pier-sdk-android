package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;
import java.util.Date;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * Fatura
 **/
@ApiModel(description = "Fatura")
public class FaturaResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("idConta")
  private Long idConta = null;
  @SerializedName("idProduto")
  private Long idProduto = null;
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
   * C\u00C3\u00B3digo identificador da fatura.
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo identificador da fatura.")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * C\u00C3\u00B3digo identificador da conta.
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo identificador da conta.")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * C\u00C3\u00B3digo identificador do produto.
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo identificador do produto.")
  public Long getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Long idProduto) {
    this.idProduto = idProduto;
  }

  
  /**
   * Data de vencimento da fatura.
   **/
  @ApiModelProperty(value = "Data de vencimento da fatura.")
  public Date getDataVencimento() {
    return dataVencimento;
  }
  public void setDataVencimento(Date dataVencimento) {
    this.dataVencimento = dataVencimento;
  }

  
  /**
   * Saldo da fatura anterior.
   **/
  @ApiModelProperty(value = "Saldo da fatura anterior.")
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
   * Saldo total das compras lan\u00C3\u00A7adas na fatura atual.
   **/
  @ApiModelProperty(value = "Saldo total das compras lan\u00C3\u00A7adas na fatura atual.")
  public BigDecimal getSaldoCompras() {
    return saldoCompras;
  }
  public void setSaldoCompras(BigDecimal saldoCompras) {
    this.saldoCompras = saldoCompras;
  }

  
  /**
   * Saldo total dos pagamentos lan\u00C3\u00A7ados na fatura atual.
   **/
  @ApiModelProperty(value = "Saldo total dos pagamentos lan\u00C3\u00A7ados na fatura atual.")
  public BigDecimal getSaldoPagamentos() {
    return saldoPagamentos;
  }
  public void setSaldoPagamentos(BigDecimal saldoPagamentos) {
    this.saldoPagamentos = saldoPagamentos;
  }

  
  /**
   * Saldo total das tarifas lan\u00C3\u00A7adas na fatura atual.
   **/
  @ApiModelProperty(value = "Saldo total das tarifas lan\u00C3\u00A7adas na fatura atual.")
  public BigDecimal getSaldoTarifas() {
    return saldoTarifas;
  }
  public void setSaldoTarifas(BigDecimal saldoTarifas) {
    this.saldoTarifas = saldoTarifas;
  }

  
  /**
   * Saldo total dos d\u00C3\u00A9bitos lan\u00C3\u00A7ados na fatura atual.
   **/
  @ApiModelProperty(value = "Saldo total dos d\u00C3\u00A9bitos lan\u00C3\u00A7ados na fatura atual.")
  public BigDecimal getSaldoDebitos() {
    return saldoDebitos;
  }
  public void setSaldoDebitos(BigDecimal saldoDebitos) {
    this.saldoDebitos = saldoDebitos;
  }

  
  /**
   * Saldo total dos cr\u00C3\u00A9dito lan\u00C3\u00A7ados na fatura atual.
   **/
  @ApiModelProperty(value = "Saldo total dos cr\u00C3\u00A9dito lan\u00C3\u00A7ados na fatura atual.")
  public BigDecimal getSaldoCreditos() {
    return saldoCreditos;
  }
  public void setSaldoCreditos(BigDecimal saldoCreditos) {
    this.saldoCreditos = saldoCreditos;
  }

  
  /**
   * Salto total devedor da fatura atual.
   **/
  @ApiModelProperty(value = "Salto total devedor da fatura atual.")
  public BigDecimal getSaldoAtualFinal() {
    return saldoAtualFinal;
  }
  public void setSaldoAtualFinal(BigDecimal saldoAtualFinal) {
    this.saldoAtualFinal = saldoAtualFinal;
  }

  
  /**
   * Valor m\u00C3\u00ADnimo para pagamento da fatura.
   **/
  @ApiModelProperty(value = "Valor m\u00C3\u00ADnimo para pagamento da fatura.")
  public BigDecimal getValorMinimoFatura() {
    return valorMinimoFatura;
  }
  public void setValorMinimoFatura(BigDecimal valorMinimoFatura) {
    this.valorMinimoFatura = valorMinimoFatura;
  }

  
  /**
   * Quando ativa, indica que fora emitida uma fatura.
   **/
  @ApiModelProperty(value = "Quando ativa, indica que fora emitida uma fatura.")
  public Integer getFlagEmiteFatura() {
    return flagEmiteFatura;
  }
  public void setFlagEmiteFatura(Integer flagEmiteFatura) {
    this.flagEmiteFatura = flagEmiteFatura;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class FaturaResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  idProduto: ").append(idProduto).append("\n");
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


