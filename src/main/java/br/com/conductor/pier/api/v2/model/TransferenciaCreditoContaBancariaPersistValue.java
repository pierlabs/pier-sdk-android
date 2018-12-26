package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{transferencia_credito_conta_bancaria_persist_description}}}
 **/
@ApiModel(description = "{{{transferencia_credito_conta_bancaria_persist_description}}}")
public class TransferenciaCreditoContaBancariaPersistValue  {
  
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
   * {{{transferencia_credito_conta_bancaria_persist_nsu_origem_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{transferencia_credito_conta_bancaria_persist_nsu_origem_value}}}")
  public Long getNsuOrigem() {
    return nsuOrigem;
  }
  public void setNsuOrigem(Long nsuOrigem) {
    this.nsuOrigem = nsuOrigem;
  }

  
  /**
   * {{{transferencia_credito_conta_bancaria_persist_id_cartao_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{transferencia_credito_conta_bancaria_persist_id_cartao_value}}}")
  public Long getIdCartao() {
    return idCartao;
  }
  public void setIdCartao(Long idCartao) {
    this.idCartao = idCartao;
  }

  
  /**
   * {{{transferencia_credito_conta_bancaria_persist_id_conta_bancaria_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{transferencia_credito_conta_bancaria_persist_id_conta_bancaria_value}}}")
  public Long getIdContaBancaria() {
    return idContaBancaria;
  }
  public void setIdContaBancaria(Long idContaBancaria) {
    this.idContaBancaria = idContaBancaria;
  }

  
  /**
   * {{{transferencia_credito_conta_bancaria_persist_valor_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{transferencia_credito_conta_bancaria_persist_valor_value}}}")
  public BigDecimal getValor() {
    return valor;
  }
  public void setValor(BigDecimal valor) {
    this.valor = valor;
  }

  
  /**
   * {{{transferencia_credito_conta_bancaria_persist_numero_parcelas_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{transferencia_credito_conta_bancaria_persist_numero_parcelas_value}}}")
  public Long getNumeroParcelas() {
    return numeroParcelas;
  }
  public void setNumeroParcelas(Long numeroParcelas) {
    this.numeroParcelas = numeroParcelas;
  }

  
  /**
   * {{{transferencia_credito_conta_bancaria_persist_numero_meses_carencia_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{transferencia_credito_conta_bancaria_persist_numero_meses_carencia_value}}}")
  public Integer getNumeroMesesCarencia() {
    return numeroMesesCarencia;
  }
  public void setNumeroMesesCarencia(Integer numeroMesesCarencia) {
    this.numeroMesesCarencia = numeroMesesCarencia;
  }

  
  /**
   * {{{transferencia_credito_conta_bancaria_persist_data_hora_terminal_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{transferencia_credito_conta_bancaria_persist_data_hora_terminal_value}}}")
  public String getDataHoraTerminal() {
    return dataHoraTerminal;
  }
  public void setDataHoraTerminal(String dataHoraTerminal) {
    this.dataHoraTerminal = dataHoraTerminal;
  }

  
  /**
   * {{{transferencia_credito_conta_bancaria_persist_terminal_requisitante_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{transferencia_credito_conta_bancaria_persist_terminal_requisitante_value}}}")
  public String getTerminalRequisitante() {
    return terminalRequisitante;
  }
  public void setTerminalRequisitante(String terminalRequisitante) {
    this.terminalRequisitante = terminalRequisitante;
  }

  
  /**
   * {{{transferencia_credito_conta_bancaria_persist_numero_estabelecimento_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{transferencia_credito_conta_bancaria_persist_numero_estabelecimento_value}}}")
  public String getNumeroEstabelecimento() {
    return numeroEstabelecimento;
  }
  public void setNumeroEstabelecimento(String numeroEstabelecimento) {
    this.numeroEstabelecimento = numeroEstabelecimento;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferenciaCreditoContaBancariaPersistValue {\n");
    
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
