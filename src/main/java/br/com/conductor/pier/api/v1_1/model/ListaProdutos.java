package br.com.conductor.pier.api.v1_1.model;

import br.com.conductor.pier.api.v1_1.model.Produto;
import java.util.*;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * Lista de Produtos
 **/
@ApiModel(description = "Lista de Produtos")
public class ListaProdutos  {
  
  @SerializedName("produtos")
  private List<Produto> produtos = null;

  
  /**
   * Lista de produtos
   **/
  @ApiModelProperty(value = "Lista de produtos")
  public List<Produto> getProdutos() {
    return produtos;
  }
  public void setProdutos(List<Produto> produtos) {
    this.produtos = produtos;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListaProdutos {\n");
    
    sb.append("  produtos: ").append(produtos).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


