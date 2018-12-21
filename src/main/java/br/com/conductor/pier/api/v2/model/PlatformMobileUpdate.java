package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Object PlatformMobile
 **/
@ApiModel(description = "Object PlatformMobile")
public class PlatformMobileUpdate  {
  
  @SerializedName("nome")
  private String nome = null;

  
  /**
   * Name of the platform
   **/
  @ApiModelProperty(required = true, value = "Name of the platform")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlatformMobileUpdate {\n");
    
    sb.append("  nome: ").append(nome).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
