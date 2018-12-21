package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{lote_cartoes_pre_pagos_response_description}}}
 **/
@ApiModel(description = "{{{lote_cartoes_pre_pagos_response_description}}}")
public class LoteCartoesPrePagosResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("idOrigemComercial")
  private Long idOrigemComercial = null;
  @SerializedName("idProduto")
  private Long idProduto = null;
  @SerializedName("idTipoCartao")
  private Long idTipoCartao = null;
  @SerializedName("idImagem")
  private Long idImagem = null;
  @SerializedName("idEndereco")
  private Long idEndereco = null;
  @SerializedName("quantidade")
  private Integer quantidade = null;
  @SerializedName("dataCadastro")
  private String dataCadastro = null;
  @SerializedName("usuarioCadastro")
  private String usuarioCadastro = null;
  @SerializedName("statusProcessamento")
  private Integer statusProcessamento = null;
  @SerializedName("identificadorExterno")
  private String identificadorExterno = null;

  
  /**
   * {{{lote_cartoes_pre_pagos_response_id_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{lote_cartoes_pre_pagos_response_id_value}}}")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{lote_cartoes_pre_pagos_response_id_origem_comercial_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{lote_cartoes_pre_pagos_response_id_origem_comercial_value}}}")
  public Long getIdOrigemComercial() {
    return idOrigemComercial;
  }
  public void setIdOrigemComercial(Long idOrigemComercial) {
    this.idOrigemComercial = idOrigemComercial;
  }

  
  /**
   * {{{lote_cartoes_pre_pagos_response_id_produto_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{lote_cartoes_pre_pagos_response_id_produto_value}}}")
  public Long getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Long idProduto) {
    this.idProduto = idProduto;
  }

  
  /**
   * {{{lote_cartoes_pre_pagos_response_id_tipo_cartao_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{lote_cartoes_pre_pagos_response_id_tipo_cartao_value}}}")
  public Long getIdTipoCartao() {
    return idTipoCartao;
  }
  public void setIdTipoCartao(Long idTipoCartao) {
    this.idTipoCartao = idTipoCartao;
  }

  
  /**
   * {{{lote_cartoes_pre_pagos_response_id_imagem_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{lote_cartoes_pre_pagos_response_id_imagem_value}}}")
  public Long getIdImagem() {
    return idImagem;
  }
  public void setIdImagem(Long idImagem) {
    this.idImagem = idImagem;
  }

  
  /**
   * {{{lote_cartoes_pre_pagos_response_id_endereco_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{lote_cartoes_pre_pagos_response_id_endereco_value}}}")
  public Long getIdEndereco() {
    return idEndereco;
  }
  public void setIdEndereco(Long idEndereco) {
    this.idEndereco = idEndereco;
  }

  
  /**
   * {{{lote_cartoes_pre_pagos_response_quantidade_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{lote_cartoes_pre_pagos_response_quantidade_value}}}")
  public Integer getQuantidade() {
    return quantidade;
  }
  public void setQuantidade(Integer quantidade) {
    this.quantidade = quantidade;
  }

  
  /**
   * {{{lote_cartoes_pre_pagos_response_data_cadastro_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{lote_cartoes_pre_pagos_response_data_cadastro_value}}}")
  public String getDataCadastro() {
    return dataCadastro;
  }
  public void setDataCadastro(String dataCadastro) {
    this.dataCadastro = dataCadastro;
  }

  
  /**
   * {{{lote_cartoes_pre_pagos_response_usuario_cadastro_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{lote_cartoes_pre_pagos_response_usuario_cadastro_value}}}")
  public String getUsuarioCadastro() {
    return usuarioCadastro;
  }
  public void setUsuarioCadastro(String usuarioCadastro) {
    this.usuarioCadastro = usuarioCadastro;
  }

  
  /**
   * {{{lote_cartoes_pre_pagos_response_status_processamento_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{lote_cartoes_pre_pagos_response_status_processamento_value}}}")
  public Integer getStatusProcessamento() {
    return statusProcessamento;
  }
  public void setStatusProcessamento(Integer statusProcessamento) {
    this.statusProcessamento = statusProcessamento;
  }

  
  /**
   * {{{lote_cartoes_pre_pagos_response_identificador_externo_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{lote_cartoes_pre_pagos_response_identificador_externo_value}}}")
  public String getIdentificadorExterno() {
    return identificadorExterno;
  }
  public void setIdentificadorExterno(String identificadorExterno) {
    this.identificadorExterno = identificadorExterno;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoteCartoesPrePagosResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  idOrigemComercial: ").append(idOrigemComercial).append("\n");
    sb.append("  idProduto: ").append(idProduto).append("\n");
    sb.append("  idTipoCartao: ").append(idTipoCartao).append("\n");
    sb.append("  idImagem: ").append(idImagem).append("\n");
    sb.append("  idEndereco: ").append(idEndereco).append("\n");
    sb.append("  quantidade: ").append(quantidade).append("\n");
    sb.append("  dataCadastro: ").append(dataCadastro).append("\n");
    sb.append("  usuarioCadastro: ").append(usuarioCadastro).append("\n");
    sb.append("  statusProcessamento: ").append(statusProcessamento).append("\n");
    sb.append("  identificadorExterno: ").append(identificadorExterno).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
