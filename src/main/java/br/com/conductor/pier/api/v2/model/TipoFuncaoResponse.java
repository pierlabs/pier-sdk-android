package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Representa\u00E7\u00E3o para resposta de dados de Tipo Fun\u00E7\u00E3o
 **/
@ApiModel(description = "Representa\u00E7\u00E3o para resposta de dados de Tipo Fun\u00E7\u00E3o")
public class TipoFuncaoResponse  {
  
  @SerializedName("id")
  private Integer id = null;
  @SerializedName("descricao")
  private String descricao = null;

  
  /**
   * C\u00F3digo identificador do tipo fun\u00E7\u00E3o na base
   **/
  @ApiModelProperty(value = "C\u00F3digo identificador do tipo fun\u00E7\u00E3o na base")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  
  /**
   * Descricao do tipo fun\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "Descricao do tipo fun\u00E7\u00E3o")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TipoFuncaoResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  descricao: ").append(descricao).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
