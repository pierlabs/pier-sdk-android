package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Representa o DTO de senha para usu\u00E1rio
 **/
@ApiModel(description = "Representa o DTO de senha para usu\u00E1rio")
public class SenhaDTO  {
  
  @SerializedName("senha")
  private String senha = null;

  
  /**
   * Senha que ser\u00E1 utilizada pelo usu\u00E1rio
   **/
  @ApiModelProperty(value = "Senha que ser\u00E1 utilizada pelo usu\u00E1rio")
  public String getSenha() {
    return senha;
  }
  public void setSenha(String senha) {
    this.senha = senha;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SenhaDTO {\n");
    
    sb.append("  senha: ").append(senha).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
