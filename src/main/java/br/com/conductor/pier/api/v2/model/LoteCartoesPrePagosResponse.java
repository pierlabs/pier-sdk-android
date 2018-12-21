package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Batch Prepaid cards
 **/
@ApiModel(description = "Batch Prepaid cards")
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
   * Identifica??o Code of the pre-paid card batch (id)
   **/
  @ApiModelProperty(required = true, value = "Identifica??o Code of the pre-paid card batch (id)")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Identifier code of the Commercial origin
   **/
  @ApiModelProperty(required = true, value = "Identifier code of the Commercial origin")
  public Long getIdOrigemComercial() {
    return idOrigemComercial;
  }
  public void setIdOrigemComercial(Long idOrigemComercial) {
    this.idOrigemComercial = idOrigemComercial;
  }

  
  /**
   * Identifier Code of the Product
   **/
  @ApiModelProperty(required = true, value = "Identifier Code of the Product")
  public Long getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Long idProduto) {
    this.idProduto = idProduto;
  }

  
  /**
   * Identifier Code of the card type
   **/
  @ApiModelProperty(required = true, value = "Identifier Code of the card type")
  public Long getIdTipoCartao() {
    return idTipoCartao;
  }
  public void setIdTipoCartao(Long idTipoCartao) {
    this.idTipoCartao = idTipoCartao;
  }

  
  /**
   * Identifier code of the card image
   **/
  @ApiModelProperty(required = true, value = "Identifier code of the card image")
  public Long getIdImagem() {
    return idImagem;
  }
  public void setIdImagem(Long idImagem) {
    this.idImagem = idImagem;
  }

  
  /**
   * Identification Code of the address
   **/
  @ApiModelProperty(required = true, value = "Identification Code of the address")
  public Long getIdEndereco() {
    return idEndereco;
  }
  public void setIdEndereco(Long idEndereco) {
    this.idEndereco = idEndereco;
  }

  
  /**
   * Number of existing cards in the batch
   **/
  @ApiModelProperty(required = true, value = "Number of existing cards in the batch")
  public Integer getQuantidade() {
    return quantidade;
  }
  public void setQuantidade(Integer quantidade) {
    this.quantidade = quantidade;
  }

  
  /**
   * Register date of the pre-paid card batch
   **/
  @ApiModelProperty(required = true, value = "Register date of the pre-paid card batch")
  public String getDataCadastro() {
    return dataCadastro;
  }
  public void setDataCadastro(String dataCadastro) {
    this.dataCadastro = dataCadastro;
  }

  
  /**
   * Username that created the batch
   **/
  @ApiModelProperty(required = true, value = "Username that created the batch")
  public String getUsuarioCadastro() {
    return usuarioCadastro;
  }
  public void setUsuarioCadastro(String usuarioCadastro) {
    this.usuarioCadastro = usuarioCadastro;
  }

  
  /**
   * Indicate the processin status of the batch
   **/
  @ApiModelProperty(required = true, value = "Indicate the processin status of the batch")
  public Integer getStatusProcessamento() {
    return statusProcessamento;
  }
  public void setStatusProcessamento(Integer statusProcessamento) {
    this.statusProcessamento = statusProcessamento;
  }

  
  /**
   * External identification number (used by the issuer)
   **/
  @ApiModelProperty(required = true, value = "External identification number (used by the issuer)")
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
