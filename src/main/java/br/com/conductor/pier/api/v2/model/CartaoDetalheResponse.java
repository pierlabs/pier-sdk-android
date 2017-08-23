package br.com.conductor.pier.api.v2.model;



import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * Objeto Cart\u00C3\u00A3o com mais informa\u00C3\u00A7\u00C3\u00B5es
 **/
@ApiModel(description = "Objeto Cart\u00C3\u00A3o com mais informa\u00C3\u00A7\u00C3\u00B5es")
public class CartaoDetalheResponse  {
  
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
  @SerializedName("descricaoTipoCartao")
  private String descricaoTipoCartao = null;
  @SerializedName("idProduto")
  private Long idProduto = null;
  @SerializedName("nomeImpresso")
  private String nomeImpresso = null;
  @SerializedName("tipoCartao")
  private Long tipoCartao = null;
  @SerializedName("codigoDesbloqueio")
  private String codigoDesbloqueio = null;

  
  /**
   * C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Cart\u00C3\u00A3o.
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Cart\u00C3\u00A3o.")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Apresenta o tipo do Portador do cart\u00C3\u00A3o, sendo: (1: Titular, 0: Adicional).
   **/
  @ApiModelProperty(value = "Apresenta o tipo do Portador do cart\u00C3\u00A3o, sendo: (1: Titular, 0: Adicional).")
  public Integer getFlagTitular() {
    return flagTitular;
  }
  public void setFlagTitular(Integer flagTitular) {
    this.flagTitular = flagTitular;
  }

  
  /**
   * C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da Pessoa a qual o cart\u00C3\u00A3o pertence
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da Pessoa a qual o cart\u00C3\u00A3o pertence")
  public Long getIdPessoa() {
    return idPessoa;
  }
  public void setIdPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
  }

  
  /**
   * N\u00C3\u00BAmero sequencial do cart\u00C3\u00A3o
   **/
  @ApiModelProperty(value = "N\u00C3\u00BAmero sequencial do cart\u00C3\u00A3o")
  public Integer getSequencialCartao() {
    return sequencialCartao;
  }
  public void setSequencialCartao(Integer sequencialCartao) {
    this.sequencialCartao = sequencialCartao;
  }

  
  /**
   * C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da Conta a qual o cart\u00C3\u00A3o pertence.
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da Conta a qual o cart\u00C3\u00A3o pertence.")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Status do Cart\u00C3\u00A3o.
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Status do Cart\u00C3\u00A3o.")
  public Long getIdStatus() {
    return idStatus;
  }
  public void setIdStatus(Long idStatus) {
    this.idStatus = idStatus;
  }

  
  /**
   * Apresenta a data em que o idStatusCartao atual do cart\u00C3\u00A3o fora aplicado, quando houver.
   **/
  @ApiModelProperty(value = "Apresenta a data em que o idStatusCartao atual do cart\u00C3\u00A3o fora aplicado, quando houver.")
  public String getDataStatus() {
    return dataStatus;
  }
  public void setDataStatus(String dataStatus) {
    this.dataStatus = dataStatus;
  }

  
  /**
   * C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Est\u00C3\u00A1gio de Impress\u00C3\u00A3o do Cart\u00C3\u00A3o.
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Est\u00C3\u00A1gio de Impress\u00C3\u00A3o do Cart\u00C3\u00A3o.")
  public Long getIdEstagio() {
    return idEstagio;
  }
  public void setIdEstagio(Long idEstagio) {
    this.idEstagio = idEstagio;
  }

  
  /**
   * Apresenta a data em que o idEstagio atual do cart\u00C3\u00A3o fora aplicado, quando houver.
   **/
  @ApiModelProperty(value = "Apresenta a data em que o idEstagio atual do cart\u00C3\u00A3o fora aplicado, quando houver.")
  public String getDataEstagio() {
    return dataEstagio;
  }
  public void setDataEstagio(String dataEstagio) {
    this.dataEstagio = dataEstagio;
  }

  
  /**
   * N\u00C3\u00BAmero do bin do cart\u00C3\u00A3o.
   **/
  @ApiModelProperty(value = "N\u00C3\u00BAmero do bin do cart\u00C3\u00A3o.")
  public Long getNumeroBin() {
    return numeroBin;
  }
  public void setNumeroBin(Long numeroBin) {
    this.numeroBin = numeroBin;
  }

  
  /**
   * Apresenta o n\u00C3\u00BAmero do cart\u00C3\u00A3o.
   **/
  @ApiModelProperty(value = "Apresenta o n\u00C3\u00BAmero do cart\u00C3\u00A3o.")
  public String getNumeroCartao() {
    return numeroCartao;
  }
  public void setNumeroCartao(String numeroCartao) {
    this.numeroCartao = numeroCartao;
  }

  
  /**
   * N\u00C3\u00BAmero do cart\u00C3\u00A3o hash.
   **/
  @ApiModelProperty(value = "N\u00C3\u00BAmero do cart\u00C3\u00A3o hash.")
  public Long getNumeroCartaoHash() {
    return numeroCartaoHash;
  }
  public void setNumeroCartaoHash(Long numeroCartaoHash) {
    this.numeroCartaoHash = numeroCartaoHash;
  }

  
  /**
   * N\u00C3\u00BAmero do cart\u00C3\u00A3o criptografado.
   **/
  @ApiModelProperty(value = "N\u00C3\u00BAmero do cart\u00C3\u00A3o criptografado.")
  public String getNumeroCartaoCriptografado() {
    return numeroCartaoCriptografado;
  }
  public void setNumeroCartaoCriptografado(String numeroCartaoCriptografado) {
    this.numeroCartaoCriptografado = numeroCartaoCriptografado;
  }

  
  /**
   * Apresenta a data de emiss\u00C3\u00A3o do cart\u00C3\u00A3o.
   **/
  @ApiModelProperty(value = "Apresenta a data de emiss\u00C3\u00A3o do cart\u00C3\u00A3o.")
  public String getDataEmissao() {
    return dataEmissao;
  }
  public void setDataEmissao(String dataEmissao) {
    this.dataEmissao = dataEmissao;
  }

  
  /**
   * Apresenta a data de validade do cart\u00C3\u00A3o em formato yyyy-MM, quando houver.
   **/
  @ApiModelProperty(value = "Apresenta a data de validade do cart\u00C3\u00A3o em formato yyyy-MM, quando houver.")
  public String getDataValidade() {
    return dataValidade;
  }
  public void setDataValidade(String dataValidade) {
    this.dataValidade = dataValidade;
  }

  
  /**
   * Apresenta o status que informa se o cart\u00C3\u00A3o \u00C3\u00A9 virtual. Sendo: (1: True, 0: False).
   **/
  @ApiModelProperty(value = "Apresenta o status que informa se o cart\u00C3\u00A3o \u00C3\u00A9 virtual. Sendo: (1: True, 0: False).")
  public Integer getCartaoVirtual() {
    return cartaoVirtual;
  }
  public void setCartaoVirtual(Integer cartaoVirtual) {
    this.cartaoVirtual = cartaoVirtual;
  }

  
  /**
   * Quando ativa, indica que o cart\u00C3\u00A3o fora impresso na Origem Comercial.
   **/
  @ApiModelProperty(value = "Quando ativa, indica que o cart\u00C3\u00A3o fora impresso na Origem Comercial.")
  public Integer getImpressaoAvulsa() {
    return impressaoAvulsa;
  }
  public void setImpressaoAvulsa(Integer impressaoAvulsa) {
    this.impressaoAvulsa = impressaoAvulsa;
  }

  
  /**
   * Apresenta a data em que o cart\u00C3\u00A3o fora impresso, caso impress\u00C3\u00A3o em loja, ou a data em que ele fora inclu\u00C3\u00ADdo no arquivo para impress\u00C3\u00A3o via gr\u00C3\u00A1fica.
   **/
  @ApiModelProperty(value = "Apresenta a data em que o cart\u00C3\u00A3o fora impresso, caso impress\u00C3\u00A3o em loja, ou a data em que ele fora inclu\u00C3\u00ADdo no arquivo para impress\u00C3\u00A3o via gr\u00C3\u00A1fica.")
  public String getDataImpressao() {
    return dataImpressao;
  }
  public void setDataImpressao(String dataImpressao) {
    this.dataImpressao = dataImpressao;
  }

  
  /**
   * Apresenta o nome do arquivo onde o cart\u00C3\u00A3o fora inclu\u00C3\u00ADdo para impress\u00C3\u00A3o por uma gr\u00C3\u00A1fica, quando houver.
   **/
  @ApiModelProperty(value = "Apresenta o nome do arquivo onde o cart\u00C3\u00A3o fora inclu\u00C3\u00ADdo para impress\u00C3\u00A3o por uma gr\u00C3\u00A1fica, quando houver.")
  public String getNomeArquivoImpressao() {
    return nomeArquivoImpressao;
  }
  public void setNomeArquivoImpressao(String nomeArquivoImpressao) {
    this.nomeArquivoImpressao = nomeArquivoImpressao;
  }

  
  /**
   * Descreve o tipo do cart\u00C3\u00A3o.
   **/
  @ApiModelProperty(value = "Descreve o tipo do cart\u00C3\u00A3o.")
  public String getDescricaoTipoCartao() {
    return descricaoTipoCartao;
  }
  public void setDescricaoTipoCartao(String descricaoTipoCartao) {
    this.descricaoTipoCartao = descricaoTipoCartao;
  }

  
  /**
   * C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Produto a qual o cart\u00C3\u00A3o pertence.
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Produto a qual o cart\u00C3\u00A3o pertence.")
  public Long getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Long idProduto) {
    this.idProduto = idProduto;
  }

  
  /**
   * Apresenta o nome impresso no cart\u00C3\u00A3o.
   **/
  @ApiModelProperty(value = "Apresenta o nome impresso no cart\u00C3\u00A3o.")
  public String getNomeImpresso() {
    return nomeImpresso;
  }
  public void setNomeImpresso(String nomeImpresso) {
    this.nomeImpresso = nomeImpresso;
  }

  
  /**
   * Indica o identificador do tipo do cart\u00C3\u00A3o.
   **/
  @ApiModelProperty(value = "Indica o identificador do tipo do cart\u00C3\u00A3o.")
  public Long getTipoCartao() {
    return tipoCartao;
  }
  public void setTipoCartao(Long tipoCartao) {
    this.tipoCartao = tipoCartao;
  }

  
  /**
   * Apresenta um c\u00C3\u00B3digo espec\u00C3\u00ADfico para ser utilizado como vari\u00C3\u00A1vel no processo de desbloqueio do cart\u00C3\u00A3o para emissores que querem usar esta funcionalidade.
   **/
  @ApiModelProperty(value = "Apresenta um c\u00C3\u00B3digo espec\u00C3\u00ADfico para ser utilizado como vari\u00C3\u00A1vel no processo de desbloqueio do cart\u00C3\u00A3o para emissores que querem usar esta funcionalidade.")
  public String getCodigoDesbloqueio() {
    return codigoDesbloqueio;
  }
  public void setCodigoDesbloqueio(String codigoDesbloqueio) {
    this.codigoDesbloqueio = codigoDesbloqueio;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CartaoDetalheResponse {\n");
    
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
    sb.append("  descricaoTipoCartao: ").append(descricaoTipoCartao).append("\n");
    sb.append("  idProduto: ").append(idProduto).append("\n");
    sb.append("  nomeImpresso: ").append(nomeImpresso).append("\n");
    sb.append("  tipoCartao: ").append(tipoCartao).append("\n");
    sb.append("  codigoDesbloqueio: ").append(codigoDesbloqueio).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


