package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Response representation of the TypeOpportunityAUD resource
 **/
@ApiModel(description = "Response representation of the TypeOpportunityAUD resource")
public class TipoOportunidadeAUDResponse  {
  
  @SerializedName("rev")
  private Long rev = null;
  @SerializedName("revType")
  private Long revType = null;
  @SerializedName("revDate")
  private String revDate = null;
  @SerializedName("id")
  private Long id = null;
  @SerializedName("descricao")
  private String descricao = null;
  @SerializedName("flagAtivo")
  private Boolean flagAtivo = null;

  
  /**
   * Identifier code of the auditorial of the opportunity types
   **/
  @ApiModelProperty(value = "Identifier code of the auditorial of the opportunity types")
  public Long getRev() {
    return rev;
  }
  public void setRev(Long rev) {
    this.rev = rev;
  }

  
  /**
   * Code that represents the type of action made in theh resource of opportunity types
   **/
  @ApiModelProperty(value = "Code that represents the type of action made in theh resource of opportunity types")
  public Long getRevType() {
    return revType;
  }
  public void setRevType(Long revType) {
    this.revType = revType;
  }

  
  /**
   * Action date of the resource of opportunity types
   **/
  @ApiModelProperty(value = "Action date of the resource of opportunity types")
  public String getRevDate() {
    return revDate;
  }
  public void setRevDate(String revDate) {
    this.revDate = revDate;
  }

  
  /**
   * Identifier Code of the opportunity type which was made the action
   **/
  @ApiModelProperty(value = "Identifier Code of the opportunity type which was made the action")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Description of the opportunity type which was made the action
   **/
  @ApiModelProperty(value = "Description of the opportunity type which was made the action")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   * Attributed that represent if the opportunity type is active
   **/
  @ApiModelProperty(value = "Attributed that represent if the opportunity type is active")
  public Boolean getFlagAtivo() {
    return flagAtivo;
  }
  public void setFlagAtivo(Boolean flagAtivo) {
    this.flagAtivo = flagAtivo;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TipoOportunidadeAUDResponse {\n");
    
    sb.append("  rev: ").append(rev).append("\n");
    sb.append("  revType: ").append(revType).append("\n");
    sb.append("  revDate: ").append(revDate).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  descricao: ").append(descricao).append("\n");
    sb.append("  flagAtivo: ").append(flagAtivo).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
