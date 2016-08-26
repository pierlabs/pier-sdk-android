package br.com.conductor.pier.api.v1_1.model;

import br.com.conductor.pier.api.v1_1.model.CartaoResponse;
import java.util.*;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * Lista de Cart\u00C3\u00B5es
 **/
@ApiModel(description = "Lista de Cart\u00C3\u00B5es")
public class ListaDeCartes  {
  
  @SerializedName("cartoes")
  private List<CartaoResponse> cartoes = null;

  
  /**
   * Lista de cart\u00C3\u00B5es
   **/
  @ApiModelProperty(value = "Lista de cart\u00C3\u00B5es")
  public List<CartaoResponse> getCartoes() {
    return cartoes;
  }
  public void setCartoes(List<CartaoResponse> cartoes) {
    this.cartoes = cartoes;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListaDeCartes {\n");
    
    sb.append("  cartoes: ").append(cartoes).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


