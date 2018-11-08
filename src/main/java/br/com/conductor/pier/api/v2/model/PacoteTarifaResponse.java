package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{pacote_tarifa_resposta}}}
 **/
@ApiModel(description = "{{{pacote_tarifa_resposta}}}")
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
   * {{{pacote_tarifa_resposta_descricao_descricao}}}
   **/
  @ApiModelProperty(value = "{{{pacote_tarifa_resposta_descricao_descricao}}}")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   * {{{pacote_tarifa_resposta_id_descricao}}}
   **/
  @ApiModelProperty(value = "{{{pacote_tarifa_resposta_id_descricao}}}")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{pacote_tarifa_resposta_quantidade_aplicacoes_descricao}}}
   **/
  @ApiModelProperty(value = "{{{pacote_tarifa_resposta_quantidade_aplicacoes_descricao}}}")
  public Integer getQuantidadeAplicacoes() {
    return quantidadeAplicacoes;
  }
  public void setQuantidadeAplicacoes(Integer quantidadeAplicacoes) {
    this.quantidadeAplicacoes = quantidadeAplicacoes;
  }

  
  /**
   * {{{pacote_tarifa_resposta_quantidade_bilhete_unico_descricao}}}
   **/
  @ApiModelProperty(value = "{{{pacote_tarifa_resposta_quantidade_bilhete_unico_descricao}}}")
  public Integer getQuantidadeBilheteUnico() {
    return quantidadeBilheteUnico;
  }
  public void setQuantidadeBilheteUnico(Integer quantidadeBilheteUnico) {
    this.quantidadeBilheteUnico = quantidadeBilheteUnico;
  }

  
  /**
   * {{{pacote_tarifa_resposta_quantidade_boleto_descricao}}}
   **/
  @ApiModelProperty(value = "{{{pacote_tarifa_resposta_quantidade_boleto_descricao}}}")
  public Integer getQuantidadeBoleto() {
    return quantidadeBoleto;
  }
  public void setQuantidadeBoleto(Integer quantidadeBoleto) {
    this.quantidadeBoleto = quantidadeBoleto;
  }

  
  /**
   * {{{pacote_tarifa_resposta_quantidade_recarga_celular_descricao}}}
   **/
  @ApiModelProperty(value = "{{{pacote_tarifa_resposta_quantidade_recarga_celular_descricao}}}")
  public Integer getQuantidadeRecargaCelular() {
    return quantidadeRecargaCelular;
  }
  public void setQuantidadeRecargaCelular(Integer quantidadeRecargaCelular) {
    this.quantidadeRecargaCelular = quantidadeRecargaCelular;
  }

  
  /**
   * {{{pacote_tarifa_resposta_quantidade_saque_descricao}}}
   **/
  @ApiModelProperty(value = "{{{pacote_tarifa_resposta_quantidade_saque_descricao}}}")
  public Integer getQuantidadeSaque() {
    return quantidadeSaque;
  }
  public void setQuantidadeSaque(Integer quantidadeSaque) {
    this.quantidadeSaque = quantidadeSaque;
  }

  
  /**
   * {{{pacote_tarifa_resposta_quantidade_taxa_pagamento_conta_descricao}}}
   **/
  @ApiModelProperty(value = "{{{pacote_tarifa_resposta_quantidade_taxa_pagamento_conta_descricao}}}")
  public Integer getQuantidadeTaxaPagamentoConta() {
    return quantidadeTaxaPagamentoConta;
  }
  public void setQuantidadeTaxaPagamentoConta(Integer quantidadeTaxaPagamentoConta) {
    this.quantidadeTaxaPagamentoConta = quantidadeTaxaPagamentoConta;
  }

  
  /**
   * {{{pacote_tarifa_resposta_quantidade_transferencia_descricao}}}
   **/
  @ApiModelProperty(value = "{{{pacote_tarifa_resposta_quantidade_transferencia_descricao}}}")
  public Integer getQuantidadeTransferencia() {
    return quantidadeTransferencia;
  }
  public void setQuantidadeTransferencia(Integer quantidadeTransferencia) {
    this.quantidadeTransferencia = quantidadeTransferencia;
  }

  
  /**
   * {{{pacote_tarifa_resposta_valor_tarifa_descricao}}}
   **/
  @ApiModelProperty(value = "{{{pacote_tarifa_resposta_valor_tarifa_descricao}}}")
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
