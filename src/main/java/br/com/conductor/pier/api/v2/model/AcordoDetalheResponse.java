package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{acordo_detalhe_response_description}}}
 **/
@ApiModel(description = "{{{acordo_detalhe_response_description}}}")
public class AcordoDetalheResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("idConta")
  private Long idConta = null;
  @SerializedName("statusAcordo")
  private Long statusAcordo = null;
  @SerializedName("valorAcordo")
  private BigDecimal valorAcordo = null;
  @SerializedName("dataAcordo")
  private String dataAcordo = null;
  @SerializedName("quantidadeParcelas")
  private Integer quantidadeParcelas = null;
  @SerializedName("saldoAtualFinal")
  private BigDecimal saldoAtualFinal = null;
  @SerializedName("diasEmAtraso")
  private Integer diasEmAtraso = null;
  @SerializedName("statusConta")
  private Long statusConta = null;
  @SerializedName("assessoriaAtual")
  private String assessoriaAtual = null;
  @SerializedName("totalPagamentos")
  private BigDecimal totalPagamentos = null;
  @SerializedName("dataVencimentoCobranca")
  private String dataVencimentoCobranca = null;
  @SerializedName("dataQuebraAcordo")
  private String dataQuebraAcordo = null;
  @SerializedName("valorParcela1")
  private BigDecimal valorParcela1 = null;
  @SerializedName("valorParcelaN")
  private BigDecimal valorParcelaN = null;
  @SerializedName("parcelaPedida")
  private Integer parcelaPedida = null;
  @SerializedName("vencimentoParcelaPedida")
  private String vencimentoParcelaPedida = null;

  
  /**
   * {{{acordo_response_id_value}}}
   **/
  @ApiModelProperty(value = "{{{acordo_response_id_value}}}")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{acordo_response_id_conta_value}}}
   **/
  @ApiModelProperty(value = "{{{acordo_response_id_conta_value}}}")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * {{{acordo_response_status_acordo_value}}}
   **/
  @ApiModelProperty(value = "{{{acordo_response_status_acordo_value}}}")
  public Long getStatusAcordo() {
    return statusAcordo;
  }
  public void setStatusAcordo(Long statusAcordo) {
    this.statusAcordo = statusAcordo;
  }

  
  /**
   * {{{acordo_response_valor_acordo_value}}}
   **/
  @ApiModelProperty(value = "{{{acordo_response_valor_acordo_value}}}")
  public BigDecimal getValorAcordo() {
    return valorAcordo;
  }
  public void setValorAcordo(BigDecimal valorAcordo) {
    this.valorAcordo = valorAcordo;
  }

  
  /**
   * {{{acordo_response_data_acordo_value}}}
   **/
  @ApiModelProperty(value = "{{{acordo_response_data_acordo_value}}}")
  public String getDataAcordo() {
    return dataAcordo;
  }
  public void setDataAcordo(String dataAcordo) {
    this.dataAcordo = dataAcordo;
  }

  
  /**
   * {{{acordo_response_quantidade_parcelas_value}}}
   **/
  @ApiModelProperty(value = "{{{acordo_response_quantidade_parcelas_value}}}")
  public Integer getQuantidadeParcelas() {
    return quantidadeParcelas;
  }
  public void setQuantidadeParcelas(Integer quantidadeParcelas) {
    this.quantidadeParcelas = quantidadeParcelas;
  }

  
  /**
   * {{{acordo_response_saldo_atual_final_value}}}
   **/
  @ApiModelProperty(value = "{{{acordo_response_saldo_atual_final_value}}}")
  public BigDecimal getSaldoAtualFinal() {
    return saldoAtualFinal;
  }
  public void setSaldoAtualFinal(BigDecimal saldoAtualFinal) {
    this.saldoAtualFinal = saldoAtualFinal;
  }

  
  /**
   * {{{acordo_response_dias_em_atraso_value}}}
   **/
  @ApiModelProperty(value = "{{{acordo_response_dias_em_atraso_value}}}")
  public Integer getDiasEmAtraso() {
    return diasEmAtraso;
  }
  public void setDiasEmAtraso(Integer diasEmAtraso) {
    this.diasEmAtraso = diasEmAtraso;
  }

  
  /**
   * {{{acordo_detalhe_response_status_conta_value}}}
   **/
  @ApiModelProperty(value = "{{{acordo_detalhe_response_status_conta_value}}}")
  public Long getStatusConta() {
    return statusConta;
  }
  public void setStatusConta(Long statusConta) {
    this.statusConta = statusConta;
  }

  
  /**
   * {{{acordo_detalhe_response_assessoria_atual_value}}}
   **/
  @ApiModelProperty(value = "{{{acordo_detalhe_response_assessoria_atual_value}}}")
  public String getAssessoriaAtual() {
    return assessoriaAtual;
  }
  public void setAssessoriaAtual(String assessoriaAtual) {
    this.assessoriaAtual = assessoriaAtual;
  }

  
  /**
   * {{{acordo_detalhe_response_total_pagamentos_value}}}
   **/
  @ApiModelProperty(value = "{{{acordo_detalhe_response_total_pagamentos_value}}}")
  public BigDecimal getTotalPagamentos() {
    return totalPagamentos;
  }
  public void setTotalPagamentos(BigDecimal totalPagamentos) {
    this.totalPagamentos = totalPagamentos;
  }

  
  /**
   * {{{acordo_detalhe_response_data_vencimento_cobranca_value}}}
   **/
  @ApiModelProperty(value = "{{{acordo_detalhe_response_data_vencimento_cobranca_value}}}")
  public String getDataVencimentoCobranca() {
    return dataVencimentoCobranca;
  }
  public void setDataVencimentoCobranca(String dataVencimentoCobranca) {
    this.dataVencimentoCobranca = dataVencimentoCobranca;
  }

  
  /**
   * {{{acordo_detalhe_response_data_quebra_acordo_value}}}
   **/
  @ApiModelProperty(value = "{{{acordo_detalhe_response_data_quebra_acordo_value}}}")
  public String getDataQuebraAcordo() {
    return dataQuebraAcordo;
  }
  public void setDataQuebraAcordo(String dataQuebraAcordo) {
    this.dataQuebraAcordo = dataQuebraAcordo;
  }

  
  /**
   * {{{acordo_detalhe_response_valor_parcela1_value}}}
   **/
  @ApiModelProperty(value = "{{{acordo_detalhe_response_valor_parcela1_value}}}")
  public BigDecimal getValorParcela1() {
    return valorParcela1;
  }
  public void setValorParcela1(BigDecimal valorParcela1) {
    this.valorParcela1 = valorParcela1;
  }

  
  /**
   * {{{acordo_detalhe_response_valor_parcela_n_value}}}
   **/
  @ApiModelProperty(value = "{{{acordo_detalhe_response_valor_parcela_n_value}}}")
  public BigDecimal getValorParcelaN() {
    return valorParcelaN;
  }
  public void setValorParcelaN(BigDecimal valorParcelaN) {
    this.valorParcelaN = valorParcelaN;
  }

  
  /**
   * {{{acordo_detalhe_response_parcela_pedida_value}}}
   **/
  @ApiModelProperty(value = "{{{acordo_detalhe_response_parcela_pedida_value}}}")
  public Integer getParcelaPedida() {
    return parcelaPedida;
  }
  public void setParcelaPedida(Integer parcelaPedida) {
    this.parcelaPedida = parcelaPedida;
  }

  
  /**
   * {{{acordo_detalhe_response_vencimento_parcela_pedida_value}}}
   **/
  @ApiModelProperty(value = "{{{acordo_detalhe_response_vencimento_parcela_pedida_value}}}")
  public String getVencimentoParcelaPedida() {
    return vencimentoParcelaPedida;
  }
  public void setVencimentoParcelaPedida(String vencimentoParcelaPedida) {
    this.vencimentoParcelaPedida = vencimentoParcelaPedida;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AcordoDetalheResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  statusAcordo: ").append(statusAcordo).append("\n");
    sb.append("  valorAcordo: ").append(valorAcordo).append("\n");
    sb.append("  dataAcordo: ").append(dataAcordo).append("\n");
    sb.append("  quantidadeParcelas: ").append(quantidadeParcelas).append("\n");
    sb.append("  saldoAtualFinal: ").append(saldoAtualFinal).append("\n");
    sb.append("  diasEmAtraso: ").append(diasEmAtraso).append("\n");
    sb.append("  statusConta: ").append(statusConta).append("\n");
    sb.append("  assessoriaAtual: ").append(assessoriaAtual).append("\n");
    sb.append("  totalPagamentos: ").append(totalPagamentos).append("\n");
    sb.append("  dataVencimentoCobranca: ").append(dataVencimentoCobranca).append("\n");
    sb.append("  dataQuebraAcordo: ").append(dataQuebraAcordo).append("\n");
    sb.append("  valorParcela1: ").append(valorParcela1).append("\n");
    sb.append("  valorParcelaN: ").append(valorParcelaN).append("\n");
    sb.append("  parcelaPedida: ").append(parcelaPedida).append("\n");
    sb.append("  vencimentoParcelaPedida: ").append(vencimentoParcelaPedida).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
