package br.com.conductor.pier.api.v2.model;

import br.com.conductor.pier.api.v2.model.CartaoImpressaoResponse;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Result of two cards created associated
 **/
@ApiModel(description = "Result of two cards created associated")
public class CartaoMultiAppImpressaoResponse  {
  
  @SerializedName("cartaoPai")
  private CartaoImpressaoResponse cartaoPai = null;
  @SerializedName("cartao")
  private CartaoImpressaoResponse cartao = null;

  
  /**
   * Primary card
   **/
  @ApiModelProperty(value = "Primary card")
  public CartaoImpressaoResponse getCartaoPai() {
    return cartaoPai;
  }
  public void setCartaoPai(CartaoImpressaoResponse cartaoPai) {
    this.cartaoPai = cartaoPai;
  }

  
  /**
   * Secondary card
   **/
  @ApiModelProperty(value = "Secondary card")
  public CartaoImpressaoResponse getCartao() {
    return cartao;
  }
  public void setCartao(CartaoImpressaoResponse cartao) {
    this.cartao = cartao;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CartaoMultiAppImpressaoResponse {\n");
    
    sb.append("  cartaoPai: ").append(cartaoPai).append("\n");
    sb.append("  cartao: ").append(cartao).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
