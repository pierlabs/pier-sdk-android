package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Object for account persistence MultiApp
 **/
@ApiModel(description = "Object for account persistence MultiApp")
public class CountMultiAppPersist  {
  
  @SerializedName("idPessoa")
  private Long idPessoa = null;
  @SerializedName("idOrigemComercial")
  private Long idOrigemComercial = null;
  @SerializedName("idProduto")
  private Long idProduto = null;
  @SerializedName("diaVencimento")
  private Integer diaVencimento = null;
  @SerializedName("valorRenda")
  private BigDecimal valorRenda = null;
  @SerializedName("valorPontuacao")
  private Integer valorPontuacao = null;
  @SerializedName("idEnderecoCorrespondencia")
  private Long idEnderecoCorrespondencia = null;
  @SerializedName("limiteGlobal")
  private BigDecimal limiteGlobal = null;
  @SerializedName("limiteMaximo")
  private BigDecimal limiteMaximo = null;
  @SerializedName("limiteParcelas")
  private BigDecimal limiteParcelas = null;
  @SerializedName("limiteConsignado")
  private BigDecimal limiteConsignado = null;
  @SerializedName("flagFaturaDigital")
  private Integer flagFaturaDigital = null;
  @SerializedName("canalEntrada")
  private String canalEntrada = null;

  
  /**
   * Identifier code of the person at the base (id)
   **/
  @ApiModelProperty(required = true, value = "Identifier code of the person at the base (id)")
  public Long getIdPessoa() {
    return idPessoa;
  }
  public void setIdPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
  }

  
  /**
   * Identification code of the commercial origin at the base (id)
   **/
  @ApiModelProperty(required = true, value = "Identification code of the commercial origin at the base (id)")
  public Long getIdOrigemComercial() {
    return idOrigemComercial;
  }
  public void setIdOrigemComercial(Long idOrigemComercial) {
    this.idOrigemComercial = idOrigemComercial;
  }

  
  /**
   * Identification code of the product at the base (id)
   **/
  @ApiModelProperty(required = true, value = "Identification code of the product at the base (id)")
  public Long getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Long idProduto) {
    this.idProduto = idProduto;
  }

  
  /**
   * Account Due Date
   **/
  @ApiModelProperty(required = true, value = "Account Due Date")
  public Integer getDiaVencimento() {
    return diaVencimento;
  }
  public void setDiaVencimento(Integer diaVencimento) {
    this.diaVencimento = diaVencimento;
  }

  
  /**
   * Amount of the account holder's income
   **/
  @ApiModelProperty(required = true, value = "Amount of the account holder's income")
  public BigDecimal getValorRenda() {
    return valorRenda;
  }
  public void setValorRenda(BigDecimal valorRenda) {
    this.valorRenda = valorRenda;
  }

  
  /**
   * score value of the acount
   **/
  @ApiModelProperty(required = true, value = "score value of the acount")
  public Integer getValorPontuacao() {
    return valorPontuacao;
  }
  public void setValorPontuacao(Integer valorPontuacao) {
    this.valorPontuacao = valorPontuacao;
  }

  
  /**
   * ID code of the account's mailing address
   **/
  @ApiModelProperty(required = true, value = "ID code of the account's mailing address")
  public Long getIdEnderecoCorrespondencia() {
    return idEnderecoCorrespondencia;
  }
  public void setIdEnderecoCorrespondencia(Long idEnderecoCorrespondencia) {
    this.idEnderecoCorrespondencia = idEnderecoCorrespondencia;
  }

  
  /**
   * global limit of the acount
   **/
  @ApiModelProperty(required = true, value = "global limit of the acount")
  public BigDecimal getLimiteGlobal() {
    return limiteGlobal;
  }
  public void setLimiteGlobal(BigDecimal limiteGlobal) {
    this.limiteGlobal = limiteGlobal;
  }

  
  /**
   * maximum limit of the acount
   **/
  @ApiModelProperty(required = true, value = "maximum limit of the acount")
  public BigDecimal getLimiteMaximo() {
    return limiteMaximo;
  }
  public void setLimiteMaximo(BigDecimal limiteMaximo) {
    this.limiteMaximo = limiteMaximo;
  }

  
  /**
   * inform the Specific Monthly Limit for Parcel Transactions
   **/
  @ApiModelProperty(required = true, value = "inform the Specific Monthly Limit for Parcel Transactions")
  public BigDecimal getLimiteParcelas() {
    return limiteParcelas;
  }
  public void setLimiteParcelas(BigDecimal limiteParcelas) {
    this.limiteParcelas = limiteParcelas;
  }

  
  /**
   * inform the Consigned Limit margin
   **/
  @ApiModelProperty(required = true, value = "inform the Consigned Limit margin")
  public BigDecimal getLimiteConsignado() {
    return limiteConsignado;
  }
  public void setLimiteConsignado(BigDecimal limiteConsignado) {
    this.limiteConsignado = limiteConsignado;
  }

  
  /**
   * On active, indicates that the customer has chosen the option to send Invoice by Email. Otherwise, invoices will be mailed
   **/
  @ApiModelProperty(required = true, value = "On active, indicates that the customer has chosen the option to send Invoice by Email. Otherwise, invoices will be mailed")
  public Integer getFlagFaturaDigital() {
    return flagFaturaDigital;
  }
  public void setFlagFaturaDigital(Integer flagFaturaDigital) {
    this.flagFaturaDigital = flagFaturaDigital;
  }

  
  /**
   * When used, it is used to indicate the capture channel of the customer's registration, such as Web, Site, App, etc
   **/
  @ApiModelProperty(value = "When used, it is used to indicate the capture channel of the customer's registration, such as Web, Site, App, etc")
  public String getCanalEntrada() {
    return canalEntrada;
  }
  public void setCanalEntrada(String canalEntrada) {
    this.canalEntrada = canalEntrada;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CountMultiAppPersist {\n");
    
    sb.append("  idPessoa: ").append(idPessoa).append("\n");
    sb.append("  idOrigemComercial: ").append(idOrigemComercial).append("\n");
    sb.append("  idProduto: ").append(idProduto).append("\n");
    sb.append("  diaVencimento: ").append(diaVencimento).append("\n");
    sb.append("  valorRenda: ").append(valorRenda).append("\n");
    sb.append("  valorPontuacao: ").append(valorPontuacao).append("\n");
    sb.append("  idEnderecoCorrespondencia: ").append(idEnderecoCorrespondencia).append("\n");
    sb.append("  limiteGlobal: ").append(limiteGlobal).append("\n");
    sb.append("  limiteMaximo: ").append(limiteMaximo).append("\n");
    sb.append("  limiteParcelas: ").append(limiteParcelas).append("\n");
    sb.append("  limiteConsignado: ").append(limiteConsignado).append("\n");
    sb.append("  flagFaturaDigital: ").append(flagFaturaDigital).append("\n");
    sb.append("  canalEntrada: ").append(canalEntrada).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
