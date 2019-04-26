package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Fatura futura
 **/
@ApiModel(description = "Fatura futura")
public class FaturaResponse  {
  
  @SerializedName("idConta")
  private Long idConta = null;
  public enum SituacaoProcessamentoEnum {
     ABERTA,  FECHADA,  TODAS, 
  };
  @SerializedName("situacaoProcessamento")
  private SituacaoProcessamentoEnum situacaoProcessamento = null;
  @SerializedName("pagamentoEfetuado")
  private Boolean pagamentoEfetuado = null;
  @SerializedName("dataVencimentoFatura")
  private String dataVencimentoFatura = null;
  @SerializedName("dataVencimentoReal")
  private String dataVencimentoReal = null;
  @SerializedName("dataFechamento")
  private String dataFechamento = null;
  @SerializedName("valorTotal")
  private BigDecimal valorTotal = null;
  @SerializedName("valorPagamentoMinimo")
  private BigDecimal valorPagamentoMinimo = null;
  @SerializedName("saldoAnterior")
  private BigDecimal saldoAnterior = null;
  @SerializedName("idBoleto")
  private Long idBoleto = null;
  @SerializedName("flagEmiteExtrato")
  private Boolean flagEmiteExtrato = null;

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o da conta
   **/
  @ApiModelProperty(value = "C\u00F3digo de identifica\u00E7\u00E3o da conta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Situa\u00E7\u00E3o de Processamento da fatura
   **/
  @ApiModelProperty(value = "Situa\u00E7\u00E3o de Processamento da fatura")
  public SituacaoProcessamentoEnum getSituacaoProcessamento() {
    return situacaoProcessamento;
  }
  public void setSituacaoProcessamento(SituacaoProcessamentoEnum situacaoProcessamento) {
    this.situacaoProcessamento = situacaoProcessamento;
  }

  
  /**
   * Status de pagamento efetuado
   **/
  @ApiModelProperty(value = "Status de pagamento efetuado")
  public Boolean getPagamentoEfetuado() {
    return pagamentoEfetuado;
  }
  public void setPagamentoEfetuado(Boolean pagamentoEfetuado) {
    this.pagamentoEfetuado = pagamentoEfetuado;
  }

  
  /**
   * Data de vencimento da fatura
   **/
  @ApiModelProperty(value = "Data de vencimento da fatura")
  public String getDataVencimentoFatura() {
    return dataVencimentoFatura;
  }
  public void setDataVencimentoFatura(String dataVencimentoFatura) {
    this.dataVencimentoFatura = dataVencimentoFatura;
  }

  
  /**
   * Data de vencimento real da fatura
   **/
  @ApiModelProperty(value = "Data de vencimento real da fatura")
  public String getDataVencimentoReal() {
    return dataVencimentoReal;
  }
  public void setDataVencimentoReal(String dataVencimentoReal) {
    this.dataVencimentoReal = dataVencimentoReal;
  }

  
  /**
   * Data de fechamento da fatura
   **/
  @ApiModelProperty(value = "Data de fechamento da fatura")
  public String getDataFechamento() {
    return dataFechamento;
  }
  public void setDataFechamento(String dataFechamento) {
    this.dataFechamento = dataFechamento;
  }

  
  /**
   * Valor total da fatura
   **/
  @ApiModelProperty(value = "Valor total da fatura")
  public BigDecimal getValorTotal() {
    return valorTotal;
  }
  public void setValorTotal(BigDecimal valorTotal) {
    this.valorTotal = valorTotal;
  }

  
  /**
   * Valor do pagamento m\u00EDnimo
   **/
  @ApiModelProperty(value = "Valor do pagamento m\u00EDnimo")
  public BigDecimal getValorPagamentoMinimo() {
    return valorPagamentoMinimo;
  }
  public void setValorPagamentoMinimo(BigDecimal valorPagamentoMinimo) {
    this.valorPagamentoMinimo = valorPagamentoMinimo;
  }

  
  /**
   * Valor do saldo anterior
   **/
  @ApiModelProperty(value = "Valor do saldo anterior")
  public BigDecimal getSaldoAnterior() {
    return saldoAnterior;
  }
  public void setSaldoAnterior(BigDecimal saldoAnterior) {
    this.saldoAnterior = saldoAnterior;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o do boleto
   **/
  @ApiModelProperty(value = "C\u00F3digo de identifica\u00E7\u00E3o do boleto")
  public Long getIdBoleto() {
    return idBoleto;
  }
  public void setIdBoleto(Long idBoleto) {
    this.idBoleto = idBoleto;
  }

  
  /**
   * Flag de emite extrato.
   **/
  @ApiModelProperty(value = "Flag de emite extrato.")
  public Boolean getFlagEmiteExtrato() {
    return flagEmiteExtrato;
  }
  public void setFlagEmiteExtrato(Boolean flagEmiteExtrato) {
    this.flagEmiteExtrato = flagEmiteExtrato;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class FaturaResponse {\n");
    
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  situacaoProcessamento: ").append(situacaoProcessamento).append("\n");
    sb.append("  pagamentoEfetuado: ").append(pagamentoEfetuado).append("\n");
    sb.append("  dataVencimentoFatura: ").append(dataVencimentoFatura).append("\n");
    sb.append("  dataVencimentoReal: ").append(dataVencimentoReal).append("\n");
    sb.append("  dataFechamento: ").append(dataFechamento).append("\n");
    sb.append("  valorTotal: ").append(valorTotal).append("\n");
    sb.append("  valorPagamentoMinimo: ").append(valorPagamentoMinimo).append("\n");
    sb.append("  saldoAnterior: ").append(saldoAnterior).append("\n");
    sb.append("  idBoleto: ").append(idBoleto).append("\n");
    sb.append("  flagEmiteExtrato: ").append(flagEmiteExtrato).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
