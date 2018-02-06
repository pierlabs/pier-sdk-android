package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto de requisi\u00C3\u00A7\u00C3\u00A3o da integra\u00C3\u00A7\u00C3\u00A3o de Arquivos.
 **/
@ApiModel(description = "Objeto de requisi\u00C3\u00A7\u00C3\u00A3o da integra\u00C3\u00A7\u00C3\u00A3o de Arquivos.")
public class IntegrarArquivoRequest  {
  
  @SerializedName("cpf")
  private String cpf = null;

  
  /**
   * CPF do cliente de Arquivos a serem integrados
   **/
  @ApiModelProperty(value = "CPF do cliente de Arquivos a serem integrados")
  public String getCpf() {
    return cpf;
  }
  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntegrarArquivoRequest {\n");
    
    sb.append("  cpf: ").append(cpf).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
