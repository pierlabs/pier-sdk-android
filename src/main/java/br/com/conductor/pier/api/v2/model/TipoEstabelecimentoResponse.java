package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{tipo_estabelecimento_response_description}}}
 **/
@ApiModel(description = "{{{tipo_estabelecimento_response_description}}}")
public class TipoEstabelecimentoResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("descricao")
  private String descricao = null;

  
  /**
   * {{{tipo_estabelecimento_response_id_value}}}
   **/
  @ApiModelProperty(value = "{{{tipo_estabelecimento_response_id_value}}}")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{tipo_estabelecimento_response_descricao_value}}}
   **/
  @ApiModelProperty(value = "{{{tipo_estabelecimento_response_descricao_value}}}")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TipoEstabelecimentoResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  descricao: ").append(descricao).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
