package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Representa a requisi\u00E7\u00E3o do recurso de incluir integra\u00E7\u00E3o emissor
 **/
@ApiModel(description = "Representa a requisi\u00E7\u00E3o do recurso de incluir integra\u00E7\u00E3o emissor")
public class IntegracaoEmissorPersist  {
  
  @SerializedName("canalEntrada")
  private String canalEntrada = null;

  
  /**
   * Canal de entrada onde deve ser informado o dispositivo usado na comunica\u00E7\u00E3o.
   **/
  @ApiModelProperty(value = "Canal de entrada onde deve ser informado o dispositivo usado na comunica\u00E7\u00E3o.")
  public String getCanalEntrada() {
    return canalEntrada;
  }
  public void setCanalEntrada(String canalEntrada) {
    this.canalEntrada = canalEntrada;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntegracaoEmissorPersist {\n");
    
    sb.append("  canalEntrada: ").append(canalEntrada).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
