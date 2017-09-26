package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * Objeto de Requisi\u00C3\u00A7\u00C3\u00A3o de Cancelamento de transa\u00C3\u00A7\u00C3\u00A3o por idCartao
 **/
@ApiModel(description = "Objeto de Requisi\u00C3\u00A7\u00C3\u00A3o de Cancelamento de transa\u00C3\u00A7\u00C3\u00A3o por idCartao")
public class CancelamentoTransacaoPorIdCartaoRequest  {
  
  @SerializedName("nsuOrigem")
  private String nsuOrigem = null;
  @SerializedName("nsuOrigemTransacaoCancelada")
  private String nsuOrigemTransacaoCancelada = null;
  @SerializedName("codigoProcessamento")
  private String codigoProcessamento = null;
  @SerializedName("dataHoraTransacaoCancelada")
  private String dataHoraTransacaoCancelada = null;
  @SerializedName("nsuAutorizacaoTransacaoCancelada")
  private String nsuAutorizacaoTransacaoCancelada = null;
  @SerializedName("valorTransacao")
  private BigDecimal valorTransacao = null;
  @SerializedName("numeroEstabelecimento")
  private Long numeroEstabelecimento = null;
  @SerializedName("dataHoraTerminal")
  private String dataHoraTerminal = null;
  @SerializedName("terminalRequisitante")
  private String terminalRequisitante = null;
  @SerializedName("numeroParcelas")
  private Long numeroParcelas = null;

  
  /**
   * N\u00C3\u00BAmero Sequencial \u00C3\u009Anico que identifica a transa\u00C3\u00A7\u00C3\u00A3o no sistema que a originou.
   **/
  @ApiModelProperty(required = true, value = "N\u00C3\u00BAmero Sequencial \u00C3\u009Anico que identifica a transa\u00C3\u00A7\u00C3\u00A3o no sistema que a originou.")
  public String getNsuOrigem() {
    return nsuOrigem;
  }
  public void setNsuOrigem(String nsuOrigem) {
    this.nsuOrigem = nsuOrigem;
  }

  
  /**
   * N\u00C3\u00BAmero Sequencial \u00C3\u009Anico que identifica a transa\u00C3\u00A7\u00C3\u00A3o no sistema a ser cancelada.
   **/
  @ApiModelProperty(required = true, value = "N\u00C3\u00BAmero Sequencial \u00C3\u009Anico que identifica a transa\u00C3\u00A7\u00C3\u00A3o no sistema a ser cancelada.")
  public String getNsuOrigemTransacaoCancelada() {
    return nsuOrigemTransacaoCancelada;
  }
  public void setNsuOrigemTransacaoCancelada(String nsuOrigemTransacaoCancelada) {
    this.nsuOrigemTransacaoCancelada = nsuOrigemTransacaoCancelada;
  }

  
  /**
   * C\u00C3\u00B3digo de Processamento que identifica o Tipo da Transa\u00C3\u00A7\u00C3\u00A3o.
   **/
  @ApiModelProperty(required = true, value = "C\u00C3\u00B3digo de Processamento que identifica o Tipo da Transa\u00C3\u00A7\u00C3\u00A3o.")
  public String getCodigoProcessamento() {
    return codigoProcessamento;
  }
  public void setCodigoProcessamento(String codigoProcessamento) {
    this.codigoProcessamento = codigoProcessamento;
  }

  
  /**
   * Apresenta a data e hora local da transa\u00C3\u00A7\u00C3\u00A3o a ser cancelada yyyy-MM-dd'T'HH:mm:ss.SSSZ. Ex: 2000-10-31T01:30:00.000-05:00
   **/
  @ApiModelProperty(required = true, value = "Apresenta a data e hora local da transa\u00C3\u00A7\u00C3\u00A3o a ser cancelada yyyy-MM-dd'T'HH:mm:ss.SSSZ. Ex: 2000-10-31T01:30:00.000-05:00")
  public String getDataHoraTransacaoCancelada() {
    return dataHoraTransacaoCancelada;
  }
  public void setDataHoraTransacaoCancelada(String dataHoraTransacaoCancelada) {
    this.dataHoraTransacaoCancelada = dataHoraTransacaoCancelada;
  }

  
  /**
   * N\u00C3\u00BAmero Sequencial \u00C3\u009Anico do HOST que identifica a transa\u00C3\u00A7\u00C3\u00A3o no sistema que autorizou.
   **/
  @ApiModelProperty(required = true, value = "N\u00C3\u00BAmero Sequencial \u00C3\u009Anico do HOST que identifica a transa\u00C3\u00A7\u00C3\u00A3o no sistema que autorizou.")
  public String getNsuAutorizacaoTransacaoCancelada() {
    return nsuAutorizacaoTransacaoCancelada;
  }
  public void setNsuAutorizacaoTransacaoCancelada(String nsuAutorizacaoTransacaoCancelada) {
    this.nsuAutorizacaoTransacaoCancelada = nsuAutorizacaoTransacaoCancelada;
  }

  
  /**
   * Valor da transa\u00C3\u00A7\u00C3\u00A3o com duas casas decimais para os centavos.
   **/
  @ApiModelProperty(required = true, value = "Valor da transa\u00C3\u00A7\u00C3\u00A3o com duas casas decimais para os centavos.")
  public BigDecimal getValorTransacao() {
    return valorTransacao;
  }
  public void setValorTransacao(BigDecimal valorTransacao) {
    this.valorTransacao = valorTransacao;
  }

  
  /**
   * N\u00C3\u00BAmero do Estabelecimento (N\u00C3\u00BAmero+DV).
   **/
  @ApiModelProperty(required = true, value = "N\u00C3\u00BAmero do Estabelecimento (N\u00C3\u00BAmero+DV).")
  public Long getNumeroEstabelecimento() {
    return numeroEstabelecimento;
  }
  public void setNumeroEstabelecimento(Long numeroEstabelecimento) {
    this.numeroEstabelecimento = numeroEstabelecimento;
  }

  
  /**
   * Apresenta a data e hora local da consulta yyyy-MM-dd'T'HH:mm:ss.SSSZ. Ex: 2000-10-31T01:30:00.000-05:00
   **/
  @ApiModelProperty(required = true, value = "Apresenta a data e hora local da consulta yyyy-MM-dd'T'HH:mm:ss.SSSZ. Ex: 2000-10-31T01:30:00.000-05:00")
  public String getDataHoraTerminal() {
    return dataHoraTerminal;
  }
  public void setDataHoraTerminal(String dataHoraTerminal) {
    this.dataHoraTerminal = dataHoraTerminal;
  }

  
  /**
   * Apresenta a identifica\u00C3\u00A7\u00C3\u00A3o do terminal requisitante
   **/
  @ApiModelProperty(required = true, value = "Apresenta a identifica\u00C3\u00A7\u00C3\u00A3o do terminal requisitante")
  public String getTerminalRequisitante() {
    return terminalRequisitante;
  }
  public void setTerminalRequisitante(String terminalRequisitante) {
    this.terminalRequisitante = terminalRequisitante;
  }

  
  /**
   * N\u00C3\u00BAmero de Parcelas.
   **/
  @ApiModelProperty(required = true, value = "N\u00C3\u00BAmero de Parcelas.")
  public Long getNumeroParcelas() {
    return numeroParcelas;
  }
  public void setNumeroParcelas(Long numeroParcelas) {
    this.numeroParcelas = numeroParcelas;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CancelamentoTransacaoPorIdCartaoRequest {\n");
    
    sb.append("  nsuOrigem: ").append(nsuOrigem).append("\n");
    sb.append("  nsuOrigemTransacaoCancelada: ").append(nsuOrigemTransacaoCancelada).append("\n");
    sb.append("  codigoProcessamento: ").append(codigoProcessamento).append("\n");
    sb.append("  dataHoraTransacaoCancelada: ").append(dataHoraTransacaoCancelada).append("\n");
    sb.append("  nsuAutorizacaoTransacaoCancelada: ").append(nsuAutorizacaoTransacaoCancelada).append("\n");
    sb.append("  valorTransacao: ").append(valorTransacao).append("\n");
    sb.append("  numeroEstabelecimento: ").append(numeroEstabelecimento).append("\n");
    sb.append("  dataHoraTerminal: ").append(dataHoraTerminal).append("\n");
    sb.append("  terminalRequisitante: ").append(terminalRequisitante).append("\n");
    sb.append("  numeroParcelas: ").append(numeroParcelas).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


