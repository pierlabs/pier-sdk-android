package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Representa\u00E7\u00E3o de um pacote de tarifa
 **/
@ApiModel(description = "Representa\u00E7\u00E3o de um pacote de tarifa")
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
   * Id do pacote de tarifa
   **/
  @ApiModelProperty(value = "Id do pacote de tarifa")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Quantidade de aplica\u00E7\u00F5es do pacote
   **/
  @ApiModelProperty(value = "Quantidade de aplica\u00E7\u00F5es do pacote")
  public Integer getQuantidadeAplicacoes() {
    return quantidadeAplicacoes;
  }
  public void setQuantidadeAplicacoes(Integer quantidadeAplicacoes) {
    this.quantidadeAplicacoes = quantidadeAplicacoes;
  }

  
  /**
   * Quantidade de bilhete \u00FAnico do pacote
   **/
  @ApiModelProperty(value = "Quantidade de bilhete \u00FAnico do pacote")
  public Integer getQuantidadeBilheteUnico() {
    return quantidadeBilheteUnico;
  }
  public void setQuantidadeBilheteUnico(Integer quantidadeBilheteUnico) {
    this.quantidadeBilheteUnico = quantidadeBilheteUnico;
  }

  
  /**
   * Quantidade de boletos do pacote
   **/
  @ApiModelProperty(value = "Quantidade de boletos do pacote")
  public Integer getQuantidadeBoleto() {
    return quantidadeBoleto;
  }
  public void setQuantidadeBoleto(Integer quantidadeBoleto) {
    this.quantidadeBoleto = quantidadeBoleto;
  }

  
  /**
   * Quantidade de recarga celular do pacote
   **/
  @ApiModelProperty(value = "Quantidade de recarga celular do pacote")
  public Integer getQuantidadeRecargaCelular() {
    return quantidadeRecargaCelular;
  }
  public void setQuantidadeRecargaCelular(Integer quantidadeRecargaCelular) {
    this.quantidadeRecargaCelular = quantidadeRecargaCelular;
  }

  
  /**
   * Quantidade de saque do pacote
   **/
  @ApiModelProperty(value = "Quantidade de saque do pacote")
  public Integer getQuantidadeSaque() {
    return quantidadeSaque;
  }
  public void setQuantidadeSaque(Integer quantidadeSaque) {
    this.quantidadeSaque = quantidadeSaque;
  }

  
  /**
   * Quantidade taxa pagamento conta do pacote
   **/
  @ApiModelProperty(value = "Quantidade taxa pagamento conta do pacote")
  public Integer getQuantidadeTaxaPagamentoConta() {
    return quantidadeTaxaPagamentoConta;
  }
  public void setQuantidadeTaxaPagamentoConta(Integer quantidadeTaxaPagamentoConta) {
    this.quantidadeTaxaPagamentoConta = quantidadeTaxaPagamentoConta;
  }

  
  /**
   * Quantidade de transfer\u00EAncias do pacote
   **/
  @ApiModelProperty(value = "Quantidade de transfer\u00EAncias do pacote")
  public Integer getQuantidadeTransferencia() {
    return quantidadeTransferencia;
  }
  public void setQuantidadeTransferencia(Integer quantidadeTransferencia) {
    this.quantidadeTransferencia = quantidadeTransferencia;
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
