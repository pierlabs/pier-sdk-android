package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Representa\u00E7\u00E3o de objeto de refer\u00EAncia por Id.
 **/
@ApiModel(description = "Representa\u00E7\u00E3o de objeto de refer\u00EAncia por Id.")
public class ReferenciaIdPersist  {
  
  @SerializedName("id")
  private Long id = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReferenciaIdPersist {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
