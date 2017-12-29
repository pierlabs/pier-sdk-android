package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Transfer\u00C3\u00AAncia cr\u00C3\u00A9dito conta banc\u00C3\u00A1ria request
 **/
@ApiModel(description = "Transfer\u00C3\u00AAncia cr\u00C3\u00A9dito conta banc\u00C3\u00A1ria request")
public class PlanoParcelamentoTransferenciaCreditoContaBancariaRequest  {
  
  @SerializedName("nsuOrigem")
  private String nsuOrigem = null;
  @SerializedName("valorTransacao")
  private BigDecimal valorTransacao = null;
  @SerializedName("idCartao")
  private Long idCartao = null;
  @SerializedName("numeroMesesCarencia")
  private Long numeroMesesCarencia = null;
  @SerializedName("numeroEstabelecimento")
  private Long numeroEstabelecimento = null;
  @SerializedName("dataHoraTerminal")
  private String dataHoraTerminal = null;
  @SerializedName("terminalRequisitante")
  private String terminalRequisitante = null;

  
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
   * C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do cart\u00C3\u00A3o.
   **/
  @ApiModelProperty(required = true, value = "C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do cart\u00C3\u00A3o.")
  public Long getIdCartao() {
    return idCartao;
  }
  public void setIdCartao(Long idCartao) {
    this.idCartao = idCartao;
  }

  
  /**
   * Representa o N\u00C3\u00BAmero de Meses concedido como car\u00C3\u00AAncia.
   **/
  @ApiModelProperty(required = true, value = "Representa o N\u00C3\u00BAmero de Meses concedido como car\u00C3\u00AAncia.")
  public Long getNumeroMesesCarencia() {
    return numeroMesesCarencia;
  }
  public void setNumeroMesesCarencia(Long numeroMesesCarencia) {
    this.numeroMesesCarencia = numeroMesesCarencia;
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

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlanoParcelamentoTransferenciaCreditoContaBancariaRequest {\n");
    
    sb.append("  nsuOrigem: ").append(nsuOrigem).append("\n");
    sb.append("  valorTransacao: ").append(valorTransacao).append("\n");
    sb.append("  idCartao: ").append(idCartao).append("\n");
    sb.append("  numeroMesesCarencia: ").append(numeroMesesCarencia).append("\n");
    sb.append("  numeroEstabelecimento: ").append(numeroEstabelecimento).append("\n");
    sb.append("  dataHoraTerminal: ").append(dataHoraTerminal).append("\n");
    sb.append("  terminalRequisitante: ").append(terminalRequisitante).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
