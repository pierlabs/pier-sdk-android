package br.com.conductor.pier.api.v2.model;

import br.com.conductor.pier.api.v2.model.CartaoImpressaoResponse;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{cartao_impressao_multiapp_response_description}}}
 **/
@ApiModel(description = "{{{cartao_impressao_multiapp_response_description}}}")
public class CartaoMultiAppImpressaoResponse  {
  
  @SerializedName("cartaoPai")
  private CartaoImpressaoResponse cartaoPai = null;
  @SerializedName("cartao")
  private CartaoImpressaoResponse cartao = null;

  
  /**
   * {{{cartao_impressao_multiapp_response_cartao_pai_value}}}
   **/
  @ApiModelProperty(value = "{{{cartao_impressao_multiapp_response_cartao_pai_value}}}")
  public CartaoImpressaoResponse getCartaoPai() {
    return cartaoPai;
  }
  public void setCartaoPai(CartaoImpressaoResponse cartaoPai) {
    this.cartaoPai = cartaoPai;
  }

  
  /**
   * {{{cartao_impressao_multiapp_response_cartao_filho_value}}}
   **/
  @ApiModelProperty(value = "{{{cartao_impressao_multiapp_response_cartao_filho_value}}}")
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
