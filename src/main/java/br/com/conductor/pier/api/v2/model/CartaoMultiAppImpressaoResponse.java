package br.com.conductor.pier.api.v2.model;

import br.com.conductor.pier.api.v2.model.CartaoImpressaoResponse;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Resultado do m\u00FAltiplo gerado com os dois cart\u00F5es vinculados
 **/
@ApiModel(description = "Resultado do m\u00FAltiplo gerado com os dois cart\u00F5es vinculados")
public class CartaoMultiAppImpressaoResponse  {
  
  @SerializedName("cartaoPai")
  private CartaoImpressaoResponse cartaoPai = null;
  @SerializedName("cartao")
  private CartaoImpressaoResponse cartao = null;

  
  /**
   * Cart\u00E3o principal
   **/
  @ApiModelProperty(value = "Cart\u00E3o principal")
  public CartaoImpressaoResponse getCartaoPai() {
    return cartaoPai;
  }
  public void setCartaoPai(CartaoImpressaoResponse cartaoPai) {
    this.cartaoPai = cartaoPai;
  }

  
  /**
   * Cart\u00E3o secund\u00E1rio
   **/
  @ApiModelProperty(value = "Cart\u00E3o secund\u00E1rio")
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
