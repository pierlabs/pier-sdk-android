package br.com.conductor.pier.api.v2.model;

import br.com.conductor.pier.api.v2.model.AplicacaoMobileEmissorResponse;
import br.com.conductor.pier.api.v2.model.CartaoEmissorResponse;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * {{{inscricao_apn_resposta_descricao}}}
 **/
@ApiModel(description = "{{{inscricao_apn_resposta_descricao}}}")
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
   * {{{inscricao_apn_resposta_aplicacao_mobile_descricao}}}
   **/
  @ApiModelProperty(value = "{{{inscricao_apn_resposta_aplicacao_mobile_descricao}}}")
  public AplicacaoMobileEmissorResponse getAplicacaoMobile() {
    return aplicacaoMobile;
  }
  public void setAplicacaoMobile(AplicacaoMobileEmissorResponse aplicacaoMobile) {
    this.aplicacaoMobile = aplicacaoMobile;
  }

  
  /**
   * {{{inscricao_apn_resposta_ativo_descricao}}}
   **/
  @ApiModelProperty(value = "{{{inscricao_apn_resposta_ativo_descricao}}}")
  public Boolean getAtivo() {
    return ativo;
  }
  public void setAtivo(Boolean ativo) {
    this.ativo = ativo;
  }

  
  /**
   * {{{inscricao_apn_resposta_cartao_descricao}}}
   **/
  @ApiModelProperty(value = "{{{inscricao_apn_resposta_cartao_descricao}}}")
  public CartaoEmissorResponse getCartao() {
    return cartao;
  }
  public void setCartao(CartaoEmissorResponse cartao) {
    this.cartao = cartao;
  }

  
  /**
   * {{{inscricao_apn_resposta_data_criacao_descricao}}}
   **/
  @ApiModelProperty(value = "{{{inscricao_apn_resposta_data_criacao_descricao}}}")
  public String getDataCriacao() {
    return dataCriacao;
  }
  public void setDataCriacao(String dataCriacao) {
    this.dataCriacao = dataCriacao;
  }

  
  /**
   * {{{inscricao_apn_resposta_data_desativacao_descricao}}}
   **/
  @ApiModelProperty(value = "{{{inscricao_apn_resposta_data_desativacao_descricao}}}")
  public String getDataDesativacao() {
    return dataDesativacao;
  }
  public void setDataDesativacao(String dataDesativacao) {
    this.dataDesativacao = dataDesativacao;
  }

  
  /**
   * {{{inscricao_apn_resposta_device_token_descricao}}}
   **/
  @ApiModelProperty(value = "{{{inscricao_apn_resposta_device_token_descricao}}}")
  public String getDeviceToken() {
    return deviceToken;
  }
  public void setDeviceToken(String deviceToken) {
    this.deviceToken = deviceToken;
  }

  
  /**
   * {{{inscricao_apn_resposta_id_descricao}}}
   **/
  @ApiModelProperty(value = "{{{inscricao_apn_resposta_id_descricao}}}")
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


