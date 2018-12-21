package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{celular_recarga_programada_persistencia_descricao}}}
 **/
@ApiModel(description = "{{{celular_recarga_programada_persistencia_descricao}}}")
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
   * {{{celular_recarga_programada_persistencia_id_cartao_descricao}}}
   **/
  @ApiModelProperty(required = true, value = "{{{celular_recarga_programada_persistencia_id_cartao_descricao}}}")
  public Long getIdCartao() {
    return idCartao;
  }
  public void setIdCartao(Long idCartao) {
    this.idCartao = idCartao;
  }

  
  /**
   * {{{celular_recarga_programada_persistencia_id_usuario_recarga_descricao}}}
   **/
  @ApiModelProperty(value = "{{{celular_recarga_programada_persistencia_id_usuario_recarga_descricao}}}")
  public Long getIdUsuarioRecarga() {
    return idUsuarioRecarga;
  }
  public void setIdUsuarioRecarga(Long idUsuarioRecarga) {
    this.idUsuarioRecarga = idUsuarioRecarga;
  }

  
  /**
   * {{{celular_recarga_programada_persistencia_id_descricao_tipo_recarga_programada_descricao}}}
   **/
  @ApiModelProperty(required = true, value = "{{{celular_recarga_programada_persistencia_id_descricao_tipo_recarga_programada_descricao}}}")
  public Long getIdDescricaoTipoRecargaProgramada() {
    return idDescricaoTipoRecargaProgramada;
  }
  public void setIdDescricaoTipoRecargaProgramada(Long idDescricaoTipoRecargaProgramada) {
    this.idDescricaoTipoRecargaProgramada = idDescricaoTipoRecargaProgramada;
  }

  
  /**
   * {{{celular_recarga_programada_persistencia_codigo_produto_descricao}}}
   **/
  @ApiModelProperty(required = true, value = "{{{celular_recarga_programada_persistencia_codigo_produto_descricao}}}")
  public Long getCodigoProduto() {
    return codigoProduto;
  }
  public void setCodigoProduto(Long codigoProduto) {
    this.codigoProduto = codigoProduto;
  }

  
  /**
   * {{{celular_recarga_programada_persistencia_codigo_operadora_descricao}}}
   **/
  @ApiModelProperty(required = true, value = "{{{celular_recarga_programada_persistencia_codigo_operadora_descricao}}}")
  public Long getCodigoOperadora() {
    return codigoOperadora;
  }
  public void setCodigoOperadora(Long codigoOperadora) {
    this.codigoOperadora = codigoOperadora;
  }

  
  /**
   * {{{celular_recarga_programada_persistencia_valor_descricao}}}
   **/
  @ApiModelProperty(required = true, value = "{{{celular_recarga_programada_persistencia_valor_descricao}}}")
  public BigDecimal getValor() {
    return valor;
  }
  public void setValor(BigDecimal valor) {
    this.valor = valor;
  }

  
  /**
   * {{{celular_recarga_programada_persistencia_id_plataforma_descricao}}}
   **/
  @ApiModelProperty(value = "{{{celular_recarga_programada_persistencia_id_plataforma_descricao}}}")
  public Long getIdPlataforma() {
    return idPlataforma;
  }
  public void setIdPlataforma(Long idPlataforma) {
    this.idPlataforma = idPlataforma;
  }

  
  /**
   * {{{celular_recarga_programada_persistencia_flag_gera_tarifa_descricao}}}
   **/
  @ApiModelProperty(required = true, value = "{{{celular_recarga_programada_persistencia_flag_gera_tarifa_descricao}}}")
  public Boolean getFlagGeraTarifa() {
    return flagGeraTarifa;
  }
  public void setFlagGeraTarifa(Boolean flagGeraTarifa) {
    this.flagGeraTarifa = flagGeraTarifa;
  }

  
  /**
   * {{{celular_recarga_programada_persistencia_id_proposta_descricao}}}
   **/
  @ApiModelProperty(value = "{{{celular_recarga_programada_persistencia_id_proposta_descricao}}}")
  public Long getIdProposta() {
    return idProposta;
  }
  public void setIdProposta(Long idProposta) {
    this.idProposta = idProposta;
  }

  
  /**
   * {{{celular_recarga_programada_persistencia_id_origem_comercial_descricao}}}
   **/
  @ApiModelProperty(required = true, value = "{{{celular_recarga_programada_persistencia_id_origem_comercial_descricao}}}")
  public Long getIdOrigemComercial() {
    return idOrigemComercial;
  }
  public void setIdOrigemComercial(Long idOrigemComercial) {
    this.idOrigemComercial = idOrigemComercial;
  }

  
  /**
   * {{{celular_recarga_programada_persistencia_ddd_celular_recarga_descricao}}}
   **/
  @ApiModelProperty(required = true, value = "{{{celular_recarga_programada_persistencia_ddd_celular_recarga_descricao}}}")
  public String getDddCelularRecarga() {
    return dddCelularRecarga;
  }
  public void setDddCelularRecarga(String dddCelularRecarga) {
    this.dddCelularRecarga = dddCelularRecarga;
  }

  
  /**
   * {{{celular_recarga_programada_persistencia_numero_celular_recarga_descricao}}}
   **/
  @ApiModelProperty(required = true, value = "{{{celular_recarga_programada_persistencia_numero_celular_recarga_descricao}}}")
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
