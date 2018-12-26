package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Represeta o objeto resposta de Chave Criptografia
 **/
@ApiModel(description = "Represeta o objeto resposta de Chave Criptografia")
public class ChaveCriptografiaResponse  {
  
  @SerializedName("conteudo")
  private String conteudo = null;

  
  /**
   * texto
   **/
  @ApiModelProperty(value = "texto")
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
