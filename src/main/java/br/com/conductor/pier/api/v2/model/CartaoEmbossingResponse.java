package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Object Card to Print
 **/
@ApiModel(description = "Object Card to Print")
public class CartaoEmbossingResponse  {
  
  @SerializedName("flagVirtual")
  private Integer flagVirtual = null;
  @SerializedName("idConta")
  private Long idConta = null;
  @SerializedName("idPessoa")
  private Long idPessoa = null;
  @SerializedName("idCartao")
  private Long idCartao = null;
  @SerializedName("idBandeira")
  private Long idBandeira = null;
  @SerializedName("idTipoCartao")
  private Long idTipoCartao = null;
  @SerializedName("dataGeracao")
  private String dataGeracao = null;
  @SerializedName("dataValidade")
  private String dataValidade = null;
  @SerializedName("nomeOrigemComercial")
  private String nomeOrigemComercial = null;
  @SerializedName("cpf")
  private String cpf = null;

  
  /**
   * Show the status that informs if the card is virtual
   **/
  @ApiModelProperty(value = "Show the status that informs if the card is virtual")
  public Integer getFlagVirtual() {
    return flagVirtual;
  }
  public void setFlagVirtual(Integer flagVirtual) {
    this.flagVirtual = flagVirtual;
  }

  
  /**
   * Show the Identification Code of the Account (id) which the created card belongs
   **/
  @ApiModelProperty(value = "Show the Identification Code of the Account (id) which the created card belongs")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Show the Identification Code of the Person (id) cardholder of the card created
   **/
  @ApiModelProperty(value = "Show the Identification Code of the Person (id) cardholder of the card created")
  public Long getIdPessoa() {
    return idPessoa;
  }
  public void setIdPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
  }

  
  /**
   * Show the identification Code of the Card (id) which was created
   **/
  @ApiModelProperty(value = "Show the identification Code of the Card (id) which was created")
  public Long getIdCartao() {
    return idCartao;
  }
  public void setIdCartao(Long idCartao) {
    this.idCartao = idCartao;
  }

  
  /**
   * Show the identification code of the flag (id) which the card belongs, when it is flagged
   **/
  @ApiModelProperty(value = "Show the identification code of the flag (id) which the card belongs, when it is flagged")
  public Long getIdBandeira() {
    return idBandeira;
  }
  public void setIdBandeira(Long idBandeira) {
    this.idBandeira = idBandeira;
  }

  
  /**
   * Show the identification Code of the Card type (id) attributed to the card
   **/
  @ApiModelProperty(value = "Show the identification Code of the Card type (id) attributed to the card")
  public Long getIdTipoCartao() {
    return idTipoCartao;
  }
  public void setIdTipoCartao(Long idTipoCartao) {
    this.idTipoCartao = idTipoCartao;
  }

  
  /**
   * Show the date of issue of the card
   **/
  @ApiModelProperty(value = "Show the date of issue of the card")
  public String getDataGeracao() {
    return dataGeracao;
  }
  public void setDataGeracao(String dataGeracao) {
    this.dataGeracao = dataGeracao;
  }

  
  /**
   * Show the expiration date of the Card
   **/
  @ApiModelProperty(value = "Show the expiration date of the Card")
  public String getDataValidade() {
    return dataValidade;
  }
  public void setDataValidade(String dataValidade) {
    this.dataValidade = dataValidade;
  }

  
  /**
   * Show the name of the Commercial Origin that the register was made of the holder which the Card belongs
   **/
  @ApiModelProperty(value = "Show the name of the Commercial Origin that the register was made of the holder which the Card belongs")
  public String getNomeOrigemComercial() {
    return nomeOrigemComercial;
  }
  public void setNomeOrigemComercial(String nomeOrigemComercial) {
    this.nomeOrigemComercial = nomeOrigemComercial;
  }

  
  /**
   * Show the CPF of the Cardholder
   **/
  @ApiModelProperty(value = "Show the CPF of the Cardholder")
  public String getCpf() {
    return cpf;
  }
  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CartaoEmbossingResponse {\n");
    
    sb.append("  flagVirtual: ").append(flagVirtual).append("\n");
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  idPessoa: ").append(idPessoa).append("\n");
    sb.append("  idCartao: ").append(idCartao).append("\n");
    sb.append("  idBandeira: ").append(idBandeira).append("\n");
    sb.append("  idTipoCartao: ").append(idTipoCartao).append("\n");
    sb.append("  dataGeracao: ").append(dataGeracao).append("\n");
    sb.append("  dataValidade: ").append(dataValidade).append("\n");
    sb.append("  nomeOrigemComercial: ").append(nomeOrigemComercial).append("\n");
    sb.append("  cpf: ").append(cpf).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
