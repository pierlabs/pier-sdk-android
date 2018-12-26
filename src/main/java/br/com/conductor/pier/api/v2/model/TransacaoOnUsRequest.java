package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto de Requisi\u00E7\u00E3o de Transa\u00E7\u00E3o On Us
 **/
@ApiModel(description = "Objeto de Requisi\u00E7\u00E3o de Transa\u00E7\u00E3o On Us")
public class TransacaoOnUsRequest  {
  
  @SerializedName("nsuOrigem")
  private String nsuOrigem = null;
  @SerializedName("codigoProcessamento")
  private String codigoProcessamento = null;
  @SerializedName("valorTransacao")
  private BigDecimal valorTransacao = null;
  @SerializedName("numeroRealCartao")
  private String numeroRealCartao = null;
  @SerializedName("dataValidadeCartao")
  private String dataValidadeCartao = null;
  @SerializedName("numeroEstabelecimento")
  private Long numeroEstabelecimento = null;
  @SerializedName("dataHoraTerminal")
  private String dataHoraTerminal = null;
  @SerializedName("terminalRequisitante")
  private String terminalRequisitante = null;

  
  /**
   * N\u00FAmero Sequencial \u00DAnico que identifica a transa\u00E7\u00E3o no sistema que a originou
   **/
  @ApiModelProperty(required = true, value = "N\u00FAmero Sequencial \u00DAnico que identifica a transa\u00E7\u00E3o no sistema que a originou")
  public String getNsuOrigem() {
    return nsuOrigem;
  }
  public void setNsuOrigem(String nsuOrigem) {
    this.nsuOrigem = nsuOrigem;
  }

  
  /**
   * C\u00F3digo de Processamento que identifica o Tipo da Transa\u00E7\u00E3o
   **/
  @ApiModelProperty(required = true, value = "C\u00F3digo de Processamento que identifica o Tipo da Transa\u00E7\u00E3o")
  public String getCodigoProcessamento() {
    return codigoProcessamento;
  }
  public void setCodigoProcessamento(String codigoProcessamento) {
    this.codigoProcessamento = codigoProcessamento;
  }

  
  /**
   * Valor da transa\u00E7\u00E3o com duas casas decimais para os centavos
   **/
  @ApiModelProperty(required = true, value = "Valor da transa\u00E7\u00E3o com duas casas decimais para os centavos")
  public BigDecimal getValorTransacao() {
    return valorTransacao;
  }
  public void setValorTransacao(BigDecimal valorTransacao) {
    this.valorTransacao = valorTransacao;
  }

  
  /**
   * N\u00FAmero Real do Cart\u00E3o
   **/
  @ApiModelProperty(required = true, value = "N\u00FAmero Real do Cart\u00E3o")
  public String getNumeroRealCartao() {
    return numeroRealCartao;
  }
  public void setNumeroRealCartao(String numeroRealCartao) {
    this.numeroRealCartao = numeroRealCartao;
  }

  
  /**
   * Data de Validade do Cart\u00E3o. Ex: AAMM
   **/
  @ApiModelProperty(required = true, value = "Data de Validade do Cart\u00E3o. Ex: AAMM")
  public String getDataValidadeCartao() {
    return dataValidadeCartao;
  }
  public void setDataValidadeCartao(String dataValidadeCartao) {
    this.dataValidadeCartao = dataValidadeCartao;
  }

  
  /**
   * N\u00FAmero do Estabelecimento (N\u00FAmero+DV)
   **/
  @ApiModelProperty(required = true, value = "N\u00FAmero do Estabelecimento (N\u00FAmero+DV)")
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
   * Apresenta a identifica\u00E7\u00E3o do terminal requisitante
   **/
  @ApiModelProperty(required = true, value = "Apresenta a identifica\u00E7\u00E3o do terminal requisitante")
  public String getTerminalRequisitante() {
    return terminalRequisitante;
  }
  public void setTerminalRequisitante(String terminalRequisitante) {
    this.terminalRequisitante = terminalRequisitante;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransacaoOnUsRequest {\n");
    
    sb.append("  nsuOrigem: ").append(nsuOrigem).append("\n");
    sb.append("  codigoProcessamento: ").append(codigoProcessamento).append("\n");
    sb.append("  valorTransacao: ").append(valorTransacao).append("\n");
    sb.append("  numeroRealCartao: ").append(numeroRealCartao).append("\n");
    sb.append("  dataValidadeCartao: ").append(dataValidadeCartao).append("\n");
    sb.append("  numeroEstabelecimento: ").append(numeroEstabelecimento).append("\n");
    sb.append("  dataHoraTerminal: ").append(dataHoraTerminal).append("\n");
    sb.append("  terminalRequisitante: ").append(terminalRequisitante).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
