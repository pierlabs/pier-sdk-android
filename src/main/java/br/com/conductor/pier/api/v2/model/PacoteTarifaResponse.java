package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Representation of an fee package tariff
 **/
@ApiModel(description = "Representation of an fee package tariff")
public class PacoteTarifaResponse  {
  
  @SerializedName("descricao")
  private String descricao = null;
  @SerializedName("id")
  private Long id = null;
  @SerializedName("quantidadeAplicacoes")
  private Integer quantidadeAplicacoes = null;
  @SerializedName("quantidadeBilheteUnico")
  private Integer quantidadeBilheteUnico = null;
  @SerializedName("quantidadeBoleto")
  private Integer quantidadeBoleto = null;
  @SerializedName("quantidadeRecargaCelular")
  private Integer quantidadeRecargaCelular = null;
  @SerializedName("quantidadeSaque")
  private Integer quantidadeSaque = null;
  @SerializedName("quantidadeTaxaPagamentoConta")
  private Integer quantidadeTaxaPagamentoConta = null;
  @SerializedName("quantidadeTransferencia")
  private Integer quantidadeTransferencia = null;
  @SerializedName("valorTarifa")
  private BigDecimal valorTarifa = null;

  
  /**
   * The description of the fee
   **/
  @ApiModelProperty(value = "The description of the fee")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   * Fee package id
   **/
  @ApiModelProperty(value = "Fee package id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Application amount
   **/
  @ApiModelProperty(value = "Application amount")
  public Integer getQuantidadeAplicacoes() {
    return quantidadeAplicacoes;
  }
  public void setQuantidadeAplicacoes(Integer quantidadeAplicacoes) {
    this.quantidadeAplicacoes = quantidadeAplicacoes;
  }

  
  /**
   * Unique ticket amount
   **/
  @ApiModelProperty(value = "Unique ticket amount")
  public Integer getQuantidadeBilheteUnico() {
    return quantidadeBilheteUnico;
  }
  public void setQuantidadeBilheteUnico(Integer quantidadeBilheteUnico) {
    this.quantidadeBilheteUnico = quantidadeBilheteUnico;
  }

  
  /**
   * Chage ticket amount
   **/
  @ApiModelProperty(value = "Chage ticket amount")
  public Integer getQuantidadeBoleto() {
    return quantidadeBoleto;
  }
  public void setQuantidadeBoleto(Integer quantidadeBoleto) {
    this.quantidadeBoleto = quantidadeBoleto;
  }

  
  /**
   * Cellphone recharge amount
   **/
  @ApiModelProperty(value = "Cellphone recharge amount")
  public Integer getQuantidadeRecargaCelular() {
    return quantidadeRecargaCelular;
  }
  public void setQuantidadeRecargaCelular(Integer quantidadeRecargaCelular) {
    this.quantidadeRecargaCelular = quantidadeRecargaCelular;
  }

  
  /**
   * Cash out amount
   **/
  @ApiModelProperty(value = "Cash out amount")
  public Integer getQuantidadeSaque() {
    return quantidadeSaque;
  }
  public void setQuantidadeSaque(Integer quantidadeSaque) {
    this.quantidadeSaque = quantidadeSaque;
  }

  
  /**
   * Payment tax account amount
   **/
  @ApiModelProperty(value = "Payment tax account amount")
  public Integer getQuantidadeTaxaPagamentoConta() {
    return quantidadeTaxaPagamentoConta;
  }
  public void setQuantidadeTaxaPagamentoConta(Integer quantidadeTaxaPagamentoConta) {
    this.quantidadeTaxaPagamentoConta = quantidadeTaxaPagamentoConta;
  }

  
  /**
   * Transfer amount
   **/
  @ApiModelProperty(value = "Transfer amount")
  public Integer getQuantidadeTransferencia() {
    return quantidadeTransferencia;
  }
  public void setQuantidadeTransferencia(Integer quantidadeTransferencia) {
    this.quantidadeTransferencia = quantidadeTransferencia;
  }

  
  /**
   * Tax value
   **/
  @ApiModelProperty(value = "Tax value")
  public BigDecimal getValorTarifa() {
    return valorTarifa;
  }
  public void setValorTarifa(BigDecimal valorTarifa) {
    this.valorTarifa = valorTarifa;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PacoteTarifaResponse {\n");
    
    sb.append("  descricao: ").append(descricao).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  quantidadeAplicacoes: ").append(quantidadeAplicacoes).append("\n");
    sb.append("  quantidadeBilheteUnico: ").append(quantidadeBilheteUnico).append("\n");
    sb.append("  quantidadeBoleto: ").append(quantidadeBoleto).append("\n");
    sb.append("  quantidadeRecargaCelular: ").append(quantidadeRecargaCelular).append("\n");
    sb.append("  quantidadeSaque: ").append(quantidadeSaque).append("\n");
    sb.append("  quantidadeTaxaPagamentoConta: ").append(quantidadeTaxaPagamentoConta).append("\n");
    sb.append("  quantidadeTransferencia: ").append(quantidadeTransferencia).append("\n");
    sb.append("  valorTarifa: ").append(valorTarifa).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
