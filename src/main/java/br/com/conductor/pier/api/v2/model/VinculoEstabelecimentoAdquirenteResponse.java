package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto de resposta do VinculoEstabelecimentoAdquirente
 **/
@ApiModel(description = "Objeto de resposta do VinculoEstabelecimentoAdquirente")
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
   * C\u00F3digo de Identifica\u00E7\u00E3o do VinculoEstabelecimentoAdquirente (id).
   **/
  @ApiModelProperty(value = "C\u00F3digo de Identifica\u00E7\u00E3o do VinculoEstabelecimentoAdquirente (id).")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * C\u00F3digo de Identifica\u00E7\u00E3o do Estabelecimento (id).
   **/
  @ApiModelProperty(value = "C\u00F3digo de Identifica\u00E7\u00E3o do Estabelecimento (id).")
  public Long getIdEstabelecimento() {
    return idEstabelecimento;
  }
  public void setIdEstabelecimento(Long idEstabelecimento) {
    this.idEstabelecimento = idEstabelecimento;
  }

  
  /**
   * C\u00F3digo de Identifica\u00E7\u00E3o do Adquirente (id).
   **/
  @ApiModelProperty(value = "C\u00F3digo de Identifica\u00E7\u00E3o do Adquirente (id).")
  public Long getIdAdquirente() {
    return idAdquirente;
  }
  public void setIdAdquirente(Long idAdquirente) {
    this.idAdquirente = idAdquirente;
  }

  
  /**
   * C\u00F3digo do v\u00EDnculo entre o estabelecimento e o adquirente.
   **/
  @ApiModelProperty(value = "C\u00F3digo do v\u00EDnculo entre o estabelecimento e o adquirente.")
  public String getCodigoEstabelecimentoAdquirente() {
    return codigoEstabelecimentoAdquirente;
  }
  public void setCodigoEstabelecimentoAdquirente(String codigoEstabelecimentoAdquirente) {
    this.codigoEstabelecimentoAdquirente = codigoEstabelecimentoAdquirente;
  }

  
  /**
   * Data de cadastro do v\u00EDnculo.
   **/
  @ApiModelProperty(value = "Data de cadastro do v\u00EDnculo.")
  public String getDataHoraCadastro() {
    return dataHoraCadastro;
  }
  public void setDataHoraCadastro(String dataHoraCadastro) {
    this.dataHoraCadastro = dataHoraCadastro;
  }

  
  /**
   * Data de cadastro do v\u00EDnculo.
   **/
  @ApiModelProperty(value = "Data de cadastro do v\u00EDnculo.")
  public String getMensagem() {
    return mensagem;
  }
  public void setMensagem(String mensagem) {
    this.mensagem = mensagem;
  }

  
  /**
   * Data de cadastro do v\u00EDnculo.
   **/
  @ApiModelProperty(value = "Data de cadastro do v\u00EDnculo.")
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
