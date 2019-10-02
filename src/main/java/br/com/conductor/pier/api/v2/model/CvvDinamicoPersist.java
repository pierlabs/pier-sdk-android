package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto de cria\u00E7\u00E3o para um CVV din\u00E2mico
 **/
@ApiModel(description = "Objeto de cria\u00E7\u00E3o para um CVV din\u00E2mico")
public class CvvDinamicoPersist  {
  
  @SerializedName("dataExpiracao")
  private String dataExpiracao = null;

  
  /**
   * cvv_dinamico_persist_data_expiracao_value
   **/
  @ApiModelProperty(required = true, value = "cvv_dinamico_persist_data_expiracao_value")
  public String getDataExpiracao() {
    return dataExpiracao;
  }
  public void setDataExpiracao(String dataExpiracao) {
    this.dataExpiracao = dataExpiracao;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CvvDinamicoPersist {\n");
    
    sb.append("  dataExpiracao: ").append(dataExpiracao).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
