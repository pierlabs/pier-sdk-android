package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Response Representation of the StatusTypeOpportunityAUD resource
 **/
@ApiModel(description = "Response Representation of the StatusTypeOpportunityAUD resource")
public class StatusOportunidadeAUDResponse  {
  
  @SerializedName("rev")
  private Long rev = null;
  @SerializedName("revType")
  private Long revType = null;
  @SerializedName("revDate")
  private String revDate = null;
  @SerializedName("id")
  private Long id = null;
  @SerializedName("idTipoOportunidade")
  private Long idTipoOportunidade = null;
  @SerializedName("nome")
  private String nome = null;
  @SerializedName("descricao")
  private String descricao = null;
  @SerializedName("flagAtivo")
  private Boolean flagAtivo = null;

  
  /**
   * Identifer code of the auditorial of the opportunity types
   **/
  @ApiModelProperty(value = "Identifer code of the auditorial of the opportunity types")
  public Long getRev() {
    return rev;
  }
  public void setRev(Long rev) {
    this.rev = rev;
  }

  
  /**
   * code that represent the action type made in the resource of opportunity type
   **/
  @ApiModelProperty(value = "code that represent the action type made in the resource of opportunity type")
  public Long getRevType() {
    return revType;
  }
  public void setRevType(Long revType) {
    this.revType = revType;
  }

  
  /**
   * Action date made in the resource of opportunity types
   **/
  @ApiModelProperty(value = "Action date made in the resource of opportunity types")
  public String getRevDate() {
    return revDate;
  }
  public void setRevDate(String revDate) {
    this.revDate = revDate;
  }

  
  /**
   * Identifier Code of the StatusOpportunity
   **/
  @ApiModelProperty(value = "Identifier Code of the StatusOpportunity")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Identifier Code of the TypeOpportunity
   **/
  @ApiModelProperty(value = "Identifier Code of the TypeOpportunity")
  public Long getIdTipoOportunidade() {
    return idTipoOportunidade;
  }
  public void setIdTipoOportunidade(Long idTipoOportunidade) {
    this.idTipoOportunidade = idTipoOportunidade;
  }

  
  /**
   * Name of the opportunity status
   **/
  @ApiModelProperty(value = "Name of the opportunity status")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * Description of the StatusOpportunity
   **/
  @ApiModelProperty(value = "Description of the StatusOpportunity")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   * Flag that represent if the opportunity type is active
   **/
  @ApiModelProperty(value = "Flag that represent if the opportunity type is active")
  public Boolean getFlagAtivo() {
    return flagAtivo;
  }
  public void setFlagAtivo(Boolean flagAtivo) {
    this.flagAtivo = flagAtivo;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatusOportunidadeAUDResponse {\n");
    
    sb.append("  rev: ").append(rev).append("\n");
    sb.append("  revType: ").append(revType).append("\n");
    sb.append("  revDate: ").append(revDate).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  idTipoOportunidade: ").append(idTipoOportunidade).append("\n");
    sb.append("  nome: ").append(nome).append("\n");
    sb.append("  descricao: ").append(descricao).append("\n");
    sb.append("  flagAtivo: ").append(flagAtivo).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
