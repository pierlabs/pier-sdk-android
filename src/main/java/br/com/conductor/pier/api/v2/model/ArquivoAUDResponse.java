package br.com.conductor.pier.api.v2.model;

import br.com.conductor.pier.api.v2.model.ArquivoParametroAUDResponse;
import java.util.*;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto Response da auditoria do arquivo.
 **/
@ApiModel(description = "Objeto Response da auditoria do arquivo.")
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
   * Identificador da auditoria arquivo
   **/
  @ApiModelProperty(value = "Identificador da auditoria arquivo")
  public Long getRev() {
    return rev;
  }
  public void setRev(Long rev) {
    this.rev = rev;
  }

  
  /**
   * Identificador do tipo de auditoria (0 - Criado, 1 - Alterado, 2 - Exclu\u00EDdo)
   **/
  @ApiModelProperty(value = "Identificador do tipo de auditoria (0 - Criado, 1 - Alterado, 2 - Exclu\u00EDdo)")
  public Integer getRevType() {
    return revType;
  }
  public void setRevType(Integer revType) {
    this.revType = revType;
  }

  
  /**
   * Identificador do arquivo auditado
   **/
  @ApiModelProperty(value = "Identificador do arquivo auditado")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Nome do arquivo auditado
   **/
  @ApiModelProperty(value = "Nome do arquivo auditado")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * Identificador da resposta da Acesso Digital
   **/
  @ApiModelProperty(value = "Identificador da resposta da Acesso Digital")
  public String getIdRespostaAcessoDigital() {
    return idRespostaAcessoDigital;
  }
  public void setIdRespostaAcessoDigital(String idRespostaAcessoDigital) {
    this.idRespostaAcessoDigital = idRespostaAcessoDigital;
  }

  
  /**
   * Data de resposta da Acesso Digital
   **/
  @ApiModelProperty(value = "Data de resposta da Acesso Digital")
  public String getDataHoraRespostaAcessoDigital() {
    return dataHoraRespostaAcessoDigital;
  }
  public void setDataHoraRespostaAcessoDigital(String dataHoraRespostaAcessoDigital) {
    this.dataHoraRespostaAcessoDigital = dataHoraRespostaAcessoDigital;
  }

  
  /**
   * Identificador da resposta da Neurotech
   **/
  @ApiModelProperty(value = "Identificador da resposta da Neurotech")
  public String getIdRespostaNeurotech() {
    return idRespostaNeurotech;
  }
  public void setIdRespostaNeurotech(String idRespostaNeurotech) {
    this.idRespostaNeurotech = idRespostaNeurotech;
  }

  
  /**
   * Data de resposta da Neurotech
   **/
  @ApiModelProperty(value = "Data de resposta da Neurotech")
  public String getDataHoraRespostaNeurotech() {
    return dataHoraRespostaNeurotech;
  }
  public void setDataHoraRespostaNeurotech(String dataHoraRespostaNeurotech) {
    this.dataHoraRespostaNeurotech = dataHoraRespostaNeurotech;
  }

  
  /**
   * Uri de acesso
   **/
  @ApiModelProperty(value = "Uri de acesso")
  public String getUri() {
    return uri;
  }
  public void setUri(String uri) {
    this.uri = uri;
  }

  
  /**
   * Data de inclus\u00E3o do arquivo auditado
   **/
  @ApiModelProperty(value = "Data de inclus\u00E3o do arquivo auditado")
  public String getDataHoraInclusao() {
    return dataHoraInclusao;
  }
  public void setDataHoraInclusao(String dataHoraInclusao) {
    this.dataHoraInclusao = dataHoraInclusao;
  }

  
  /**
   * Data de altera\u00E7\u00E3o do arquivo auditado
   **/
  @ApiModelProperty(value = "Data de altera\u00E7\u00E3o do arquivo auditado")
  public String getDataHoraAlteracao() {
    return dataHoraAlteracao;
  }
  public void setDataHoraAlteracao(String dataHoraAlteracao) {
    this.dataHoraAlteracao = dataHoraAlteracao;
  }

  
  /**
   * Extens\u00E3o do arquivo auditado
   **/
  @ApiModelProperty(value = "Extens\u00E3o do arquivo auditado")
  public String getExtensao() {
    return extensao;
  }
  public void setExtensao(String extensao) {
    this.extensao = extensao;
  }

  
  /**
   * Lista  de par\u00E2metros do arquivo auditado
   **/
  @ApiModelProperty(value = "Lista  de par\u00E2metros do arquivo auditado")
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
