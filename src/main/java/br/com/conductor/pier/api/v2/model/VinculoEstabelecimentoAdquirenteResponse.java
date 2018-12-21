package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Response object of the LinkMerchantAcquirer
 **/
@ApiModel(description = "Response object of the LinkMerchantAcquirer")
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
   * Identification Code of the LinkEstablishmentAcquirer (id)
   **/
  @ApiModelProperty(value = "Identification Code of the LinkEstablishmentAcquirer (id)")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Identification Code of the Establishment (id)
   **/
  @ApiModelProperty(value = "Identification Code of the Establishment (id)")
  public Long getIdEstabelecimento() {
    return idEstabelecimento;
  }
  public void setIdEstabelecimento(Long idEstabelecimento) {
    this.idEstabelecimento = idEstabelecimento;
  }

  
  /**
   * Identification Code of the Acquirer (id)
   **/
  @ApiModelProperty(value = "Identification Code of the Acquirer (id)")
  public Long getIdAdquirente() {
    return idAdquirente;
  }
  public void setIdAdquirente(Long idAdquirente) {
    this.idAdquirente = idAdquirente;
  }

  
  /**
   * Link Code between the establishment and the acquirer
   **/
  @ApiModelProperty(value = "Link Code between the establishment and the acquirer")
  public String getCodigoEstabelecimentoAdquirente() {
    return codigoEstabelecimentoAdquirente;
  }
  public void setCodigoEstabelecimentoAdquirente(String codigoEstabelecimentoAdquirente) {
    this.codigoEstabelecimentoAdquirente = codigoEstabelecimentoAdquirente;
  }

  
  /**
   * Register date of the link
   **/
  @ApiModelProperty(value = "Register date of the link")
  public String getDataHoraCadastro() {
    return dataHoraCadastro;
  }
  public void setDataHoraCadastro(String dataHoraCadastro) {
    this.dataHoraCadastro = dataHoraCadastro;
  }

  
  /**
   * Register date of the link
   **/
  @ApiModelProperty(value = "Register date of the link")
  public String getMensagem() {
    return mensagem;
  }
  public void setMensagem(String mensagem) {
    this.mensagem = mensagem;
  }

  
  /**
   * Register date of the link
   **/
  @ApiModelProperty(value = "Register date of the link")
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
