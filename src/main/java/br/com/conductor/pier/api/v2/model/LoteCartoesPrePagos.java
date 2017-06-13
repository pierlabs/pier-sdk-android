package br.com.conductor.pier.api.v2.model;



import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * Lote Cart\u00C3\u00B5es Pr\u00C3\u00A9-Pagos
 **/
@ApiModel(description = "Lote Cart\u00C3\u00B5es Pr\u00C3\u00A9-Pagos")
public class LoteCartoesPrePagos  {
  
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

  
  /**
   * C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do lote de cart\u00C3\u00B5es pr\u00C3\u00A9-pagos (id).
   **/
  @ApiModelProperty(required = true, value = "C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do lote de cart\u00C3\u00B5es pr\u00C3\u00A9-pagos (id).")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * C\u00C3\u00B3digo identificador da origem comercial.
   **/
  @ApiModelProperty(required = true, value = "C\u00C3\u00B3digo identificador da origem comercial.")
  public Long getIdOrigemComercial() {
    return idOrigemComercial;
  }
  public void setIdOrigemComercial(Long idOrigemComercial) {
    this.idOrigemComercial = idOrigemComercial;
  }

  
  /**
   * C\u00C3\u00B3digo identificador do Produto.
   **/
  @ApiModelProperty(required = true, value = "C\u00C3\u00B3digo identificador do Produto.")
  public Long getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Long idProduto) {
    this.idProduto = idProduto;
  }

  
  /**
   * C\u00C3\u00B3digo identificador do tipo do cart\u00C3\u00A3o.
   **/
  @ApiModelProperty(required = true, value = "C\u00C3\u00B3digo identificador do tipo do cart\u00C3\u00A3o.")
  public Long getIdTipoCartao() {
    return idTipoCartao;
  }
  public void setIdTipoCartao(Long idTipoCartao) {
    this.idTipoCartao = idTipoCartao;
  }

  
  /**
   * C\u00C3\u00B3digo identificador da Imagem do cart\u00C3\u00A3o.
   **/
  @ApiModelProperty(required = true, value = "C\u00C3\u00B3digo identificador da Imagem do cart\u00C3\u00A3o.")
  public Long getIdImagem() {
    return idImagem;
  }
  public void setIdImagem(Long idImagem) {
    this.idImagem = idImagem;
  }

  
  /**
   * C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Endere\u00C3\u00A7o.
   **/
  @ApiModelProperty(required = true, value = "C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Endere\u00C3\u00A7o.")
  public Long getIdEndereco() {
    return idEndereco;
  }
  public void setIdEndereco(Long idEndereco) {
    this.idEndereco = idEndereco;
  }

  
  /**
   * N\u00C3\u00BAmero de cart\u00C3\u00B5es existentes no Lote.
   **/
  @ApiModelProperty(required = true, value = "N\u00C3\u00BAmero de cart\u00C3\u00B5es existentes no Lote.")
  public Integer getQuantidade() {
    return quantidade;
  }
  public void setQuantidade(Integer quantidade) {
    this.quantidade = quantidade;
  }

  
  /**
   * Data de cadastro do lote de cart\u00C3\u00B5es pr\u00C3\u00A9-pagos.
   **/
  @ApiModelProperty(required = true, value = "Data de cadastro do lote de cart\u00C3\u00B5es pr\u00C3\u00A9-pagos.")
  public String getDataCadastro() {
    return dataCadastro;
  }
  public void setDataCadastro(String dataCadastro) {
    this.dataCadastro = dataCadastro;
  }

  
  /**
   * Nome do usu\u00C3\u00A1rio que criou o lote.
   **/
  @ApiModelProperty(required = true, value = "Nome do usu\u00C3\u00A1rio que criou o lote.")
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

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoteCartoesPrePagos {\n");
    
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
    sb.append("}\n");
    return sb.toString();
  }
}


