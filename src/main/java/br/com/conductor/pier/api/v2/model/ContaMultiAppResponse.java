package br.com.conductor.pier.api.v2.model;

import br.com.conductor.pier.api.v2.model.ContaResponse;
import java.util.*;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto com response do cadastro de contas MultiApp
 **/
@ApiModel(description = "Objeto com response do cadastro de contas MultiApp")
public class ContaMultiAppResponse  {
  
  @SerializedName("contas")
  private List<ContaResponse> contas = null;

  
  /**
   * contas MultiApp geradas
   **/
  @ApiModelProperty(value = "contas MultiApp geradas")
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
