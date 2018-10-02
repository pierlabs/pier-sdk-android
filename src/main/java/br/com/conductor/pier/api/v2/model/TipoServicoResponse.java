package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{tipo_servico_response_description}}}
 **/
@ApiModel(description = "{{{tipo_servico_response_description}}}")
public class TipoServicoResponse  {
  
  @SerializedName("descricao")
  private String descricao = null;
  @SerializedName("id")
  private Long id = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   * {{{tipo_servico_response_id_value}}}
   **/
  @ApiModelProperty(value = "{{{tipo_servico_response_id_value}}}")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TipoServicoResponse {\n");
    
    sb.append("  descricao: ").append(descricao).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
