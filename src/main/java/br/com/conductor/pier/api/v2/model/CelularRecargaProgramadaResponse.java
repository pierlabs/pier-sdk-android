package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{celular_recarga_programada_resposta_descricao}}}
 **/
@ApiModel(description = "{{{celular_recarga_programada_resposta_descricao}}}")
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
   * {{{celular_recarga_programada_resposta_codigo_operadora_descricao}}}
   **/
  @ApiModelProperty(value = "{{{celular_recarga_programada_resposta_codigo_operadora_descricao}}}")
  public Long getCodigoOperadora() {
    return codigoOperadora;
  }
  public void setCodigoOperadora(Long codigoOperadora) {
    this.codigoOperadora = codigoOperadora;
  }

  
  /**
   * {{{celular_recarga_programada_resposta_codigo_produto_descricao}}}
   **/
  @ApiModelProperty(value = "{{{celular_recarga_programada_resposta_codigo_produto_descricao}}}")
  public Long getCodigoProduto() {
    return codigoProduto;
  }
  public void setCodigoProduto(Long codigoProduto) {
    this.codigoProduto = codigoProduto;
  }

  
  /**
   * {{{celular_recarga_programada_resposta_flag_gera_tarifa_descricao}}}
   **/
  @ApiModelProperty(value = "{{{celular_recarga_programada_resposta_flag_gera_tarifa_descricao}}}")
  public Boolean getFlagGeraTarifa() {
    return flagGeraTarifa;
  }
  public void setFlagGeraTarifa(Boolean flagGeraTarifa) {
    this.flagGeraTarifa = flagGeraTarifa;
  }

  
  /**
   * {{{celular_recarga_programada_resposta_id_recarga_programada_descricao}}}
   **/
  @ApiModelProperty(value = "{{{celular_recarga_programada_resposta_id_recarga_programada_descricao}}}")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{celular_recarga_programada_resposta_id_cartao_descricao}}}
   **/
  @ApiModelProperty(value = "{{{celular_recarga_programada_resposta_id_cartao_descricao}}}")
  public Long getIdCartao() {
    return idCartao;
  }
  public void setIdCartao(Long idCartao) {
    this.idCartao = idCartao;
  }

  
  /**
   * {{{celular_recarga_programada_resposta_id_celular_recarga_descricao}}}
   **/
  @ApiModelProperty(value = "{{{celular_recarga_programada_resposta_id_celular_recarga_descricao}}}")
  public Long getIdCelularRecarga() {
    return idCelularRecarga;
  }
  public void setIdCelularRecarga(Long idCelularRecarga) {
    this.idCelularRecarga = idCelularRecarga;
  }

  
  /**
   * {{{celular_recarga_programada_resposta_id_conta_descricao}}}
   **/
  @ApiModelProperty(value = "{{{celular_recarga_programada_resposta_id_conta_descricao}}}")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * {{{celular_recarga_programada_resposta_id_descricao_tipo_recarga_programada_descricao}}}
   **/
  @ApiModelProperty(value = "{{{celular_recarga_programada_resposta_id_descricao_tipo_recarga_programada_descricao}}}")
  public Long getIdDescricaoTipoRecargaProgramada() {
    return idDescricaoTipoRecargaProgramada;
  }
  public void setIdDescricaoTipoRecargaProgramada(Long idDescricaoTipoRecargaProgramada) {
    this.idDescricaoTipoRecargaProgramada = idDescricaoTipoRecargaProgramada;
  }

  
  /**
   * {{{celular_recarga_programada_resposta_id_origem_comercial_descricao}}}
   **/
  @ApiModelProperty(value = "{{{celular_recarga_programada_resposta_id_origem_comercial_descricao}}}")
  public Long getIdOrigemComercial() {
    return idOrigemComercial;
  }
  public void setIdOrigemComercial(Long idOrigemComercial) {
    this.idOrigemComercial = idOrigemComercial;
  }

  
  /**
   * {{{celular_recarga_programada_resposta_id_proposta_descricao}}}
   **/
  @ApiModelProperty(value = "{{{celular_recarga_programada_resposta_id_proposta_descricao}}}")
  public Long getIdProposta() {
    return idProposta;
  }
  public void setIdProposta(Long idProposta) {
    this.idProposta = idProposta;
  }

  
  /**
   * {{{celular_recarga_programada_resposta_id_usuario_recarga_descricao}}}
   **/
  @ApiModelProperty(value = "{{{celular_recarga_programada_resposta_id_usuario_recarga_descricao}}}")
  public Long getIdUsuarioRecarga() {
    return idUsuarioRecarga;
  }
  public void setIdUsuarioRecarga(Long idUsuarioRecarga) {
    this.idUsuarioRecarga = idUsuarioRecarga;
  }

  
  /**
   * {{{celular_recarga_programada_resposta_id_plataforma_descricao}}}
   **/
  @ApiModelProperty(value = "{{{celular_recarga_programada_resposta_id_plataforma_descricao}}}")
  public Long getIdiPlataforma() {
    return idiPlataforma;
  }
  public void setIdiPlataforma(Long idiPlataforma) {
    this.idiPlataforma = idiPlataforma;
  }

  
  /**
   * {{{celular_recarga_programada_resposta_motivo_cancelamento_descricao}}}
   **/
  @ApiModelProperty(value = "{{{celular_recarga_programada_resposta_motivo_cancelamento_descricao}}}")
  public Long getMotivoCancelamento() {
    return motivoCancelamento;
  }
  public void setMotivoCancelamento(Long motivoCancelamento) {
    this.motivoCancelamento = motivoCancelamento;
  }

  
  /**
   * {{{celular_recarga_programada_resposta_valor_descricao}}}
   **/
  @ApiModelProperty(value = "{{{celular_recarga_programada_resposta_valor_descricao}}}")
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
