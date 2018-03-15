package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Lote Cart\u00F5es Pr\u00E9-Pagos
 **/
@ApiModel(description = "Lote Cart\u00F5es Pr\u00E9-Pagos")
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
   * C\u00F3digo de identifica\u00E7\u00E3o do lote de cart\u00F5es pr\u00E9-pagos (id).
   **/
  @ApiModelProperty(required = true, value = "C\u00F3digo de identifica\u00E7\u00E3o do lote de cart\u00F5es pr\u00E9-pagos (id).")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * C\u00F3digo identificador da origem comercial.
   **/
  @ApiModelProperty(required = true, value = "C\u00F3digo identificador da origem comercial.")
  public Long getIdOrigemComercial() {
    return idOrigemComercial;
  }
  public void setIdOrigemComercial(Long idOrigemComercial) {
    this.idOrigemComercial = idOrigemComercial;
  }

  
  /**
   * C\u00F3digo identificador do Produto.
   **/
  @ApiModelProperty(required = true, value = "C\u00F3digo identificador do Produto.")
  public Long getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Long idProduto) {
    this.idProduto = idProduto;
  }

  
  /**
   * C\u00F3digo identificador do tipo do cart\u00E3o.
   **/
  @ApiModelProperty(required = true, value = "C\u00F3digo identificador do tipo do cart\u00E3o.")
  public Long getIdTipoCartao() {
    return idTipoCartao;
  }
  public void setIdTipoCartao(Long idTipoCartao) {
    this.idTipoCartao = idTipoCartao;
  }

  
  /**
   * C\u00F3digo identificador da Imagem do cart\u00E3o.
   **/
  @ApiModelProperty(required = true, value = "C\u00F3digo identificador da Imagem do cart\u00E3o.")
  public Long getIdImagem() {
    return idImagem;
  }
  public void setIdImagem(Long idImagem) {
    this.idImagem = idImagem;
  }

  
  /**
   * C\u00F3digo de Identifica\u00E7\u00E3o do Endere\u00E7o.
   **/
  @ApiModelProperty(required = true, value = "C\u00F3digo de Identifica\u00E7\u00E3o do Endere\u00E7o.")
  public Long getIdEndereco() {
    return idEndereco;
  }
  public void setIdEndereco(Long idEndereco) {
    this.idEndereco = idEndereco;
  }

  
  /**
   * N\u00FAmero de cart\u00F5es existentes no Lote.
   **/
  @ApiModelProperty(required = true, value = "N\u00FAmero de cart\u00F5es existentes no Lote.")
  public Integer getQuantidade() {
    return quantidade;
  }
  public void setQuantidade(Integer quantidade) {
    this.quantidade = quantidade;
  }

  
  /**
   * Data de cadastro do lote de cart\u00F5es pr\u00E9-pagos.
   **/
  @ApiModelProperty(required = true, value = "Data de cadastro do lote de cart\u00F5es pr\u00E9-pagos.")
  public String getDataCadastro() {
    return dataCadastro;
  }
  public void setDataCadastro(String dataCadastro) {
    this.dataCadastro = dataCadastro;
  }

  
  /**
   * Nome do usu\u00E1rio que criou o lote.
   **/
  @ApiModelProperty(required = true, value = "Nome do usu\u00E1rio que criou o lote.")
  public String getUsuarioCadastro() {
    return usuarioCadastro;
  }
  public void setUsuarioCadastro(String usuarioCadastro) {
    this.usuarioCadastro = usuarioCadastro;
  }

  
  /**
   * Indica o status de processamento do lote.
   **/
  @ApiModelProperty(required = true, value = "Indica o status de processamento do lote.")
  public Integer getStatusProcessamento() {
    return statusProcessamento;
  }
  public void setStatusProcessamento(Integer statusProcessamento) {
    this.statusProcessamento = statusProcessamento;
  }

  
  /**
   * N\u00FAmero de identifica\u00E7\u00E3o externo (utilizado pelo emissor).
   **/
  @ApiModelProperty(required = true, value = "N\u00FAmero de identifica\u00E7\u00E3o externo (utilizado pelo emissor).")
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
