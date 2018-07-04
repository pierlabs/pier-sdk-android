package br.com.conductor.pier.api.v2.model;



import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * {{{integracao_emissor_persist_description}}}
 **/
@ApiModel(description = "{{{integracao_emissor_persist_description}}}")
public class IntegracaoEmissorPersist  {
  
  @SerializedName("canalEntrada")
  private String canalEntrada = null;

  
  /**
   * {{{integracao_emissor_persist_canal_entrada_value}}}
   **/
  @ApiModelProperty(value = "{{{integracao_emissor_persist_canal_entrada_value}}}")
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


