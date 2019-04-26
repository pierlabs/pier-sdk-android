package br.com.conductor.pier.api.v2.model;

import br.com.conductor.pier.api.v2.model.AplicacaoMobileEmissorResponse;
import br.com.conductor.pier.api.v2.model.CartaoEmissorResponse;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Representa a resposta de uma inscricao APN
 **/
@ApiModel(description = "Representa a resposta de uma inscricao APN")
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
   * Representa a aplica\u00E7\u00E3o mobile da inscri\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "Representa a aplica\u00E7\u00E3o mobile da inscri\u00E7\u00E3o")
  public AplicacaoMobileEmissorResponse getAplicacaoMobile() {
    return aplicacaoMobile;
  }
  public void setAplicacaoMobile(AplicacaoMobileEmissorResponse aplicacaoMobile) {
    this.aplicacaoMobile = aplicacaoMobile;
  }

  
  /**
   * Indica se a inscri\u00E7\u00E3o est\u00E1 ativa
   **/
  @ApiModelProperty(value = "Indica se a inscri\u00E7\u00E3o est\u00E1 ativa")
  public Boolean getAtivo() {
    return ativo;
  }
  public void setAtivo(Boolean ativo) {
    this.ativo = ativo;
  }

  
  /**
   * Representa o cart\u00E3o associado \u00E0 inscri\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "Representa o cart\u00E3o associado \u00E0 inscri\u00E7\u00E3o")
  public CartaoEmissorResponse getCartao() {
    return cartao;
  }
  public void setCartao(CartaoEmissorResponse cartao) {
    this.cartao = cartao;
  }

  
  /**
   * Data da cria\u00E7\u00E3o da inscri\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "Data da cria\u00E7\u00E3o da inscri\u00E7\u00E3o")
  public String getDataCriacao() {
    return dataCriacao;
  }
  public void setDataCriacao(String dataCriacao) {
    this.dataCriacao = dataCriacao;
  }

  
  /**
   * Data da desativa\u00E7\u00E3o da inscri\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "Data da desativa\u00E7\u00E3o da inscri\u00E7\u00E3o")
  public String getDataDesativacao() {
    return dataDesativacao;
  }
  public void setDataDesativacao(String dataDesativacao) {
    this.dataDesativacao = dataDesativacao;
  }

  
  /**
   * Token do dispositivo
   **/
  @ApiModelProperty(value = "Token do dispositivo")
  public String getDeviceToken() {
    return deviceToken;
  }
  public void setDeviceToken(String deviceToken) {
    this.deviceToken = deviceToken;
  }

  
  /**
   * Id da inscri\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "Id da inscri\u00E7\u00E3o")
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
