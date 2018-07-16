package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * {{{risco_fraude_response_description}}}
 **/
@ApiModel(description = "{{{risco_fraude_response_description}}}")
public class RiscoFraudeResponseValue  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("idTipoResolucao")
  private Long idTipoResolucao = null;
  @SerializedName("descricaoTipoResolucao")
  private String descricaoTipoResolucao = null;
  @SerializedName("flagAltoRisco")
  private Boolean flagAltoRisco = null;
  @SerializedName("idConta")
  private Long idConta = null;
  @SerializedName("idCartao")
  private Long idCartao = null;
  @SerializedName("idTransacao")
  private Long idTransacao = null;
  @SerializedName("dataTransacao")
  private String dataTransacao = null;
  @SerializedName("valorTransacao")
  private BigDecimal valorTransacao = null;
  @SerializedName("nomeEstabelecimento")
  private String nomeEstabelecimento = null;

  
  /**
   * {{{risco_fraude_response_id_value}}}
   **/
  @ApiModelProperty(value = "{{{risco_fraude_response_id_value}}}")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{risco_fraude_response_id_tipo_resolucao_value}}}
   **/
  @ApiModelProperty(value = "{{{risco_fraude_response_id_tipo_resolucao_value}}}")
  public Long getIdTipoResolucao() {
    return idTipoResolucao;
  }
  public void setIdTipoResolucao(Long idTipoResolucao) {
    this.idTipoResolucao = idTipoResolucao;
  }

  
  /**
   * {{{risco_fraude_response_descricao_tipo_resolucao_value}}}
   **/
  @ApiModelProperty(value = "{{{risco_fraude_response_descricao_tipo_resolucao_value}}}")
  public String getDescricaoTipoResolucao() {
    return descricaoTipoResolucao;
  }
  public void setDescricaoTipoResolucao(String descricaoTipoResolucao) {
    this.descricaoTipoResolucao = descricaoTipoResolucao;
  }

  
  /**
   * {{{risco_fraude_response_flag_alto_risco_value}}}
   **/
  @ApiModelProperty(value = "{{{risco_fraude_response_flag_alto_risco_value}}}")
  public Boolean getFlagAltoRisco() {
    return flagAltoRisco;
  }
  public void setFlagAltoRisco(Boolean flagAltoRisco) {
    this.flagAltoRisco = flagAltoRisco;
  }

  
  /**
   * {{{risco_fraude_response_id_conta_value}}}
   **/
  @ApiModelProperty(value = "{{{risco_fraude_response_id_conta_value}}}")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * {{{risco_fraude_response_id_cartao_value}}}
   **/
  @ApiModelProperty(value = "{{{risco_fraude_response_id_cartao_value}}}")
  public Long getIdCartao() {
    return idCartao;
  }
  public void setIdCartao(Long idCartao) {
    this.idCartao = idCartao;
  }

  
  /**
   * {{{risco_fraude_response_id_transacao_value}}}
   **/
  @ApiModelProperty(value = "{{{risco_fraude_response_id_transacao_value}}}")
  public Long getIdTransacao() {
    return idTransacao;
  }
  public void setIdTransacao(Long idTransacao) {
    this.idTransacao = idTransacao;
  }

  
  /**
   * {{{risco_fraude_response_data_transacao_value}}}
   **/
  @ApiModelProperty(value = "{{{risco_fraude_response_data_transacao_value}}}")
  public String getDataTransacao() {
    return dataTransacao;
  }
  public void setDataTransacao(String dataTransacao) {
    this.dataTransacao = dataTransacao;
  }

  
  /**
   * {{{risco_fraude_response_valor_transacao_value}}}
   **/
  @ApiModelProperty(value = "{{{risco_fraude_response_valor_transacao_value}}}")
  public BigDecimal getValorTransacao() {
    return valorTransacao;
  }
  public void setValorTransacao(BigDecimal valorTransacao) {
    this.valorTransacao = valorTransacao;
  }

  
  /**
   * {{{risco_fraude_response_nome_estabelecimento_value}}}
   **/
  @ApiModelProperty(value = "{{{risco_fraude_response_nome_estabelecimento_value}}}")
  public String getNomeEstabelecimento() {
    return nomeEstabelecimento;
  }
  public void setNomeEstabelecimento(String nomeEstabelecimento) {
    this.nomeEstabelecimento = nomeEstabelecimento;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class RiscoFraudeResponseValue {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  idTipoResolucao: ").append(idTipoResolucao).append("\n");
    sb.append("  descricaoTipoResolucao: ").append(descricaoTipoResolucao).append("\n");
    sb.append("  flagAltoRisco: ").append(flagAltoRisco).append("\n");
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  idCartao: ").append(idCartao).append("\n");
    sb.append("  idTransacao: ").append(idTransacao).append("\n");
    sb.append("  dataTransacao: ").append(dataTransacao).append("\n");
    sb.append("  valorTransacao: ").append(valorTransacao).append("\n");
    sb.append("  nomeEstabelecimento: ").append(nomeEstabelecimento).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


