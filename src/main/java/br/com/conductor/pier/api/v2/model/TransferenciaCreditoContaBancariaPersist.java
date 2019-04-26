package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Transfer\u00EAncia de cr\u00E9dito para conta banc\u00E1ria
 **/
@ApiModel(description = "Transfer\u00EAncia de cr\u00E9dito para conta banc\u00E1ria")
public class TransferenciaCreditoContaBancariaPersist  {
  
  @SerializedName("nsuOrigem")
  private Long nsuOrigem = null;
  @SerializedName("idCartao")
  private Long idCartao = null;
  @SerializedName("idContaBancaria")
  private Long idContaBancaria = null;
  @SerializedName("valor")
  private BigDecimal valor = null;
  @SerializedName("numeroParcelas")
  private Long numeroParcelas = null;
  @SerializedName("numeroMesesCarencia")
  private Integer numeroMesesCarencia = null;
  @SerializedName("dataHoraTerminal")
  private String dataHoraTerminal = null;
  @SerializedName("terminalRequisitante")
  private String terminalRequisitante = null;
  @SerializedName("numeroEstabelecimento")
  private String numeroEstabelecimento = null;

  
  /**
   * Representa o N\u00FAmero Sequencial \u00DAnico que identifica a transa\u00E7\u00E3o no sistema que a originou
   **/
  @ApiModelProperty(required = true, value = "Representa o N\u00FAmero Sequencial \u00DAnico que identifica a transa\u00E7\u00E3o no sistema que a originou")
  public Long getNsuOrigem() {
    return nsuOrigem;
  }
  public void setNsuOrigem(Long nsuOrigem) {
    this.nsuOrigem = nsuOrigem;
  }

  
  /**
   * Representa o Identificador do Cartao
   **/
  @ApiModelProperty(required = true, value = "Representa o Identificador do Cartao")
  public Long getIdCartao() {
    return idCartao;
  }
  public void setIdCartao(Long idCartao) {
    this.idCartao = idCartao;
  }

  
  /**
   * Representa o Identificador da conta banc\u00E1ria
   **/
  @ApiModelProperty(required = true, value = "Representa o Identificador da conta banc\u00E1ria")
  public Long getIdContaBancaria() {
    return idContaBancaria;
  }
  public void setIdContaBancaria(Long idContaBancaria) {
    this.idContaBancaria = idContaBancaria;
  }

  
  /**
   * Representa o Valor da transfer\u00EAncia
   **/
  @ApiModelProperty(required = true, value = "Representa o Valor da transfer\u00EAncia")
  public BigDecimal getValor() {
    return valor;
  }
  public void setValor(BigDecimal valor) {
    this.valor = valor;
  }

  
  /**
   * Representa o N\u00FAmero de Parcelas pelo qual o valor da transfer\u00EAncia ser\u00E1 dividido
   **/
  @ApiModelProperty(required = true, value = "Representa o N\u00FAmero de Parcelas pelo qual o valor da transfer\u00EAncia ser\u00E1 dividido")
  public Long getNumeroParcelas() {
    return numeroParcelas;
  }
  public void setNumeroParcelas(Long numeroParcelas) {
    this.numeroParcelas = numeroParcelas;
  }

  
  /**
   * Representa o N\u00FAmero de Meses concedido como car\u00EAncia
   **/
  @ApiModelProperty(required = true, value = "Representa o N\u00FAmero de Meses concedido como car\u00EAncia")
  public Integer getNumeroMesesCarencia() {
    return numeroMesesCarencia;
  }
  public void setNumeroMesesCarencia(Integer numeroMesesCarencia) {
    this.numeroMesesCarencia = numeroMesesCarencia;
  }

  
  /**
   * Representa a Data e hora do terminal requisitante
   **/
  @ApiModelProperty(required = true, value = "Representa a Data e hora do terminal requisitante")
  public String getDataHoraTerminal() {
    return dataHoraTerminal;
  }
  public void setDataHoraTerminal(String dataHoraTerminal) {
    this.dataHoraTerminal = dataHoraTerminal;
  }

  
  /**
   * Representa a identifica\u00E7\u00E3o do terminal requisitante
   **/
  @ApiModelProperty(required = true, value = "Representa a identifica\u00E7\u00E3o do terminal requisitante")
  public String getTerminalRequisitante() {
    return terminalRequisitante;
  }
  public void setTerminalRequisitante(String terminalRequisitante) {
    this.terminalRequisitante = terminalRequisitante;
  }

  
  /**
   * Representa a identifica\u00E7\u00E3o do n\u00FAmero do estabelecimento
   **/
  @ApiModelProperty(required = true, value = "Representa a identifica\u00E7\u00E3o do n\u00FAmero do estabelecimento")
  public String getNumeroEstabelecimento() {
    return numeroEstabelecimento;
  }
  public void setNumeroEstabelecimento(String numeroEstabelecimento) {
    this.numeroEstabelecimento = numeroEstabelecimento;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferenciaCreditoContaBancariaPersist {\n");
    
    sb.append("  nsuOrigem: ").append(nsuOrigem).append("\n");
    sb.append("  idCartao: ").append(idCartao).append("\n");
    sb.append("  idContaBancaria: ").append(idContaBancaria).append("\n");
    sb.append("  valor: ").append(valor).append("\n");
    sb.append("  numeroParcelas: ").append(numeroParcelas).append("\n");
    sb.append("  numeroMesesCarencia: ").append(numeroMesesCarencia).append("\n");
    sb.append("  dataHoraTerminal: ").append(dataHoraTerminal).append("\n");
    sb.append("  terminalRequisitante: ").append(terminalRequisitante).append("\n");
    sb.append("  numeroEstabelecimento: ").append(numeroEstabelecimento).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
