package br.com.conductor.pier.api.v1_1.model;

import br.com.conductor.pier.api.v1_1.model.Pessoa;
import java.util.*;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * Lista de Pessoas
 **/
@ApiModel(description = "Lista de Pessoas")
public class ListaDePessoas  {
  
  @SerializedName("pessoas")
  private List<Pessoa> pessoas = null;

  
  /**
   * Lista de pessoas
   **/
  @ApiModelProperty(value = "Lista de pessoas")
  public List<Pessoa> getPessoas() {
    return pessoas;
  }
  public void setPessoas(List<Pessoa> pessoas) {
    this.pessoas = pessoas;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListaDePessoas {\n");
    
    sb.append("  pessoas: ").append(pessoas).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


