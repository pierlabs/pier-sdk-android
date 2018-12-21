package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Cellular recharge programmed answer
 **/
@ApiModel(description = "Cellular recharge programmed answer")
public class CelularRecargaProgramadaResponse  {
  
  @SerializedName("codigoOperadora")
  private Long codigoOperadora = null;
  @SerializedName("codigoProduto")
  private Long codigoProduto = null;
  @SerializedName("flagGeraTarifa")
  private Boolean flagGeraTarifa = null;
  @SerializedName("id")
  private Long id = null;
  @SerializedName("idCartao")
  private Long idCartao = null;
  @SerializedName("idCelularRecarga")
  private Long idCelularRecarga = null;
  @SerializedName("idConta")
  private Long idConta = null;
  @SerializedName("idDescricaoTipoRecargaProgramada")
  private Long idDescricaoTipoRecargaProgramada = null;
  @SerializedName("idOrigemComercial")
  private Long idOrigemComercial = null;
  @SerializedName("idProposta")
  private Long idProposta = null;
  @SerializedName("idUsuarioRecarga")
  private Long idUsuarioRecarga = null;
  @SerializedName("idiPlataforma")
  private Long idiPlataforma = null;
  @SerializedName("motivoCancelamento")
  private Long motivoCancelamento = null;
  @SerializedName("valor")
  private BigDecimal valor = null;

  
  /**
   * Operator code
   **/
  @ApiModelProperty(value = "Operator code")
  public Long getCodigoOperadora() {
    return codigoOperadora;
  }
  public void setCodigoOperadora(Long codigoOperadora) {
    this.codigoOperadora = codigoOperadora;
  }

  
  /**
   * product code
   **/
  @ApiModelProperty(value = "product code")
  public Long getCodigoProduto() {
    return codigoProduto;
  }
  public void setCodigoProduto(Long codigoProduto) {
    this.codigoProduto = codigoProduto;
  }

  
  /**
   * Tariff signaling
   **/
  @ApiModelProperty(value = "Tariff signaling")
  public Boolean getFlagGeraTarifa() {
    return flagGeraTarifa;
  }
  public void setFlagGeraTarifa(Boolean flagGeraTarifa) {
    this.flagGeraTarifa = flagGeraTarifa;
  }

  
  /**
   * Card ID
   **/
  @ApiModelProperty(value = "Card ID")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Card ID
   **/
  @ApiModelProperty(value = "Card ID")
  public Long getIdCartao() {
    return idCartao;
  }
  public void setIdCartao(Long idCartao) {
    this.idCartao = idCartao;
  }

  
  /**
   * Cellphone number
   **/
  @ApiModelProperty(value = "Cellphone number")
  public Long getIdCelularRecarga() {
    return idCelularRecarga;
  }
  public void setIdCelularRecarga(Long idCelularRecarga) {
    this.idCelularRecarga = idCelularRecarga;
  }

  
  /**
   * Account Identifier
   **/
  @ApiModelProperty(value = "Account Identifier")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Scheduled recharge type identifier
   **/
  @ApiModelProperty(value = "Scheduled recharge type identifier")
  public Long getIdDescricaoTipoRecargaProgramada() {
    return idDescricaoTipoRecargaProgramada;
  }
  public void setIdDescricaoTipoRecargaProgramada(Long idDescricaoTipoRecargaProgramada) {
    this.idDescricaoTipoRecargaProgramada = idDescricaoTipoRecargaProgramada;
  }

  
  /**
   * Business Source Identifier
   **/
  @ApiModelProperty(value = "Business Source Identifier")
  public Long getIdOrigemComercial() {
    return idOrigemComercial;
  }
  public void setIdOrigemComercial(Long idOrigemComercial) {
    this.idOrigemComercial = idOrigemComercial;
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
   * Proposal identifier
   **/
  @ApiModelProperty(value = "Proposal identifier")
  public Long getIdiPlataforma() {
    return idiPlataforma;
  }
  public void setIdiPlataforma(Long idiPlataforma) {
    this.idiPlataforma = idiPlataforma;
  }

  
  /**
   * Reason for cancellation
   **/
  @ApiModelProperty(value = "Reason for cancellation")
  public Long getMotivoCancelamento() {
    return motivoCancelamento;
  }
  public void setMotivoCancelamento(Long motivoCancelamento) {
    this.motivoCancelamento = motivoCancelamento;
  }

  
  /**
   * Recharge value
   **/
  @ApiModelProperty(value = "Recharge value")
  public BigDecimal getValor() {
    return valor;
  }
  public void setValor(BigDecimal valor) {
    this.valor = valor;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CelularRecargaProgramadaResponse {\n");
    
    sb.append("  codigoOperadora: ").append(codigoOperadora).append("\n");
    sb.append("  codigoProduto: ").append(codigoProduto).append("\n");
    sb.append("  flagGeraTarifa: ").append(flagGeraTarifa).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  idCartao: ").append(idCartao).append("\n");
    sb.append("  idCelularRecarga: ").append(idCelularRecarga).append("\n");
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  idDescricaoTipoRecargaProgramada: ").append(idDescricaoTipoRecargaProgramada).append("\n");
    sb.append("  idOrigemComercial: ").append(idOrigemComercial).append("\n");
    sb.append("  idProposta: ").append(idProposta).append("\n");
    sb.append("  idUsuarioRecarga: ").append(idUsuarioRecarga).append("\n");
    sb.append("  idiPlataforma: ").append(idiPlataforma).append("\n");
    sb.append("  motivoCancelamento: ").append(motivoCancelamento).append("\n");
    sb.append("  valor: ").append(valor).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
