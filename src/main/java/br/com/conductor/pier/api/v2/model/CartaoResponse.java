package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Object Card
 **/
@ApiModel(description = "Object Card")
public class CartaoResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("flagTitular")
  private Integer flagTitular = null;
  @SerializedName("idPessoa")
  private Long idPessoa = null;
  @SerializedName("sequencialCartao")
  private Integer sequencialCartao = null;
  @SerializedName("idConta")
  private Long idConta = null;
  @SerializedName("idStatus")
  private Long idStatus = null;
  @SerializedName("dataStatus")
  private String dataStatus = null;
  @SerializedName("idEstagio")
  private Long idEstagio = null;
  @SerializedName("dataEstagio")
  private String dataEstagio = null;
  @SerializedName("numeroBin")
  private Long numeroBin = null;
  @SerializedName("numeroCartao")
  private String numeroCartao = null;
  @SerializedName("numeroCartaoHash")
  private Long numeroCartaoHash = null;
  @SerializedName("numeroCartaoCriptografado")
  private String numeroCartaoCriptografado = null;
  @SerializedName("dataEmissao")
  private String dataEmissao = null;
  @SerializedName("dataValidade")
  private String dataValidade = null;
  @SerializedName("cartaoVirtual")
  private Integer cartaoVirtual = null;
  @SerializedName("impressaoAvulsa")
  private Integer impressaoAvulsa = null;
  @SerializedName("dataImpressao")
  private String dataImpressao = null;
  @SerializedName("nomeArquivoImpressao")
  private String nomeArquivoImpressao = null;
  @SerializedName("idProduto")
  private Long idProduto = null;
  @SerializedName("nomeImpresso")
  private String nomeImpresso = null;
  @SerializedName("codigoDesbloqueio")
  private String codigoDesbloqueio = null;

  
  /**
   * Identification Code of the Card
   **/
  @ApiModelProperty(value = "Identification Code of the Card")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Show the tiype of the Cardholder, being: (1: Holder, 0: Additional)
   **/
  @ApiModelProperty(value = "Show the tiype of the Cardholder, being: (1: Holder, 0: Additional)")
  public Integer getFlagTitular() {
    return flagTitular;
  }
  public void setFlagTitular(Integer flagTitular) {
    this.flagTitular = flagTitular;
  }

  
  /**
   * Identification Code of the Person which the card belongs
   **/
  @ApiModelProperty(value = "Identification Code of the Person which the card belongs")
  public Long getIdPessoa() {
    return idPessoa;
  }
  public void setIdPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
  }

  
  /**
   * Card Sequel Number
   **/
  @ApiModelProperty(value = "Card Sequel Number")
  public Integer getSequencialCartao() {
    return sequencialCartao;
  }
  public void setSequencialCartao(Integer sequencialCartao) {
    this.sequencialCartao = sequencialCartao;
  }

  
  /**
   * Identification Code of the Account which the card belongs
   **/
  @ApiModelProperty(value = "Identification Code of the Account which the card belongs")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Identification Code of the Card Status
   **/
  @ApiModelProperty(value = "Identification Code of the Card Status")
  public Long getIdStatus() {
    return idStatus;
  }
  public void setIdStatus(Long idStatus) {
    this.idStatus = idStatus;
  }

  
  /**
   * Show the date which the current idStatusCard was applied, when there is
   **/
  @ApiModelProperty(value = "Show the date which the current idStatusCard was applied, when there is")
  public String getDataStatus() {
    return dataStatus;
  }
  public void setDataStatus(String dataStatus) {
    this.dataStatus = dataStatus;
  }

  
  /**
   * Identification Code of the Stage Printed Card
   **/
  @ApiModelProperty(value = "Identification Code of the Stage Printed Card")
  public Long getIdEstagio() {
    return idEstagio;
  }
  public void setIdEstagio(Long idEstagio) {
    this.idEstagio = idEstagio;
  }

  
  /**
   * Show te date which the current idStage of the card applied, when there is
   **/
  @ApiModelProperty(value = "Show te date which the current idStage of the card applied, when there is")
  public String getDataEstagio() {
    return dataEstagio;
  }
  public void setDataEstagio(String dataEstagio) {
    this.dataEstagio = dataEstagio;
  }

  
  /**
   * Bin number of the card
   **/
  @ApiModelProperty(value = "Bin number of the card")
  public Long getNumeroBin() {
    return numeroBin;
  }
  public void setNumeroBin(Long numeroBin) {
    this.numeroBin = numeroBin;
  }

  
  /**
   * Show the card number
   **/
  @ApiModelProperty(value = "Show the card number")
  public String getNumeroCartao() {
    return numeroCartao;
  }
  public void setNumeroCartao(String numeroCartao) {
    this.numeroCartao = numeroCartao;
  }

  
  /**
   * Hash Card Number
   **/
  @ApiModelProperty(value = "Hash Card Number")
  public Long getNumeroCartaoHash() {
    return numeroCartaoHash;
  }
  public void setNumeroCartaoHash(Long numeroCartaoHash) {
    this.numeroCartaoHash = numeroCartaoHash;
  }

  
  /**
   * Encrypted Card Number
   **/
  @ApiModelProperty(value = "Encrypted Card Number")
  public String getNumeroCartaoCriptografado() {
    return numeroCartaoCriptografado;
  }
  public void setNumeroCartaoCriptografado(String numeroCartaoCriptografado) {
    this.numeroCartaoCriptografado = numeroCartaoCriptografado;
  }

  
  /**
   * Show the issue date of the card
   **/
  @ApiModelProperty(value = "Show the issue date of the card")
  public String getDataEmissao() {
    return dataEmissao;
  }
  public void setDataEmissao(String dataEmissao) {
    this.dataEmissao = dataEmissao;
  }

  
  /**
   * Show the Expiration date of the card in the format yyyy-MM, when there is
   **/
  @ApiModelProperty(value = "Show the Expiration date of the card in the format yyyy-MM, when there is")
  public String getDataValidade() {
    return dataValidade;
  }
  public void setDataValidade(String dataValidade) {
    this.dataValidade = dataValidade;
  }

  
  /**
   * Show the status that informs if the card is virtual, being: (1: True, 0: False)
   **/
  @ApiModelProperty(value = "Show the status that informs if the card is virtual, being: (1: True, 0: False)")
  public Integer getCartaoVirtual() {
    return cartaoVirtual;
  }
  public void setCartaoVirtual(Integer cartaoVirtual) {
    this.cartaoVirtual = cartaoVirtual;
  }

  
  /**
   * When it is active, indicates that the card was printed in the Commercial Origin
   **/
  @ApiModelProperty(value = "When it is active, indicates that the card was printed in the Commercial Origin")
  public Integer getImpressaoAvulsa() {
    return impressaoAvulsa;
  }
  public void setImpressaoAvulsa(Integer impressaoAvulsa) {
    this.impressaoAvulsa = impressaoAvulsa;
  }

  
  /**
   * Show the date of the card that was printed, in case of printing in a store, or the date which was included in the file for printing in a Graphic
   **/
  @ApiModelProperty(value = "Show the date of the card that was printed, in case of printing in a store, or the date which was included in the file for printing in a Graphic")
  public String getDataImpressao() {
    return dataImpressao;
  }
  public void setDataImpressao(String dataImpressao) {
    this.dataImpressao = dataImpressao;
  }

  
  /**
   * Show the name of the file where the card was included for printing, when there is
   **/
  @ApiModelProperty(value = "Show the name of the file where the card was included for printing, when there is")
  public String getNomeArquivoImpressao() {
    return nomeArquivoImpressao;
  }
  public void setNomeArquivoImpressao(String nomeArquivoImpressao) {
    this.nomeArquivoImpressao = nomeArquivoImpressao;
  }

  
  /**
   * Identification Code of the Product which the card belongs
   **/
  @ApiModelProperty(value = "Identification Code of the Product which the card belongs")
  public Long getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Long idProduto) {
    this.idProduto = idProduto;
  }

  
  /**
   * Show the name printed on the card
   **/
  @ApiModelProperty(value = "Show the name printed on the card")
  public String getNomeImpresso() {
    return nomeImpresso;
  }
  public void setNomeImpresso(String nomeImpresso) {
    this.nomeImpresso = nomeImpresso;
  }

  
  /**
   * Show a specific code to be used as a variable in the process of unlock the card for issuer that want to use this functionality
   **/
  @ApiModelProperty(value = "Show a specific code to be used as a variable in the process of unlock the card for issuer that want to use this functionality")
  public String getCodigoDesbloqueio() {
    return codigoDesbloqueio;
  }
  public void setCodigoDesbloqueio(String codigoDesbloqueio) {
    this.codigoDesbloqueio = codigoDesbloqueio;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CartaoResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  flagTitular: ").append(flagTitular).append("\n");
    sb.append("  idPessoa: ").append(idPessoa).append("\n");
    sb.append("  sequencialCartao: ").append(sequencialCartao).append("\n");
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  idStatus: ").append(idStatus).append("\n");
    sb.append("  dataStatus: ").append(dataStatus).append("\n");
    sb.append("  idEstagio: ").append(idEstagio).append("\n");
    sb.append("  dataEstagio: ").append(dataEstagio).append("\n");
    sb.append("  numeroBin: ").append(numeroBin).append("\n");
    sb.append("  numeroCartao: ").append(numeroCartao).append("\n");
    sb.append("  numeroCartaoHash: ").append(numeroCartaoHash).append("\n");
    sb.append("  numeroCartaoCriptografado: ").append(numeroCartaoCriptografado).append("\n");
    sb.append("  dataEmissao: ").append(dataEmissao).append("\n");
    sb.append("  dataValidade: ").append(dataValidade).append("\n");
    sb.append("  cartaoVirtual: ").append(cartaoVirtual).append("\n");
    sb.append("  impressaoAvulsa: ").append(impressaoAvulsa).append("\n");
    sb.append("  dataImpressao: ").append(dataImpressao).append("\n");
    sb.append("  nomeArquivoImpressao: ").append(nomeArquivoImpressao).append("\n");
    sb.append("  idProduto: ").append(idProduto).append("\n");
    sb.append("  nomeImpresso: ").append(nomeImpresso).append("\n");
    sb.append("  codigoDesbloqueio: ").append(codigoDesbloqueio).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
