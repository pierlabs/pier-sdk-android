package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Represents a card response
 **/
@ApiModel(description = "Represents a card response")
public class CartaoEmissorResponse  {
  
  @SerializedName("id")
  private Long id = null;

  
  /**
   * Card id
   **/
  @ApiModelProperty(value = "Card id")
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
