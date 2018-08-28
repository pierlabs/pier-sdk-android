package br.com.conductor.pier.api.v2.model;

import br.com.conductor.pier.api.v2.model.ArquivoParametroAUDResponse;
import java.util.*;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{arquivo_a_u_d_response_description}}}
 **/
@ApiModel(description = "{{{arquivo_a_u_d_response_description}}}")
public class ArquivoAUDResponse  {
  
  @SerializedName("rev")
  private Long rev = null;
  @SerializedName("revType")
  private Integer revType = null;
  @SerializedName("id")
  private Long id = null;
  @SerializedName("nome")
  private String nome = null;
  @SerializedName("idRespostaAcessoDigital")
  private String idRespostaAcessoDigital = null;
  @SerializedName("dataHoraRespostaAcessoDigital")
  private String dataHoraRespostaAcessoDigital = null;
  @SerializedName("idRespostaNeurotech")
  private String idRespostaNeurotech = null;
  @SerializedName("dataHoraRespostaNeurotech")
  private String dataHoraRespostaNeurotech = null;
  @SerializedName("uri")
  private String uri = null;
  @SerializedName("dataHoraInclusao")
  private String dataHoraInclusao = null;
  @SerializedName("dataHoraAlteracao")
  private String dataHoraAlteracao = null;
  @SerializedName("extensao")
  private String extensao = null;
  @SerializedName("parametros")
  private List<ArquivoParametroAUDResponse> parametros = null;

  
  /**
   * {{{arquivo_a_u_d_response_rev_value}}}
   **/
  @ApiModelProperty(value = "{{{arquivo_a_u_d_response_rev_value}}}")
  public Long getRev() {
    return rev;
  }
  public void setRev(Long rev) {
    this.rev = rev;
  }

  
  /**
   * {{{arquivo_a_u_d_response_rev_type_value}}}
   **/
  @ApiModelProperty(value = "{{{arquivo_a_u_d_response_rev_type_value}}}")
  public Integer getRevType() {
    return revType;
  }
  public void setRevType(Integer revType) {
    this.revType = revType;
  }

  
  /**
   * {{{arquivo_a_u_d_response_id_value}}}
   **/
  @ApiModelProperty(value = "{{{arquivo_a_u_d_response_id_value}}}")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{arquivo_a_u_d_response_nome_value}}}
   **/
  @ApiModelProperty(value = "{{{arquivo_a_u_d_response_nome_value}}}")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * {{{arquivo_a_u_d_response_id_resposta_acesso_digital_value}}}
   **/
  @ApiModelProperty(value = "{{{arquivo_a_u_d_response_id_resposta_acesso_digital_value}}}")
  public String getIdRespostaAcessoDigital() {
    return idRespostaAcessoDigital;
  }
  public void setIdRespostaAcessoDigital(String idRespostaAcessoDigital) {
    this.idRespostaAcessoDigital = idRespostaAcessoDigital;
  }

  
  /**
   * {{{arquivo_a_u_d_response_data_hora_resposta_acesso_digital_value}}}
   **/
  @ApiModelProperty(value = "{{{arquivo_a_u_d_response_data_hora_resposta_acesso_digital_value}}}")
  public String getDataHoraRespostaAcessoDigital() {
    return dataHoraRespostaAcessoDigital;
  }
  public void setDataHoraRespostaAcessoDigital(String dataHoraRespostaAcessoDigital) {
    this.dataHoraRespostaAcessoDigital = dataHoraRespostaAcessoDigital;
  }

  
  /**
   * {{{arquivo_a_u_d_response_id_resposta_neurotech_value}}}
   **/
  @ApiModelProperty(value = "{{{arquivo_a_u_d_response_id_resposta_neurotech_value}}}")
  public String getIdRespostaNeurotech() {
    return idRespostaNeurotech;
  }
  public void setIdRespostaNeurotech(String idRespostaNeurotech) {
    this.idRespostaNeurotech = idRespostaNeurotech;
  }

  
  /**
   * {{{arquivo_a_u_d_response_data_hora_resposta_neurotech_value}}}
   **/
  @ApiModelProperty(value = "{{{arquivo_a_u_d_response_data_hora_resposta_neurotech_value}}}")
  public String getDataHoraRespostaNeurotech() {
    return dataHoraRespostaNeurotech;
  }
  public void setDataHoraRespostaNeurotech(String dataHoraRespostaNeurotech) {
    this.dataHoraRespostaNeurotech = dataHoraRespostaNeurotech;
  }

  
  /**
   * {{{arquivo_a_u_d_response_uri_value}}}
   **/
  @ApiModelProperty(value = "{{{arquivo_a_u_d_response_uri_value}}}")
  public String getUri() {
    return uri;
  }
  public void setUri(String uri) {
    this.uri = uri;
  }

  
  /**
   * {{{arquivo_a_u_d_response_data_hora_inclusao_value}}}
   **/
  @ApiModelProperty(value = "{{{arquivo_a_u_d_response_data_hora_inclusao_value}}}")
  public String getDataHoraInclusao() {
    return dataHoraInclusao;
  }
  public void setDataHoraInclusao(String dataHoraInclusao) {
    this.dataHoraInclusao = dataHoraInclusao;
  }

  
  /**
   * {{{arquivo_a_u_d_response_data_hora_alteracao_value}}}
   **/
  @ApiModelProperty(value = "{{{arquivo_a_u_d_response_data_hora_alteracao_value}}}")
  public String getDataHoraAlteracao() {
    return dataHoraAlteracao;
  }
  public void setDataHoraAlteracao(String dataHoraAlteracao) {
    this.dataHoraAlteracao = dataHoraAlteracao;
  }

  
  /**
   * {{{arquivo_a_u_d_response_extensao_value}}}
   **/
  @ApiModelProperty(value = "{{{arquivo_a_u_d_response_extensao_value}}}")
  public String getExtensao() {
    return extensao;
  }
  public void setExtensao(String extensao) {
    this.extensao = extensao;
  }

  
  /**
   * {{{arquivo_a_u_d_response_parametros_value}}}
   **/
  @ApiModelProperty(value = "{{{arquivo_a_u_d_response_parametros_value}}}")
  public List<ArquivoParametroAUDResponse> getParametros() {
    return parametros;
  }
  public void setParametros(List<ArquivoParametroAUDResponse> parametros) {
    this.parametros = parametros;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArquivoAUDResponse {\n");
    
    sb.append("  rev: ").append(rev).append("\n");
    sb.append("  revType: ").append(revType).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  nome: ").append(nome).append("\n");
    sb.append("  idRespostaAcessoDigital: ").append(idRespostaAcessoDigital).append("\n");
    sb.append("  dataHoraRespostaAcessoDigital: ").append(dataHoraRespostaAcessoDigital).append("\n");
    sb.append("  idRespostaNeurotech: ").append(idRespostaNeurotech).append("\n");
    sb.append("  dataHoraRespostaNeurotech: ").append(dataHoraRespostaNeurotech).append("\n");
    sb.append("  uri: ").append(uri).append("\n");
    sb.append("  dataHoraInclusao: ").append(dataHoraInclusao).append("\n");
    sb.append("  dataHoraAlteracao: ").append(dataHoraAlteracao).append("\n");
    sb.append("  extensao: ").append(extensao).append("\n");
    sb.append("  parametros: ").append(parametros).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
