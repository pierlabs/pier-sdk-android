package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class GrupoEstabelecimentoUpdate  {
  
  @SerializedName("descricao")
  private String descricao = null;
  @SerializedName("idLayout")
  private Long idLayout = null;

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Long getIdLayout() {
    return idLayout;
  }
  public void setIdLayout(Long idLayout) {
    this.idLayout = idLayout;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class GrupoEstabelecimentoUpdate {\n");
    
    sb.append("  descricao: ").append(descricao).append("\n");
    sb.append("  idLayout: ").append(idLayout).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
