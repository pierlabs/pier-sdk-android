package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Request Representation of the issuer integration including resource
 **/
@ApiModel(description = "Request Representation of the issuer integration including resource")
public class IntegracaoEmissorPersist  {
  
  @SerializedName("canalEntrada")
  private String canalEntrada = null;

  
  /**
   * Input channel where must be informed the device used in the communication
   **/
  @ApiModelProperty(value = "Input channel where must be informed the device used in the communication")
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
