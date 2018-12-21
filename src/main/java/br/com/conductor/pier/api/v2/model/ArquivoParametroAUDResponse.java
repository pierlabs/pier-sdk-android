package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Object Auditorial Response of the files parameters
 **/
@ApiModel(description = "Object Auditorial Response of the files parameters")
public class ArquivoParametroAUDResponse  {
  
  @SerializedName("rev")
  private Long rev = null;
  @SerializedName("revType")
  private Integer revType = null;
  @SerializedName("id")
  private String id = null;
  @SerializedName("parametro")
  private String parametro = null;
  @SerializedName("conteudo")
  private String conteudo = null;
  @SerializedName("dataHoraInclusao")
  private String dataHoraInclusao = null;
  @SerializedName("dataHoraAlteracao")
  private String dataHoraAlteracao = null;

  
  /**
   * Identifier of the auditorial file
   **/
  @ApiModelProperty(value = "Identifier of the auditorial file")
  public Long getRev() {
    return rev;
  }
  public void setRev(Long rev) {
    this.rev = rev;
  }

  
  /**
   * Identifier of auditorail type (0 - Created, 1 - Updated, 2 - Excluded)
   **/
  @ApiModelProperty(value = "Identifier of auditorail type (0 - Created, 1 - Updated, 2 - Excluded)")
  public Integer getRevType() {
    return revType;
  }
  public void setRevType(Integer revType) {
    this.revType = revType;
  }

  
  /**
   * Identifier of the parameter
   **/
  @ApiModelProperty(value = "Identifier of the parameter")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * Name of the parameter
   **/
  @ApiModelProperty(value = "Name of the parameter")
  public String getParametro() {
    return parametro;
  }
  public void setParametro(String parametro) {
    this.parametro = parametro;
  }

  
  /**
   * Content of the parameter
   **/
  @ApiModelProperty(value = "Content of the parameter")
  public String getConteudo() {
    return conteudo;
  }
  public void setConteudo(String conteudo) {
    this.conteudo = conteudo;
  }

  
  /**
   * Date of inclusion of the parameter
   **/
  @ApiModelProperty(value = "Date of inclusion of the parameter")
  public String getDataHoraInclusao() {
    return dataHoraInclusao;
  }
  public void setDataHoraInclusao(String dataHoraInclusao) {
    this.dataHoraInclusao = dataHoraInclusao;
  }

  
  /**
   * Date of the update of the parameter
   **/
  @ApiModelProperty(value = "Date of the update of the parameter")
  public String getDataHoraAlteracao() {
    return dataHoraAlteracao;
  }
  public void setDataHoraAlteracao(String dataHoraAlteracao) {
    this.dataHoraAlteracao = dataHoraAlteracao;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArquivoParametroAUDResponse {\n");
    
    sb.append("  rev: ").append(rev).append("\n");
    sb.append("  revType: ").append(revType).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  parametro: ").append(parametro).append("\n");
    sb.append("  conteudo: ").append(conteudo).append("\n");
    sb.append("  dataHoraInclusao: ").append(dataHoraInclusao).append("\n");
    sb.append("  dataHoraAlteracao: ").append(dataHoraAlteracao).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
