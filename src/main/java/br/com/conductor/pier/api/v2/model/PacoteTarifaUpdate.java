package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto de persist\u00EAncia de um pacote de tarifas
 **/
@ApiModel(description = "Objeto de persist\u00EAncia de um pacote de tarifas")
public class PacoteTarifaUpdate  {
  
  @SerializedName("descricao")
  private String descricao = null;
  @SerializedName("quantidadeRecargaCelular")
  private Integer quantidadeRecargaCelular = null;
  @SerializedName("quantidadeBilheteUnico")
  private Integer quantidadeBilheteUnico = null;
  @SerializedName("quantidadeTaxaPagamentoConta")
  private Integer quantidadeTaxaPagamentoConta = null;
  @SerializedName("quantidadeSaque")
  private Integer quantidadeSaque = null;
  @SerializedName("quantidadeTransferencia")
  private Integer quantidadeTransferencia = null;
  @SerializedName("quantidadeBoleto")
  private Integer quantidadeBoleto = null;
  @SerializedName("quantidadeAplicacoes")
  private Integer quantidadeAplicacoes = null;
  @SerializedName("valorTarifa")
  private BigDecimal valorTarifa = null;

  
  /**
   * Descri\u00E7\u00E3o do pacote de tarifa
   **/
  @ApiModelProperty(value = "Descri\u00E7\u00E3o do pacote de tarifa")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   * Quantidade de recargas de celular inclusas no pacote de tarifas
   **/
  @ApiModelProperty(required = true, value = "Quantidade de recargas de celular inclusas no pacote de tarifas")
  public Integer getQuantidadeRecargaCelular() {
    return quantidadeRecargaCelular;
  }
  public void setQuantidadeRecargaCelular(Integer quantidadeRecargaCelular) {
    this.quantidadeRecargaCelular = quantidadeRecargaCelular;
  }

  
  /**
   * Quantidade de recargas de bilhete \u00FAnico inclusas no pacote de tarifas
   **/
  @ApiModelProperty(required = true, value = "Quantidade de recargas de bilhete \u00FAnico inclusas no pacote de tarifas")
  public Integer getQuantidadeBilheteUnico() {
    return quantidadeBilheteUnico;
  }
  public void setQuantidadeBilheteUnico(Integer quantidadeBilheteUnico) {
    this.quantidadeBilheteUnico = quantidadeBilheteUnico;
  }

  
  /**
   * Quantidade de pagamentos de contas inclusas no pacote de tarifas
   **/
  @ApiModelProperty(required = true, value = "Quantidade de pagamentos de contas inclusas no pacote de tarifas")
  public Integer getQuantidadeTaxaPagamentoConta() {
    return quantidadeTaxaPagamentoConta;
  }
  public void setQuantidadeTaxaPagamentoConta(Integer quantidadeTaxaPagamentoConta) {
    this.quantidadeTaxaPagamentoConta = quantidadeTaxaPagamentoConta;
  }

  
  /**
   * Quantidade de saques inclusos no pacote de tarifas
   **/
  @ApiModelProperty(required = true, value = "Quantidade de saques inclusos no pacote de tarifas")
  public Integer getQuantidadeSaque() {
    return quantidadeSaque;
  }
  public void setQuantidadeSaque(Integer quantidadeSaque) {
    this.quantidadeSaque = quantidadeSaque;
  }

  
  /**
   * Quantidade de transfer\u00EAncias inclusas no pacote de tarifas
   **/
  @ApiModelProperty(required = true, value = "Quantidade de transfer\u00EAncias inclusas no pacote de tarifas")
  public Integer getQuantidadeTransferencia() {
    return quantidadeTransferencia;
  }
  public void setQuantidadeTransferencia(Integer quantidadeTransferencia) {
    this.quantidadeTransferencia = quantidadeTransferencia;
  }

  
  /**
   * Quantidade de gera\u00E7\u00E3o de boletos inclusos no pacote de tarifas
   **/
  @ApiModelProperty(required = true, value = "Quantidade de gera\u00E7\u00E3o de boletos inclusos no pacote de tarifas")
  public Integer getQuantidadeBoleto() {
    return quantidadeBoleto;
  }
  public void setQuantidadeBoleto(Integer quantidadeBoleto) {
    this.quantidadeBoleto = quantidadeBoleto;
  }

  
  /**
   * Quantidade de aplica\u00E7\u00F5es inclusas no pacote de tarifas
   **/
  @ApiModelProperty(required = true, value = "Quantidade de aplica\u00E7\u00F5es inclusas no pacote de tarifas")
  public Integer getQuantidadeAplicacoes() {
    return quantidadeAplicacoes;
  }
  public void setQuantidadeAplicacoes(Integer quantidadeAplicacoes) {
    this.quantidadeAplicacoes = quantidadeAplicacoes;
  }

  
  /**
   * Valor da tarifa do pacote
   **/
  @ApiModelProperty(value = "Valor da tarifa do pacote")
  public BigDecimal getValorTarifa() {
    return valorTarifa;
  }
  public void setValorTarifa(BigDecimal valorTarifa) {
    this.valorTarifa = valorTarifa;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PacoteTarifaUpdate {\n");
    
    sb.append("  descricao: ").append(descricao).append("\n");
    sb.append("  quantidadeRecargaCelular: ").append(quantidadeRecargaCelular).append("\n");
    sb.append("  quantidadeBilheteUnico: ").append(quantidadeBilheteUnico).append("\n");
    sb.append("  quantidadeTaxaPagamentoConta: ").append(quantidadeTaxaPagamentoConta).append("\n");
    sb.append("  quantidadeSaque: ").append(quantidadeSaque).append("\n");
    sb.append("  quantidadeTransferencia: ").append(quantidadeTransferencia).append("\n");
    sb.append("  quantidadeBoleto: ").append(quantidadeBoleto).append("\n");
    sb.append("  quantidadeAplicacoes: ").append(quantidadeAplicacoes).append("\n");
    sb.append("  valorTarifa: ").append(valorTarifa).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
