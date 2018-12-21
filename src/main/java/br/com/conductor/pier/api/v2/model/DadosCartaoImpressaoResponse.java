package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Object Card for printing
 **/
@ApiModel(description = "Object Card for printing")
public class DadosCartaoImpressaoResponse  {
  
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
  @SerializedName("cpf")
  private String cpf = null;
  @SerializedName("tipoPortador")
  private String tipoPortador = null;
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
  @SerializedName("nomeBandeira")
  private String nomeBandeira = null;
  @SerializedName("flagTitular")
  private Integer flagTitular = null;
  @SerializedName("sequencialCartao")
  private Integer sequencialCartao = null;
  @SerializedName("idStatus")
  private Long idStatus = null;
  @SerializedName("descricaoStatusCartao")
  private String descricaoStatusCartao = null;
  @SerializedName("dataStatus")
  private String dataStatus = null;
  @SerializedName("idEstagio")
  private Long idEstagio = null;
  @SerializedName("descricaoEstagio")
  private String descricaoEstagio = null;
  @SerializedName("dataEstagio")
  private String dataEstagio = null;
  @SerializedName("numeroBin")
  private String numeroBin = null;
  @SerializedName("idProduto")
  private Long idProduto = null;
  @SerializedName("descricaoProduto")
  private String descricaoProduto = null;
  @SerializedName("idStatusConta")
  private Long idStatusConta = null;
  @SerializedName("descricaoStatusConta")
  private Long descricaoStatusConta = null;
  @SerializedName("dataEmbossing")
  private String dataEmbossing = null;
  @SerializedName("codigoDesbloqueio")
  private String codigoDesbloqueio = null;
  @SerializedName("nomePessoa")
  private String nomePessoa = null;
  @SerializedName("tipoPessoa")
  private String tipoPessoa = null;
  @SerializedName("dataNascimento")
  private String dataNascimento = null;
  @SerializedName("idEndereco")
  private Long idEndereco = null;
  @SerializedName("idTipoEndereco")
  private Long idTipoEndereco = null;
  @SerializedName("descricaoTipoEndereco")
  private String descricaoTipoEndereco = null;
  @SerializedName("cep")
  private String cep = null;
  @SerializedName("logradouro")
  private String logradouro = null;
  @SerializedName("numeroEndereco")
  private String numeroEndereco = null;
  @SerializedName("complementoEndereco")
  private String complementoEndereco = null;
  @SerializedName("bairro")
  private String bairro = null;
  @SerializedName("cidade")
  private String cidade = null;
  @SerializedName("uf")
  private String uf = null;
  @SerializedName("pais")
  private String pais = null;
  @SerializedName("senhaCriptografada")
  private String senhaCriptografada = null;
  @SerializedName("icvv")
  private String icvv = null;
  @SerializedName("idStatusImpressao")
  private Long idStatusImpressao = null;

  
  /**
   * The identification code of the account (id) which the card created belongs
   **/
  @ApiModelProperty(value = "The identification code of the account (id) which the card created belongs")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Identification Code of the Person (id) cardholder created
   **/
  @ApiModelProperty(value = "Identification Code of the Person (id) cardholder created")
  public Long getIdPessoa() {
    return idPessoa;
  }
  public void setIdPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
  }

  
  /**
   * Identification Code of the Card (id) that was created
   **/
  @ApiModelProperty(value = "Identification Code of the Card (id) that was created")
  public Long getIdCartao() {
    return idCartao;
  }
  public void setIdCartao(Long idCartao) {
    this.idCartao = idCartao;
  }

  
  /**
   * Identification Code fo the flag (id) which the card belongs, when it is flagged
   **/
  @ApiModelProperty(value = "Identification Code fo the flag (id) which the card belongs, when it is flagged")
  public Long getIdBandeira() {
    return idBandeira;
  }
  public void setIdBandeira(Long idBandeira) {
    this.idBandeira = idBandeira;
  }

  
  /**
   * Identification Code of the Type of Card (id) attributed to the Card
   **/
  @ApiModelProperty(value = "Identification Code of the Type of Card (id) attributed to the Card")
  public Long getIdTipoCartao() {
    return idTipoCartao;
  }
  public void setIdTipoCartao(Long idTipoCartao) {
    this.idTipoCartao = idTipoCartao;
  }

  
  /**
   * Card number
   **/
  @ApiModelProperty(value = "Card number")
  public String getNumeroCartao() {
    return numeroCartao;
  }
  public void setNumeroCartao(String numeroCartao) {
    this.numeroCartao = numeroCartao;
  }

  
  /**
   * Cardholder name
   **/
  @ApiModelProperty(value = "Cardholder name")
  public String getNomePlastico() {
    return nomePlastico;
  }
  public void setNomePlastico(String nomePlastico) {
    this.nomePlastico = nomePlastico;
  }

  
  /**
   * The CVV number to ve printed on the Card
   **/
  @ApiModelProperty(value = "The CVV number to ve printed on the Card")
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
   * Show the expiration date of the card
   **/
  @ApiModelProperty(value = "Show the expiration date of the card")
  public String getDataValidade() {
    return dataValidade;
  }
  public void setDataValidade(String dataValidade) {
    this.dataValidade = dataValidade;
  }

  
  /**
   * The CPF of the Cardholder
   **/
  @ApiModelProperty(value = "The CPF of the Cardholder")
  public String getCpf() {
    return cpf;
  }
  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  
  /**
   * Cardholder type, being: ('H': Holder, 'A': Additional)
   **/
  @ApiModelProperty(value = "Cardholder type, being: ('H': Holder, 'A': Additional)")
  public String getTipoPortador() {
    return tipoPortador;
  }
  public void setTipoPortador(String tipoPortador) {
    this.tipoPortador = tipoPortador;
  }

  
  /**
   * Trail1 dates, following the rules of the issuer trail
   **/
  @ApiModelProperty(value = "Trail1 dates, following the rules of the issuer trail")
  public String getTrilha1() {
    return trilha1;
  }
  public void setTrilha1(String trilha1) {
    this.trilha1 = trilha1;
  }

  
  /**
   * Trail2 dates, following the rules of the issuer trail
   **/
  @ApiModelProperty(value = "Trail2 dates, following the rules of the issuer trail")
  public String getTrilha2() {
    return trilha2;
  }
  public void setTrilha2(String trilha2) {
    this.trilha2 = trilha2;
  }

  
  /**
   * The dates of the trailCVV01, following the rules of the issuer trail
   **/
  @ApiModelProperty(value = "The dates of the trailCVV01, following the rules of the issuer trail")
  public String getTrilhaCVV1() {
    return trilhaCVV1;
  }
  public void setTrilhaCVV1(String trilhaCVV1) {
    this.trilhaCVV1 = trilhaCVV1;
  }

  
  /**
   * The dates of the TrailCVV02, following the rules of the issuer trail
   **/
  @ApiModelProperty(value = "The dates of the TrailCVV02, following the rules of the issuer trail")
  public String getTrilhaCVV2() {
    return trilhaCVV2;
  }
  public void setTrilhaCVV2(String trilhaCVV2) {
    this.trilhaCVV2 = trilhaCVV2;
  }

  
  /**
   * The status that informs if the card is virtual
   **/
  @ApiModelProperty(value = "The status that informs if the card is virtual")
  public Integer getFlagVirtual() {
    return flagVirtual;
  }
  public void setFlagVirtual(Integer flagVirtual) {
    this.flagVirtual = flagVirtual;
  }

  
  /**
   * Flag name
   **/
  @ApiModelProperty(value = "Flag name")
  public String getNomeBandeira() {
    return nomeBandeira;
  }
  public void setNomeBandeira(String nomeBandeira) {
    this.nomeBandeira = nomeBandeira;
  }

  
  /**
   * Flag Indicative of Ownership of the Account
   **/
  @ApiModelProperty(value = "Flag Indicative of Ownership of the Account")
  public Integer getFlagTitular() {
    return flagTitular;
  }
  public void setFlagTitular(Integer flagTitular) {
    this.flagTitular = flagTitular;
  }

  
  /**
   * Card Sequence Code
   **/
  @ApiModelProperty(value = "Card Sequence Code")
  public Integer getSequencialCartao() {
    return sequencialCartao;
  }
  public void setSequencialCartao(Integer sequencialCartao) {
    this.sequencialCartao = sequencialCartao;
  }

  
  /**
   * Identifier of the Card Status
   **/
  @ApiModelProperty(value = "Identifier of the Card Status")
  public Long getIdStatus() {
    return idStatus;
  }
  public void setIdStatus(Long idStatus) {
    this.idStatus = idStatus;
  }

  
  /**
   * Description of the Card Status
   **/
  @ApiModelProperty(value = "Description of the Card Status")
  public String getDescricaoStatusCartao() {
    return descricaoStatusCartao;
  }
  public void setDescricaoStatusCartao(String descricaoStatusCartao) {
    this.descricaoStatusCartao = descricaoStatusCartao;
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
   * Identifier of the Card Stage
   **/
  @ApiModelProperty(value = "Identifier of the Card Stage")
  public Long getIdEstagio() {
    return idEstagio;
  }
  public void setIdEstagio(Long idEstagio) {
    this.idEstagio = idEstagio;
  }

  
  /**
   * Description of the Card Stage
   **/
  @ApiModelProperty(value = "Description of the Card Stage")
  public String getDescricaoEstagio() {
    return descricaoEstagio;
  }
  public void setDescricaoEstagio(String descricaoEstagio) {
    this.descricaoEstagio = descricaoEstagio;
  }

  
  /**
   * Show the date which the current idStageCard was applied, when there is
   **/
  @ApiModelProperty(value = "Show the date which the current idStageCard was applied, when there is")
  public String getDataEstagio() {
    return dataEstagio;
  }
  public void setDataEstagio(String dataEstagio) {
    this.dataEstagio = dataEstagio;
  }

  
  /**
   * Bin number of the Card
   **/
  @ApiModelProperty(value = "Bin number of the Card")
  public String getNumeroBin() {
    return numeroBin;
  }
  public void setNumeroBin(String numeroBin) {
    this.numeroBin = numeroBin;
  }

  
  /**
   * Identifier of the Product associated to the account
   **/
  @ApiModelProperty(value = "Identifier of the Product associated to the account")
  public Long getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Long idProduto) {
    this.idProduto = idProduto;
  }

  
  /**
   * Description of the product
   **/
  @ApiModelProperty(value = "Description of the product")
  public String getDescricaoProduto() {
    return descricaoProduto;
  }
  public void setDescricaoProduto(String descricaoProduto) {
    this.descricaoProduto = descricaoProduto;
  }

  
  /**
   * Identifier of the Card Status
   **/
  @ApiModelProperty(value = "Identifier of the Card Status")
  public Long getIdStatusConta() {
    return idStatusConta;
  }
  public void setIdStatusConta(Long idStatusConta) {
    this.idStatusConta = idStatusConta;
  }

  
  /**
   * Description of the account status
   **/
  @ApiModelProperty(value = "Description of the account status")
  public Long getDescricaoStatusConta() {
    return descricaoStatusConta;
  }
  public void setDescricaoStatusConta(Long descricaoStatusConta) {
    this.descricaoStatusConta = descricaoStatusConta;
  }

  
  /**
   * Date that the card was embossing
   **/
  @ApiModelProperty(value = "Date that the card was embossing")
  public String getDataEmbossing() {
    return dataEmbossing;
  }
  public void setDataEmbossing(String dataEmbossing) {
    this.dataEmbossing = dataEmbossing;
  }

  
  /**
   * Unlock Code of the Card
   **/
  @ApiModelProperty(value = "Unlock Code of the Card")
  public String getCodigoDesbloqueio() {
    return codigoDesbloqueio;
  }
  public void setCodigoDesbloqueio(String codigoDesbloqueio) {
    this.codigoDesbloqueio = codigoDesbloqueio;
  }

  
  /**
   * The 'Full name of the PP' or the 'Full name of the Social Reason' (Business Name)'
   **/
  @ApiModelProperty(value = "The 'Full name of the PP' or the 'Full name of the Social Reason' (Business Name)'")
  public String getNomePessoa() {
    return nomePessoa;
  }
  public void setNomePessoa(String nomePessoa) {
    this.nomePessoa = nomePessoa;
  }

  
  /**
   * Identification Code of the Person, being: ('PP': Physical Person), ('LP': Legal Person)
   **/
  @ApiModelProperty(value = "Identification Code of the Person, being: ('PP': Physical Person), ('LP': Legal Person)")
  public String getTipoPessoa() {
    return tipoPessoa;
  }
  public void setTipoPessoa(String tipoPessoa) {
    this.tipoPessoa = tipoPessoa;
  }

  
  /**
   * Birth date of the Person, when it is PP, or the date of the Business Opening, when it is LP
   **/
  @ApiModelProperty(value = "Birth date of the Person, when it is PP, or the date of the Business Opening, when it is LP")
  public String getDataNascimento() {
    return dataNascimento;
  }
  public void setDataNascimento(String dataNascimento) {
    this.dataNascimento = dataNascimento;
  }

  
  /**
   * Identifier of Address of the cardholder
   **/
  @ApiModelProperty(value = "Identifier of Address of the cardholder")
  public Long getIdEndereco() {
    return idEndereco;
  }
  public void setIdEndereco(Long idEndereco) {
    this.idEndereco = idEndereco;
  }

  
  /**
   * Identification Code of the Type of Address (id)
   **/
  @ApiModelProperty(value = "Identification Code of the Type of Address (id)")
  public Long getIdTipoEndereco() {
    return idTipoEndereco;
  }
  public void setIdTipoEndereco(Long idTipoEndereco) {
    this.idTipoEndereco = idTipoEndereco;
  }

  
  /**
   * Description of the type of address
   **/
  @ApiModelProperty(value = "Description of the type of address")
  public String getDescricaoTipoEndereco() {
    return descricaoTipoEndereco;
  }
  public void setDescricaoTipoEndereco(String descricaoTipoEndereco) {
    this.descricaoTipoEndereco = descricaoTipoEndereco;
  }

  
  /**
   * Zip code in format '58800000'
   **/
  @ApiModelProperty(value = "Zip code in format '58800000'")
  public String getCep() {
    return cep;
  }
  public void setCep(String cep) {
    this.cep = cep;
  }

  
  /**
   * Street Number
   **/
  @ApiModelProperty(value = "Street Number")
  public String getLogradouro() {
    return logradouro;
  }
  public void setLogradouro(String logradouro) {
    this.logradouro = logradouro;
  }

  
  /**
   * Address number
   **/
  @ApiModelProperty(value = "Address number")
  public String getNumeroEndereco() {
    return numeroEndereco;
  }
  public void setNumeroEndereco(String numeroEndereco) {
    this.numeroEndereco = numeroEndereco;
  }

  
  /**
   * Complementary Descriptions refering to the address
   **/
  @ApiModelProperty(value = "Complementary Descriptions refering to the address")
  public String getComplementoEndereco() {
    return complementoEndereco;
  }
  public void setComplementoEndereco(String complementoEndereco) {
    this.complementoEndereco = complementoEndereco;
  }

  
  /**
   * Neighborhood name
   **/
  @ApiModelProperty(value = "Neighborhood name")
  public String getBairro() {
    return bairro;
  }
  public void setBairro(String bairro) {
    this.bairro = bairro;
  }

  
  /**
   * City name
   **/
  @ApiModelProperty(value = "City name")
  public String getCidade() {
    return cidade;
  }
  public void setCidade(String cidade) {
    this.cidade = cidade;
  }

  
  /**
   * Federal Unity
   **/
  @ApiModelProperty(value = "Federal Unity")
  public String getUf() {
    return uf;
  }
  public void setUf(String uf) {
    this.uf = uf;
  }

  
  /**
   * Country name
   **/
  @ApiModelProperty(value = "Country name")
  public String getPais() {
    return pais;
  }
  public void setPais(String pais) {
    this.pais = pais;
  }

  
  /**
   * Encrypted password
   **/
  @ApiModelProperty(value = "Encrypted password")
  public String getSenhaCriptografada() {
    return senhaCriptografada;
  }
  public void setSenhaCriptografada(String senhaCriptografada) {
    this.senhaCriptografada = senhaCriptografada;
  }

  
  /**
   * The number of ICVV of the card
   **/
  @ApiModelProperty(value = "The number of ICVV of the card")
  public String getIcvv() {
    return icvv;
  }
  public void setIcvv(String icvv) {
    this.icvv = icvv;
  }

  
  /**
   * Displays the print status identifier of the card
   **/
  @ApiModelProperty(value = "Displays the print status identifier of the card")
  public Long getIdStatusImpressao() {
    return idStatusImpressao;
  }
  public void setIdStatusImpressao(Long idStatusImpressao) {
    this.idStatusImpressao = idStatusImpressao;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DadosCartaoImpressaoResponse {\n");
    
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
    sb.append("  cpf: ").append(cpf).append("\n");
    sb.append("  tipoPortador: ").append(tipoPortador).append("\n");
    sb.append("  trilha1: ").append(trilha1).append("\n");
    sb.append("  trilha2: ").append(trilha2).append("\n");
    sb.append("  trilhaCVV1: ").append(trilhaCVV1).append("\n");
    sb.append("  trilhaCVV2: ").append(trilhaCVV2).append("\n");
    sb.append("  flagVirtual: ").append(flagVirtual).append("\n");
    sb.append("  nomeBandeira: ").append(nomeBandeira).append("\n");
    sb.append("  flagTitular: ").append(flagTitular).append("\n");
    sb.append("  sequencialCartao: ").append(sequencialCartao).append("\n");
    sb.append("  idStatus: ").append(idStatus).append("\n");
    sb.append("  descricaoStatusCartao: ").append(descricaoStatusCartao).append("\n");
    sb.append("  dataStatus: ").append(dataStatus).append("\n");
    sb.append("  idEstagio: ").append(idEstagio).append("\n");
    sb.append("  descricaoEstagio: ").append(descricaoEstagio).append("\n");
    sb.append("  dataEstagio: ").append(dataEstagio).append("\n");
    sb.append("  numeroBin: ").append(numeroBin).append("\n");
    sb.append("  idProduto: ").append(idProduto).append("\n");
    sb.append("  descricaoProduto: ").append(descricaoProduto).append("\n");
    sb.append("  idStatusConta: ").append(idStatusConta).append("\n");
    sb.append("  descricaoStatusConta: ").append(descricaoStatusConta).append("\n");
    sb.append("  dataEmbossing: ").append(dataEmbossing).append("\n");
    sb.append("  codigoDesbloqueio: ").append(codigoDesbloqueio).append("\n");
    sb.append("  nomePessoa: ").append(nomePessoa).append("\n");
    sb.append("  tipoPessoa: ").append(tipoPessoa).append("\n");
    sb.append("  dataNascimento: ").append(dataNascimento).append("\n");
    sb.append("  idEndereco: ").append(idEndereco).append("\n");
    sb.append("  idTipoEndereco: ").append(idTipoEndereco).append("\n");
    sb.append("  descricaoTipoEndereco: ").append(descricaoTipoEndereco).append("\n");
    sb.append("  cep: ").append(cep).append("\n");
    sb.append("  logradouro: ").append(logradouro).append("\n");
    sb.append("  numeroEndereco: ").append(numeroEndereco).append("\n");
    sb.append("  complementoEndereco: ").append(complementoEndereco).append("\n");
    sb.append("  bairro: ").append(bairro).append("\n");
    sb.append("  cidade: ").append(cidade).append("\n");
    sb.append("  uf: ").append(uf).append("\n");
    sb.append("  pais: ").append(pais).append("\n");
    sb.append("  senhaCriptografada: ").append(senhaCriptografada).append("\n");
    sb.append("  icvv: ").append(icvv).append("\n");
    sb.append("  idStatusImpressao: ").append(idStatusImpressao).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
