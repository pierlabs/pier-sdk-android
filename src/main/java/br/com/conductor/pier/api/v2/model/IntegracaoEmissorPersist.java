package br.com.conductor.pier.api.v2.model;



import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * Representa a requisi\u00C3\u00A7\u00C3\u00A3o do recurso de incluir integra\u00C3\u00A7\u00C3\u00A3o emissor
 **/
@ApiModel(description = "Representa a requisi\u00C3\u00A7\u00C3\u00A3o do recurso de incluir integra\u00C3\u00A7\u00C3\u00A3o emissor")
public class IntegracaoEmissorPersist  {
  
  @SerializedName("canalEntrada")
  private String canalEntrada = null;

  
  /**
   * Canal de entrada onde deve ser informado o dispositivo usado na comunica\u00C3\u00A7\u00C3\u00A3o.
   **/
  @ApiModelProperty(value = "Canal de entrada onde deve ser informado o dispositivo usado na comunica\u00C3\u00A7\u00C3\u00A3o.")
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


