package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Representation Object Response for encryption key
 **/
@ApiModel(description = "Representation Object Response for encryption key")
public class ChaveCriptografiaResponse  {
  
  @SerializedName("conteudo")
  private String conteudo = null;

  
  /**
   * text
   **/
  @ApiModelProperty(value = "text")
  public String getConteudo() {
    return conteudo;
  }
  public void setConteudo(String conteudo) {
    this.conteudo = conteudo;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChaveCriptografiaResponse {\n");
    
    sb.append("  conteudo: ").append(conteudo).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
