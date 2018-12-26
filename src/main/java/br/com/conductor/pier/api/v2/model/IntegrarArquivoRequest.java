package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{integrar_arquivo_request_description}}}
 **/
@ApiModel(description = "{{{integrar_arquivo_request_description}}}")
public class IntegrarArquivoRequest  {
  
  @SerializedName("numeroReceitaFederal")
  private String numeroReceitaFederal = null;

  
  /**
   * {{{integrar_arquivo_request_numero_receita_federal_value}}}
   **/
  @ApiModelProperty(value = "{{{integrar_arquivo_request_numero_receita_federal_value}}}")
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
