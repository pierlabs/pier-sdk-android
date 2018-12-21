package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Celphone persistence recharge programmed
 **/
@ApiModel(description = "Celphone persistence recharge programmed")
public class CelularRecargaProgramadaPersist  {
  
  @SerializedName("idCartao")
  private Long idCartao = null;
  @SerializedName("idUsuarioRecarga")
  private Long idUsuarioRecarga = null;
  @SerializedName("idDescricaoTipoRecargaProgramada")
  private Long idDescricaoTipoRecargaProgramada = null;
  @SerializedName("codigoProduto")
  private Long codigoProduto = null;
  @SerializedName("codigoOperadora")
  private Long codigoOperadora = null;
  @SerializedName("valor")
  private BigDecimal valor = null;
  @SerializedName("idPlataforma")
  private Long idPlataforma = null;
  @SerializedName("flagGeraTarifa")
  private Boolean flagGeraTarifa = null;
  @SerializedName("idProposta")
  private Long idProposta = null;
  @SerializedName("idOrigemComercial")
  private Long idOrigemComercial = null;
  @SerializedName("dddCelularRecarga")
  private String dddCelularRecarga = null;
  @SerializedName("numeroCelularRecarga")
  private String numeroCelularRecarga = null;

  
  /**
   * Card ID
   **/
  @ApiModelProperty(required = true, value = "Card ID")
  public Long getIdCartao() {
    return idCartao;
  }
  public void setIdCartao(Long idCartao) {
    this.idCartao = idCartao;
  }

  
  /**
   * User ID
   **/
  @ApiModelProperty(value = "User ID")
  public Long getIdUsuarioRecarga() {
    return idUsuarioRecarga;
  }
  public void setIdUsuarioRecarga(Long idUsuarioRecarga) {
    this.idUsuarioRecarga = idUsuarioRecarga;
  }

  
  /**
   * Scheduled recharge type identifier
   **/
  @ApiModelProperty(required = true, value = "Scheduled recharge type identifier")
  public Long getIdDescricaoTipoRecargaProgramada() {
    return idDescricaoTipoRecargaProgramada;
  }
  public void setIdDescricaoTipoRecargaProgramada(Long idDescricaoTipoRecargaProgramada) {
    this.idDescricaoTipoRecargaProgramada = idDescricaoTipoRecargaProgramada;
  }

  
  /**
   * Product code
   **/
  @ApiModelProperty(required = true, value = "Product code")
  public Long getCodigoProduto() {
    return codigoProduto;
  }
  public void setCodigoProduto(Long codigoProduto) {
    this.codigoProduto = codigoProduto;
  }

  
  /**
   * Operator code
   **/
  @ApiModelProperty(required = true, value = "Operator code")
  public Long getCodigoOperadora() {
    return codigoOperadora;
  }
  public void setCodigoOperadora(Long codigoOperadora) {
    this.codigoOperadora = codigoOperadora;
  }

  
  /**
   * Recharge value
   **/
  @ApiModelProperty(required = true, value = "Recharge value")
  public BigDecimal getValor() {
    return valor;
  }
  public void setValor(BigDecimal valor) {
    this.valor = valor;
  }

  
  /**
   * Platform identifier
   **/
  @ApiModelProperty(value = "Platform identifier")
  public Long getIdPlataforma() {
    return idPlataforma;
  }
  public void setIdPlataforma(Long idPlataforma) {
    this.idPlataforma = idPlataforma;
  }

  
  /**
   * Tariff signaling
   **/
  @ApiModelProperty(required = true, value = "Tariff signaling")
  public Boolean getFlagGeraTarifa() {
    return flagGeraTarifa;
  }
  public void setFlagGeraTarifa(Boolean flagGeraTarifa) {
    this.flagGeraTarifa = flagGeraTarifa;
  }

  
  /**
   * Proposal identifier
   **/
  @ApiModelProperty(value = "Proposal identifier")
  public Long getIdProposta() {
    return idProposta;
  }
  public void setIdProposta(Long idProposta) {
    this.idProposta = idProposta;
  }

  
  /**
   * Business Source Identifier
   **/
  @ApiModelProperty(required = true, value = "Business Source Identifier")
  public Long getIdOrigemComercial() {
    return idOrigemComercial;
  }
  public void setIdOrigemComercial(Long idOrigemComercial) {
    this.idOrigemComercial = idOrigemComercial;
  }

  
  /**
   * Direct dialing from cell phone
   **/
  @ApiModelProperty(required = true, value = "Direct dialing from cell phone")
  public String getDddCelularRecarga() {
    return dddCelularRecarga;
  }
  public void setDddCelularRecarga(String dddCelularRecarga) {
    this.dddCelularRecarga = dddCelularRecarga;
  }

  
  /**
   * Cellphone number
   **/
  @ApiModelProperty(required = true, value = "Cellphone number")
  public String getNumeroCelularRecarga() {
    return numeroCelularRecarga;
  }
  public void setNumeroCelularRecarga(String numeroCelularRecarga) {
    this.numeroCelularRecarga = numeroCelularRecarga;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CelularRecargaProgramadaPersist {\n");
    
    sb.append("  idCartao: ").append(idCartao).append("\n");
    sb.append("  idUsuarioRecarga: ").append(idUsuarioRecarga).append("\n");
    sb.append("  idDescricaoTipoRecargaProgramada: ").append(idDescricaoTipoRecargaProgramada).append("\n");
    sb.append("  codigoProduto: ").append(codigoProduto).append("\n");
    sb.append("  codigoOperadora: ").append(codigoOperadora).append("\n");
    sb.append("  valor: ").append(valor).append("\n");
    sb.append("  idPlataforma: ").append(idPlataforma).append("\n");
    sb.append("  flagGeraTarifa: ").append(flagGeraTarifa).append("\n");
    sb.append("  idProposta: ").append(idProposta).append("\n");
    sb.append("  idOrigemComercial: ").append(idOrigemComercial).append("\n");
    sb.append("  dddCelularRecarga: ").append(dddCelularRecarga).append("\n");
    sb.append("  numeroCelularRecarga: ").append(numeroCelularRecarga).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
