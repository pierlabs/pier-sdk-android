package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * LogAcessoUsuarioResponse
 **/
@ApiModel(description = "LogAcessoUsuarioResponse")
public class LogAcessoUsuarioResponse  {
  
  @SerializedName("id")
  private Long id = null;

  
  /**
   * C\u00F3digo de mensagem inserida (id)
   **/
  @ApiModelProperty(value = "C\u00F3digo de mensagem inserida (id)")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogAcessoUsuarioResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
