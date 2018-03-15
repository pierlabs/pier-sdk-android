package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto de requisi\u00E7\u00E3o da integra\u00E7\u00E3o de Arquivos.
 **/
@ApiModel(description = "Objeto de requisi\u00E7\u00E3o da integra\u00E7\u00E3o de Arquivos.")
public class IntegrarArquivoRequest  {
  
  @SerializedName("numeroReceitaFederal")
  private String numeroReceitaFederal = null;

  
  /**
   * N\u00FAmero Receita Federal (CPF) vinculado a um ou mais arquivos que ser\u00E3o enviados para realizar integra\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "N\u00FAmero Receita Federal (CPF) vinculado a um ou mais arquivos que ser\u00E3o enviados para realizar integra\u00E7\u00E3o")
  public String getNumeroReceitaFederal() {
    return numeroReceitaFederal;
  }
  public void setNumeroReceitaFederal(String numeroReceitaFederal) {
    this.numeroReceitaFederal = numeroReceitaFederal;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntegrarArquivoRequest {\n");
    
    sb.append("  numeroReceitaFederal: ").append(numeroReceitaFederal).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
