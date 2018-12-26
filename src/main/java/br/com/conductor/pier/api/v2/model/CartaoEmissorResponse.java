package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Representa a resposta de um cart\u00E3o
 **/
@ApiModel(description = "Representa a resposta de um cart\u00E3o")
public class CartaoEmissorResponse  {
  
  @SerializedName("id")
  private Long id = null;

  
  /**
   * Id do cart\u00E3o
   **/
  @ApiModelProperty(value = "Id do cart\u00E3o")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CartaoEmissorResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
