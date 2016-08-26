package br.com.conductor.pier.api.v1_1.model;

import br.com.conductor.pier.api.v1_1.model.StatusCarto;
import java.util.*;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * Lista de Status Cart\u00C3\u00B5es
 **/
@ApiModel(description = "Lista de Status Cart\u00C3\u00B5es")
public class ListaDeStatusCartes  {
  
  @SerializedName("statusCartoes")
  private List<StatusCarto> statusCartoes = null;

  
  /**
   * Lista de status cart\u00C3\u00B5es
   **/
  @ApiModelProperty(value = "Lista de status cart\u00C3\u00B5es")
  public List<StatusCarto> getStatusCartoes() {
    return statusCartoes;
  }
  public void setStatusCartoes(List<StatusCarto> statusCartoes) {
    this.statusCartoes = statusCartoes;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListaDeStatusCartes {\n");
    
    sb.append("  statusCartoes: ").append(statusCartoes).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


