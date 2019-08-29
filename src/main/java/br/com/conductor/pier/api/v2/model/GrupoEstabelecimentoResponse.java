package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Representa\u00E7\u00E3o da resposta do recurso de grupo estabelecimento
 **/
@ApiModel(description = "Representa\u00E7\u00E3o da resposta do recurso de grupo estabelecimento")
public class GrupoEstabelecimentoResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("descricao")
  private String descricao = null;
  @SerializedName("idLayout")
  private Long idLayout = null;

  
  /**
   * C\u00F3digo identificador do grupo de estabelecimento
   **/
  @ApiModelProperty(value = "C\u00F3digo identificador do grupo de estabelecimento")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Descri\u00E7\u00E3o do grupo de estabelecimento
   **/
  @ApiModelProperty(value = "Descri\u00E7\u00E3o do grupo de estabelecimento")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   * idLayout
   **/
  @ApiModelProperty(value = "idLayout")
  public Long getIdLayout() {
    return idLayout;
  }
  public void setIdLayout(Long idLayout) {
    this.idLayout = idLayout;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class GrupoEstabelecimentoResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  descricao: ").append(descricao).append("\n");
    sb.append("  idLayout: ").append(idLayout).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
