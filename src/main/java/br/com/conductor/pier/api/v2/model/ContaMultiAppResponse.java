package br.com.conductor.pier.api.v2.model;

import br.com.conductor.pier.api.v2.model.ContaResponse;
import java.util.*;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Object with account record response MultiApp
 **/
@ApiModel(description = "Object with account record response MultiApp")
public class ContaMultiAppResponse  {
  
  @SerializedName("contas")
  private List<ContaResponse> contas = null;

  
  /**
   * generated MultiApp accounts
   **/
  @ApiModelProperty(value = "generated MultiApp accounts")
  public List<ContaResponse> getContas() {
    return contas;
  }
  public void setContas(List<ContaResponse> contas) {
    this.contas = contas;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContaMultiAppResponse {\n");
    
    sb.append("  contas: ").append(contas).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
