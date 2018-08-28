package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{estagio_cartao_update_id}}}
 **/
@ApiModel(description = "{{{estagio_cartao_update_id}}}")
public class EstagioCartaoUpdate  {
  
  @SerializedName("id")
  private Long id = null;

  
  /**
   * {{{estagio_cartao_update_id_value}}}
   **/
  @ApiModelProperty(value = "{{{estagio_cartao_update_id_value}}}")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EstagioCartaoUpdate {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
