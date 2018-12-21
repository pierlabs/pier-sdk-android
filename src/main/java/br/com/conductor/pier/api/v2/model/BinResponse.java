package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{bin_response_description}}}
 **/
@ApiModel(description = "{{{bin_response_description}}}")
public class BinResponse  {
  
  @SerializedName("id")
  private Long id = null;

  
  /**
   * {{{bin_response_id_value}}}
   **/
  @ApiModelProperty(value = "{{{bin_response_id_value}}}")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class BinResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
