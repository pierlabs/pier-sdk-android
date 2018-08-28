package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{vinculo_estabelecimento_adquirente_response_description}}}
 **/
@ApiModel(description = "{{{vinculo_estabelecimento_adquirente_response_description}}}")
public class VinculoEstabelecimentoAdquirenteResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("idEstabelecimento")
  private Long idEstabelecimento = null;
  @SerializedName("idAdquirente")
  private Long idAdquirente = null;
  @SerializedName("codigoEstabelecimentoAdquirente")
  private String codigoEstabelecimentoAdquirente = null;
  @SerializedName("dataHoraCadastro")
  private String dataHoraCadastro = null;
  @SerializedName("mensagem")
  private String mensagem = null;
  @SerializedName("status")
  private Integer status = null;

  
  /**
   * {{{vinculo_estabelecimento_adquirente_response_id_value}}}
   **/
  @ApiModelProperty(value = "{{{vinculo_estabelecimento_adquirente_response_id_value}}}")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{vinculo_estabelecimento_adquirente_response_id_estabelecimento_value}}}
   **/
  @ApiModelProperty(value = "{{{vinculo_estabelecimento_adquirente_response_id_estabelecimento_value}}}")
  public Long getIdEstabelecimento() {
    return idEstabelecimento;
  }
  public void setIdEstabelecimento(Long idEstabelecimento) {
    this.idEstabelecimento = idEstabelecimento;
  }

  
  /**
   * {{{vinculo_estabelecimento_adquirente_response_id_adquirente_value}}}
   **/
  @ApiModelProperty(value = "{{{vinculo_estabelecimento_adquirente_response_id_adquirente_value}}}")
  public Long getIdAdquirente() {
    return idAdquirente;
  }
  public void setIdAdquirente(Long idAdquirente) {
    this.idAdquirente = idAdquirente;
  }

  
  /**
   * {{{vinculo_estabelecimento_adquirente_response_codigo_estabelecimento_adquirente_value}}}
   **/
  @ApiModelProperty(value = "{{{vinculo_estabelecimento_adquirente_response_codigo_estabelecimento_adquirente_value}}}")
  public String getCodigoEstabelecimentoAdquirente() {
    return codigoEstabelecimentoAdquirente;
  }
  public void setCodigoEstabelecimentoAdquirente(String codigoEstabelecimentoAdquirente) {
    this.codigoEstabelecimentoAdquirente = codigoEstabelecimentoAdquirente;
  }

  
  /**
   * {{{vinculo_estabelecimento_adquirente_response_data_hora_cadastro_value}}}
   **/
  @ApiModelProperty(value = "{{{vinculo_estabelecimento_adquirente_response_data_hora_cadastro_value}}}")
  public String getDataHoraCadastro() {
    return dataHoraCadastro;
  }
  public void setDataHoraCadastro(String dataHoraCadastro) {
    this.dataHoraCadastro = dataHoraCadastro;
  }

  
  /**
   * {{{vinculo_estabelecimento_adquirente_response_mensagem_value}}}
   **/
  @ApiModelProperty(value = "{{{vinculo_estabelecimento_adquirente_response_mensagem_value}}}")
  public String getMensagem() {
    return mensagem;
  }
  public void setMensagem(String mensagem) {
    this.mensagem = mensagem;
  }

  
  /**
   * {{{vinculo_estabelecimento_adquirente_response_status_value}}}
   **/
  @ApiModelProperty(value = "{{{vinculo_estabelecimento_adquirente_response_status_value}}}")
  public Integer getStatus() {
    return status;
  }
  public void setStatus(Integer status) {
    this.status = status;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class VinculoEstabelecimentoAdquirenteResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  idEstabelecimento: ").append(idEstabelecimento).append("\n");
    sb.append("  idAdquirente: ").append(idAdquirente).append("\n");
    sb.append("  codigoEstabelecimentoAdquirente: ").append(codigoEstabelecimentoAdquirente).append("\n");
    sb.append("  dataHoraCadastro: ").append(dataHoraCadastro).append("\n");
    sb.append("  mensagem: ").append(mensagem).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
