package br.com.conductor.pier.api.v2.model;

import br.com.conductor.pier.api.v2.model.ArquivoParametroAUDResponse;
import java.util.*;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Object Response of the file auditorial
 **/
@ApiModel(description = "Object Response of the file auditorial")
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
   * Identifier of the auditorail File
   **/
  @ApiModelProperty(value = "Identifier of the auditorail File")
  public Long getRev() {
    return rev;
  }
  public void setRev(Long rev) {
    this.rev = rev;
  }

  
  /**
   * Identifier of the auditorial type (0 - Created, 1 - Updated, 2 - Excluded)
   **/
  @ApiModelProperty(value = "Identifier of the auditorial type (0 - Created, 1 - Updated, 2 - Excluded)")
  public Integer getRevType() {
    return revType;
  }
  public void setRevType(Integer revType) {
    this.revType = revType;
  }

  
  /**
   * Identifier of the audited file
   **/
  @ApiModelProperty(value = "Identifier of the audited file")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * File name audited
   **/
  @ApiModelProperty(value = "File name audited")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * Identifier of the answer of the Digital Access
   **/
  @ApiModelProperty(value = "Identifier of the answer of the Digital Access")
  public String getIdRespostaAcessoDigital() {
    return idRespostaAcessoDigital;
  }
  public void setIdRespostaAcessoDigital(String idRespostaAcessoDigital) {
    this.idRespostaAcessoDigital = idRespostaAcessoDigital;
  }

  
  /**
   * Date of response of the Digital Access
   **/
  @ApiModelProperty(value = "Date of response of the Digital Access")
  public String getDataHoraRespostaAcessoDigital() {
    return dataHoraRespostaAcessoDigital;
  }
  public void setDataHoraRespostaAcessoDigital(String dataHoraRespostaAcessoDigital) {
    this.dataHoraRespostaAcessoDigital = dataHoraRespostaAcessoDigital;
  }

  
  /**
   * Identifier of the response of Neurotech
   **/
  @ApiModelProperty(value = "Identifier of the response of Neurotech")
  public String getIdRespostaNeurotech() {
    return idRespostaNeurotech;
  }
  public void setIdRespostaNeurotech(String idRespostaNeurotech) {
    this.idRespostaNeurotech = idRespostaNeurotech;
  }

  
  /**
   * Date of response of the Neurotech
   **/
  @ApiModelProperty(value = "Date of response of the Neurotech")
  public String getDataHoraRespostaNeurotech() {
    return dataHoraRespostaNeurotech;
  }
  public void setDataHoraRespostaNeurotech(String dataHoraRespostaNeurotech) {
    this.dataHoraRespostaNeurotech = dataHoraRespostaNeurotech;
  }

  
  /**
   * Uri of access
   **/
  @ApiModelProperty(value = "Uri of access")
  public String getUri() {
    return uri;
  }
  public void setUri(String uri) {
    this.uri = uri;
  }

  
  /**
   * Date of inclusion of the audited file
   **/
  @ApiModelProperty(value = "Date of inclusion of the audited file")
  public String getDataHoraInclusao() {
    return dataHoraInclusao;
  }
  public void setDataHoraInclusao(String dataHoraInclusao) {
    this.dataHoraInclusao = dataHoraInclusao;
  }

  
  /**
   * Date of the audited file update
   **/
  @ApiModelProperty(value = "Date of the audited file update")
  public String getDataHoraAlteracao() {
    return dataHoraAlteracao;
  }
  public void setDataHoraAlteracao(String dataHoraAlteracao) {
    this.dataHoraAlteracao = dataHoraAlteracao;
  }

  
  /**
   * Extension of the audited file
   **/
  @ApiModelProperty(value = "Extension of the audited file")
  public String getExtensao() {
    return extensao;
  }
  public void setExtensao(String extensao) {
    this.extensao = extensao;
  }

  
  /**
   * List of parameter of the audited file
   **/
  @ApiModelProperty(value = "List of parameter of the audited file")
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
