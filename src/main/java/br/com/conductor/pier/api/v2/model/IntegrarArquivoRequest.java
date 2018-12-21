package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Request Object of file integration
 **/
@ApiModel(description = "Request Object of file integration")
public class IntegrarArquivoRequest  {
  
  @SerializedName("numeroReceitaFederal")
  private String numeroReceitaFederal = null;

  
  /**
   * IRs number (CPF) linked to one or more files that will be sent to be integrated
   **/
  @ApiModelProperty(value = "IRs number (CPF) linked to one or more files that will be sent to be integrated")
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
