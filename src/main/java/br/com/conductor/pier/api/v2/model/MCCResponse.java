package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * ObjetoMCC
 **/
@ApiModel(description = "ObjetoMCC")
public class MCCResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("descricao")
  private String descricao = null;
  @SerializedName("grupoMCCId")
  private Long grupoMCCId = null;
  @SerializedName("grupoMCCDescricao")
  private String grupoMCCDescricao = null;

  
  /**
   * C\u00F3digo de Identifica\u00E7\u00E3o do MCC (id)
   **/
  @ApiModelProperty(value = "C\u00F3digo de Identifica\u00E7\u00E3o do MCC (id)")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * descricao do MCC
   **/
  @ApiModelProperty(value = "descricao do MCC")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   * C\u00F3digo de indentifica\u00E7\u00E3o do grupo MCC
   **/
  @ApiModelProperty(value = "C\u00F3digo de indentifica\u00E7\u00E3o do grupo MCC")
  public Long getGrupoMCCId() {
    return grupoMCCId;
  }
  public void setGrupoMCCId(Long grupoMCCId) {
    this.grupoMCCId = grupoMCCId;
  }

  
  /**
   * Descri\u00E7\u00E3o do grupo MCC
   **/
  @ApiModelProperty(value = "Descri\u00E7\u00E3o do grupo MCC")
  public String getGrupoMCCDescricao() {
    return grupoMCCDescricao;
  }
  public void setGrupoMCCDescricao(String grupoMCCDescricao) {
    this.grupoMCCDescricao = grupoMCCDescricao;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class MCCResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  descricao: ").append(descricao).append("\n");
    sb.append("  grupoMCCId: ").append(grupoMCCId).append("\n");
    sb.append("  grupoMCCDescricao: ").append(grupoMCCDescricao).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
