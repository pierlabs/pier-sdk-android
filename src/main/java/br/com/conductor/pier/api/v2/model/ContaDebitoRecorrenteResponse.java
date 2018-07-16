package br.com.conductor.pier.api.v2.model;



import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * {{{conta_debito_recorrente_response_description}}}
 **/
@ApiModel(description = "{{{conta_debito_recorrente_response_description}}}")
public class ContaDebitoRecorrenteResponse  {
  
  @SerializedName("ativo")
  private Boolean ativo = null;
  @SerializedName("dataHoraFim")
  private String dataHoraFim = null;
  @SerializedName("dataHoraInicio")
  private String dataHoraInicio = null;
  @SerializedName("dataHoraUltimoPagamento")
  private String dataHoraUltimoPagamento = null;
  @SerializedName("descricao")
  private String descricao = null;
  @SerializedName("idConta")
  private Long idConta = null;
  @SerializedName("idContaDebitoRecorrente")
  private Long idContaDebitoRecorrente = null;
  @SerializedName("idTipoDebitoRecorrente")
  private Long idTipoDebitoRecorrente = null;
  @SerializedName("idUsuario")
  private Long idUsuario = null;
  @SerializedName("login")
  private String login = null;
  @SerializedName("numeroParcelas")
  private Integer numeroParcelas = null;
  @SerializedName("origem")
  private String origem = null;

  
  /**
   * {{{conta_debito_recorrente_response_ativo_value}}}
   **/
  @ApiModelProperty(value = "{{{conta_debito_recorrente_response_ativo_value}}}")
  public Boolean getAtivo() {
    return ativo;
  }
  public void setAtivo(Boolean ativo) {
    this.ativo = ativo;
  }

  
  /**
   * {{{conta_debito_recorrente_response_data_hora_fim_value}}}
   **/
  @ApiModelProperty(value = "{{{conta_debito_recorrente_response_data_hora_fim_value}}}")
  public String getDataHoraFim() {
    return dataHoraFim;
  }
  public void setDataHoraFim(String dataHoraFim) {
    this.dataHoraFim = dataHoraFim;
  }

  
  /**
   * {{{conta_debito_recorrente_response_data_hora_inicio_value}}}
   **/
  @ApiModelProperty(value = "{{{conta_debito_recorrente_response_data_hora_inicio_value}}}")
  public String getDataHoraInicio() {
    return dataHoraInicio;
  }
  public void setDataHoraInicio(String dataHoraInicio) {
    this.dataHoraInicio = dataHoraInicio;
  }

  
  /**
   * {{{conta_debito_recorrente_response_data_hora_ultimo_pagamento_value}}}
   **/
  @ApiModelProperty(value = "{{{conta_debito_recorrente_response_data_hora_ultimo_pagamento_value}}}")
  public String getDataHoraUltimoPagamento() {
    return dataHoraUltimoPagamento;
  }
  public void setDataHoraUltimoPagamento(String dataHoraUltimoPagamento) {
    this.dataHoraUltimoPagamento = dataHoraUltimoPagamento;
  }

  
  /**
   * {{{conta_debito_recorrente_response_descricao_value}}}
   **/
  @ApiModelProperty(value = "{{{conta_debito_recorrente_response_descricao_value}}}")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   * {{{conta_debito_recorrente_response_id_conta_value}}}
   **/
  @ApiModelProperty(value = "{{{conta_debito_recorrente_response_id_conta_value}}}")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * {{{conta_debito_recorrente_response_id_conta_debito_recorrente_value}}}
   **/
  @ApiModelProperty(value = "{{{conta_debito_recorrente_response_id_conta_debito_recorrente_value}}}")
  public Long getIdContaDebitoRecorrente() {
    return idContaDebitoRecorrente;
  }
  public void setIdContaDebitoRecorrente(Long idContaDebitoRecorrente) {
    this.idContaDebitoRecorrente = idContaDebitoRecorrente;
  }

  
  /**
   * {{{conta_debito_recorrente_response_id_tipo_debito_recorrente_value}}}
   **/
  @ApiModelProperty(value = "{{{conta_debito_recorrente_response_id_tipo_debito_recorrente_value}}}")
  public Long getIdTipoDebitoRecorrente() {
    return idTipoDebitoRecorrente;
  }
  public void setIdTipoDebitoRecorrente(Long idTipoDebitoRecorrente) {
    this.idTipoDebitoRecorrente = idTipoDebitoRecorrente;
  }

  
  /**
   * {{{conta_debito_recorrente_response_id_usuario_value}}}
   **/
  @ApiModelProperty(value = "{{{conta_debito_recorrente_response_id_usuario_value}}}")
  public Long getIdUsuario() {
    return idUsuario;
  }
  public void setIdUsuario(Long idUsuario) {
    this.idUsuario = idUsuario;
  }

  
  /**
   * {{{conta_debito_recorrente_response_id_login_value}}}
   **/
  @ApiModelProperty(value = "{{{conta_debito_recorrente_response_id_login_value}}}")
  public String getLogin() {
    return login;
  }
  public void setLogin(String login) {
    this.login = login;
  }

  
  /**
   * {{{conta_debito_recorrente_response_num_parcelas_value}}}
   **/
  @ApiModelProperty(value = "{{{conta_debito_recorrente_response_num_parcelas_value}}}")
  public Integer getNumeroParcelas() {
    return numeroParcelas;
  }
  public void setNumeroParcelas(Integer numeroParcelas) {
    this.numeroParcelas = numeroParcelas;
  }

  
  /**
   * {{{conta_debito_recorrente_response_origem_value}}}
   **/
  @ApiModelProperty(value = "{{{conta_debito_recorrente_response_origem_value}}}")
  public String getOrigem() {
    return origem;
  }
  public void setOrigem(String origem) {
    this.origem = origem;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContaDebitoRecorrenteResponse {\n");
    
    sb.append("  ativo: ").append(ativo).append("\n");
    sb.append("  dataHoraFim: ").append(dataHoraFim).append("\n");
    sb.append("  dataHoraInicio: ").append(dataHoraInicio).append("\n");
    sb.append("  dataHoraUltimoPagamento: ").append(dataHoraUltimoPagamento).append("\n");
    sb.append("  descricao: ").append(descricao).append("\n");
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  idContaDebitoRecorrente: ").append(idContaDebitoRecorrente).append("\n");
    sb.append("  idTipoDebitoRecorrente: ").append(idTipoDebitoRecorrente).append("\n");
    sb.append("  idUsuario: ").append(idUsuario).append("\n");
    sb.append("  login: ").append(login).append("\n");
    sb.append("  numeroParcelas: ").append(numeroParcelas).append("\n");
    sb.append("  origem: ").append(origem).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


