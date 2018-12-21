package br.com.conductor.pier.api.v2.model;

import br.com.conductor.pier.api.v2.model.AplicacaoMobileEmissorResponse;
import br.com.conductor.pier.api.v2.model.CartaoEmissorResponse;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Represents a subscription response
 **/
@ApiModel(description = "Represents a subscription response")
public class InscricaoAPNResponse  {
  
  @SerializedName("aplicacaoMobile")
  private AplicacaoMobileEmissorResponse aplicacaoMobile = null;
  @SerializedName("ativo")
  private Boolean ativo = null;
  @SerializedName("cartao")
  private CartaoEmissorResponse cartao = null;
  @SerializedName("dataCriacao")
  private String dataCriacao = null;
  @SerializedName("dataDesativacao")
  private String dataDesativacao = null;
  @SerializedName("deviceToken")
  private String deviceToken = null;
  @SerializedName("id")
  private Long id = null;

  
  /**
   * Represents the mobile application associated to the subscription
   **/
  @ApiModelProperty(value = "Represents the mobile application associated to the subscription")
  public AplicacaoMobileEmissorResponse getAplicacaoMobile() {
    return aplicacaoMobile;
  }
  public void setAplicacaoMobile(AplicacaoMobileEmissorResponse aplicacaoMobile) {
    this.aplicacaoMobile = aplicacaoMobile;
  }

  
  /**
   * Indicates is the subscription is active
   **/
  @ApiModelProperty(value = "Indicates is the subscription is active")
  public Boolean getAtivo() {
    return ativo;
  }
  public void setAtivo(Boolean ativo) {
    this.ativo = ativo;
  }

  
  /**
   * Represents the card associated to the subscription
   **/
  @ApiModelProperty(value = "Represents the card associated to the subscription")
  public CartaoEmissorResponse getCartao() {
    return cartao;
  }
  public void setCartao(CartaoEmissorResponse cartao) {
    this.cartao = cartao;
  }

  
  /**
   * The subscription creation date
   **/
  @ApiModelProperty(value = "The subscription creation date")
  public String getDataCriacao() {
    return dataCriacao;
  }
  public void setDataCriacao(String dataCriacao) {
    this.dataCriacao = dataCriacao;
  }

  
  /**
   * The subscription deactivation date
   **/
  @ApiModelProperty(value = "The subscription deactivation date")
  public String getDataDesativacao() {
    return dataDesativacao;
  }
  public void setDataDesativacao(String dataDesativacao) {
    this.dataDesativacao = dataDesativacao;
  }

  
  /**
   * The device token
   **/
  @ApiModelProperty(value = "The device token")
  public String getDeviceToken() {
    return deviceToken;
  }
  public void setDeviceToken(String deviceToken) {
    this.deviceToken = deviceToken;
  }

  
  /**
   * Subscription id
   **/
  @ApiModelProperty(value = "Subscription id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class InscricaoAPNResponse {\n");
    
    sb.append("  aplicacaoMobile: ").append(aplicacaoMobile).append("\n");
    sb.append("  ativo: ").append(ativo).append("\n");
    sb.append("  cartao: ").append(cartao).append("\n");
    sb.append("  dataCriacao: ").append(dataCriacao).append("\n");
    sb.append("  dataDesativacao: ").append(dataDesativacao).append("\n");
    sb.append("  deviceToken: ").append(deviceToken).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
