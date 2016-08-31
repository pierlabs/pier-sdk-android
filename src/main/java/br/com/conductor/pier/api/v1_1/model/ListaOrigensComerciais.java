package br.com.conductor.pier.api.v1_1.model;

import br.com.conductor.pier.api.v1_1.model.OrigemComercial;
import java.util.*;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * Lista de Origens Comerciais
 **/
@ApiModel(description = "Lista de Origens Comerciais")
public class ListaOrigensComerciais  {
  
  @SerializedName("origensComerciais")
  private List<OrigemComercial> origensComerciais = null;

  
  /**
   * Lista de origens comerciais
   **/
  @ApiModelProperty(value = "Lista de origens comerciais")
  public List<OrigemComercial> getOrigensComerciais() {
    return origensComerciais;
  }
  public void setOrigensComerciais(List<OrigemComercial> origensComerciais) {
    this.origensComerciais = origensComerciais;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListaOrigensComerciais {\n");
    
    sb.append("  origensComerciais: ").append(origensComerciais).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


