package br.com.conductor.pier.api.v1_1.model;

import br.com.conductor.pier.api.v1_1.model.EstgioCarto;
import java.util.*;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * Lista de Est\u00C3\u00A1gios Cart\u00C3\u00B5es
 **/
@ApiModel(description = "Lista de Est\u00C3\u00A1gios Cart\u00C3\u00B5es")
public class ListaDeEstgiosCartes  {
  
  @SerializedName("estagiosCartoes")
  private List<EstgioCarto> estagiosCartoes = null;

  
  /**
   * Lista de est\u00C3\u00A1gios cart\u00C3\u00B5es
   **/
  @ApiModelProperty(value = "Lista de est\u00C3\u00A1gios cart\u00C3\u00B5es")
  public List<EstgioCarto> getEstagiosCartoes() {
    return estagiosCartoes;
  }
  public void setEstagiosCartoes(List<EstgioCarto> estagiosCartoes) {
    this.estagiosCartoes = estagiosCartoes;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListaDeEstgiosCartes {\n");
    
    sb.append("  estagiosCartoes: ").append(estagiosCartoes).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


