package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto PlataformaMobile
 **/
@ApiModel(description = "Objeto PlataformaMobile")
public class PlatformMobilePersist  {
  
  @SerializedName("nome")
  private String nome = null;

  
  /**
   * Show the platform name
   **/
  @ApiModelProperty(value = "Show the platform name")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlatformMobilePersist {\n");
    
    sb.append("  nome: ").append(nome).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
