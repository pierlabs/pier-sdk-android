package br.com.conductor.pier.api.v1_1.model;

import br.com.conductor.pier.api.v1_1.model.ExtratoResponse;
import java.util.*;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



@ApiModel(description = "")
public class ConsultarExtratoContaResponse  {
  
  @SerializedName("codigoRetorno")
  private Integer codigoRetorno = null;
  @SerializedName("comprasNacionais")
  private Double comprasNacionais = null;
  @SerializedName("cpf")
  private String cpf = null;
  @SerializedName("creditosNacionais")
  private Double creditosNacionais = null;
  @SerializedName("dataVencimento")
  private String dataVencimento = null;
  @SerializedName("debitosNacionais")
  private Double debitosNacionais = null;
  @SerializedName("descricaoRetorno")
  private String descricaoRetorno = null;
  @SerializedName("extrato")
  private List<ExtratoResponse> extrato = null;
  @SerializedName("idCartao")
  private Integer idCartao = null;
  @SerializedName("idConta")
  private Integer idConta = null;
  @SerializedName("multa")
  private Double multa = null;
  @SerializedName("pagamentos")
  private Double pagamentos = null;
  @SerializedName("saldoAtualFinal")
  private Double saldoAtualFinal = null;
  @SerializedName("saldoExtratoAnterior")
  private Double saldoExtratoAnterior = null;
  @SerializedName("tarifasNacionais")
  private Double tarifasNacionais = null;
  @SerializedName("valorMinimoExtrato")
  private Double valorMinimoExtrato = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getCodigoRetorno() {
    return codigoRetorno;
  }
  public void setCodigoRetorno(Integer codigoRetorno) {
    this.codigoRetorno = codigoRetorno;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Double getComprasNacionais() {
    return comprasNacionais;
  }
  public void setComprasNacionais(Double comprasNacionais) {
    this.comprasNacionais = comprasNacionais;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getCpf() {
    return cpf;
  }
  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Double getCreditosNacionais() {
    return creditosNacionais;
  }
  public void setCreditosNacionais(Double creditosNacionais) {
    this.creditosNacionais = creditosNacionais;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getDataVencimento() {
    return dataVencimento;
  }
  public void setDataVencimento(String dataVencimento) {
    this.dataVencimento = dataVencimento;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Double getDebitosNacionais() {
    return debitosNacionais;
  }
  public void setDebitosNacionais(Double debitosNacionais) {
    this.debitosNacionais = debitosNacionais;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getDescricaoRetorno() {
    return descricaoRetorno;
  }
  public void setDescricaoRetorno(String descricaoRetorno) {
    this.descricaoRetorno = descricaoRetorno;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public List<ExtratoResponse> getExtrato() {
    return extrato;
  }
  public void setExtrato(List<ExtratoResponse> extrato) {
    this.extrato = extrato;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getIdCartao() {
    return idCartao;
  }
  public void setIdCartao(Integer idCartao) {
    this.idCartao = idCartao;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getIdConta() {
    return idConta;
  }
  public void setIdConta(Integer idConta) {
    this.idConta = idConta;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Double getMulta() {
    return multa;
  }
  public void setMulta(Double multa) {
    this.multa = multa;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Double getPagamentos() {
    return pagamentos;
  }
  public void setPagamentos(Double pagamentos) {
    this.pagamentos = pagamentos;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Double getSaldoAtualFinal() {
    return saldoAtualFinal;
  }
  public void setSaldoAtualFinal(Double saldoAtualFinal) {
    this.saldoAtualFinal = saldoAtualFinal;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Double getSaldoExtratoAnterior() {
    return saldoExtratoAnterior;
  }
  public void setSaldoExtratoAnterior(Double saldoExtratoAnterior) {
    this.saldoExtratoAnterior = saldoExtratoAnterior;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Double getTarifasNacionais() {
    return tarifasNacionais;
  }
  public void setTarifasNacionais(Double tarifasNacionais) {
    this.tarifasNacionais = tarifasNacionais;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Double getValorMinimoExtrato() {
    return valorMinimoExtrato;
  }
  public void setValorMinimoExtrato(Double valorMinimoExtrato) {
    this.valorMinimoExtrato = valorMinimoExtrato;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsultarExtratoContaResponse {\n");
    
    sb.append("  codigoRetorno: ").append(codigoRetorno).append("\n");
    sb.append("  comprasNacionais: ").append(comprasNacionais).append("\n");
    sb.append("  cpf: ").append(cpf).append("\n");
    sb.append("  creditosNacionais: ").append(creditosNacionais).append("\n");
    sb.append("  dataVencimento: ").append(dataVencimento).append("\n");
    sb.append("  debitosNacionais: ").append(debitosNacionais).append("\n");
    sb.append("  descricaoRetorno: ").append(descricaoRetorno).append("\n");
    sb.append("  extrato: ").append(extrato).append("\n");
    sb.append("  idCartao: ").append(idCartao).append("\n");
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  multa: ").append(multa).append("\n");
    sb.append("  pagamentos: ").append(pagamentos).append("\n");
    sb.append("  saldoAtualFinal: ").append(saldoAtualFinal).append("\n");
    sb.append("  saldoExtratoAnterior: ").append(saldoExtratoAnterior).append("\n");
    sb.append("  tarifasNacionais: ").append(tarifasNacionais).append("\n");
    sb.append("  valorMinimoExtrato: ").append(valorMinimoExtrato).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


