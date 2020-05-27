package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Representa o objeto de resposta da consulta da senha do cart\u00E3o
 **/
@ApiModel(description = "Representa o objeto de resposta da consulta da senha do cart\u00E3o")
public class ConsultarSenhaCartaoResponse  {
  
  @SerializedName("senha")
  private String senha = null;

  
  /**
   * Senha
   **/
  @ApiModelProperty(value = "Senha")
  public String getSenha() {
    return senha;
  }
  public void setSenha(String senha) {
    this.senha = senha;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsultarSenhaCartaoResponse {\n");
    
    sb.append("  senha: ").append(senha).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
