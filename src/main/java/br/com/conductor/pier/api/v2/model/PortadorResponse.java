package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Cardholder
 **/
@ApiModel(description = "Cardholder")
public class PortadorResponse  {
  
  @SerializedName("idConta")
  private Long idConta = null;
  @SerializedName("idProduto")
  private Long idProduto = null;
  @SerializedName("idPessoa")
  private Long idPessoa = null;
  @SerializedName("idParentesco")
  private Long idParentesco = null;
  @SerializedName("tipoPortador")
  private String tipoPortador = null;
  @SerializedName("nomeImpresso")
  private String nomeImpresso = null;
  @SerializedName("idTipoCartao")
  private Long idTipoCartao = null;
  @SerializedName("flagAtivo")
  private Integer flagAtivo = null;
  @SerializedName("dataCadastroPortador")
  private String dataCadastroPortador = null;
  @SerializedName("dataCancelamentoPortador")
  private String dataCancelamentoPortador = null;

  
  /**
   * Identification Code of the Account (id)
   **/
  @ApiModelProperty(value = "Identification Code of the Account (id)")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Identification Code of the Product (id)
   **/
  @ApiModelProperty(value = "Identification Code of the Product (id)")
  public Long getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Long idProduto) {
    this.idProduto = idProduto;
  }

  
  /**
   * Identification Code of the Person (id)
   **/
  @ApiModelProperty(value = "Identification Code of the Person (id)")
  public Long getIdPessoa() {
    return idPessoa;
  }
  public void setIdPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
  }

  
  /**
   * Identification Code of the Kinship (id)
   **/
  @ApiModelProperty(value = "Identification Code of the Kinship (id)")
  public Long getIdParentesco() {
    return idParentesco;
  }
  public void setIdParentesco(Long idParentesco) {
    this.idParentesco = idParentesco;
  }

  
  /**
   * Show the type of Cardholder, being ('H': Holder, 'A': Additional)
   **/
  @ApiModelProperty(value = "Show the type of Cardholder, being ('H': Holder, 'A': Additional)")
  public String getTipoPortador() {
    return tipoPortador;
  }
  public void setTipoPortador(String tipoPortador) {
    this.tipoPortador = tipoPortador;
  }

  
  /**
   * Show the name to be printed on the card
   **/
  @ApiModelProperty(value = "Show the name to be printed on the card")
  public String getNomeImpresso() {
    return nomeImpresso;
  }
  public void setNomeImpresso(String nomeImpresso) {
    this.nomeImpresso = nomeImpresso;
  }

  
  /**
   * Show the identification Code of the Card type (id), that will be used to create cards of this cardholder, linked to the respective account through the Idaccount field
   **/
  @ApiModelProperty(value = "Show the identification Code of the Card type (id), that will be used to create cards of this cardholder, linked to the respective account through the Idaccount field")
  public Long getIdTipoCartao() {
    return idTipoCartao;
  }
  public void setIdTipoCartao(Long idTipoCartao) {
    this.idTipoCartao = idTipoCartao;
  }

  
  /**
   * When it is active, indicate that the register of the Cardholder is active, in issuers that make this type of manangement
   **/
  @ApiModelProperty(value = "When it is active, indicate that the register of the Cardholder is active, in issuers that make this type of manangement")
  public Integer getFlagAtivo() {
    return flagAtivo;
  }
  public void setFlagAtivo(Integer flagAtivo) {
    this.flagAtivo = flagAtivo;
  }

  
  /**
   * show the date which the Cardholder was registered, when there is this information
   **/
  @ApiModelProperty(value = "show the date which the Cardholder was registered, when there is this information")
  public String getDataCadastroPortador() {
    return dataCadastroPortador;
  }
  public void setDataCadastroPortador(String dataCadastroPortador) {
    this.dataCadastroPortador = dataCadastroPortador;
  }

  
  /**
   * Show the date which the Cardholder was canceled, when there is this information
   **/
  @ApiModelProperty(value = "Show the date which the Cardholder was canceled, when there is this information")
  public String getDataCancelamentoPortador() {
    return dataCancelamentoPortador;
  }
  public void setDataCancelamentoPortador(String dataCancelamentoPortador) {
    this.dataCancelamentoPortador = dataCancelamentoPortador;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PortadorResponse {\n");
    
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  idProduto: ").append(idProduto).append("\n");
    sb.append("  idPessoa: ").append(idPessoa).append("\n");
    sb.append("  idParentesco: ").append(idParentesco).append("\n");
    sb.append("  tipoPortador: ").append(tipoPortador).append("\n");
    sb.append("  nomeImpresso: ").append(nomeImpresso).append("\n");
    sb.append("  idTipoCartao: ").append(idTipoCartao).append("\n");
    sb.append("  flagAtivo: ").append(flagAtivo).append("\n");
    sb.append("  dataCadastroPortador: ").append(dataCadastroPortador).append("\n");
    sb.append("  dataCancelamentoPortador: ").append(dataCancelamentoPortador).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
