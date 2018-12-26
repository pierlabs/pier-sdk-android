package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Representa a resposta de uma aplica\u00E7\u00E3o mobile
 **/
@ApiModel(description = "Representa a resposta de uma aplica\u00E7\u00E3o mobile")
public class AplicacaoMobileEmissorResponse  {
  
  @SerializedName("id")
  private Long id = null;

  
  /**
   * Id da aplica\u00E7\u00E3o mobile
   **/
  @ApiModelProperty(value = "Id da aplica\u00E7\u00E3o mobile")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AplicacaoMobileEmissorResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
