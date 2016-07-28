package br.com.conductor.pier.api.v1_1.model;

import br.com.conductor.pier.api.v1_1.model.CartaoResponse;
import java.util.*;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



@ApiModel(description = "")
public class ConsultarCartaoResponse  {
  
  @SerializedName("cartoes")
  private List<CartaoResponse> cartoes = null;
  @SerializedName("codigoRetorno")
  private Integer codigoRetorno = null;
  @SerializedName("descricaoRetorno")
  private String descricaoRetorno = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  public List<CartaoResponse> getCartoes() {
    return cartoes;
  }
  public void setCartoes(List<CartaoResponse> cartoes) {
    this.cartoes = cartoes;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getCodigoRetorno() {
    return codigoRetorno;
  }
  public void setCodigoRetorno(Integer codigoRetorno) {
    this.codigoRetorno = codigoRetorno;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getDescricaoRetorno() {
    return descricaoRetorno;
  }
  public void setDescricaoRetorno(String descricaoRetorno) {
    this.descricaoRetorno = descricaoRetorno;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsultarCartaoResponse {\n");
    
    sb.append("  cartoes: ").append(cartoes).append("\n");
    sb.append("  codigoRetorno: ").append(codigoRetorno).append("\n");
    sb.append("  descricaoRetorno: ").append(descricaoRetorno).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


