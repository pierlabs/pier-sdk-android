package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Persist\u00EAncia celular recarga programada
 **/
@ApiModel(description = "Persist\u00EAncia celular recarga programada")
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
   * Identificador do cart\u00E3o
   **/
  @ApiModelProperty(required = true, value = "Identificador do cart\u00E3o")
  public Long getIdCartao() {
    return idCartao;
  }
  public void setIdCartao(Long idCartao) {
    this.idCartao = idCartao;
  }

  
  /**
   * Identificador do usu\u00E1rio
   **/
  @ApiModelProperty(value = "Identificador do usu\u00E1rio")
  public Long getIdUsuarioRecarga() {
    return idUsuarioRecarga;
  }
  public void setIdUsuarioRecarga(Long idUsuarioRecarga) {
    this.idUsuarioRecarga = idUsuarioRecarga;
  }

  
  /**
   * Identificador do tipo da recarga programada
   **/
  @ApiModelProperty(required = true, value = "Identificador do tipo da recarga programada")
  public Long getIdDescricaoTipoRecargaProgramada() {
    return idDescricaoTipoRecargaProgramada;
  }
  public void setIdDescricaoTipoRecargaProgramada(Long idDescricaoTipoRecargaProgramada) {
    this.idDescricaoTipoRecargaProgramada = idDescricaoTipoRecargaProgramada;
  }

  
  /**
   * C\u00F3digo do produto
   **/
  @ApiModelProperty(required = true, value = "C\u00F3digo do produto")
  public Long getCodigoProduto() {
    return codigoProduto;
  }
  public void setCodigoProduto(Long codigoProduto) {
    this.codigoProduto = codigoProduto;
  }

  
  /**
   * C\u00F3digo da operadora
   **/
  @ApiModelProperty(required = true, value = "C\u00F3digo da operadora")
  public Long getCodigoOperadora() {
    return codigoOperadora;
  }
  public void setCodigoOperadora(Long codigoOperadora) {
    this.codigoOperadora = codigoOperadora;
  }

  
  /**
   * Valor da recarga
   **/
  @ApiModelProperty(required = true, value = "Valor da recarga")
  public BigDecimal getValor() {
    return valor;
  }
  public void setValor(BigDecimal valor) {
    this.valor = valor;
  }

  
  /**
   * Identificador da platafora
   **/
  @ApiModelProperty(value = "Identificador da platafora")
  public Long getIdPlataforma() {
    return idPlataforma;
  }
  public void setIdPlataforma(Long idPlataforma) {
    this.idPlataforma = idPlataforma;
  }

  
  /**
   * Sinaliza\u00E7\u00E3o da tarifa
   **/
  @ApiModelProperty(required = true, value = "Sinaliza\u00E7\u00E3o da tarifa")
  public Boolean getFlagGeraTarifa() {
    return flagGeraTarifa;
  }
  public void setFlagGeraTarifa(Boolean flagGeraTarifa) {
    this.flagGeraTarifa = flagGeraTarifa;
  }

  
  /**
   * Identificador da proposta
   **/
  @ApiModelProperty(value = "Identificador da proposta")
  public Long getIdProposta() {
    return idProposta;
  }
  public void setIdProposta(Long idProposta) {
    this.idProposta = idProposta;
  }

  
  /**
   * Identificador da origem comercial
   **/
  @ApiModelProperty(required = true, value = "Identificador da origem comercial")
  public Long getIdOrigemComercial() {
    return idOrigemComercial;
  }
  public void setIdOrigemComercial(Long idOrigemComercial) {
    this.idOrigemComercial = idOrigemComercial;
  }

  
  /**
   * Discagem direta a dist\u00E2ncia do celular
   **/
  @ApiModelProperty(required = true, value = "Discagem direta a dist\u00E2ncia do celular")
  public String getDddCelularRecarga() {
    return dddCelularRecarga;
  }
  public void setDddCelularRecarga(String dddCelularRecarga) {
    this.dddCelularRecarga = dddCelularRecarga;
  }

  
  /**
   * N\u00FAmero do celular
   **/
  @ApiModelProperty(required = true, value = "N\u00FAmero do celular")
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
