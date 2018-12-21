package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Object Card for printing
 **/
@ApiModel(description = "Object Card for printing")
public class CartaoImpressaoResponse  {
  
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
  @SerializedName("numeroCartao")
  private String numeroCartao = null;
  @SerializedName("nomePlastico")
  private String nomePlastico = null;
  @SerializedName("cvv2")
  private String cvv2 = null;
  @SerializedName("dataGeracao")
  private String dataGeracao = null;
  @SerializedName("dataValidade")
  private String dataValidade = null;
  @SerializedName("nomeOrigemComercial")
  private String nomeOrigemComercial = null;
  @SerializedName("nomeEmpresa")
  private String nomeEmpresa = null;
  @SerializedName("numeroAgencia")
  private Integer numeroAgencia = null;
  @SerializedName("numeroContaCorente")
  private String numeroContaCorente = null;
  @SerializedName("nomeEmpresaBeneficio")
  private String nomeEmpresaBeneficio = null;
  @SerializedName("cpf")
  private String cpf = null;
  @SerializedName("tipoPortador")
  private String tipoPortador = null;
  @SerializedName("nomeEmpregador")
  private String nomeEmpregador = null;
  @SerializedName("trilha1")
  private String trilha1 = null;
  @SerializedName("trilha2")
  private String trilha2 = null;
  @SerializedName("trilhaCVV1")
  private String trilhaCVV1 = null;
  @SerializedName("trilhaCVV2")
  private String trilhaCVV2 = null;
  @SerializedName("flagVirtual")
  private Integer flagVirtual = null;
  @SerializedName("numeroCartaoHash")
  private Long numeroCartaoHash = null;

  
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
   * Show the Identification Code of the Card (id) that was created
   **/
  @ApiModelProperty(value = "Show the Identification Code of the Card (id) that was created")
  public Long getIdCartao() {
    return idCartao;
  }
  public void setIdCartao(Long idCartao) {
    this.idCartao = idCartao;
  }

  
  /**
   * Show the Identification Code of the Flag (id) which the Card belongs, when it is flagged
   **/
  @ApiModelProperty(value = "Show the Identification Code of the Flag (id) which the Card belongs, when it is flagged")
  public Long getIdBandeira() {
    return idBandeira;
  }
  public void setIdBandeira(Long idBandeira) {
    this.idBandeira = idBandeira;
  }

  
  /**
   * Show the Identification Code of the Type of Card (id) attributed to the card
   **/
  @ApiModelProperty(value = "Show the Identification Code of the Type of Card (id) attributed to the card")
  public Long getIdTipoCartao() {
    return idTipoCartao;
  }
  public void setIdTipoCartao(Long idTipoCartao) {
    this.idTipoCartao = idTipoCartao;
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
   * Show the name of the Cardholder
   **/
  @ApiModelProperty(value = "Show the name of the Cardholder")
  public String getNomePlastico() {
    return nomePlastico;
  }
  public void setNomePlastico(String nomePlastico) {
    this.nomePlastico = nomePlastico;
  }

  
  /**
   * Show the number of the CVV to be printed on the Card
   **/
  @ApiModelProperty(value = "Show the number of the CVV to be printed on the Card")
  public String getCvv2() {
    return cvv2;
  }
  public void setCvv2(String cvv2) {
    this.cvv2 = cvv2;
  }

  
  /**
   * Show the issue date of the card
   **/
  @ApiModelProperty(value = "Show the issue date of the card")
  public String getDataGeracao() {
    return dataGeracao;
  }
  public void setDataGeracao(String dataGeracao) {
    this.dataGeracao = dataGeracao;
  }

  
  /**
   * Show the Expiration date of the Card
   **/
  @ApiModelProperty(value = "Show the Expiration date of the Card")
  public String getDataValidade() {
    return dataValidade;
  }
  public void setDataValidade(String dataValidade) {
    this.dataValidade = dataValidade;
  }

  
  /**
   * Show the name of the Commercial Origin that created the register of the holder of the Account which the card belongs
   **/
  @ApiModelProperty(value = "Show the name of the Commercial Origin that created the register of the holder of the Account which the card belongs")
  public String getNomeOrigemComercial() {
    return nomeOrigemComercial;
  }
  public void setNomeOrigemComercial(String nomeOrigemComercial) {
    this.nomeOrigemComercial = nomeOrigemComercial;
  }

  
  /**
   * Show the company name (Legal Person) holder of the card, when it is applicable
   **/
  @ApiModelProperty(value = "Show the company name (Legal Person) holder of the card, when it is applicable")
  public String getNomeEmpresa() {
    return nomeEmpresa;
  }
  public void setNomeEmpresa(String nomeEmpresa) {
    this.nomeEmpresa = nomeEmpresa;
  }

  
  /**
   * Show the number of the Agency to be printed on the Card, when it is applicable
   **/
  @ApiModelProperty(value = "Show the number of the Agency to be printed on the Card, when it is applicable")
  public Integer getNumeroAgencia() {
    return numeroAgencia;
  }
  public void setNumeroAgencia(Integer numeroAgencia) {
    this.numeroAgencia = numeroAgencia;
  }

  
  /**
   * Show the Current Account Number to be printed on the Card, whe it is applicable
   **/
  @ApiModelProperty(value = "Show the Current Account Number to be printed on the Card, whe it is applicable")
  public String getNumeroContaCorente() {
    return numeroContaCorente;
  }
  public void setNumeroContaCorente(String numeroContaCorente) {
    this.numeroContaCorente = numeroContaCorente;
  }

  
  /**
   * Show the name of the Physical or Legal Person that hired services of benefit for the cardholder, when it is applicable
   **/
  @ApiModelProperty(value = "Show the name of the Physical or Legal Person that hired services of benefit for the cardholder, when it is applicable")
  public String getNomeEmpresaBeneficio() {
    return nomeEmpresaBeneficio;
  }
  public void setNomeEmpresaBeneficio(String nomeEmpresaBeneficio) {
    this.nomeEmpresaBeneficio = nomeEmpresaBeneficio;
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

  
  /**
   * Show the Cardholder type of the card, being: ('H': Holder, 'A': Additional)
   **/
  @ApiModelProperty(value = "Show the Cardholder type of the card, being: ('H': Holder, 'A': Additional)")
  public String getTipoPortador() {
    return tipoPortador;
  }
  public void setTipoPortador(String tipoPortador) {
    this.tipoPortador = tipoPortador;
  }

  
  /**
   * Show the name of the Legal or Physical Person to be printed on the card, when it is applicable
   **/
  @ApiModelProperty(value = "Show the name of the Legal or Physical Person to be printed on the card, when it is applicable")
  public String getNomeEmpregador() {
    return nomeEmpregador;
  }
  public void setNomeEmpregador(String nomeEmpregador) {
    this.nomeEmpregador = nomeEmpregador;
  }

  
  /**
   * Show the dates of the Trail1, following the rules of the issuer trail
   **/
  @ApiModelProperty(value = "Show the dates of the Trail1, following the rules of the issuer trail")
  public String getTrilha1() {
    return trilha1;
  }
  public void setTrilha1(String trilha1) {
    this.trilha1 = trilha1;
  }

  
  /**
   * Show the dates of the Trail2, following the rules of the issuer trail
   **/
  @ApiModelProperty(value = "Show the dates of the Trail2, following the rules of the issuer trail")
  public String getTrilha2() {
    return trilha2;
  }
  public void setTrilha2(String trilha2) {
    this.trilha2 = trilha2;
  }

  
  /**
   * Show the dates of TrailCVV01, following the rules of the issuer trail
   **/
  @ApiModelProperty(value = "Show the dates of TrailCVV01, following the rules of the issuer trail")
  public String getTrilhaCVV1() {
    return trilhaCVV1;
  }
  public void setTrilhaCVV1(String trilhaCVV1) {
    this.trilhaCVV1 = trilhaCVV1;
  }

  
  /**
   * Show the dates of TrailCVV02, following the rules of the issuer trail
   **/
  @ApiModelProperty(value = "Show the dates of TrailCVV02, following the rules of the issuer trail")
  public String getTrilhaCVV2() {
    return trilhaCVV2;
  }
  public void setTrilhaCVV2(String trilhaCVV2) {
    this.trilhaCVV2 = trilhaCVV2;
  }

  
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
   * Show the hash number of the card
   **/
  @ApiModelProperty(value = "Show the hash number of the card")
  public Long getNumeroCartaoHash() {
    return numeroCartaoHash;
  }
  public void setNumeroCartaoHash(Long numeroCartaoHash) {
    this.numeroCartaoHash = numeroCartaoHash;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CartaoImpressaoResponse {\n");
    
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  idPessoa: ").append(idPessoa).append("\n");
    sb.append("  idCartao: ").append(idCartao).append("\n");
    sb.append("  idBandeira: ").append(idBandeira).append("\n");
    sb.append("  idTipoCartao: ").append(idTipoCartao).append("\n");
    sb.append("  numeroCartao: ").append(numeroCartao).append("\n");
    sb.append("  nomePlastico: ").append(nomePlastico).append("\n");
    sb.append("  cvv2: ").append(cvv2).append("\n");
    sb.append("  dataGeracao: ").append(dataGeracao).append("\n");
    sb.append("  dataValidade: ").append(dataValidade).append("\n");
    sb.append("  nomeOrigemComercial: ").append(nomeOrigemComercial).append("\n");
    sb.append("  nomeEmpresa: ").append(nomeEmpresa).append("\n");
    sb.append("  numeroAgencia: ").append(numeroAgencia).append("\n");
    sb.append("  numeroContaCorente: ").append(numeroContaCorente).append("\n");
    sb.append("  nomeEmpresaBeneficio: ").append(nomeEmpresaBeneficio).append("\n");
    sb.append("  cpf: ").append(cpf).append("\n");
    sb.append("  tipoPortador: ").append(tipoPortador).append("\n");
    sb.append("  nomeEmpregador: ").append(nomeEmpregador).append("\n");
    sb.append("  trilha1: ").append(trilha1).append("\n");
    sb.append("  trilha2: ").append(trilha2).append("\n");
    sb.append("  trilhaCVV1: ").append(trilhaCVV1).append("\n");
    sb.append("  trilhaCVV2: ").append(trilhaCVV2).append("\n");
    sb.append("  flagVirtual: ").append(flagVirtual).append("\n");
    sb.append("  numeroCartaoHash: ").append(numeroCartaoHash).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
