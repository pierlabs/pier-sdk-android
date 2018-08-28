package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{arquivo_ajuste_lote_request_description}}}
 **/
@ApiModel(description = "{{{arquivo_ajuste_lote_request_description}}}")
public class DetalheAjusteLoteUpdate  {
  
  @SerializedName("status")
  private String status = null;

  
  /**
   * {{{detalhe_ajuste_lote_update_name_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{detalhe_ajuste_lote_update_name_value}}}")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DetalheAjusteLoteUpdate {\n");
    
    sb.append("  status: ").append(status).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
