package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Celular recarga programada resposta
 **/
@ApiModel(description = "Celular recarga programada resposta")
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
   * C\u00F3digo da operadora
   **/
  @ApiModelProperty(value = "C\u00F3digo da operadora")
  public Long getCodigoOperadora() {
    return codigoOperadora;
  }
  public void setCodigoOperadora(Long codigoOperadora) {
    this.codigoOperadora = codigoOperadora;
  }

  
  /**
   * C\u00F3digo do produto
   **/
  @ApiModelProperty(value = "C\u00F3digo do produto")
  public Long getCodigoProduto() {
    return codigoProduto;
  }
  public void setCodigoProduto(Long codigoProduto) {
    this.codigoProduto = codigoProduto;
  }

  
  /**
   * inaliza\u00E7\u00E3o da tarifa
   **/
  @ApiModelProperty(value = "inaliza\u00E7\u00E3o da tarifa")
  public Boolean getFlagGeraTarifa() {
    return flagGeraTarifa;
  }
  public void setFlagGeraTarifa(Boolean flagGeraTarifa) {
    this.flagGeraTarifa = flagGeraTarifa;
  }

  
  /**
   * dentificador do cart\u00E3o
   **/
  @ApiModelProperty(value = "dentificador do cart\u00E3o")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * dentificador do cart\u00E3o
   **/
  @ApiModelProperty(value = "dentificador do cart\u00E3o")
  public Long getIdCartao() {
    return idCartao;
  }
  public void setIdCartao(Long idCartao) {
    this.idCartao = idCartao;
  }

  
  /**
   * N\u00FAmero do celular
   **/
  @ApiModelProperty(value = "N\u00FAmero do celular")
  public Long getIdCelularRecarga() {
    return idCelularRecarga;
  }
  public void setIdCelularRecarga(Long idCelularRecarga) {
    this.idCelularRecarga = idCelularRecarga;
  }

  
  /**
   * Identificador da conta
   **/
  @ApiModelProperty(value = "Identificador da conta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Identificador do tipo da recarga programada
   **/
  @ApiModelProperty(value = "Identificador do tipo da recarga programada")
  public Long getIdDescricaoTipoRecargaProgramada() {
    return idDescricaoTipoRecargaProgramada;
  }
  public void setIdDescricaoTipoRecargaProgramada(Long idDescricaoTipoRecargaProgramada) {
    this.idDescricaoTipoRecargaProgramada = idDescricaoTipoRecargaProgramada;
  }

  
  /**
   * Identificador da origem comercial
   **/
  @ApiModelProperty(value = "Identificador da origem comercial")
  public Long getIdOrigemComercial() {
    return idOrigemComercial;
  }
  public void setIdOrigemComercial(Long idOrigemComercial) {
    this.idOrigemComercial = idOrigemComercial;
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
   * Identificador da proposta
   **/
  @ApiModelProperty(value = "Identificador da proposta")
  public Long getIdiPlataforma() {
    return idiPlataforma;
  }
  public void setIdiPlataforma(Long idiPlataforma) {
    this.idiPlataforma = idiPlataforma;
  }

  
  /**
   * Motivo do cancelamento
   **/
  @ApiModelProperty(value = "Motivo do cancelamento")
  public Long getMotivoCancelamento() {
    return motivoCancelamento;
  }
  public void setMotivoCancelamento(Long motivoCancelamento) {
    this.motivoCancelamento = motivoCancelamento;
  }

  
  /**
   * Valor da recarga
   **/
  @ApiModelProperty(value = "Valor da recarga")
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
